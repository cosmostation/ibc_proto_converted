// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: lum-network/millions/draw.proto
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

enum Lum_Network_Millions_DrawState: SwiftProtobuf.Enum {
  typealias RawValue = Int
  case unspecified // = 0
  case icaWithdrawrewards // = 1
  case queryBalance // = 2
  case ibcTransfer // = 3
  case drawing // = 4
  case success // = 5
  case failure // = 6
  case UNRECOGNIZED(Int)

  init() {
    self = .unspecified
  }

  init?(rawValue: Int) {
    switch rawValue {
    case 0: self = .unspecified
    case 1: self = .icaWithdrawrewards
    case 2: self = .queryBalance
    case 3: self = .ibcTransfer
    case 4: self = .drawing
    case 5: self = .success
    case 6: self = .failure
    default: self = .UNRECOGNIZED(rawValue)
    }
  }

  var rawValue: Int {
    switch self {
    case .unspecified: return 0
    case .icaWithdrawrewards: return 1
    case .queryBalance: return 2
    case .ibcTransfer: return 3
    case .drawing: return 4
    case .success: return 5
    case .failure: return 6
    case .UNRECOGNIZED(let i): return i
    }
  }

}

#if swift(>=4.2)

extension Lum_Network_Millions_DrawState: CaseIterable {
  // The compiler won't synthesize support with the UNRECOGNIZED case.
  static var allCases: [Lum_Network_Millions_DrawState] = [
    .unspecified,
    .icaWithdrawrewards,
    .queryBalance,
    .ibcTransfer,
    .drawing,
    .success,
    .failure,
  ]
}

#endif  // swift(>=4.2)

struct Lum_Network_Millions_Draw {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// Draw IDs
  var poolID: UInt64 {
    get {return _storage._poolID}
    set {_uniqueStorage()._poolID = newValue}
  }

  var drawID: UInt64 {
    get {return _storage._drawID}
    set {_uniqueStorage()._drawID = newValue}
  }

  /// Draw states
  /// error_state is only set in case of failure
  var state: Lum_Network_Millions_DrawState {
    get {return _storage._state}
    set {_uniqueStorage()._state = newValue}
  }

  var errorState: Lum_Network_Millions_DrawState {
    get {return _storage._errorState}
    set {_uniqueStorage()._errorState = newValue}
  }

  /// Draw state done data
  var randSeed: Int64 {
    get {return _storage._randSeed}
    set {_uniqueStorage()._randSeed = newValue}
  }

  var prizePool: Cosmos_Base_V1beta1_Coin {
    get {return _storage._prizePool ?? Cosmos_Base_V1beta1_Coin()}
    set {_uniqueStorage()._prizePool = newValue}
  }
  /// Returns true if `prizePool` has been explicitly set.
  var hasPrizePool: Bool {return _storage._prizePool != nil}
  /// Clears the value of `prizePool`. Subsequent reads from it will return its default value.
  mutating func clearPrizePool() {_uniqueStorage()._prizePool = nil}

  var prizePoolFreshAmount: String {
    get {return _storage._prizePoolFreshAmount}
    set {_uniqueStorage()._prizePoolFreshAmount = newValue}
  }

  var prizePoolRemainsAmount: String {
    get {return _storage._prizePoolRemainsAmount}
    set {_uniqueStorage()._prizePoolRemainsAmount = newValue}
  }

  var prizesRefs: [Lum_Network_Millions_PrizeRef] {
    get {return _storage._prizesRefs}
    set {_uniqueStorage()._prizesRefs = newValue}
  }

  var totalWinCount: UInt64 {
    get {return _storage._totalWinCount}
    set {_uniqueStorage()._totalWinCount = newValue}
  }

  var totalWinAmount: String {
    get {return _storage._totalWinAmount}
    set {_uniqueStorage()._totalWinAmount = newValue}
  }

  /// Draw creation and updates
  var createdAtHeight: Int64 {
    get {return _storage._createdAtHeight}
    set {_uniqueStorage()._createdAtHeight = newValue}
  }

  var updatedAtHeight: Int64 {
    get {return _storage._updatedAtHeight}
    set {_uniqueStorage()._updatedAtHeight = newValue}
  }

  var createdAt: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _storage._createdAt ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_uniqueStorage()._createdAt = newValue}
  }
  /// Returns true if `createdAt` has been explicitly set.
  var hasCreatedAt: Bool {return _storage._createdAt != nil}
  /// Clears the value of `createdAt`. Subsequent reads from it will return its default value.
  mutating func clearCreatedAt() {_uniqueStorage()._createdAt = nil}

  var updatedAt: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _storage._updatedAt ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_uniqueStorage()._updatedAt = newValue}
  }
  /// Returns true if `updatedAt` has been explicitly set.
  var hasUpdatedAt: Bool {return _storage._updatedAt != nil}
  /// Clears the value of `updatedAt`. Subsequent reads from it will return its default value.
  mutating func clearUpdatedAt() {_uniqueStorage()._updatedAt = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _storage = _StorageClass.defaultInstance
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Lum_Network_Millions_DrawState: @unchecked Sendable {}
extension Lum_Network_Millions_Draw: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "lum.network.millions"

extension Lum_Network_Millions_DrawState: SwiftProtobuf._ProtoNameProviding {
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    0: .same(proto: "DRAW_STATE_UNSPECIFIED"),
    1: .same(proto: "DRAW_STATE_ICA_WITHDRAWREWARDS"),
    2: .same(proto: "DRAW_STATE_QUERY_BALANCE"),
    3: .same(proto: "DRAW_STATE_IBC_TRANSFER"),
    4: .same(proto: "DRAW_STATE_DRAWING"),
    5: .same(proto: "DRAW_STATE_SUCCESS"),
    6: .same(proto: "DRAW_STATE_FAILURE"),
  ]
}

extension Lum_Network_Millions_Draw: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Draw"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "pool_id"),
    2: .standard(proto: "draw_id"),
    3: .same(proto: "state"),
    4: .standard(proto: "error_state"),
    5: .standard(proto: "rand_seed"),
    6: .standard(proto: "prize_pool"),
    7: .standard(proto: "prize_pool_fresh_amount"),
    8: .standard(proto: "prize_pool_remains_amount"),
    11: .standard(proto: "prizes_refs"),
    12: .standard(proto: "total_win_count"),
    13: .standard(proto: "total_win_amount"),
    15: .standard(proto: "created_at_height"),
    16: .standard(proto: "updated_at_height"),
    17: .standard(proto: "created_at"),
    18: .standard(proto: "updated_at"),
  ]

  fileprivate class _StorageClass {
    var _poolID: UInt64 = 0
    var _drawID: UInt64 = 0
    var _state: Lum_Network_Millions_DrawState = .unspecified
    var _errorState: Lum_Network_Millions_DrawState = .unspecified
    var _randSeed: Int64 = 0
    var _prizePool: Cosmos_Base_V1beta1_Coin? = nil
    var _prizePoolFreshAmount: String = String()
    var _prizePoolRemainsAmount: String = String()
    var _prizesRefs: [Lum_Network_Millions_PrizeRef] = []
    var _totalWinCount: UInt64 = 0
    var _totalWinAmount: String = String()
    var _createdAtHeight: Int64 = 0
    var _updatedAtHeight: Int64 = 0
    var _createdAt: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
    var _updatedAt: SwiftProtobuf.Google_Protobuf_Timestamp? = nil

    static let defaultInstance = _StorageClass()

    private init() {}

    init(copying source: _StorageClass) {
      _poolID = source._poolID
      _drawID = source._drawID
      _state = source._state
      _errorState = source._errorState
      _randSeed = source._randSeed
      _prizePool = source._prizePool
      _prizePoolFreshAmount = source._prizePoolFreshAmount
      _prizePoolRemainsAmount = source._prizePoolRemainsAmount
      _prizesRefs = source._prizesRefs
      _totalWinCount = source._totalWinCount
      _totalWinAmount = source._totalWinAmount
      _createdAtHeight = source._createdAtHeight
      _updatedAtHeight = source._updatedAtHeight
      _createdAt = source._createdAt
      _updatedAt = source._updatedAt
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
        case 1: try { try decoder.decodeSingularUInt64Field(value: &_storage._poolID) }()
        case 2: try { try decoder.decodeSingularUInt64Field(value: &_storage._drawID) }()
        case 3: try { try decoder.decodeSingularEnumField(value: &_storage._state) }()
        case 4: try { try decoder.decodeSingularEnumField(value: &_storage._errorState) }()
        case 5: try { try decoder.decodeSingularInt64Field(value: &_storage._randSeed) }()
        case 6: try { try decoder.decodeSingularMessageField(value: &_storage._prizePool) }()
        case 7: try { try decoder.decodeSingularStringField(value: &_storage._prizePoolFreshAmount) }()
        case 8: try { try decoder.decodeSingularStringField(value: &_storage._prizePoolRemainsAmount) }()
        case 11: try { try decoder.decodeRepeatedMessageField(value: &_storage._prizesRefs) }()
        case 12: try { try decoder.decodeSingularUInt64Field(value: &_storage._totalWinCount) }()
        case 13: try { try decoder.decodeSingularStringField(value: &_storage._totalWinAmount) }()
        case 15: try { try decoder.decodeSingularInt64Field(value: &_storage._createdAtHeight) }()
        case 16: try { try decoder.decodeSingularInt64Field(value: &_storage._updatedAtHeight) }()
        case 17: try { try decoder.decodeSingularMessageField(value: &_storage._createdAt) }()
        case 18: try { try decoder.decodeSingularMessageField(value: &_storage._updatedAt) }()
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
      if _storage._poolID != 0 {
        try visitor.visitSingularUInt64Field(value: _storage._poolID, fieldNumber: 1)
      }
      if _storage._drawID != 0 {
        try visitor.visitSingularUInt64Field(value: _storage._drawID, fieldNumber: 2)
      }
      if _storage._state != .unspecified {
        try visitor.visitSingularEnumField(value: _storage._state, fieldNumber: 3)
      }
      if _storage._errorState != .unspecified {
        try visitor.visitSingularEnumField(value: _storage._errorState, fieldNumber: 4)
      }
      if _storage._randSeed != 0 {
        try visitor.visitSingularInt64Field(value: _storage._randSeed, fieldNumber: 5)
      }
      try { if let v = _storage._prizePool {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 6)
      } }()
      if !_storage._prizePoolFreshAmount.isEmpty {
        try visitor.visitSingularStringField(value: _storage._prizePoolFreshAmount, fieldNumber: 7)
      }
      if !_storage._prizePoolRemainsAmount.isEmpty {
        try visitor.visitSingularStringField(value: _storage._prizePoolRemainsAmount, fieldNumber: 8)
      }
      if !_storage._prizesRefs.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._prizesRefs, fieldNumber: 11)
      }
      if _storage._totalWinCount != 0 {
        try visitor.visitSingularUInt64Field(value: _storage._totalWinCount, fieldNumber: 12)
      }
      if !_storage._totalWinAmount.isEmpty {
        try visitor.visitSingularStringField(value: _storage._totalWinAmount, fieldNumber: 13)
      }
      if _storage._createdAtHeight != 0 {
        try visitor.visitSingularInt64Field(value: _storage._createdAtHeight, fieldNumber: 15)
      }
      if _storage._updatedAtHeight != 0 {
        try visitor.visitSingularInt64Field(value: _storage._updatedAtHeight, fieldNumber: 16)
      }
      try { if let v = _storage._createdAt {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 17)
      } }()
      try { if let v = _storage._updatedAt {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 18)
      } }()
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Lum_Network_Millions_Draw, rhs: Lum_Network_Millions_Draw) -> Bool {
    if lhs._storage !== rhs._storage {
      let storagesAreEqual: Bool = withExtendedLifetime((lhs._storage, rhs._storage)) { (_args: (_StorageClass, _StorageClass)) in
        let _storage = _args.0
        let rhs_storage = _args.1
        if _storage._poolID != rhs_storage._poolID {return false}
        if _storage._drawID != rhs_storage._drawID {return false}
        if _storage._state != rhs_storage._state {return false}
        if _storage._errorState != rhs_storage._errorState {return false}
        if _storage._randSeed != rhs_storage._randSeed {return false}
        if _storage._prizePool != rhs_storage._prizePool {return false}
        if _storage._prizePoolFreshAmount != rhs_storage._prizePoolFreshAmount {return false}
        if _storage._prizePoolRemainsAmount != rhs_storage._prizePoolRemainsAmount {return false}
        if _storage._prizesRefs != rhs_storage._prizesRefs {return false}
        if _storage._totalWinCount != rhs_storage._totalWinCount {return false}
        if _storage._totalWinAmount != rhs_storage._totalWinAmount {return false}
        if _storage._createdAtHeight != rhs_storage._createdAtHeight {return false}
        if _storage._updatedAtHeight != rhs_storage._updatedAtHeight {return false}
        if _storage._createdAt != rhs_storage._createdAt {return false}
        if _storage._updatedAt != rhs_storage._updatedAt {return false}
        return true
      }
      if !storagesAreEqual {return false}
    }
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
