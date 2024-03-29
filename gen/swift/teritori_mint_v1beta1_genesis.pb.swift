// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: teritori/mint/v1beta1/genesis.proto
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

/// GenesisState defines the mint module's genesis state.
struct Teritori_Mint_V1beta1_GenesisState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// minter is a space for holding current rewards information.
  var minter: Teritori_Mint_V1beta1_Minter {
    get {return _storage._minter ?? Teritori_Mint_V1beta1_Minter()}
    set {_uniqueStorage()._minter = newValue}
  }
  /// Returns true if `minter` has been explicitly set.
  var hasMinter: Bool {return _storage._minter != nil}
  /// Clears the value of `minter`. Subsequent reads from it will return its default value.
  mutating func clearMinter() {_uniqueStorage()._minter = nil}

  /// params defines all the paramaters of the module.
  var params: Teritori_Mint_V1beta1_Params {
    get {return _storage._params ?? Teritori_Mint_V1beta1_Params()}
    set {_uniqueStorage()._params = newValue}
  }
  /// Returns true if `params` has been explicitly set.
  var hasParams: Bool {return _storage._params != nil}
  /// Clears the value of `params`. Subsequent reads from it will return its default value.
  mutating func clearParams() {_uniqueStorage()._params = nil}

  /// required values for team rewards
  var monthInfo: Teritori_Mint_V1beta1_TeamVestingMonthInfo {
    get {return _storage._monthInfo ?? Teritori_Mint_V1beta1_TeamVestingMonthInfo()}
    set {_uniqueStorage()._monthInfo = newValue}
  }
  /// Returns true if `monthInfo` has been explicitly set.
  var hasMonthInfo: Bool {return _storage._monthInfo != nil}
  /// Clears the value of `monthInfo`. Subsequent reads from it will return its default value.
  mutating func clearMonthInfo() {_uniqueStorage()._monthInfo = nil}

  /// current reduction period start block
  var reductionStartedBlock: Int64 {
    get {return _storage._reductionStartedBlock}
    set {_uniqueStorage()._reductionStartedBlock = newValue}
  }

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _storage = _StorageClass.defaultInstance
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Teritori_Mint_V1beta1_GenesisState: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "teritori.mint.v1beta1"

extension Teritori_Mint_V1beta1_GenesisState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GenesisState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "minter"),
    2: .same(proto: "params"),
    3: .standard(proto: "month_info"),
    4: .standard(proto: "reduction_started_block"),
  ]

  fileprivate class _StorageClass {
    var _minter: Teritori_Mint_V1beta1_Minter? = nil
    var _params: Teritori_Mint_V1beta1_Params? = nil
    var _monthInfo: Teritori_Mint_V1beta1_TeamVestingMonthInfo? = nil
    var _reductionStartedBlock: Int64 = 0

    static let defaultInstance = _StorageClass()

    private init() {}

    init(copying source: _StorageClass) {
      _minter = source._minter
      _params = source._params
      _monthInfo = source._monthInfo
      _reductionStartedBlock = source._reductionStartedBlock
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
        case 1: try { try decoder.decodeSingularMessageField(value: &_storage._minter) }()
        case 2: try { try decoder.decodeSingularMessageField(value: &_storage._params) }()
        case 3: try { try decoder.decodeSingularMessageField(value: &_storage._monthInfo) }()
        case 4: try { try decoder.decodeSingularInt64Field(value: &_storage._reductionStartedBlock) }()
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
      try { if let v = _storage._minter {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
      } }()
      try { if let v = _storage._params {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
      } }()
      try { if let v = _storage._monthInfo {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
      } }()
      if _storage._reductionStartedBlock != 0 {
        try visitor.visitSingularInt64Field(value: _storage._reductionStartedBlock, fieldNumber: 4)
      }
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Teritori_Mint_V1beta1_GenesisState, rhs: Teritori_Mint_V1beta1_GenesisState) -> Bool {
    if lhs._storage !== rhs._storage {
      let storagesAreEqual: Bool = withExtendedLifetime((lhs._storage, rhs._storage)) { (_args: (_StorageClass, _StorageClass)) in
        let _storage = _args.0
        let rhs_storage = _args.1
        if _storage._minter != rhs_storage._minter {return false}
        if _storage._params != rhs_storage._params {return false}
        if _storage._monthInfo != rhs_storage._monthInfo {return false}
        if _storage._reductionStartedBlock != rhs_storage._reductionStartedBlock {return false}
        return true
      }
      if !storagesAreEqual {return false}
    }
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
