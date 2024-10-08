// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: osmosis/incentives/params.proto
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

/// Params holds parameters for the incentives module
struct Osmosis_Incentives_Params {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// distr_epoch_identifier is what epoch type distribution will be triggered by
  /// (day, week, etc.)
  var distrEpochIdentifier: String = String()

  /// group_creation_fee is the fee required to create a new group
  /// It is only charged to all addresses other than incentive module account
  /// or addresses in the unrestricted_creator_whitelist
  var groupCreationFee: [Cosmos_Base_V1beta1_Coin] = []

  /// unrestricted_creator_whitelist is a list of addresses that are
  /// allowed to bypass restrictions on permissionless Group
  /// creation. In the future, we might expand these to creating gauges
  /// as well.
  /// The goal of this is to allow a subdao to manage incentives efficiently
  /// without being stopped by 5 day governance process or a high fee.
  /// At the same time, it prevents spam by having a fee for all
  /// other users.
  var unrestrictedCreatorWhitelist: [String] = []

  /// internal_uptime is the uptime used for internal incentives on pools that
  /// use NoLock gauges (currently only Concentrated Liquidity pools).
  ///
  /// Since Group gauges route through internal gauges, this parameter affects
  /// the uptime of those incentives as well (i.e. distributions through volume
  /// splitting incentives will use this uptime).
  var internalUptime: SwiftProtobuf.Google_Protobuf_Duration {
    get {return _internalUptime ?? SwiftProtobuf.Google_Protobuf_Duration()}
    set {_internalUptime = newValue}
  }
  /// Returns true if `internalUptime` has been explicitly set.
  var hasInternalUptime: Bool {return self._internalUptime != nil}
  /// Clears the value of `internalUptime`. Subsequent reads from it will return its default value.
  mutating func clearInternalUptime() {self._internalUptime = nil}

  /// min_value_for_distribution is the minimum amount a token must be worth
  /// in order to be eligible for distribution. If the token is worth
  /// less than this amount (or the route between the two denoms is not
  /// registered), it will not be distributed and is forfeited to the remaining
  /// distributees that are eligible.
  var minValueForDistribution: Cosmos_Base_V1beta1_Coin {
    get {return _minValueForDistribution ?? Cosmos_Base_V1beta1_Coin()}
    set {_minValueForDistribution = newValue}
  }
  /// Returns true if `minValueForDistribution` has been explicitly set.
  var hasMinValueForDistribution: Bool {return self._minValueForDistribution != nil}
  /// Clears the value of `minValueForDistribution`. Subsequent reads from it will return its default value.
  mutating func clearMinValueForDistribution() {self._minValueForDistribution = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _internalUptime: SwiftProtobuf.Google_Protobuf_Duration? = nil
  fileprivate var _minValueForDistribution: Cosmos_Base_V1beta1_Coin? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Osmosis_Incentives_Params: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "osmosis.incentives"

extension Osmosis_Incentives_Params: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Params"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "distr_epoch_identifier"),
    2: .standard(proto: "group_creation_fee"),
    3: .standard(proto: "unrestricted_creator_whitelist"),
    4: .standard(proto: "internal_uptime"),
    5: .standard(proto: "min_value_for_distribution"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.distrEpochIdentifier) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.groupCreationFee) }()
      case 3: try { try decoder.decodeRepeatedStringField(value: &self.unrestrictedCreatorWhitelist) }()
      case 4: try { try decoder.decodeSingularMessageField(value: &self._internalUptime) }()
      case 5: try { try decoder.decodeSingularMessageField(value: &self._minValueForDistribution) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.distrEpochIdentifier.isEmpty {
      try visitor.visitSingularStringField(value: self.distrEpochIdentifier, fieldNumber: 1)
    }
    if !self.groupCreationFee.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.groupCreationFee, fieldNumber: 2)
    }
    if !self.unrestrictedCreatorWhitelist.isEmpty {
      try visitor.visitRepeatedStringField(value: self.unrestrictedCreatorWhitelist, fieldNumber: 3)
    }
    try { if let v = self._internalUptime {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
    } }()
    try { if let v = self._minValueForDistribution {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 5)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Incentives_Params, rhs: Osmosis_Incentives_Params) -> Bool {
    if lhs.distrEpochIdentifier != rhs.distrEpochIdentifier {return false}
    if lhs.groupCreationFee != rhs.groupCreationFee {return false}
    if lhs.unrestrictedCreatorWhitelist != rhs.unrestrictedCreatorWhitelist {return false}
    if lhs._internalUptime != rhs._internalUptime {return false}
    if lhs._minValueForDistribution != rhs._minValueForDistribution {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
