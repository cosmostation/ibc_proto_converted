// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: injective/auction/v1beta1/query.proto
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

/// QueryAuctionParamsRequest is the request type for the Query/AuctionParams RPC
/// method.
struct Injective_Auction_V1beta1_QueryAuctionParamsRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// QueryAuctionParamsRequest is the response type for the Query/AuctionParams
/// RPC method.
struct Injective_Auction_V1beta1_QueryAuctionParamsResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var params: Injective_Auction_V1beta1_Params {
    get {return _params ?? Injective_Auction_V1beta1_Params()}
    set {_params = newValue}
  }
  /// Returns true if `params` has been explicitly set.
  var hasParams: Bool {return self._params != nil}
  /// Clears the value of `params`. Subsequent reads from it will return its default value.
  mutating func clearParams() {self._params = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _params: Injective_Auction_V1beta1_Params? = nil
}

/// QueryCurrentAuctionBasketRequest is the request type for the
/// Query/CurrentAuctionBasket RPC method.
struct Injective_Auction_V1beta1_QueryCurrentAuctionBasketRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// QueryCurrentAuctionBasketResponse is the response type for the
/// Query/CurrentAuctionBasket RPC method.
struct Injective_Auction_V1beta1_QueryCurrentAuctionBasketResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// amount describes the amount put on auction
  var amount: [Cosmos_Base_V1beta1_Coin] = []

  /// auctionRound describes current auction round
  var auctionRound: UInt64 = 0

  /// auctionClosingTime describes auction close time for the round
  var auctionClosingTime: Int64 = 0

  /// highestBidder describes highest bidder on current round
  var highestBidder: String = String()

  /// highestBidAmount describes highest bid amount on current round
  var highestBidAmount: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// QueryModuleStateRequest is the request type for the Query/AuctionModuleState
/// RPC method.
struct Injective_Auction_V1beta1_QueryModuleStateRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// QueryModuleStateResponse is the response type for the
/// Query/AuctionModuleState RPC method.
struct Injective_Auction_V1beta1_QueryModuleStateResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var state: Injective_Auction_V1beta1_GenesisState {
    get {return _state ?? Injective_Auction_V1beta1_GenesisState()}
    set {_state = newValue}
  }
  /// Returns true if `state` has been explicitly set.
  var hasState: Bool {return self._state != nil}
  /// Clears the value of `state`. Subsequent reads from it will return its default value.
  mutating func clearState() {self._state = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _state: Injective_Auction_V1beta1_GenesisState? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Injective_Auction_V1beta1_QueryAuctionParamsRequest: @unchecked Sendable {}
extension Injective_Auction_V1beta1_QueryAuctionParamsResponse: @unchecked Sendable {}
extension Injective_Auction_V1beta1_QueryCurrentAuctionBasketRequest: @unchecked Sendable {}
extension Injective_Auction_V1beta1_QueryCurrentAuctionBasketResponse: @unchecked Sendable {}
extension Injective_Auction_V1beta1_QueryModuleStateRequest: @unchecked Sendable {}
extension Injective_Auction_V1beta1_QueryModuleStateResponse: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "injective.auction.v1beta1"

extension Injective_Auction_V1beta1_QueryAuctionParamsRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryAuctionParamsRequest"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Injective_Auction_V1beta1_QueryAuctionParamsRequest, rhs: Injective_Auction_V1beta1_QueryAuctionParamsRequest) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Injective_Auction_V1beta1_QueryAuctionParamsResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryAuctionParamsResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "params"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._params) }()
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
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Injective_Auction_V1beta1_QueryAuctionParamsResponse, rhs: Injective_Auction_V1beta1_QueryAuctionParamsResponse) -> Bool {
    if lhs._params != rhs._params {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Injective_Auction_V1beta1_QueryCurrentAuctionBasketRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryCurrentAuctionBasketRequest"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Injective_Auction_V1beta1_QueryCurrentAuctionBasketRequest, rhs: Injective_Auction_V1beta1_QueryCurrentAuctionBasketRequest) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Injective_Auction_V1beta1_QueryCurrentAuctionBasketResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryCurrentAuctionBasketResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "amount"),
    2: .same(proto: "auctionRound"),
    3: .same(proto: "auctionClosingTime"),
    4: .same(proto: "highestBidder"),
    5: .same(proto: "highestBidAmount"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.amount) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.auctionRound) }()
      case 3: try { try decoder.decodeSingularInt64Field(value: &self.auctionClosingTime) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.highestBidder) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.highestBidAmount) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.amount.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.amount, fieldNumber: 1)
    }
    if self.auctionRound != 0 {
      try visitor.visitSingularUInt64Field(value: self.auctionRound, fieldNumber: 2)
    }
    if self.auctionClosingTime != 0 {
      try visitor.visitSingularInt64Field(value: self.auctionClosingTime, fieldNumber: 3)
    }
    if !self.highestBidder.isEmpty {
      try visitor.visitSingularStringField(value: self.highestBidder, fieldNumber: 4)
    }
    if !self.highestBidAmount.isEmpty {
      try visitor.visitSingularStringField(value: self.highestBidAmount, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Injective_Auction_V1beta1_QueryCurrentAuctionBasketResponse, rhs: Injective_Auction_V1beta1_QueryCurrentAuctionBasketResponse) -> Bool {
    if lhs.amount != rhs.amount {return false}
    if lhs.auctionRound != rhs.auctionRound {return false}
    if lhs.auctionClosingTime != rhs.auctionClosingTime {return false}
    if lhs.highestBidder != rhs.highestBidder {return false}
    if lhs.highestBidAmount != rhs.highestBidAmount {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Injective_Auction_V1beta1_QueryModuleStateRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryModuleStateRequest"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Injective_Auction_V1beta1_QueryModuleStateRequest, rhs: Injective_Auction_V1beta1_QueryModuleStateRequest) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Injective_Auction_V1beta1_QueryModuleStateResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryModuleStateResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "state"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._state) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._state {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Injective_Auction_V1beta1_QueryModuleStateResponse, rhs: Injective_Auction_V1beta1_QueryModuleStateResponse) -> Bool {
    if lhs._state != rhs._state {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
