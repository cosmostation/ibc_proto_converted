// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: persistence/oracle/v1beta1/tx.proto
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

/// MsgAggregateExchangeRatePrevote represents a message to submit an aggregate
/// exchange rate prevote.
struct Persistence_Oracle_V1beta1_MsgAggregateExchangeRatePrevote {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var hash: String = String()

  var feeder: String = String()

  var validator: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgAggregateExchangeRatePrevoteResponse defines the
/// Msg/AggregateExchangeRatePrevote response type.
struct Persistence_Oracle_V1beta1_MsgAggregateExchangeRatePrevoteResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgAggregateExchangeRateVote represents a message to submit anaggregate
/// exchange rate vote.
struct Persistence_Oracle_V1beta1_MsgAggregateExchangeRateVote {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var salt: String = String()

  var exchangeRates: String = String()

  var feeder: String = String()

  var validator: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgAggregateExchangeRateVoteResponse defines the
/// Msg/AggregateExchangeRateVote response type.
struct Persistence_Oracle_V1beta1_MsgAggregateExchangeRateVoteResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgDelegateFeedConsent represents a message to delegate oracle voting rights
/// to another address.
struct Persistence_Oracle_V1beta1_MsgDelegateFeedConsent {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var `operator`: String = String()

  var delegate: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgDelegateFeedConsentResponse defines the Msg/DelegateFeedConsent response
/// type.
struct Persistence_Oracle_V1beta1_MsgDelegateFeedConsentResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Persistence_Oracle_V1beta1_MsgAddFundsToRewardPool {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var from: String = String()

  /// rewards are the coin(s) to add to reward pool
  var funds: [Cosmos_Base_V1beta1_Coin] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgAddFundsToRewardPoolResponse
struct Persistence_Oracle_V1beta1_MsgAddFundsToRewardPoolResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Persistence_Oracle_V1beta1_MsgAggregateExchangeRatePrevote: @unchecked Sendable {}
extension Persistence_Oracle_V1beta1_MsgAggregateExchangeRatePrevoteResponse: @unchecked Sendable {}
extension Persistence_Oracle_V1beta1_MsgAggregateExchangeRateVote: @unchecked Sendable {}
extension Persistence_Oracle_V1beta1_MsgAggregateExchangeRateVoteResponse: @unchecked Sendable {}
extension Persistence_Oracle_V1beta1_MsgDelegateFeedConsent: @unchecked Sendable {}
extension Persistence_Oracle_V1beta1_MsgDelegateFeedConsentResponse: @unchecked Sendable {}
extension Persistence_Oracle_V1beta1_MsgAddFundsToRewardPool: @unchecked Sendable {}
extension Persistence_Oracle_V1beta1_MsgAddFundsToRewardPoolResponse: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "persistence.oracle.v1beta1"

extension Persistence_Oracle_V1beta1_MsgAggregateExchangeRatePrevote: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgAggregateExchangeRatePrevote"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "hash"),
    2: .same(proto: "feeder"),
    3: .same(proto: "validator"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.hash) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.feeder) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.validator) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.hash.isEmpty {
      try visitor.visitSingularStringField(value: self.hash, fieldNumber: 1)
    }
    if !self.feeder.isEmpty {
      try visitor.visitSingularStringField(value: self.feeder, fieldNumber: 2)
    }
    if !self.validator.isEmpty {
      try visitor.visitSingularStringField(value: self.validator, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Persistence_Oracle_V1beta1_MsgAggregateExchangeRatePrevote, rhs: Persistence_Oracle_V1beta1_MsgAggregateExchangeRatePrevote) -> Bool {
    if lhs.hash != rhs.hash {return false}
    if lhs.feeder != rhs.feeder {return false}
    if lhs.validator != rhs.validator {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Persistence_Oracle_V1beta1_MsgAggregateExchangeRatePrevoteResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgAggregateExchangeRatePrevoteResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Persistence_Oracle_V1beta1_MsgAggregateExchangeRatePrevoteResponse, rhs: Persistence_Oracle_V1beta1_MsgAggregateExchangeRatePrevoteResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Persistence_Oracle_V1beta1_MsgAggregateExchangeRateVote: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgAggregateExchangeRateVote"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "salt"),
    2: .standard(proto: "exchange_rates"),
    3: .same(proto: "feeder"),
    4: .same(proto: "validator"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.salt) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.exchangeRates) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.feeder) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.validator) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.salt.isEmpty {
      try visitor.visitSingularStringField(value: self.salt, fieldNumber: 1)
    }
    if !self.exchangeRates.isEmpty {
      try visitor.visitSingularStringField(value: self.exchangeRates, fieldNumber: 2)
    }
    if !self.feeder.isEmpty {
      try visitor.visitSingularStringField(value: self.feeder, fieldNumber: 3)
    }
    if !self.validator.isEmpty {
      try visitor.visitSingularStringField(value: self.validator, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Persistence_Oracle_V1beta1_MsgAggregateExchangeRateVote, rhs: Persistence_Oracle_V1beta1_MsgAggregateExchangeRateVote) -> Bool {
    if lhs.salt != rhs.salt {return false}
    if lhs.exchangeRates != rhs.exchangeRates {return false}
    if lhs.feeder != rhs.feeder {return false}
    if lhs.validator != rhs.validator {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Persistence_Oracle_V1beta1_MsgAggregateExchangeRateVoteResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgAggregateExchangeRateVoteResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Persistence_Oracle_V1beta1_MsgAggregateExchangeRateVoteResponse, rhs: Persistence_Oracle_V1beta1_MsgAggregateExchangeRateVoteResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Persistence_Oracle_V1beta1_MsgDelegateFeedConsent: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgDelegateFeedConsent"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "operator"),
    2: .same(proto: "delegate"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.`operator`) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.delegate) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.`operator`.isEmpty {
      try visitor.visitSingularStringField(value: self.`operator`, fieldNumber: 1)
    }
    if !self.delegate.isEmpty {
      try visitor.visitSingularStringField(value: self.delegate, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Persistence_Oracle_V1beta1_MsgDelegateFeedConsent, rhs: Persistence_Oracle_V1beta1_MsgDelegateFeedConsent) -> Bool {
    if lhs.`operator` != rhs.`operator` {return false}
    if lhs.delegate != rhs.delegate {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Persistence_Oracle_V1beta1_MsgDelegateFeedConsentResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgDelegateFeedConsentResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Persistence_Oracle_V1beta1_MsgDelegateFeedConsentResponse, rhs: Persistence_Oracle_V1beta1_MsgDelegateFeedConsentResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Persistence_Oracle_V1beta1_MsgAddFundsToRewardPool: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgAddFundsToRewardPool"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "from"),
    2: .same(proto: "funds"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.from) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.funds) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.from.isEmpty {
      try visitor.visitSingularStringField(value: self.from, fieldNumber: 1)
    }
    if !self.funds.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.funds, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Persistence_Oracle_V1beta1_MsgAddFundsToRewardPool, rhs: Persistence_Oracle_V1beta1_MsgAddFundsToRewardPool) -> Bool {
    if lhs.from != rhs.from {return false}
    if lhs.funds != rhs.funds {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Persistence_Oracle_V1beta1_MsgAddFundsToRewardPoolResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgAddFundsToRewardPoolResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Persistence_Oracle_V1beta1_MsgAddFundsToRewardPoolResponse, rhs: Persistence_Oracle_V1beta1_MsgAddFundsToRewardPoolResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
