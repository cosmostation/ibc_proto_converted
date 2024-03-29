// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: kava/issuance/v1beta1/genesis.proto
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

/// GenesisState defines the issuance module's genesis state.
struct Kava_Issuance_V1beta1_GenesisState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// params defines all the paramaters of the module.
  var params: Kava_Issuance_V1beta1_Params {
    get {return _params ?? Kava_Issuance_V1beta1_Params()}
    set {_params = newValue}
  }
  /// Returns true if `params` has been explicitly set.
  var hasParams: Bool {return self._params != nil}
  /// Clears the value of `params`. Subsequent reads from it will return its default value.
  mutating func clearParams() {self._params = nil}

  var supplies: [Kava_Issuance_V1beta1_AssetSupply] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _params: Kava_Issuance_V1beta1_Params? = nil
}

/// Params defines the parameters for the issuance module.
struct Kava_Issuance_V1beta1_Params {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var assets: [Kava_Issuance_V1beta1_Asset] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// Asset type for assets in the issuance module
struct Kava_Issuance_V1beta1_Asset {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var owner: String = String()

  var denom: String = String()

  var blockedAddresses: [String] = []

  var paused: Bool = false

  var blockable: Bool = false

  var rateLimit: Kava_Issuance_V1beta1_RateLimit {
    get {return _rateLimit ?? Kava_Issuance_V1beta1_RateLimit()}
    set {_rateLimit = newValue}
  }
  /// Returns true if `rateLimit` has been explicitly set.
  var hasRateLimit: Bool {return self._rateLimit != nil}
  /// Clears the value of `rateLimit`. Subsequent reads from it will return its default value.
  mutating func clearRateLimit() {self._rateLimit = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _rateLimit: Kava_Issuance_V1beta1_RateLimit? = nil
}

/// RateLimit parameters for rate-limiting the supply of an issued asset
struct Kava_Issuance_V1beta1_RateLimit {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var active: Bool = false

  var limit: Data = Data()

  var timePeriod: SwiftProtobuf.Google_Protobuf_Duration {
    get {return _timePeriod ?? SwiftProtobuf.Google_Protobuf_Duration()}
    set {_timePeriod = newValue}
  }
  /// Returns true if `timePeriod` has been explicitly set.
  var hasTimePeriod: Bool {return self._timePeriod != nil}
  /// Clears the value of `timePeriod`. Subsequent reads from it will return its default value.
  mutating func clearTimePeriod() {self._timePeriod = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _timePeriod: SwiftProtobuf.Google_Protobuf_Duration? = nil
}

/// AssetSupply contains information about an asset's rate-limited supply (the
/// total supply of the asset is tracked in the top-level supply module)
struct Kava_Issuance_V1beta1_AssetSupply {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var currentSupply: Cosmos_Base_V1beta1_Coin {
    get {return _currentSupply ?? Cosmos_Base_V1beta1_Coin()}
    set {_currentSupply = newValue}
  }
  /// Returns true if `currentSupply` has been explicitly set.
  var hasCurrentSupply: Bool {return self._currentSupply != nil}
  /// Clears the value of `currentSupply`. Subsequent reads from it will return its default value.
  mutating func clearCurrentSupply() {self._currentSupply = nil}

  var timeElapsed: SwiftProtobuf.Google_Protobuf_Duration {
    get {return _timeElapsed ?? SwiftProtobuf.Google_Protobuf_Duration()}
    set {_timeElapsed = newValue}
  }
  /// Returns true if `timeElapsed` has been explicitly set.
  var hasTimeElapsed: Bool {return self._timeElapsed != nil}
  /// Clears the value of `timeElapsed`. Subsequent reads from it will return its default value.
  mutating func clearTimeElapsed() {self._timeElapsed = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _currentSupply: Cosmos_Base_V1beta1_Coin? = nil
  fileprivate var _timeElapsed: SwiftProtobuf.Google_Protobuf_Duration? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Kava_Issuance_V1beta1_GenesisState: @unchecked Sendable {}
extension Kava_Issuance_V1beta1_Params: @unchecked Sendable {}
extension Kava_Issuance_V1beta1_Asset: @unchecked Sendable {}
extension Kava_Issuance_V1beta1_RateLimit: @unchecked Sendable {}
extension Kava_Issuance_V1beta1_AssetSupply: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "kava.issuance.v1beta1"

extension Kava_Issuance_V1beta1_GenesisState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GenesisState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "params"),
    2: .same(proto: "supplies"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._params) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.supplies) }()
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
    if !self.supplies.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.supplies, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kava_Issuance_V1beta1_GenesisState, rhs: Kava_Issuance_V1beta1_GenesisState) -> Bool {
    if lhs._params != rhs._params {return false}
    if lhs.supplies != rhs.supplies {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Kava_Issuance_V1beta1_Params: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Params"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "assets"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.assets) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.assets.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.assets, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kava_Issuance_V1beta1_Params, rhs: Kava_Issuance_V1beta1_Params) -> Bool {
    if lhs.assets != rhs.assets {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Kava_Issuance_V1beta1_Asset: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Asset"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "owner"),
    2: .same(proto: "denom"),
    3: .standard(proto: "blocked_addresses"),
    4: .same(proto: "paused"),
    5: .same(proto: "blockable"),
    6: .standard(proto: "rate_limit"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.owner) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.denom) }()
      case 3: try { try decoder.decodeRepeatedStringField(value: &self.blockedAddresses) }()
      case 4: try { try decoder.decodeSingularBoolField(value: &self.paused) }()
      case 5: try { try decoder.decodeSingularBoolField(value: &self.blockable) }()
      case 6: try { try decoder.decodeSingularMessageField(value: &self._rateLimit) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.owner.isEmpty {
      try visitor.visitSingularStringField(value: self.owner, fieldNumber: 1)
    }
    if !self.denom.isEmpty {
      try visitor.visitSingularStringField(value: self.denom, fieldNumber: 2)
    }
    if !self.blockedAddresses.isEmpty {
      try visitor.visitRepeatedStringField(value: self.blockedAddresses, fieldNumber: 3)
    }
    if self.paused != false {
      try visitor.visitSingularBoolField(value: self.paused, fieldNumber: 4)
    }
    if self.blockable != false {
      try visitor.visitSingularBoolField(value: self.blockable, fieldNumber: 5)
    }
    try { if let v = self._rateLimit {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 6)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kava_Issuance_V1beta1_Asset, rhs: Kava_Issuance_V1beta1_Asset) -> Bool {
    if lhs.owner != rhs.owner {return false}
    if lhs.denom != rhs.denom {return false}
    if lhs.blockedAddresses != rhs.blockedAddresses {return false}
    if lhs.paused != rhs.paused {return false}
    if lhs.blockable != rhs.blockable {return false}
    if lhs._rateLimit != rhs._rateLimit {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Kava_Issuance_V1beta1_RateLimit: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".RateLimit"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "active"),
    2: .same(proto: "limit"),
    3: .standard(proto: "time_period"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBoolField(value: &self.active) }()
      case 2: try { try decoder.decodeSingularBytesField(value: &self.limit) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._timePeriod) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if self.active != false {
      try visitor.visitSingularBoolField(value: self.active, fieldNumber: 1)
    }
    if !self.limit.isEmpty {
      try visitor.visitSingularBytesField(value: self.limit, fieldNumber: 2)
    }
    try { if let v = self._timePeriod {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kava_Issuance_V1beta1_RateLimit, rhs: Kava_Issuance_V1beta1_RateLimit) -> Bool {
    if lhs.active != rhs.active {return false}
    if lhs.limit != rhs.limit {return false}
    if lhs._timePeriod != rhs._timePeriod {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Kava_Issuance_V1beta1_AssetSupply: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".AssetSupply"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "current_supply"),
    2: .standard(proto: "time_elapsed"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._currentSupply) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._timeElapsed) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._currentSupply {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    try { if let v = self._timeElapsed {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kava_Issuance_V1beta1_AssetSupply, rhs: Kava_Issuance_V1beta1_AssetSupply) -> Bool {
    if lhs._currentSupply != rhs._currentSupply {return false}
    if lhs._timeElapsed != rhs._timeElapsed {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
