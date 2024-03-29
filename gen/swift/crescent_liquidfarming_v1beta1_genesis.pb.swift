// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: crescent/liquidfarming/v1beta1/genesis.proto
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

/// GenesisState defines the liquidfarming module's genesis state.
struct Crescent_Liquidfarming_V1beta1_GenesisState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var params: Crescent_Liquidfarming_V1beta1_Params {
    get {return _params ?? Crescent_Liquidfarming_V1beta1_Params()}
    set {_params = newValue}
  }
  /// Returns true if `params` has been explicitly set.
  var hasParams: Bool {return self._params != nil}
  /// Clears the value of `params`. Subsequent reads from it will return its default value.
  mutating func clearParams() {self._params = nil}

  var lastRewardsAuctionIDRecord: [Crescent_Liquidfarming_V1beta1_LastRewardsAuctionIdRecord] = []

  var liquidFarms: [Crescent_Liquidfarming_V1beta1_LiquidFarm] = []

  var rewardsAuctions: [Crescent_Liquidfarming_V1beta1_RewardsAuction] = []

  var bids: [Crescent_Liquidfarming_V1beta1_Bid] = []

  var winningBidRecords: [Crescent_Liquidfarming_V1beta1_WinningBidRecord] = []

  var lastRewardsAuctionEndTime: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _lastRewardsAuctionEndTime ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_lastRewardsAuctionEndTime = newValue}
  }
  /// Returns true if `lastRewardsAuctionEndTime` has been explicitly set.
  var hasLastRewardsAuctionEndTime: Bool {return self._lastRewardsAuctionEndTime != nil}
  /// Clears the value of `lastRewardsAuctionEndTime`. Subsequent reads from it will return its default value.
  mutating func clearLastRewardsAuctionEndTime() {self._lastRewardsAuctionEndTime = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _params: Crescent_Liquidfarming_V1beta1_Params? = nil
  fileprivate var _lastRewardsAuctionEndTime: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
}

struct Crescent_Liquidfarming_V1beta1_LastRewardsAuctionIdRecord {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var poolID: UInt64 = 0

  var auctionID: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// WinningBidRecord defines a custom winning bid record that is required to be recorded
/// in genesis state.
struct Crescent_Liquidfarming_V1beta1_WinningBidRecord {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var auctionID: UInt64 = 0

  var winningBid: Crescent_Liquidfarming_V1beta1_Bid {
    get {return _winningBid ?? Crescent_Liquidfarming_V1beta1_Bid()}
    set {_winningBid = newValue}
  }
  /// Returns true if `winningBid` has been explicitly set.
  var hasWinningBid: Bool {return self._winningBid != nil}
  /// Clears the value of `winningBid`. Subsequent reads from it will return its default value.
  mutating func clearWinningBid() {self._winningBid = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _winningBid: Crescent_Liquidfarming_V1beta1_Bid? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Crescent_Liquidfarming_V1beta1_GenesisState: @unchecked Sendable {}
extension Crescent_Liquidfarming_V1beta1_LastRewardsAuctionIdRecord: @unchecked Sendable {}
extension Crescent_Liquidfarming_V1beta1_WinningBidRecord: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "crescent.liquidfarming.v1beta1"

extension Crescent_Liquidfarming_V1beta1_GenesisState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GenesisState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "params"),
    2: .standard(proto: "last_rewards_auction_id_record"),
    3: .standard(proto: "liquid_farms"),
    4: .standard(proto: "rewards_auctions"),
    5: .same(proto: "bids"),
    6: .standard(proto: "winning_bid_records"),
    7: .standard(proto: "last_rewards_auction_end_time"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._params) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.lastRewardsAuctionIDRecord) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.liquidFarms) }()
      case 4: try { try decoder.decodeRepeatedMessageField(value: &self.rewardsAuctions) }()
      case 5: try { try decoder.decodeRepeatedMessageField(value: &self.bids) }()
      case 6: try { try decoder.decodeRepeatedMessageField(value: &self.winningBidRecords) }()
      case 7: try { try decoder.decodeSingularMessageField(value: &self._lastRewardsAuctionEndTime) }()
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
    if !self.lastRewardsAuctionIDRecord.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.lastRewardsAuctionIDRecord, fieldNumber: 2)
    }
    if !self.liquidFarms.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.liquidFarms, fieldNumber: 3)
    }
    if !self.rewardsAuctions.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.rewardsAuctions, fieldNumber: 4)
    }
    if !self.bids.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.bids, fieldNumber: 5)
    }
    if !self.winningBidRecords.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.winningBidRecords, fieldNumber: 6)
    }
    try { if let v = self._lastRewardsAuctionEndTime {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 7)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Crescent_Liquidfarming_V1beta1_GenesisState, rhs: Crescent_Liquidfarming_V1beta1_GenesisState) -> Bool {
    if lhs._params != rhs._params {return false}
    if lhs.lastRewardsAuctionIDRecord != rhs.lastRewardsAuctionIDRecord {return false}
    if lhs.liquidFarms != rhs.liquidFarms {return false}
    if lhs.rewardsAuctions != rhs.rewardsAuctions {return false}
    if lhs.bids != rhs.bids {return false}
    if lhs.winningBidRecords != rhs.winningBidRecords {return false}
    if lhs._lastRewardsAuctionEndTime != rhs._lastRewardsAuctionEndTime {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Crescent_Liquidfarming_V1beta1_LastRewardsAuctionIdRecord: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".LastRewardsAuctionIdRecord"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "pool_id"),
    2: .standard(proto: "auction_id"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.poolID) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.auctionID) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.poolID != 0 {
      try visitor.visitSingularUInt64Field(value: self.poolID, fieldNumber: 1)
    }
    if self.auctionID != 0 {
      try visitor.visitSingularUInt64Field(value: self.auctionID, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Crescent_Liquidfarming_V1beta1_LastRewardsAuctionIdRecord, rhs: Crescent_Liquidfarming_V1beta1_LastRewardsAuctionIdRecord) -> Bool {
    if lhs.poolID != rhs.poolID {return false}
    if lhs.auctionID != rhs.auctionID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Crescent_Liquidfarming_V1beta1_WinningBidRecord: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".WinningBidRecord"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "auction_id"),
    2: .standard(proto: "winning_bid"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.auctionID) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._winningBid) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if self.auctionID != 0 {
      try visitor.visitSingularUInt64Field(value: self.auctionID, fieldNumber: 1)
    }
    try { if let v = self._winningBid {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Crescent_Liquidfarming_V1beta1_WinningBidRecord, rhs: Crescent_Liquidfarming_V1beta1_WinningBidRecord) -> Bool {
    if lhs.auctionID != rhs.auctionID {return false}
    if lhs._winningBid != rhs._winningBid {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
