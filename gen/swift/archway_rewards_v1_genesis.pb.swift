// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: archway/rewards/v1/genesis.proto
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

/// GenesisState defines the initial state of the tracking module.
struct Archway_Rewards_V1_GenesisState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// params defines all the module parameters.
  var params: Archway_Rewards_V1_Params {
    get {return _params ?? Archway_Rewards_V1_Params()}
    set {_params = newValue}
  }
  /// Returns true if `params` has been explicitly set.
  var hasParams: Bool {return self._params != nil}
  /// Clears the value of `params`. Subsequent reads from it will return its default value.
  mutating func clearParams() {self._params = nil}

  /// contracts_metadata defines a list of all contracts metadata.
  var contractsMetadata: [Archway_Rewards_V1_ContractMetadata] = []

  /// block_rewards defines a list of all block rewards objects.
  var blockRewards: [Archway_Rewards_V1_BlockRewards] = []

  /// tx_rewards defines a list of all tx rewards objects.
  var txRewards: [Archway_Rewards_V1_TxRewards] = []

  /// min_consensus_fee defines the minimum gas unit price.
  var minConsensusFee: Cosmos_Base_V1beta1_DecCoin {
    get {return _minConsensusFee ?? Cosmos_Base_V1beta1_DecCoin()}
    set {_minConsensusFee = newValue}
  }
  /// Returns true if `minConsensusFee` has been explicitly set.
  var hasMinConsensusFee: Bool {return self._minConsensusFee != nil}
  /// Clears the value of `minConsensusFee`. Subsequent reads from it will return its default value.
  mutating func clearMinConsensusFee() {self._minConsensusFee = nil}

  /// rewards_record_last_id defines the last unique ID for a RewardsRecord objs.
  var rewardsRecordLastID: UInt64 = 0

  /// rewards_records defines a list of all active (undistributed) rewards
  /// records.
  var rewardsRecords: [Archway_Rewards_V1_RewardsRecord] = []

  /// flat_fees defines a list of contract flat fee.
  var flatFees: [Archway_Rewards_V1_FlatFee] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _params: Archway_Rewards_V1_Params? = nil
  fileprivate var _minConsensusFee: Cosmos_Base_V1beta1_DecCoin? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Archway_Rewards_V1_GenesisState: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "archway.rewards.v1"

extension Archway_Rewards_V1_GenesisState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GenesisState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "params"),
    2: .standard(proto: "contracts_metadata"),
    3: .standard(proto: "block_rewards"),
    4: .standard(proto: "tx_rewards"),
    5: .standard(proto: "min_consensus_fee"),
    6: .standard(proto: "rewards_record_last_id"),
    7: .standard(proto: "rewards_records"),
    8: .standard(proto: "flat_fees"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._params) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.contractsMetadata) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.blockRewards) }()
      case 4: try { try decoder.decodeRepeatedMessageField(value: &self.txRewards) }()
      case 5: try { try decoder.decodeSingularMessageField(value: &self._minConsensusFee) }()
      case 6: try { try decoder.decodeSingularUInt64Field(value: &self.rewardsRecordLastID) }()
      case 7: try { try decoder.decodeRepeatedMessageField(value: &self.rewardsRecords) }()
      case 8: try { try decoder.decodeRepeatedMessageField(value: &self.flatFees) }()
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
    if !self.contractsMetadata.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.contractsMetadata, fieldNumber: 2)
    }
    if !self.blockRewards.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.blockRewards, fieldNumber: 3)
    }
    if !self.txRewards.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.txRewards, fieldNumber: 4)
    }
    try { if let v = self._minConsensusFee {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 5)
    } }()
    if self.rewardsRecordLastID != 0 {
      try visitor.visitSingularUInt64Field(value: self.rewardsRecordLastID, fieldNumber: 6)
    }
    if !self.rewardsRecords.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.rewardsRecords, fieldNumber: 7)
    }
    if !self.flatFees.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.flatFees, fieldNumber: 8)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Archway_Rewards_V1_GenesisState, rhs: Archway_Rewards_V1_GenesisState) -> Bool {
    if lhs._params != rhs._params {return false}
    if lhs.contractsMetadata != rhs.contractsMetadata {return false}
    if lhs.blockRewards != rhs.blockRewards {return false}
    if lhs.txRewards != rhs.txRewards {return false}
    if lhs._minConsensusFee != rhs._minConsensusFee {return false}
    if lhs.rewardsRecordLastID != rhs.rewardsRecordLastID {return false}
    if lhs.rewardsRecords != rhs.rewardsRecords {return false}
    if lhs.flatFees != rhs.flatFees {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}