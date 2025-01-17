// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: thorchain/v1/x/thorchain/types/msg_swap.proto
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

enum Types_OrderType: SwiftProtobuf.Enum {
  typealias RawValue = Int
  case market // = 0
  case limit // = 1
  case UNRECOGNIZED(Int)

  init() {
    self = .market
  }

  init?(rawValue: Int) {
    switch rawValue {
    case 0: self = .market
    case 1: self = .limit
    default: self = .UNRECOGNIZED(rawValue)
    }
  }

  var rawValue: Int {
    switch self {
    case .market: return 0
    case .limit: return 1
    case .UNRECOGNIZED(let i): return i
    }
  }

}

#if swift(>=4.2)

extension Types_OrderType: CaseIterable {
  // The compiler won't synthesize support with the UNRECOGNIZED case.
  static var allCases: [Types_OrderType] = [
    .market,
    .limit,
  ]
}

#endif  // swift(>=4.2)

struct Types_MsgSwap {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var tx: Common_Tx {
    get {return _storage._tx ?? Common_Tx()}
    set {_uniqueStorage()._tx = newValue}
  }
  /// Returns true if `tx` has been explicitly set.
  var hasTx: Bool {return _storage._tx != nil}
  /// Clears the value of `tx`. Subsequent reads from it will return its default value.
  mutating func clearTx() {_uniqueStorage()._tx = nil}

  var targetAsset: Common_Asset {
    get {return _storage._targetAsset ?? Common_Asset()}
    set {_uniqueStorage()._targetAsset = newValue}
  }
  /// Returns true if `targetAsset` has been explicitly set.
  var hasTargetAsset: Bool {return _storage._targetAsset != nil}
  /// Clears the value of `targetAsset`. Subsequent reads from it will return its default value.
  mutating func clearTargetAsset() {_uniqueStorage()._targetAsset = nil}

  var destination: String {
    get {return _storage._destination}
    set {_uniqueStorage()._destination = newValue}
  }

  var tradeTarget: String {
    get {return _storage._tradeTarget}
    set {_uniqueStorage()._tradeTarget = newValue}
  }

  var affiliateAddress: String {
    get {return _storage._affiliateAddress}
    set {_uniqueStorage()._affiliateAddress = newValue}
  }

  var affiliateBasisPoints: String {
    get {return _storage._affiliateBasisPoints}
    set {_uniqueStorage()._affiliateBasisPoints = newValue}
  }

  var signer: Data {
    get {return _storage._signer}
    set {_uniqueStorage()._signer = newValue}
  }

  var aggregator: String {
    get {return _storage._aggregator}
    set {_uniqueStorage()._aggregator = newValue}
  }

  var aggregatorTargetAddress: String {
    get {return _storage._aggregatorTargetAddress}
    set {_uniqueStorage()._aggregatorTargetAddress = newValue}
  }

  var aggregatorTargetLimit: String {
    get {return _storage._aggregatorTargetLimit}
    set {_uniqueStorage()._aggregatorTargetLimit = newValue}
  }

  var orderType: Types_OrderType {
    get {return _storage._orderType}
    set {_uniqueStorage()._orderType = newValue}
  }

  var streamQuantity: UInt64 {
    get {return _storage._streamQuantity}
    set {_uniqueStorage()._streamQuantity = newValue}
  }

  var streamInterval: UInt64 {
    get {return _storage._streamInterval}
    set {_uniqueStorage()._streamInterval = newValue}
  }

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _storage = _StorageClass.defaultInstance
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Types_OrderType: @unchecked Sendable {}
extension Types_MsgSwap: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "types"

extension Types_OrderType: SwiftProtobuf._ProtoNameProviding {
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    0: .same(proto: "market"),
    1: .same(proto: "limit"),
  ]
}

extension Types_MsgSwap: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgSwap"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "tx"),
    2: .standard(proto: "target_asset"),
    3: .same(proto: "destination"),
    4: .standard(proto: "trade_target"),
    5: .standard(proto: "affiliate_address"),
    6: .standard(proto: "affiliate_basis_points"),
    7: .same(proto: "signer"),
    8: .same(proto: "aggregator"),
    9: .standard(proto: "aggregator_target_address"),
    10: .standard(proto: "aggregator_target_limit"),
    11: .standard(proto: "order_type"),
    12: .standard(proto: "stream_quantity"),
    13: .standard(proto: "stream_interval"),
  ]

  fileprivate class _StorageClass {
    var _tx: Common_Tx? = nil
    var _targetAsset: Common_Asset? = nil
    var _destination: String = String()
    var _tradeTarget: String = String()
    var _affiliateAddress: String = String()
    var _affiliateBasisPoints: String = String()
    var _signer: Data = Data()
    var _aggregator: String = String()
    var _aggregatorTargetAddress: String = String()
    var _aggregatorTargetLimit: String = String()
    var _orderType: Types_OrderType = .market
    var _streamQuantity: UInt64 = 0
    var _streamInterval: UInt64 = 0

    static let defaultInstance = _StorageClass()

    private init() {}

    init(copying source: _StorageClass) {
      _tx = source._tx
      _targetAsset = source._targetAsset
      _destination = source._destination
      _tradeTarget = source._tradeTarget
      _affiliateAddress = source._affiliateAddress
      _affiliateBasisPoints = source._affiliateBasisPoints
      _signer = source._signer
      _aggregator = source._aggregator
      _aggregatorTargetAddress = source._aggregatorTargetAddress
      _aggregatorTargetLimit = source._aggregatorTargetLimit
      _orderType = source._orderType
      _streamQuantity = source._streamQuantity
      _streamInterval = source._streamInterval
    }
  }

  fileprivate mutating func _uniqueStorage() -> _StorageClass {
    if !isKnownUniquelyReferenced(&_storage) {
      _storage = _StorageClass(copying: _storage)
    }
    return _storage
  }

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    _ = _uniqueStorage()
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      while let fieldNumber = try decoder.nextFieldNumber() {
        // The use of inline closures is to circumvent an issue where the compiler
        // allocates stack space for every case branch when no optimizations are
        // enabled. https://github.com/apple/swift-protobuf/issues/1034
        switch fieldNumber {
        case 1: try { try decoder.decodeSingularMessageField(value: &_storage._tx) }()
        case 2: try { try decoder.decodeSingularMessageField(value: &_storage._targetAsset) }()
        case 3: try { try decoder.decodeSingularStringField(value: &_storage._destination) }()
        case 4: try { try decoder.decodeSingularStringField(value: &_storage._tradeTarget) }()
        case 5: try { try decoder.decodeSingularStringField(value: &_storage._affiliateAddress) }()
        case 6: try { try decoder.decodeSingularStringField(value: &_storage._affiliateBasisPoints) }()
        case 7: try { try decoder.decodeSingularBytesField(value: &_storage._signer) }()
        case 8: try { try decoder.decodeSingularStringField(value: &_storage._aggregator) }()
        case 9: try { try decoder.decodeSingularStringField(value: &_storage._aggregatorTargetAddress) }()
        case 10: try { try decoder.decodeSingularStringField(value: &_storage._aggregatorTargetLimit) }()
        case 11: try { try decoder.decodeSingularEnumField(value: &_storage._orderType) }()
        case 12: try { try decoder.decodeSingularUInt64Field(value: &_storage._streamQuantity) }()
        case 13: try { try decoder.decodeSingularUInt64Field(value: &_storage._streamInterval) }()
        default: break
        }
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every if/case branch local when no optimizations
      // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
      // https://github.com/apple/swift-protobuf/issues/1182
      try { if let v = _storage._tx {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
      } }()
      try { if let v = _storage._targetAsset {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
      } }()
      if !_storage._destination.isEmpty {
        try visitor.visitSingularStringField(value: _storage._destination, fieldNumber: 3)
      }
      if !_storage._tradeTarget.isEmpty {
        try visitor.visitSingularStringField(value: _storage._tradeTarget, fieldNumber: 4)
      }
      if !_storage._affiliateAddress.isEmpty {
        try visitor.visitSingularStringField(value: _storage._affiliateAddress, fieldNumber: 5)
      }
      if !_storage._affiliateBasisPoints.isEmpty {
        try visitor.visitSingularStringField(value: _storage._affiliateBasisPoints, fieldNumber: 6)
      }
      if !_storage._signer.isEmpty {
        try visitor.visitSingularBytesField(value: _storage._signer, fieldNumber: 7)
      }
      if !_storage._aggregator.isEmpty {
        try visitor.visitSingularStringField(value: _storage._aggregator, fieldNumber: 8)
      }
      if !_storage._aggregatorTargetAddress.isEmpty {
        try visitor.visitSingularStringField(value: _storage._aggregatorTargetAddress, fieldNumber: 9)
      }
      if !_storage._aggregatorTargetLimit.isEmpty {
        try visitor.visitSingularStringField(value: _storage._aggregatorTargetLimit, fieldNumber: 10)
      }
      if _storage._orderType != .market {
        try visitor.visitSingularEnumField(value: _storage._orderType, fieldNumber: 11)
      }
      if _storage._streamQuantity != 0 {
        try visitor.visitSingularUInt64Field(value: _storage._streamQuantity, fieldNumber: 12)
      }
      if _storage._streamInterval != 0 {
        try visitor.visitSingularUInt64Field(value: _storage._streamInterval, fieldNumber: 13)
      }
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Types_MsgSwap, rhs: Types_MsgSwap) -> Bool {
    if lhs._storage !== rhs._storage {
      let storagesAreEqual: Bool = withExtendedLifetime((lhs._storage, rhs._storage)) { (_args: (_StorageClass, _StorageClass)) in
        let _storage = _args.0
        let rhs_storage = _args.1
        if _storage._tx != rhs_storage._tx {return false}
        if _storage._targetAsset != rhs_storage._targetAsset {return false}
        if _storage._destination != rhs_storage._destination {return false}
        if _storage._tradeTarget != rhs_storage._tradeTarget {return false}
        if _storage._affiliateAddress != rhs_storage._affiliateAddress {return false}
        if _storage._affiliateBasisPoints != rhs_storage._affiliateBasisPoints {return false}
        if _storage._signer != rhs_storage._signer {return false}
        if _storage._aggregator != rhs_storage._aggregator {return false}
        if _storage._aggregatorTargetAddress != rhs_storage._aggregatorTargetAddress {return false}
        if _storage._aggregatorTargetLimit != rhs_storage._aggregatorTargetLimit {return false}
        if _storage._orderType != rhs_storage._orderType {return false}
        if _storage._streamQuantity != rhs_storage._streamQuantity {return false}
        if _storage._streamInterval != rhs_storage._streamInterval {return false}
        return true
      }
      if !storagesAreEqual {return false}
    }
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
