// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: osmosis/concentratedliquidity/v1beta1/incentive_record.proto
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

/// IncentiveRecord is the high-level struct we use to deal with an independent
/// incentive being distributed on a pool. Note that PoolId, Denom, and MinUptime
/// are included in the key so we avoid storing them in state, hence the
/// distinction between IncentiveRecord and IncentiveRecordBody.
struct Osmosis_Concentratedliquidity_V1beta1_IncentiveRecord {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// incentive_id is the id uniquely identifying this incentive record.
  var incentiveID: UInt64 = 0

  var poolID: UInt64 = 0

  /// incentive record body holds necessary
  var incentiveRecordBody: Osmosis_Concentratedliquidity_V1beta1_IncentiveRecordBody {
    get {return _incentiveRecordBody ?? Osmosis_Concentratedliquidity_V1beta1_IncentiveRecordBody()}
    set {_incentiveRecordBody = newValue}
  }
  /// Returns true if `incentiveRecordBody` has been explicitly set.
  var hasIncentiveRecordBody: Bool {return self._incentiveRecordBody != nil}
  /// Clears the value of `incentiveRecordBody`. Subsequent reads from it will return its default value.
  mutating func clearIncentiveRecordBody() {self._incentiveRecordBody = nil}

  /// min_uptime is the minimum uptime required for liquidity to qualify for this
  /// incentive. It should be always be one of the supported uptimes in
  /// types.SupportedUptimes
  var minUptime: SwiftProtobuf.Google_Protobuf_Duration {
    get {return _minUptime ?? SwiftProtobuf.Google_Protobuf_Duration()}
    set {_minUptime = newValue}
  }
  /// Returns true if `minUptime` has been explicitly set.
  var hasMinUptime: Bool {return self._minUptime != nil}
  /// Clears the value of `minUptime`. Subsequent reads from it will return its default value.
  mutating func clearMinUptime() {self._minUptime = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _incentiveRecordBody: Osmosis_Concentratedliquidity_V1beta1_IncentiveRecordBody? = nil
  fileprivate var _minUptime: SwiftProtobuf.Google_Protobuf_Duration? = nil
}

/// IncentiveRecordBody represents the body stored in state for each individual
/// record.
struct Osmosis_Concentratedliquidity_V1beta1_IncentiveRecordBody {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// remaining_coin is the total amount of incentives to be distributed
  var remainingCoin: Cosmos_Base_V1beta1_DecCoin {
    get {return _remainingCoin ?? Cosmos_Base_V1beta1_DecCoin()}
    set {_remainingCoin = newValue}
  }
  /// Returns true if `remainingCoin` has been explicitly set.
  var hasRemainingCoin: Bool {return self._remainingCoin != nil}
  /// Clears the value of `remainingCoin`. Subsequent reads from it will return its default value.
  mutating func clearRemainingCoin() {self._remainingCoin = nil}

  /// emission_rate is the incentive emission rate per second
  var emissionRate: String = String()

  /// start_time is the time when the incentive starts distributing
  var startTime: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _startTime ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_startTime = newValue}
  }
  /// Returns true if `startTime` has been explicitly set.
  var hasStartTime: Bool {return self._startTime != nil}
  /// Clears the value of `startTime`. Subsequent reads from it will return its default value.
  mutating func clearStartTime() {self._startTime = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _remainingCoin: Cosmos_Base_V1beta1_DecCoin? = nil
  fileprivate var _startTime: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Osmosis_Concentratedliquidity_V1beta1_IncentiveRecord: @unchecked Sendable {}
extension Osmosis_Concentratedliquidity_V1beta1_IncentiveRecordBody: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "osmosis.concentratedliquidity.v1beta1"

extension Osmosis_Concentratedliquidity_V1beta1_IncentiveRecord: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".IncentiveRecord"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "incentive_id"),
    2: .standard(proto: "pool_id"),
    4: .standard(proto: "incentive_record_body"),
    5: .standard(proto: "min_uptime"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.incentiveID) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.poolID) }()
      case 4: try { try decoder.decodeSingularMessageField(value: &self._incentiveRecordBody) }()
      case 5: try { try decoder.decodeSingularMessageField(value: &self._minUptime) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if self.incentiveID != 0 {
      try visitor.visitSingularUInt64Field(value: self.incentiveID, fieldNumber: 1)
    }
    if self.poolID != 0 {
      try visitor.visitSingularUInt64Field(value: self.poolID, fieldNumber: 2)
    }
    try { if let v = self._incentiveRecordBody {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
    } }()
    try { if let v = self._minUptime {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 5)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Concentratedliquidity_V1beta1_IncentiveRecord, rhs: Osmosis_Concentratedliquidity_V1beta1_IncentiveRecord) -> Bool {
    if lhs.incentiveID != rhs.incentiveID {return false}
    if lhs.poolID != rhs.poolID {return false}
    if lhs._incentiveRecordBody != rhs._incentiveRecordBody {return false}
    if lhs._minUptime != rhs._minUptime {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Osmosis_Concentratedliquidity_V1beta1_IncentiveRecordBody: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".IncentiveRecordBody"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "remaining_coin"),
    2: .standard(proto: "emission_rate"),
    3: .standard(proto: "start_time"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._remainingCoin) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.emissionRate) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._startTime) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._remainingCoin {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    if !self.emissionRate.isEmpty {
      try visitor.visitSingularStringField(value: self.emissionRate, fieldNumber: 2)
    }
    try { if let v = self._startTime {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Concentratedliquidity_V1beta1_IncentiveRecordBody, rhs: Osmosis_Concentratedliquidity_V1beta1_IncentiveRecordBody) -> Bool {
    if lhs._remainingCoin != rhs._remainingCoin {return false}
    if lhs.emissionRate != rhs.emissionRate {return false}
    if lhs._startTime != rhs._startTime {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
