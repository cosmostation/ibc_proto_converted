// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: crescent/liquidfarming/v1beta1/tx.proto
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

/// MsgLiquidFarm defines a SDK message for farming pool coin for a liquid farm.
struct Crescent_Liquidfarming_V1beta1_MsgLiquidFarm {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var poolID: UInt64 = 0

  var farmer: String = String()

  var farmingCoin: Cosmos_Base_V1beta1_Coin {
    get {return _farmingCoin ?? Cosmos_Base_V1beta1_Coin()}
    set {_farmingCoin = newValue}
  }
  /// Returns true if `farmingCoin` has been explicitly set.
  var hasFarmingCoin: Bool {return self._farmingCoin != nil}
  /// Clears the value of `farmingCoin`. Subsequent reads from it will return its default value.
  mutating func clearFarmingCoin() {self._farmingCoin = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _farmingCoin: Cosmos_Base_V1beta1_Coin? = nil
}

/// MsgLiquidFarmResponse defines the MsgLiquidFarmResponse response type.
struct Crescent_Liquidfarming_V1beta1_MsgLiquidFarmResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgLiquidUnfarm defines a SDK message for unfarming LFCoin.
struct Crescent_Liquidfarming_V1beta1_MsgLiquidUnfarm {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var poolID: UInt64 = 0

  var farmer: String = String()

  var unfarmingCoin: Cosmos_Base_V1beta1_Coin {
    get {return _unfarmingCoin ?? Cosmos_Base_V1beta1_Coin()}
    set {_unfarmingCoin = newValue}
  }
  /// Returns true if `unfarmingCoin` has been explicitly set.
  var hasUnfarmingCoin: Bool {return self._unfarmingCoin != nil}
  /// Clears the value of `unfarmingCoin`. Subsequent reads from it will return its default value.
  mutating func clearUnfarmingCoin() {self._unfarmingCoin = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _unfarmingCoin: Cosmos_Base_V1beta1_Coin? = nil
}

/// MsgLiquidUnfarmResponse defines the MsgLiquidUnfarmResponse response type.
struct Crescent_Liquidfarming_V1beta1_MsgLiquidUnfarmResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgLiquidUnfarmAndWithdraw defines a SDK message for unfarming LFCoin.
struct Crescent_Liquidfarming_V1beta1_MsgLiquidUnfarmAndWithdraw {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var poolID: UInt64 = 0

  var farmer: String = String()

  var unfarmingCoin: Cosmos_Base_V1beta1_Coin {
    get {return _unfarmingCoin ?? Cosmos_Base_V1beta1_Coin()}
    set {_unfarmingCoin = newValue}
  }
  /// Returns true if `unfarmingCoin` has been explicitly set.
  var hasUnfarmingCoin: Bool {return self._unfarmingCoin != nil}
  /// Clears the value of `unfarmingCoin`. Subsequent reads from it will return its default value.
  mutating func clearUnfarmingCoin() {self._unfarmingCoin = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _unfarmingCoin: Cosmos_Base_V1beta1_Coin? = nil
}

/// MsgLiquidUnfarmAndWithdrawResponse defines the MsgLiquidUnfarmAndWithdrawResponse response type.
struct Crescent_Liquidfarming_V1beta1_MsgLiquidUnfarmAndWithdrawResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgPlaceBid defines a SDK message for placing a bid for a rewards auction.
struct Crescent_Liquidfarming_V1beta1_MsgPlaceBid {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var auctionID: UInt64 = 0

  var poolID: UInt64 = 0

  var bidder: String = String()

  var biddingCoin: Cosmos_Base_V1beta1_Coin {
    get {return _biddingCoin ?? Cosmos_Base_V1beta1_Coin()}
    set {_biddingCoin = newValue}
  }
  /// Returns true if `biddingCoin` has been explicitly set.
  var hasBiddingCoin: Bool {return self._biddingCoin != nil}
  /// Clears the value of `biddingCoin`. Subsequent reads from it will return its default value.
  mutating func clearBiddingCoin() {self._biddingCoin = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _biddingCoin: Cosmos_Base_V1beta1_Coin? = nil
}

/// MsgPlaceBidResponse defines the MsgPlaceBidResponse response type.
struct Crescent_Liquidfarming_V1beta1_MsgPlaceBidResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgRefundBid defines a SDK message for refunding the bid that is not winning for the auction.
struct Crescent_Liquidfarming_V1beta1_MsgRefundBid {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var auctionID: UInt64 = 0

  var poolID: UInt64 = 0

  var bidder: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgRefundBidResponse defines the MsgRefundBidResponse response type.
struct Crescent_Liquidfarming_V1beta1_MsgRefundBidResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgAdvanceAuction defines a message to advance rewards auction by one.
struct Crescent_Liquidfarming_V1beta1_MsgAdvanceAuction {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// requester defines the bech32-encoded address of the requester
  var requester: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgAdvanceAuctionResponse defines the Msg/AdvanceAuction response type.
struct Crescent_Liquidfarming_V1beta1_MsgAdvanceAuctionResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Crescent_Liquidfarming_V1beta1_MsgLiquidFarm: @unchecked Sendable {}
extension Crescent_Liquidfarming_V1beta1_MsgLiquidFarmResponse: @unchecked Sendable {}
extension Crescent_Liquidfarming_V1beta1_MsgLiquidUnfarm: @unchecked Sendable {}
extension Crescent_Liquidfarming_V1beta1_MsgLiquidUnfarmResponse: @unchecked Sendable {}
extension Crescent_Liquidfarming_V1beta1_MsgLiquidUnfarmAndWithdraw: @unchecked Sendable {}
extension Crescent_Liquidfarming_V1beta1_MsgLiquidUnfarmAndWithdrawResponse: @unchecked Sendable {}
extension Crescent_Liquidfarming_V1beta1_MsgPlaceBid: @unchecked Sendable {}
extension Crescent_Liquidfarming_V1beta1_MsgPlaceBidResponse: @unchecked Sendable {}
extension Crescent_Liquidfarming_V1beta1_MsgRefundBid: @unchecked Sendable {}
extension Crescent_Liquidfarming_V1beta1_MsgRefundBidResponse: @unchecked Sendable {}
extension Crescent_Liquidfarming_V1beta1_MsgAdvanceAuction: @unchecked Sendable {}
extension Crescent_Liquidfarming_V1beta1_MsgAdvanceAuctionResponse: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "crescent.liquidfarming.v1beta1"

extension Crescent_Liquidfarming_V1beta1_MsgLiquidFarm: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgLiquidFarm"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "pool_id"),
    2: .same(proto: "farmer"),
    3: .standard(proto: "farming_coin"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.poolID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.farmer) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._farmingCoin) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if self.poolID != 0 {
      try visitor.visitSingularUInt64Field(value: self.poolID, fieldNumber: 1)
    }
    if !self.farmer.isEmpty {
      try visitor.visitSingularStringField(value: self.farmer, fieldNumber: 2)
    }
    try { if let v = self._farmingCoin {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Crescent_Liquidfarming_V1beta1_MsgLiquidFarm, rhs: Crescent_Liquidfarming_V1beta1_MsgLiquidFarm) -> Bool {
    if lhs.poolID != rhs.poolID {return false}
    if lhs.farmer != rhs.farmer {return false}
    if lhs._farmingCoin != rhs._farmingCoin {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Crescent_Liquidfarming_V1beta1_MsgLiquidFarmResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgLiquidFarmResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Crescent_Liquidfarming_V1beta1_MsgLiquidFarmResponse, rhs: Crescent_Liquidfarming_V1beta1_MsgLiquidFarmResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Crescent_Liquidfarming_V1beta1_MsgLiquidUnfarm: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgLiquidUnfarm"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "pool_id"),
    2: .same(proto: "farmer"),
    3: .standard(proto: "unfarming_coin"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.poolID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.farmer) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._unfarmingCoin) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if self.poolID != 0 {
      try visitor.visitSingularUInt64Field(value: self.poolID, fieldNumber: 1)
    }
    if !self.farmer.isEmpty {
      try visitor.visitSingularStringField(value: self.farmer, fieldNumber: 2)
    }
    try { if let v = self._unfarmingCoin {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Crescent_Liquidfarming_V1beta1_MsgLiquidUnfarm, rhs: Crescent_Liquidfarming_V1beta1_MsgLiquidUnfarm) -> Bool {
    if lhs.poolID != rhs.poolID {return false}
    if lhs.farmer != rhs.farmer {return false}
    if lhs._unfarmingCoin != rhs._unfarmingCoin {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Crescent_Liquidfarming_V1beta1_MsgLiquidUnfarmResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgLiquidUnfarmResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Crescent_Liquidfarming_V1beta1_MsgLiquidUnfarmResponse, rhs: Crescent_Liquidfarming_V1beta1_MsgLiquidUnfarmResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Crescent_Liquidfarming_V1beta1_MsgLiquidUnfarmAndWithdraw: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgLiquidUnfarmAndWithdraw"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "pool_id"),
    2: .same(proto: "farmer"),
    3: .standard(proto: "unfarming_coin"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.poolID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.farmer) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._unfarmingCoin) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if self.poolID != 0 {
      try visitor.visitSingularUInt64Field(value: self.poolID, fieldNumber: 1)
    }
    if !self.farmer.isEmpty {
      try visitor.visitSingularStringField(value: self.farmer, fieldNumber: 2)
    }
    try { if let v = self._unfarmingCoin {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Crescent_Liquidfarming_V1beta1_MsgLiquidUnfarmAndWithdraw, rhs: Crescent_Liquidfarming_V1beta1_MsgLiquidUnfarmAndWithdraw) -> Bool {
    if lhs.poolID != rhs.poolID {return false}
    if lhs.farmer != rhs.farmer {return false}
    if lhs._unfarmingCoin != rhs._unfarmingCoin {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Crescent_Liquidfarming_V1beta1_MsgLiquidUnfarmAndWithdrawResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgLiquidUnfarmAndWithdrawResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Crescent_Liquidfarming_V1beta1_MsgLiquidUnfarmAndWithdrawResponse, rhs: Crescent_Liquidfarming_V1beta1_MsgLiquidUnfarmAndWithdrawResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Crescent_Liquidfarming_V1beta1_MsgPlaceBid: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgPlaceBid"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "auction_id"),
    2: .standard(proto: "pool_id"),
    3: .same(proto: "bidder"),
    4: .standard(proto: "bidding_coin"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.auctionID) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.poolID) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.bidder) }()
      case 4: try { try decoder.decodeSingularMessageField(value: &self._biddingCoin) }()
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
    if self.poolID != 0 {
      try visitor.visitSingularUInt64Field(value: self.poolID, fieldNumber: 2)
    }
    if !self.bidder.isEmpty {
      try visitor.visitSingularStringField(value: self.bidder, fieldNumber: 3)
    }
    try { if let v = self._biddingCoin {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Crescent_Liquidfarming_V1beta1_MsgPlaceBid, rhs: Crescent_Liquidfarming_V1beta1_MsgPlaceBid) -> Bool {
    if lhs.auctionID != rhs.auctionID {return false}
    if lhs.poolID != rhs.poolID {return false}
    if lhs.bidder != rhs.bidder {return false}
    if lhs._biddingCoin != rhs._biddingCoin {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Crescent_Liquidfarming_V1beta1_MsgPlaceBidResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgPlaceBidResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Crescent_Liquidfarming_V1beta1_MsgPlaceBidResponse, rhs: Crescent_Liquidfarming_V1beta1_MsgPlaceBidResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Crescent_Liquidfarming_V1beta1_MsgRefundBid: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgRefundBid"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "auction_id"),
    2: .standard(proto: "pool_id"),
    3: .same(proto: "bidder"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.auctionID) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.poolID) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.bidder) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.auctionID != 0 {
      try visitor.visitSingularUInt64Field(value: self.auctionID, fieldNumber: 1)
    }
    if self.poolID != 0 {
      try visitor.visitSingularUInt64Field(value: self.poolID, fieldNumber: 2)
    }
    if !self.bidder.isEmpty {
      try visitor.visitSingularStringField(value: self.bidder, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Crescent_Liquidfarming_V1beta1_MsgRefundBid, rhs: Crescent_Liquidfarming_V1beta1_MsgRefundBid) -> Bool {
    if lhs.auctionID != rhs.auctionID {return false}
    if lhs.poolID != rhs.poolID {return false}
    if lhs.bidder != rhs.bidder {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Crescent_Liquidfarming_V1beta1_MsgRefundBidResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgRefundBidResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Crescent_Liquidfarming_V1beta1_MsgRefundBidResponse, rhs: Crescent_Liquidfarming_V1beta1_MsgRefundBidResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Crescent_Liquidfarming_V1beta1_MsgAdvanceAuction: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgAdvanceAuction"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "requester"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.requester) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.requester.isEmpty {
      try visitor.visitSingularStringField(value: self.requester, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Crescent_Liquidfarming_V1beta1_MsgAdvanceAuction, rhs: Crescent_Liquidfarming_V1beta1_MsgAdvanceAuction) -> Bool {
    if lhs.requester != rhs.requester {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Crescent_Liquidfarming_V1beta1_MsgAdvanceAuctionResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgAdvanceAuctionResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Crescent_Liquidfarming_V1beta1_MsgAdvanceAuctionResponse, rhs: Crescent_Liquidfarming_V1beta1_MsgAdvanceAuctionResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
