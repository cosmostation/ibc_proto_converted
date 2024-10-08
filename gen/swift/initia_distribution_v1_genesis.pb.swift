// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: initia/distribution/v1/genesis.proto
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

/// ValidatorOutstandingRewardsRecord is used for import/export via genesis json.
struct Initia_Distribution_V1_ValidatorOutstandingRewardsRecord {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// validator_address is the address of the validator.
  var validatorAddress: String = String()

  /// outstanding_rewards represents the outstanding rewards of a validator.
  var outstandingRewards: [Initia_Distribution_V1_DecPool] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// ValidatorAccumulatedCommissionRecord is used for import / export via genesis
/// json.
struct Initia_Distribution_V1_ValidatorAccumulatedCommissionRecord {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// validator_address is the address of the validator.
  var validatorAddress: String = String()

  /// accumulated is the accumulated commission of a validator.
  var accumulated: Initia_Distribution_V1_ValidatorAccumulatedCommission {
    get {return _accumulated ?? Initia_Distribution_V1_ValidatorAccumulatedCommission()}
    set {_accumulated = newValue}
  }
  /// Returns true if `accumulated` has been explicitly set.
  var hasAccumulated: Bool {return self._accumulated != nil}
  /// Clears the value of `accumulated`. Subsequent reads from it will return its default value.
  mutating func clearAccumulated() {self._accumulated = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _accumulated: Initia_Distribution_V1_ValidatorAccumulatedCommission? = nil
}

/// ValidatorHistoricalRewardsRecord is used for import / export via genesis
/// json.
struct Initia_Distribution_V1_ValidatorHistoricalRewardsRecord {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// validator_address is the address of the validator.
  var validatorAddress: String = String()

  /// period defines the period the historical rewards apply to.
  var period: UInt64 = 0

  /// rewards defines the historical rewards of a validator.
  var rewards: Initia_Distribution_V1_ValidatorHistoricalRewards {
    get {return _rewards ?? Initia_Distribution_V1_ValidatorHistoricalRewards()}
    set {_rewards = newValue}
  }
  /// Returns true if `rewards` has been explicitly set.
  var hasRewards: Bool {return self._rewards != nil}
  /// Clears the value of `rewards`. Subsequent reads from it will return its default value.
  mutating func clearRewards() {self._rewards = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _rewards: Initia_Distribution_V1_ValidatorHistoricalRewards? = nil
}

/// ValidatorCurrentRewardsRecord is used for import / export via genesis json.
struct Initia_Distribution_V1_ValidatorCurrentRewardsRecord {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// validator_address is the address of the validator.
  var validatorAddress: String = String()

  /// rewards defines the current rewards of a validator.
  var rewards: Initia_Distribution_V1_ValidatorCurrentRewards {
    get {return _rewards ?? Initia_Distribution_V1_ValidatorCurrentRewards()}
    set {_rewards = newValue}
  }
  /// Returns true if `rewards` has been explicitly set.
  var hasRewards: Bool {return self._rewards != nil}
  /// Clears the value of `rewards`. Subsequent reads from it will return its default value.
  mutating func clearRewards() {self._rewards = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _rewards: Initia_Distribution_V1_ValidatorCurrentRewards? = nil
}

/// DelegatorStartingInfoRecord used for import / export via genesis json.
struct Initia_Distribution_V1_DelegatorStartingInfoRecord {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// delegator_address is the address of the delegator.
  var delegatorAddress: String = String()

  /// validator_address is the address of the validator.
  var validatorAddress: String = String()

  /// starting_info defines the starting info of a delegator.
  var startingInfo: Initia_Distribution_V1_DelegatorStartingInfo {
    get {return _startingInfo ?? Initia_Distribution_V1_DelegatorStartingInfo()}
    set {_startingInfo = newValue}
  }
  /// Returns true if `startingInfo` has been explicitly set.
  var hasStartingInfo: Bool {return self._startingInfo != nil}
  /// Clears the value of `startingInfo`. Subsequent reads from it will return its default value.
  mutating func clearStartingInfo() {self._startingInfo = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _startingInfo: Initia_Distribution_V1_DelegatorStartingInfo? = nil
}

/// ValidatorSlashEventRecord is used for import / export via genesis json.
struct Initia_Distribution_V1_ValidatorSlashEventRecord {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// validator_address is the address of the validator.
  var validatorAddress: String = String()

  /// height defines the block height at which the slash event occurred.
  var height: UInt64 = 0

  /// period is the period of the slash event.
  var period: UInt64 = 0

  /// validator_slash_event describes the slash event.
  var validatorSlashEvent: Initia_Distribution_V1_ValidatorSlashEvent {
    get {return _validatorSlashEvent ?? Initia_Distribution_V1_ValidatorSlashEvent()}
    set {_validatorSlashEvent = newValue}
  }
  /// Returns true if `validatorSlashEvent` has been explicitly set.
  var hasValidatorSlashEvent: Bool {return self._validatorSlashEvent != nil}
  /// Clears the value of `validatorSlashEvent`. Subsequent reads from it will return its default value.
  mutating func clearValidatorSlashEvent() {self._validatorSlashEvent = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _validatorSlashEvent: Initia_Distribution_V1_ValidatorSlashEvent? = nil
}

/// GenesisState defines the distribution module's genesis state.
struct Initia_Distribution_V1_GenesisState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// params defines all the paramaters of the module.
  var params: Initia_Distribution_V1_Params {
    get {return _params ?? Initia_Distribution_V1_Params()}
    set {_params = newValue}
  }
  /// Returns true if `params` has been explicitly set.
  var hasParams: Bool {return self._params != nil}
  /// Clears the value of `params`. Subsequent reads from it will return its default value.
  mutating func clearParams() {self._params = nil}

  /// fee_pool defines the fee pool at genesis.
  var feePool: Cosmos_Distribution_V1beta1_FeePool {
    get {return _feePool ?? Cosmos_Distribution_V1beta1_FeePool()}
    set {_feePool = newValue}
  }
  /// Returns true if `feePool` has been explicitly set.
  var hasFeePool: Bool {return self._feePool != nil}
  /// Clears the value of `feePool`. Subsequent reads from it will return its default value.
  mutating func clearFeePool() {self._feePool = nil}

  /// fee_pool defines the delegator withdraw infos at genesis.
  var delegatorWithdrawInfos: [Cosmos_Distribution_V1beta1_DelegatorWithdrawInfo] = []

  /// fee_pool defines the previous proposer at genesis.
  var previousProposer: String = String()

  /// fee_pool defines the outstanding rewards of all validators at genesis.
  var outstandingRewards: [Initia_Distribution_V1_ValidatorOutstandingRewardsRecord] = []

  /// fee_pool defines the accumulated commissions of all validators at genesis.
  var validatorAccumulatedCommissions: [Initia_Distribution_V1_ValidatorAccumulatedCommissionRecord] = []

  /// fee_pool defines the historical rewards of all validators at genesis.
  var validatorHistoricalRewards: [Initia_Distribution_V1_ValidatorHistoricalRewardsRecord] = []

  /// fee_pool defines the current rewards of all validators at genesis.
  var validatorCurrentRewards: [Initia_Distribution_V1_ValidatorCurrentRewardsRecord] = []

  /// fee_pool defines the delegator starting infos at genesis.
  var delegatorStartingInfos: [Initia_Distribution_V1_DelegatorStartingInfoRecord] = []

  /// fee_pool defines the validator slash events at genesis.
  var validatorSlashEvents: [Initia_Distribution_V1_ValidatorSlashEventRecord] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _params: Initia_Distribution_V1_Params? = nil
  fileprivate var _feePool: Cosmos_Distribution_V1beta1_FeePool? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Initia_Distribution_V1_ValidatorOutstandingRewardsRecord: @unchecked Sendable {}
extension Initia_Distribution_V1_ValidatorAccumulatedCommissionRecord: @unchecked Sendable {}
extension Initia_Distribution_V1_ValidatorHistoricalRewardsRecord: @unchecked Sendable {}
extension Initia_Distribution_V1_ValidatorCurrentRewardsRecord: @unchecked Sendable {}
extension Initia_Distribution_V1_DelegatorStartingInfoRecord: @unchecked Sendable {}
extension Initia_Distribution_V1_ValidatorSlashEventRecord: @unchecked Sendable {}
extension Initia_Distribution_V1_GenesisState: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "initia.distribution.v1"

extension Initia_Distribution_V1_ValidatorOutstandingRewardsRecord: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ValidatorOutstandingRewardsRecord"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "validator_address"),
    2: .standard(proto: "outstanding_rewards"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.validatorAddress) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.outstandingRewards) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.validatorAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.validatorAddress, fieldNumber: 1)
    }
    if !self.outstandingRewards.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.outstandingRewards, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Initia_Distribution_V1_ValidatorOutstandingRewardsRecord, rhs: Initia_Distribution_V1_ValidatorOutstandingRewardsRecord) -> Bool {
    if lhs.validatorAddress != rhs.validatorAddress {return false}
    if lhs.outstandingRewards != rhs.outstandingRewards {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Initia_Distribution_V1_ValidatorAccumulatedCommissionRecord: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ValidatorAccumulatedCommissionRecord"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "validator_address"),
    2: .same(proto: "accumulated"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.validatorAddress) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._accumulated) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.validatorAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.validatorAddress, fieldNumber: 1)
    }
    try { if let v = self._accumulated {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Initia_Distribution_V1_ValidatorAccumulatedCommissionRecord, rhs: Initia_Distribution_V1_ValidatorAccumulatedCommissionRecord) -> Bool {
    if lhs.validatorAddress != rhs.validatorAddress {return false}
    if lhs._accumulated != rhs._accumulated {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Initia_Distribution_V1_ValidatorHistoricalRewardsRecord: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ValidatorHistoricalRewardsRecord"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "validator_address"),
    2: .same(proto: "period"),
    3: .same(proto: "rewards"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.validatorAddress) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.period) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._rewards) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.validatorAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.validatorAddress, fieldNumber: 1)
    }
    if self.period != 0 {
      try visitor.visitSingularUInt64Field(value: self.period, fieldNumber: 2)
    }
    try { if let v = self._rewards {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Initia_Distribution_V1_ValidatorHistoricalRewardsRecord, rhs: Initia_Distribution_V1_ValidatorHistoricalRewardsRecord) -> Bool {
    if lhs.validatorAddress != rhs.validatorAddress {return false}
    if lhs.period != rhs.period {return false}
    if lhs._rewards != rhs._rewards {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Initia_Distribution_V1_ValidatorCurrentRewardsRecord: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ValidatorCurrentRewardsRecord"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "validator_address"),
    2: .same(proto: "rewards"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.validatorAddress) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._rewards) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.validatorAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.validatorAddress, fieldNumber: 1)
    }
    try { if let v = self._rewards {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Initia_Distribution_V1_ValidatorCurrentRewardsRecord, rhs: Initia_Distribution_V1_ValidatorCurrentRewardsRecord) -> Bool {
    if lhs.validatorAddress != rhs.validatorAddress {return false}
    if lhs._rewards != rhs._rewards {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Initia_Distribution_V1_DelegatorStartingInfoRecord: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".DelegatorStartingInfoRecord"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "delegator_address"),
    2: .standard(proto: "validator_address"),
    3: .standard(proto: "starting_info"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.delegatorAddress) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.validatorAddress) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._startingInfo) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.delegatorAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.delegatorAddress, fieldNumber: 1)
    }
    if !self.validatorAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.validatorAddress, fieldNumber: 2)
    }
    try { if let v = self._startingInfo {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Initia_Distribution_V1_DelegatorStartingInfoRecord, rhs: Initia_Distribution_V1_DelegatorStartingInfoRecord) -> Bool {
    if lhs.delegatorAddress != rhs.delegatorAddress {return false}
    if lhs.validatorAddress != rhs.validatorAddress {return false}
    if lhs._startingInfo != rhs._startingInfo {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Initia_Distribution_V1_ValidatorSlashEventRecord: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ValidatorSlashEventRecord"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "validator_address"),
    2: .same(proto: "height"),
    3: .same(proto: "period"),
    4: .standard(proto: "validator_slash_event"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.validatorAddress) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.height) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.period) }()
      case 4: try { try decoder.decodeSingularMessageField(value: &self._validatorSlashEvent) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.validatorAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.validatorAddress, fieldNumber: 1)
    }
    if self.height != 0 {
      try visitor.visitSingularUInt64Field(value: self.height, fieldNumber: 2)
    }
    if self.period != 0 {
      try visitor.visitSingularUInt64Field(value: self.period, fieldNumber: 3)
    }
    try { if let v = self._validatorSlashEvent {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Initia_Distribution_V1_ValidatorSlashEventRecord, rhs: Initia_Distribution_V1_ValidatorSlashEventRecord) -> Bool {
    if lhs.validatorAddress != rhs.validatorAddress {return false}
    if lhs.height != rhs.height {return false}
    if lhs.period != rhs.period {return false}
    if lhs._validatorSlashEvent != rhs._validatorSlashEvent {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Initia_Distribution_V1_GenesisState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GenesisState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "params"),
    2: .standard(proto: "fee_pool"),
    3: .standard(proto: "delegator_withdraw_infos"),
    4: .standard(proto: "previous_proposer"),
    5: .standard(proto: "outstanding_rewards"),
    6: .standard(proto: "validator_accumulated_commissions"),
    7: .standard(proto: "validator_historical_rewards"),
    8: .standard(proto: "validator_current_rewards"),
    9: .standard(proto: "delegator_starting_infos"),
    10: .standard(proto: "validator_slash_events"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._params) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._feePool) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.delegatorWithdrawInfos) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.previousProposer) }()
      case 5: try { try decoder.decodeRepeatedMessageField(value: &self.outstandingRewards) }()
      case 6: try { try decoder.decodeRepeatedMessageField(value: &self.validatorAccumulatedCommissions) }()
      case 7: try { try decoder.decodeRepeatedMessageField(value: &self.validatorHistoricalRewards) }()
      case 8: try { try decoder.decodeRepeatedMessageField(value: &self.validatorCurrentRewards) }()
      case 9: try { try decoder.decodeRepeatedMessageField(value: &self.delegatorStartingInfos) }()
      case 10: try { try decoder.decodeRepeatedMessageField(value: &self.validatorSlashEvents) }()
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
    try { if let v = self._feePool {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    if !self.delegatorWithdrawInfos.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.delegatorWithdrawInfos, fieldNumber: 3)
    }
    if !self.previousProposer.isEmpty {
      try visitor.visitSingularStringField(value: self.previousProposer, fieldNumber: 4)
    }
    if !self.outstandingRewards.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.outstandingRewards, fieldNumber: 5)
    }
    if !self.validatorAccumulatedCommissions.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.validatorAccumulatedCommissions, fieldNumber: 6)
    }
    if !self.validatorHistoricalRewards.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.validatorHistoricalRewards, fieldNumber: 7)
    }
    if !self.validatorCurrentRewards.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.validatorCurrentRewards, fieldNumber: 8)
    }
    if !self.delegatorStartingInfos.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.delegatorStartingInfos, fieldNumber: 9)
    }
    if !self.validatorSlashEvents.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.validatorSlashEvents, fieldNumber: 10)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Initia_Distribution_V1_GenesisState, rhs: Initia_Distribution_V1_GenesisState) -> Bool {
    if lhs._params != rhs._params {return false}
    if lhs._feePool != rhs._feePool {return false}
    if lhs.delegatorWithdrawInfos != rhs.delegatorWithdrawInfos {return false}
    if lhs.previousProposer != rhs.previousProposer {return false}
    if lhs.outstandingRewards != rhs.outstandingRewards {return false}
    if lhs.validatorAccumulatedCommissions != rhs.validatorAccumulatedCommissions {return false}
    if lhs.validatorHistoricalRewards != rhs.validatorHistoricalRewards {return false}
    if lhs.validatorCurrentRewards != rhs.validatorCurrentRewards {return false}
    if lhs.delegatorStartingInfos != rhs.delegatorStartingInfos {return false}
    if lhs.validatorSlashEvents != rhs.validatorSlashEvents {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
