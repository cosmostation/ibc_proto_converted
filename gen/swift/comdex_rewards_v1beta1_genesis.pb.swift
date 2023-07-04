// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: comdex/rewards/v1beta1/genesis.proto
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

/// GenesisState defines the rewards module's genesis state.
struct Comdex_Rewards_V1beta1_GenesisState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var internalRewards: [Comdex_Rewards_V1beta1_InternalRewards] = []

  var lockerRewardsTracker: [Comdex_Rewards_V1beta1_LockerRewardsTracker] = []

  var vaultInterestTracker: [Comdex_Rewards_V1beta1_VaultInterestTracker] = []

  var lockerExternalRewards: [Comdex_Rewards_V1beta1_LockerExternalRewards] = []

  var vaultExternalRewards: [Comdex_Rewards_V1beta1_VaultExternalRewards] = []

  var appIds: [UInt64] = []

  var epochInfo: [Comdex_Rewards_V1beta1_EpochInfo] = []

  var gauge: [Comdex_Rewards_V1beta1_Gauge] = []

  var gaugeByTriggerDuration: [Comdex_Rewards_V1beta1_GaugeByTriggerDuration] = []

  var params: Comdex_Rewards_V1beta1_Params {
    get {return _params ?? Comdex_Rewards_V1beta1_Params()}
    set {_params = newValue}
  }
  /// Returns true if `params` has been explicitly set.
  var hasParams: Bool {return self._params != nil}
  /// Clears the value of `params`. Subsequent reads from it will return its default value.
  mutating func clearParams() {self._params = nil}

  var lendExternalRewards: [Comdex_Rewards_V1beta1_LendExternalRewards] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _params: Comdex_Rewards_V1beta1_Params? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Comdex_Rewards_V1beta1_GenesisState: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "comdex.rewards.v1beta1"

extension Comdex_Rewards_V1beta1_GenesisState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GenesisState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "internal_rewards"),
    2: .standard(proto: "locker_rewards_tracker"),
    3: .standard(proto: "vault_interest_tracker"),
    4: .standard(proto: "locker_external_rewards"),
    5: .standard(proto: "vault_external_rewards"),
    6: .same(proto: "appIDs"),
    7: .same(proto: "epochInfo"),
    8: .same(proto: "gauge"),
    9: .same(proto: "gaugeByTriggerDuration"),
    10: .same(proto: "params"),
    11: .same(proto: "lendExternalRewards"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.internalRewards) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.lockerRewardsTracker) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.vaultInterestTracker) }()
      case 4: try { try decoder.decodeRepeatedMessageField(value: &self.lockerExternalRewards) }()
      case 5: try { try decoder.decodeRepeatedMessageField(value: &self.vaultExternalRewards) }()
      case 6: try { try decoder.decodeRepeatedUInt64Field(value: &self.appIds) }()
      case 7: try { try decoder.decodeRepeatedMessageField(value: &self.epochInfo) }()
      case 8: try { try decoder.decodeRepeatedMessageField(value: &self.gauge) }()
      case 9: try { try decoder.decodeRepeatedMessageField(value: &self.gaugeByTriggerDuration) }()
      case 10: try { try decoder.decodeSingularMessageField(value: &self._params) }()
      case 11: try { try decoder.decodeRepeatedMessageField(value: &self.lendExternalRewards) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.internalRewards.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.internalRewards, fieldNumber: 1)
    }
    if !self.lockerRewardsTracker.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.lockerRewardsTracker, fieldNumber: 2)
    }
    if !self.vaultInterestTracker.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.vaultInterestTracker, fieldNumber: 3)
    }
    if !self.lockerExternalRewards.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.lockerExternalRewards, fieldNumber: 4)
    }
    if !self.vaultExternalRewards.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.vaultExternalRewards, fieldNumber: 5)
    }
    if !self.appIds.isEmpty {
      try visitor.visitPackedUInt64Field(value: self.appIds, fieldNumber: 6)
    }
    if !self.epochInfo.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.epochInfo, fieldNumber: 7)
    }
    if !self.gauge.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.gauge, fieldNumber: 8)
    }
    if !self.gaugeByTriggerDuration.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.gaugeByTriggerDuration, fieldNumber: 9)
    }
    try { if let v = self._params {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 10)
    } }()
    if !self.lendExternalRewards.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.lendExternalRewards, fieldNumber: 11)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Comdex_Rewards_V1beta1_GenesisState, rhs: Comdex_Rewards_V1beta1_GenesisState) -> Bool {
    if lhs.internalRewards != rhs.internalRewards {return false}
    if lhs.lockerRewardsTracker != rhs.lockerRewardsTracker {return false}
    if lhs.vaultInterestTracker != rhs.vaultInterestTracker {return false}
    if lhs.lockerExternalRewards != rhs.lockerExternalRewards {return false}
    if lhs.vaultExternalRewards != rhs.vaultExternalRewards {return false}
    if lhs.appIds != rhs.appIds {return false}
    if lhs.epochInfo != rhs.epochInfo {return false}
    if lhs.gauge != rhs.gauge {return false}
    if lhs.gaugeByTriggerDuration != rhs.gaugeByTriggerDuration {return false}
    if lhs._params != rhs._params {return false}
    if lhs.lendExternalRewards != rhs.lendExternalRewards {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}