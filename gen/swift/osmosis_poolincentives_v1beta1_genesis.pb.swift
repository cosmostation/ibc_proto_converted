// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: osmosis/poolincentives/v1beta1/genesis.proto
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

/// GenesisState defines the pool incentives module's genesis state.
struct Osmosis_Poolincentives_V1beta1_GenesisState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// params defines all the parameters of the module.
  var params: Osmosis_Poolincentives_V1beta1_Params {
    get {return _params ?? Osmosis_Poolincentives_V1beta1_Params()}
    set {_params = newValue}
  }
  /// Returns true if `params` has been explicitly set.
  var hasParams: Bool {return self._params != nil}
  /// Clears the value of `params`. Subsequent reads from it will return its default value.
  mutating func clearParams() {self._params = nil}

  var lockableDurations: [SwiftProtobuf.Google_Protobuf_Duration] = []

  var distrInfo: Osmosis_Poolincentives_V1beta1_DistrInfo {
    get {return _distrInfo ?? Osmosis_Poolincentives_V1beta1_DistrInfo()}
    set {_distrInfo = newValue}
  }
  /// Returns true if `distrInfo` has been explicitly set.
  var hasDistrInfo: Bool {return self._distrInfo != nil}
  /// Clears the value of `distrInfo`. Subsequent reads from it will return its default value.
  mutating func clearDistrInfo() {self._distrInfo = nil}

  /// any_pool_to_internal_gauges defines the gauges for any pool to internal
  /// pool. For every pool type (e.g. LP, Concentrated, etc), there is one such
  /// link
  var anyPoolToInternalGauges: Osmosis_Poolincentives_V1beta1_AnyPoolToInternalGauges {
    get {return _anyPoolToInternalGauges ?? Osmosis_Poolincentives_V1beta1_AnyPoolToInternalGauges()}
    set {_anyPoolToInternalGauges = newValue}
  }
  /// Returns true if `anyPoolToInternalGauges` has been explicitly set.
  var hasAnyPoolToInternalGauges: Bool {return self._anyPoolToInternalGauges != nil}
  /// Clears the value of `anyPoolToInternalGauges`. Subsequent reads from it will return its default value.
  mutating func clearAnyPoolToInternalGauges() {self._anyPoolToInternalGauges = nil}

  /// concentrated_pool_to_no_lock_gauges defines the no lock gauges for
  /// concentrated pool. This only exists between concentrated pool and no lock
  /// gauges. Both external and internal gauges are included.
  var concentratedPoolToNoLockGauges: Osmosis_Poolincentives_V1beta1_ConcentratedPoolToNoLockGauges {
    get {return _concentratedPoolToNoLockGauges ?? Osmosis_Poolincentives_V1beta1_ConcentratedPoolToNoLockGauges()}
    set {_concentratedPoolToNoLockGauges = newValue}
  }
  /// Returns true if `concentratedPoolToNoLockGauges` has been explicitly set.
  var hasConcentratedPoolToNoLockGauges: Bool {return self._concentratedPoolToNoLockGauges != nil}
  /// Clears the value of `concentratedPoolToNoLockGauges`. Subsequent reads from it will return its default value.
  mutating func clearConcentratedPoolToNoLockGauges() {self._concentratedPoolToNoLockGauges = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _params: Osmosis_Poolincentives_V1beta1_Params? = nil
  fileprivate var _distrInfo: Osmosis_Poolincentives_V1beta1_DistrInfo? = nil
  fileprivate var _anyPoolToInternalGauges: Osmosis_Poolincentives_V1beta1_AnyPoolToInternalGauges? = nil
  fileprivate var _concentratedPoolToNoLockGauges: Osmosis_Poolincentives_V1beta1_ConcentratedPoolToNoLockGauges? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Osmosis_Poolincentives_V1beta1_GenesisState: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "osmosis.poolincentives.v1beta1"

extension Osmosis_Poolincentives_V1beta1_GenesisState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GenesisState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "params"),
    2: .standard(proto: "lockable_durations"),
    3: .standard(proto: "distr_info"),
    4: .standard(proto: "any_pool_to_internal_gauges"),
    5: .standard(proto: "concentrated_pool_to_no_lock_gauges"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._params) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.lockableDurations) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._distrInfo) }()
      case 4: try { try decoder.decodeSingularMessageField(value: &self._anyPoolToInternalGauges) }()
      case 5: try { try decoder.decodeSingularMessageField(value: &self._concentratedPoolToNoLockGauges) }()
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
    if !self.lockableDurations.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.lockableDurations, fieldNumber: 2)
    }
    try { if let v = self._distrInfo {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    try { if let v = self._anyPoolToInternalGauges {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
    } }()
    try { if let v = self._concentratedPoolToNoLockGauges {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 5)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Poolincentives_V1beta1_GenesisState, rhs: Osmosis_Poolincentives_V1beta1_GenesisState) -> Bool {
    if lhs._params != rhs._params {return false}
    if lhs.lockableDurations != rhs.lockableDurations {return false}
    if lhs._distrInfo != rhs._distrInfo {return false}
    if lhs._anyPoolToInternalGauges != rhs._anyPoolToInternalGauges {return false}
    if lhs._concentratedPoolToNoLockGauges != rhs._concentratedPoolToNoLockGauges {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
