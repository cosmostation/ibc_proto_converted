// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: OmniFlix/marketplace/v1beta1/auction.proto
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

enum OmniFlix_Marketplace_V1beta1_AuctionStatus: SwiftProtobuf.Enum {
  typealias RawValue = Int
  case unspecified // = 0
  case inactive // = 1
  case active // = 2
  case UNRECOGNIZED(Int)

  init() {
    self = .unspecified
  }

  init?(rawValue: Int) {
    switch rawValue {
    case 0: self = .unspecified
    case 1: self = .inactive
    case 2: self = .active
    default: self = .UNRECOGNIZED(rawValue)
    }
  }

  var rawValue: Int {
    switch self {
    case .unspecified: return 0
    case .inactive: return 1
    case .active: return 2
    case .UNRECOGNIZED(let i): return i
    }
  }

}

#if swift(>=4.2)

extension OmniFlix_Marketplace_V1beta1_AuctionStatus: CaseIterable {
  // The compiler won't synthesize support with the UNRECOGNIZED case.
  static var allCases: [OmniFlix_Marketplace_V1beta1_AuctionStatus] = [
    .unspecified,
    .inactive,
    .active,
  ]
}

#endif  // swift(>=4.2)

struct OmniFlix_Marketplace_V1beta1_AuctionListing {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var id: UInt64 = 0

  var nftID: String = String()

  var denomID: String = String()

  var startPrice: Cosmos_Base_V1beta1_Coin {
    get {return _startPrice ?? Cosmos_Base_V1beta1_Coin()}
    set {_startPrice = newValue}
  }
  /// Returns true if `startPrice` has been explicitly set.
  var hasStartPrice: Bool {return self._startPrice != nil}
  /// Clears the value of `startPrice`. Subsequent reads from it will return its default value.
  mutating func clearStartPrice() {self._startPrice = nil}

  var startTime: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _startTime ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_startTime = newValue}
  }
  /// Returns true if `startTime` has been explicitly set.
  var hasStartTime: Bool {return self._startTime != nil}
  /// Clears the value of `startTime`. Subsequent reads from it will return its default value.
  mutating func clearStartTime() {self._startTime = nil}

  var endTime: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _endTime ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_endTime = newValue}
  }
  /// Returns true if `endTime` has been explicitly set.
  var hasEndTime: Bool {return self._endTime != nil}
  /// Clears the value of `endTime`. Subsequent reads from it will return its default value.
  mutating func clearEndTime() {self._endTime = nil}

  var owner: String = String()

  var incrementPercentage: String = String()

  var whitelistAccounts: [String] = []

  var splitShares: [OmniFlix_Marketplace_V1beta1_WeightedAddress] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _startPrice: Cosmos_Base_V1beta1_Coin? = nil
  fileprivate var _startTime: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
  fileprivate var _endTime: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
}

struct OmniFlix_Marketplace_V1beta1_Bid {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var auctionID: UInt64 = 0

  var bidder: String = String()

  var amount: Cosmos_Base_V1beta1_Coin {
    get {return _amount ?? Cosmos_Base_V1beta1_Coin()}
    set {_amount = newValue}
  }
  /// Returns true if `amount` has been explicitly set.
  var hasAmount: Bool {return self._amount != nil}
  /// Clears the value of `amount`. Subsequent reads from it will return its default value.
  mutating func clearAmount() {self._amount = nil}

  var time: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _time ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_time = newValue}
  }
  /// Returns true if `time` has been explicitly set.
  var hasTime: Bool {return self._time != nil}
  /// Clears the value of `time`. Subsequent reads from it will return its default value.
  mutating func clearTime() {self._time = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _amount: Cosmos_Base_V1beta1_Coin? = nil
  fileprivate var _time: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension OmniFlix_Marketplace_V1beta1_AuctionStatus: @unchecked Sendable {}
extension OmniFlix_Marketplace_V1beta1_AuctionListing: @unchecked Sendable {}
extension OmniFlix_Marketplace_V1beta1_Bid: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "OmniFlix.marketplace.v1beta1"

extension OmniFlix_Marketplace_V1beta1_AuctionStatus: SwiftProtobuf._ProtoNameProviding {
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    0: .same(proto: "AUCTION_STATUS_UNSPECIFIED"),
    1: .same(proto: "AUCTION_STATUS_INACTIVE"),
    2: .same(proto: "AUCTION_STATUS_ACTIVE"),
  ]
}

extension OmniFlix_Marketplace_V1beta1_AuctionListing: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".AuctionListing"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
    2: .standard(proto: "nft_id"),
    3: .standard(proto: "denom_id"),
    4: .standard(proto: "start_price"),
    5: .standard(proto: "start_time"),
    6: .standard(proto: "end_time"),
    7: .same(proto: "owner"),
    8: .standard(proto: "increment_percentage"),
    9: .standard(proto: "whitelist_accounts"),
    10: .standard(proto: "split_shares"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.id) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.nftID) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.denomID) }()
      case 4: try { try decoder.decodeSingularMessageField(value: &self._startPrice) }()
      case 5: try { try decoder.decodeSingularMessageField(value: &self._startTime) }()
      case 6: try { try decoder.decodeSingularMessageField(value: &self._endTime) }()
      case 7: try { try decoder.decodeSingularStringField(value: &self.owner) }()
      case 8: try { try decoder.decodeSingularStringField(value: &self.incrementPercentage) }()
      case 9: try { try decoder.decodeRepeatedStringField(value: &self.whitelistAccounts) }()
      case 10: try { try decoder.decodeRepeatedMessageField(value: &self.splitShares) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if self.id != 0 {
      try visitor.visitSingularUInt64Field(value: self.id, fieldNumber: 1)
    }
    if !self.nftID.isEmpty {
      try visitor.visitSingularStringField(value: self.nftID, fieldNumber: 2)
    }
    if !self.denomID.isEmpty {
      try visitor.visitSingularStringField(value: self.denomID, fieldNumber: 3)
    }
    try { if let v = self._startPrice {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
    } }()
    try { if let v = self._startTime {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 5)
    } }()
    try { if let v = self._endTime {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 6)
    } }()
    if !self.owner.isEmpty {
      try visitor.visitSingularStringField(value: self.owner, fieldNumber: 7)
    }
    if !self.incrementPercentage.isEmpty {
      try visitor.visitSingularStringField(value: self.incrementPercentage, fieldNumber: 8)
    }
    if !self.whitelistAccounts.isEmpty {
      try visitor.visitRepeatedStringField(value: self.whitelistAccounts, fieldNumber: 9)
    }
    if !self.splitShares.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.splitShares, fieldNumber: 10)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: OmniFlix_Marketplace_V1beta1_AuctionListing, rhs: OmniFlix_Marketplace_V1beta1_AuctionListing) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs.nftID != rhs.nftID {return false}
    if lhs.denomID != rhs.denomID {return false}
    if lhs._startPrice != rhs._startPrice {return false}
    if lhs._startTime != rhs._startTime {return false}
    if lhs._endTime != rhs._endTime {return false}
    if lhs.owner != rhs.owner {return false}
    if lhs.incrementPercentage != rhs.incrementPercentage {return false}
    if lhs.whitelistAccounts != rhs.whitelistAccounts {return false}
    if lhs.splitShares != rhs.splitShares {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension OmniFlix_Marketplace_V1beta1_Bid: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Bid"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "auction_id"),
    2: .same(proto: "bidder"),
    3: .same(proto: "amount"),
    4: .same(proto: "time"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.auctionID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.bidder) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._amount) }()
      case 4: try { try decoder.decodeSingularMessageField(value: &self._time) }()
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
    if !self.bidder.isEmpty {
      try visitor.visitSingularStringField(value: self.bidder, fieldNumber: 2)
    }
    try { if let v = self._amount {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    try { if let v = self._time {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: OmniFlix_Marketplace_V1beta1_Bid, rhs: OmniFlix_Marketplace_V1beta1_Bid) -> Bool {
    if lhs.auctionID != rhs.auctionID {return false}
    if lhs.bidder != rhs.bidder {return false}
    if lhs._amount != rhs._amount {return false}
    if lhs._time != rhs._time {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
