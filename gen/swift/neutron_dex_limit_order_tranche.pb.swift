// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: neutron/dex/limit_order_tranche.proto
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

struct Neutron_Dex_LimitOrderTrancheKey {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var tradePairID: Neutron_Dex_TradePairID {
    get {return _tradePairID ?? Neutron_Dex_TradePairID()}
    set {_tradePairID = newValue}
  }
  /// Returns true if `tradePairID` has been explicitly set.
  var hasTradePairID: Bool {return self._tradePairID != nil}
  /// Clears the value of `tradePairID`. Subsequent reads from it will return its default value.
  mutating func clearTradePairID() {self._tradePairID = nil}

  var tickIndexTakerToMaker: Int64 = 0

  var trancheKey: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _tradePairID: Neutron_Dex_TradePairID? = nil
}

struct Neutron_Dex_LimitOrderTranche {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var key: Neutron_Dex_LimitOrderTrancheKey {
    get {return _key ?? Neutron_Dex_LimitOrderTrancheKey()}
    set {_key = newValue}
  }
  /// Returns true if `key` has been explicitly set.
  var hasKey: Bool {return self._key != nil}
  /// Clears the value of `key`. Subsequent reads from it will return its default value.
  mutating func clearKey() {self._key = nil}

  var reservesMakerDenom: String = String()

  var reservesTakerDenom: String = String()

  var totalMakerDenom: String = String()

  /// LimitOrders with expiration_time set are valid as long as blockTime <= expiration_time
  var totalTakerDenom: String = String()

  /// JIT orders also use expiration_time to handle deletion but represent a special case
  /// All JIT orders have a expiration_time of 0 and an exception is made to still treat these orders as live
  /// Order deletion still functions the same and the orders will be deleted at the end of the block
  var expirationTime: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _expirationTime ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_expirationTime = newValue}
  }
  /// Returns true if `expirationTime` has been explicitly set.
  var hasExpirationTime: Bool {return self._expirationTime != nil}
  /// Clears the value of `expirationTime`. Subsequent reads from it will return its default value.
  mutating func clearExpirationTime() {self._expirationTime = nil}

  var priceTakerToMaker: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _key: Neutron_Dex_LimitOrderTrancheKey? = nil
  fileprivate var _expirationTime: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Neutron_Dex_LimitOrderTrancheKey: @unchecked Sendable {}
extension Neutron_Dex_LimitOrderTranche: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "neutron.dex"

extension Neutron_Dex_LimitOrderTrancheKey: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".LimitOrderTrancheKey"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "trade_pair_id"),
    2: .standard(proto: "tick_index_taker_to_maker"),
    3: .standard(proto: "tranche_key"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._tradePairID) }()
      case 2: try { try decoder.decodeSingularInt64Field(value: &self.tickIndexTakerToMaker) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.trancheKey) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._tradePairID {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    if self.tickIndexTakerToMaker != 0 {
      try visitor.visitSingularInt64Field(value: self.tickIndexTakerToMaker, fieldNumber: 2)
    }
    if !self.trancheKey.isEmpty {
      try visitor.visitSingularStringField(value: self.trancheKey, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Neutron_Dex_LimitOrderTrancheKey, rhs: Neutron_Dex_LimitOrderTrancheKey) -> Bool {
    if lhs._tradePairID != rhs._tradePairID {return false}
    if lhs.tickIndexTakerToMaker != rhs.tickIndexTakerToMaker {return false}
    if lhs.trancheKey != rhs.trancheKey {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Neutron_Dex_LimitOrderTranche: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".LimitOrderTranche"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "key"),
    2: .standard(proto: "reserves_maker_denom"),
    3: .standard(proto: "reserves_taker_denom"),
    4: .standard(proto: "total_maker_denom"),
    5: .standard(proto: "total_taker_denom"),
    6: .standard(proto: "expiration_time"),
    7: .standard(proto: "price_taker_to_maker"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._key) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.reservesMakerDenom) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.reservesTakerDenom) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.totalMakerDenom) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.totalTakerDenom) }()
      case 6: try { try decoder.decodeSingularMessageField(value: &self._expirationTime) }()
      case 7: try { try decoder.decodeSingularStringField(value: &self.priceTakerToMaker) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._key {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    if !self.reservesMakerDenom.isEmpty {
      try visitor.visitSingularStringField(value: self.reservesMakerDenom, fieldNumber: 2)
    }
    if !self.reservesTakerDenom.isEmpty {
      try visitor.visitSingularStringField(value: self.reservesTakerDenom, fieldNumber: 3)
    }
    if !self.totalMakerDenom.isEmpty {
      try visitor.visitSingularStringField(value: self.totalMakerDenom, fieldNumber: 4)
    }
    if !self.totalTakerDenom.isEmpty {
      try visitor.visitSingularStringField(value: self.totalTakerDenom, fieldNumber: 5)
    }
    try { if let v = self._expirationTime {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 6)
    } }()
    if !self.priceTakerToMaker.isEmpty {
      try visitor.visitSingularStringField(value: self.priceTakerToMaker, fieldNumber: 7)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Neutron_Dex_LimitOrderTranche, rhs: Neutron_Dex_LimitOrderTranche) -> Bool {
    if lhs._key != rhs._key {return false}
    if lhs.reservesMakerDenom != rhs.reservesMakerDenom {return false}
    if lhs.reservesTakerDenom != rhs.reservesTakerDenom {return false}
    if lhs.totalMakerDenom != rhs.totalMakerDenom {return false}
    if lhs.totalTakerDenom != rhs.totalTakerDenom {return false}
    if lhs._expirationTime != rhs._expirationTime {return false}
    if lhs.priceTakerToMaker != rhs.priceTakerToMaker {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}