// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: thorchain/v1/x/thorchain/types/msg_loan.proto
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

struct Types_MsgLoanOpen {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var owner: String {
    get {return _storage._owner}
    set {_uniqueStorage()._owner = newValue}
  }

  var collateralAsset: Common_Asset {
    get {return _storage._collateralAsset ?? Common_Asset()}
    set {_uniqueStorage()._collateralAsset = newValue}
  }
  /// Returns true if `collateralAsset` has been explicitly set.
  var hasCollateralAsset: Bool {return _storage._collateralAsset != nil}
  /// Clears the value of `collateralAsset`. Subsequent reads from it will return its default value.
  mutating func clearCollateralAsset() {_uniqueStorage()._collateralAsset = nil}

  var collateralAmount: String {
    get {return _storage._collateralAmount}
    set {_uniqueStorage()._collateralAmount = newValue}
  }

  var targetAddress: String {
    get {return _storage._targetAddress}
    set {_uniqueStorage()._targetAddress = newValue}
  }

  var targetAsset: Common_Asset {
    get {return _storage._targetAsset ?? Common_Asset()}
    set {_uniqueStorage()._targetAsset = newValue}
  }
  /// Returns true if `targetAsset` has been explicitly set.
  var hasTargetAsset: Bool {return _storage._targetAsset != nil}
  /// Clears the value of `targetAsset`. Subsequent reads from it will return its default value.
  mutating func clearTargetAsset() {_uniqueStorage()._targetAsset = nil}

  var minOut: String {
    get {return _storage._minOut}
    set {_uniqueStorage()._minOut = newValue}
  }

  var affiliateAddress: String {
    get {return _storage._affiliateAddress}
    set {_uniqueStorage()._affiliateAddress = newValue}
  }

  var affiliateBasisPoints: String {
    get {return _storage._affiliateBasisPoints}
    set {_uniqueStorage()._affiliateBasisPoints = newValue}
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

  var signer: Data {
    get {return _storage._signer}
    set {_uniqueStorage()._signer = newValue}
  }

  var txID: String {
    get {return _storage._txID}
    set {_uniqueStorage()._txID = newValue}
  }

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _storage = _StorageClass.defaultInstance
}

struct Types_MsgLoanRepayment {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var owner: String {
    get {return _storage._owner}
    set {_uniqueStorage()._owner = newValue}
  }

  var collateralAsset: Common_Asset {
    get {return _storage._collateralAsset ?? Common_Asset()}
    set {_uniqueStorage()._collateralAsset = newValue}
  }
  /// Returns true if `collateralAsset` has been explicitly set.
  var hasCollateralAsset: Bool {return _storage._collateralAsset != nil}
  /// Clears the value of `collateralAsset`. Subsequent reads from it will return its default value.
  mutating func clearCollateralAsset() {_uniqueStorage()._collateralAsset = nil}

  var coin: Common_Coin {
    get {return _storage._coin ?? Common_Coin()}
    set {_uniqueStorage()._coin = newValue}
  }
  /// Returns true if `coin` has been explicitly set.
  var hasCoin: Bool {return _storage._coin != nil}
  /// Clears the value of `coin`. Subsequent reads from it will return its default value.
  mutating func clearCoin() {_uniqueStorage()._coin = nil}

  var minOut: String {
    get {return _storage._minOut}
    set {_uniqueStorage()._minOut = newValue}
  }

  var signer: Data {
    get {return _storage._signer}
    set {_uniqueStorage()._signer = newValue}
  }

  var from: String {
    get {return _storage._from}
    set {_uniqueStorage()._from = newValue}
  }

  var txID: String {
    get {return _storage._txID}
    set {_uniqueStorage()._txID = newValue}
  }

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _storage = _StorageClass.defaultInstance
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Types_MsgLoanOpen: @unchecked Sendable {}
extension Types_MsgLoanRepayment: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "types"

extension Types_MsgLoanOpen: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgLoanOpen"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "owner"),
    2: .standard(proto: "collateral_asset"),
    3: .standard(proto: "collateral_amount"),
    4: .standard(proto: "target_address"),
    5: .standard(proto: "target_asset"),
    6: .standard(proto: "min_out"),
    7: .standard(proto: "affiliate_address"),
    8: .standard(proto: "affiliate_basis_points"),
    9: .same(proto: "aggregator"),
    10: .standard(proto: "aggregator_target_address"),
    11: .standard(proto: "aggregator_target_limit"),
    12: .same(proto: "signer"),
    13: .standard(proto: "tx_id"),
  ]

  fileprivate class _StorageClass {
    var _owner: String = String()
    var _collateralAsset: Common_Asset? = nil
    var _collateralAmount: String = String()
    var _targetAddress: String = String()
    var _targetAsset: Common_Asset? = nil
    var _minOut: String = String()
    var _affiliateAddress: String = String()
    var _affiliateBasisPoints: String = String()
    var _aggregator: String = String()
    var _aggregatorTargetAddress: String = String()
    var _aggregatorTargetLimit: String = String()
    var _signer: Data = Data()
    var _txID: String = String()

    static let defaultInstance = _StorageClass()

    private init() {}

    init(copying source: _StorageClass) {
      _owner = source._owner
      _collateralAsset = source._collateralAsset
      _collateralAmount = source._collateralAmount
      _targetAddress = source._targetAddress
      _targetAsset = source._targetAsset
      _minOut = source._minOut
      _affiliateAddress = source._affiliateAddress
      _affiliateBasisPoints = source._affiliateBasisPoints
      _aggregator = source._aggregator
      _aggregatorTargetAddress = source._aggregatorTargetAddress
      _aggregatorTargetLimit = source._aggregatorTargetLimit
      _signer = source._signer
      _txID = source._txID
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
        case 1: try { try decoder.decodeSingularStringField(value: &_storage._owner) }()
        case 2: try { try decoder.decodeSingularMessageField(value: &_storage._collateralAsset) }()
        case 3: try { try decoder.decodeSingularStringField(value: &_storage._collateralAmount) }()
        case 4: try { try decoder.decodeSingularStringField(value: &_storage._targetAddress) }()
        case 5: try { try decoder.decodeSingularMessageField(value: &_storage._targetAsset) }()
        case 6: try { try decoder.decodeSingularStringField(value: &_storage._minOut) }()
        case 7: try { try decoder.decodeSingularStringField(value: &_storage._affiliateAddress) }()
        case 8: try { try decoder.decodeSingularStringField(value: &_storage._affiliateBasisPoints) }()
        case 9: try { try decoder.decodeSingularStringField(value: &_storage._aggregator) }()
        case 10: try { try decoder.decodeSingularStringField(value: &_storage._aggregatorTargetAddress) }()
        case 11: try { try decoder.decodeSingularStringField(value: &_storage._aggregatorTargetLimit) }()
        case 12: try { try decoder.decodeSingularBytesField(value: &_storage._signer) }()
        case 13: try { try decoder.decodeSingularStringField(value: &_storage._txID) }()
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
      if !_storage._owner.isEmpty {
        try visitor.visitSingularStringField(value: _storage._owner, fieldNumber: 1)
      }
      try { if let v = _storage._collateralAsset {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
      } }()
      if !_storage._collateralAmount.isEmpty {
        try visitor.visitSingularStringField(value: _storage._collateralAmount, fieldNumber: 3)
      }
      if !_storage._targetAddress.isEmpty {
        try visitor.visitSingularStringField(value: _storage._targetAddress, fieldNumber: 4)
      }
      try { if let v = _storage._targetAsset {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 5)
      } }()
      if !_storage._minOut.isEmpty {
        try visitor.visitSingularStringField(value: _storage._minOut, fieldNumber: 6)
      }
      if !_storage._affiliateAddress.isEmpty {
        try visitor.visitSingularStringField(value: _storage._affiliateAddress, fieldNumber: 7)
      }
      if !_storage._affiliateBasisPoints.isEmpty {
        try visitor.visitSingularStringField(value: _storage._affiliateBasisPoints, fieldNumber: 8)
      }
      if !_storage._aggregator.isEmpty {
        try visitor.visitSingularStringField(value: _storage._aggregator, fieldNumber: 9)
      }
      if !_storage._aggregatorTargetAddress.isEmpty {
        try visitor.visitSingularStringField(value: _storage._aggregatorTargetAddress, fieldNumber: 10)
      }
      if !_storage._aggregatorTargetLimit.isEmpty {
        try visitor.visitSingularStringField(value: _storage._aggregatorTargetLimit, fieldNumber: 11)
      }
      if !_storage._signer.isEmpty {
        try visitor.visitSingularBytesField(value: _storage._signer, fieldNumber: 12)
      }
      if !_storage._txID.isEmpty {
        try visitor.visitSingularStringField(value: _storage._txID, fieldNumber: 13)
      }
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Types_MsgLoanOpen, rhs: Types_MsgLoanOpen) -> Bool {
    if lhs._storage !== rhs._storage {
      let storagesAreEqual: Bool = withExtendedLifetime((lhs._storage, rhs._storage)) { (_args: (_StorageClass, _StorageClass)) in
        let _storage = _args.0
        let rhs_storage = _args.1
        if _storage._owner != rhs_storage._owner {return false}
        if _storage._collateralAsset != rhs_storage._collateralAsset {return false}
        if _storage._collateralAmount != rhs_storage._collateralAmount {return false}
        if _storage._targetAddress != rhs_storage._targetAddress {return false}
        if _storage._targetAsset != rhs_storage._targetAsset {return false}
        if _storage._minOut != rhs_storage._minOut {return false}
        if _storage._affiliateAddress != rhs_storage._affiliateAddress {return false}
        if _storage._affiliateBasisPoints != rhs_storage._affiliateBasisPoints {return false}
        if _storage._aggregator != rhs_storage._aggregator {return false}
        if _storage._aggregatorTargetAddress != rhs_storage._aggregatorTargetAddress {return false}
        if _storage._aggregatorTargetLimit != rhs_storage._aggregatorTargetLimit {return false}
        if _storage._signer != rhs_storage._signer {return false}
        if _storage._txID != rhs_storage._txID {return false}
        return true
      }
      if !storagesAreEqual {return false}
    }
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Types_MsgLoanRepayment: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgLoanRepayment"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "owner"),
    2: .standard(proto: "collateral_asset"),
    3: .same(proto: "coin"),
    4: .standard(proto: "min_out"),
    5: .same(proto: "signer"),
    6: .same(proto: "from"),
    7: .standard(proto: "tx_id"),
  ]

  fileprivate class _StorageClass {
    var _owner: String = String()
    var _collateralAsset: Common_Asset? = nil
    var _coin: Common_Coin? = nil
    var _minOut: String = String()
    var _signer: Data = Data()
    var _from: String = String()
    var _txID: String = String()

    static let defaultInstance = _StorageClass()

    private init() {}

    init(copying source: _StorageClass) {
      _owner = source._owner
      _collateralAsset = source._collateralAsset
      _coin = source._coin
      _minOut = source._minOut
      _signer = source._signer
      _from = source._from
      _txID = source._txID
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
        case 1: try { try decoder.decodeSingularStringField(value: &_storage._owner) }()
        case 2: try { try decoder.decodeSingularMessageField(value: &_storage._collateralAsset) }()
        case 3: try { try decoder.decodeSingularMessageField(value: &_storage._coin) }()
        case 4: try { try decoder.decodeSingularStringField(value: &_storage._minOut) }()
        case 5: try { try decoder.decodeSingularBytesField(value: &_storage._signer) }()
        case 6: try { try decoder.decodeSingularStringField(value: &_storage._from) }()
        case 7: try { try decoder.decodeSingularStringField(value: &_storage._txID) }()
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
      if !_storage._owner.isEmpty {
        try visitor.visitSingularStringField(value: _storage._owner, fieldNumber: 1)
      }
      try { if let v = _storage._collateralAsset {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
      } }()
      try { if let v = _storage._coin {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
      } }()
      if !_storage._minOut.isEmpty {
        try visitor.visitSingularStringField(value: _storage._minOut, fieldNumber: 4)
      }
      if !_storage._signer.isEmpty {
        try visitor.visitSingularBytesField(value: _storage._signer, fieldNumber: 5)
      }
      if !_storage._from.isEmpty {
        try visitor.visitSingularStringField(value: _storage._from, fieldNumber: 6)
      }
      if !_storage._txID.isEmpty {
        try visitor.visitSingularStringField(value: _storage._txID, fieldNumber: 7)
      }
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Types_MsgLoanRepayment, rhs: Types_MsgLoanRepayment) -> Bool {
    if lhs._storage !== rhs._storage {
      let storagesAreEqual: Bool = withExtendedLifetime((lhs._storage, rhs._storage)) { (_args: (_StorageClass, _StorageClass)) in
        let _storage = _args.0
        let rhs_storage = _args.1
        if _storage._owner != rhs_storage._owner {return false}
        if _storage._collateralAsset != rhs_storage._collateralAsset {return false}
        if _storage._coin != rhs_storage._coin {return false}
        if _storage._minOut != rhs_storage._minOut {return false}
        if _storage._signer != rhs_storage._signer {return false}
        if _storage._from != rhs_storage._from {return false}
        if _storage._txID != rhs_storage._txID {return false}
        return true
      }
      if !storagesAreEqual {return false}
    }
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
