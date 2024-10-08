// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: osmosis/lockup/lock.proto
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

/// LockQueryType defines the type of the lock query that can
/// either be by duration or start time of the lock.
enum Osmosis_Lockup_LockQueryType: SwiftProtobuf.Enum {
  typealias RawValue = Int
  case byDuration // = 0
  case byTime // = 1
  case noLock // = 2
  case byGroup // = 3
  case UNRECOGNIZED(Int)

  init() {
    self = .byDuration
  }

  init?(rawValue: Int) {
    switch rawValue {
    case 0: self = .byDuration
    case 1: self = .byTime
    case 2: self = .noLock
    case 3: self = .byGroup
    default: self = .UNRECOGNIZED(rawValue)
    }
  }

  var rawValue: Int {
    switch self {
    case .byDuration: return 0
    case .byTime: return 1
    case .noLock: return 2
    case .byGroup: return 3
    case .UNRECOGNIZED(let i): return i
    }
  }

}

#if swift(>=4.2)

extension Osmosis_Lockup_LockQueryType: CaseIterable {
  // The compiler won't synthesize support with the UNRECOGNIZED case.
  static var allCases: [Osmosis_Lockup_LockQueryType] = [
    .byDuration,
    .byTime,
    .noLock,
    .byGroup,
  ]
}

#endif  // swift(>=4.2)

/// PeriodLock is a single lock unit by period defined by the x/lockup module.
/// It's a record of a locked coin at a specific time. It stores owner, duration,
/// unlock time and the number of coins locked. A state of a period lock is
/// created upon lock creation, and deleted once the lock has been matured after
/// the `duration` has passed since unbonding started.
struct Osmosis_Lockup_PeriodLock {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// ID is the unique id of the lock.
  /// The ID of the lock is decided upon lock creation, incrementing by 1 for
  /// every lock.
  var id: UInt64 = 0

  /// Owner is the account address of the lock owner.
  /// Only the owner can modify the state of the lock.
  var owner: String = String()

  /// Duration is the time needed for a lock to mature after unlocking has
  /// started.
  var duration: SwiftProtobuf.Google_Protobuf_Duration {
    get {return _duration ?? SwiftProtobuf.Google_Protobuf_Duration()}
    set {_duration = newValue}
  }
  /// Returns true if `duration` has been explicitly set.
  var hasDuration: Bool {return self._duration != nil}
  /// Clears the value of `duration`. Subsequent reads from it will return its default value.
  mutating func clearDuration() {self._duration = nil}

  /// EndTime refers to the time at which the lock would mature and get deleted.
  /// This value is first initialized when an unlock has started for the lock,
  /// end time being block time + duration.
  var endTime: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _endTime ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_endTime = newValue}
  }
  /// Returns true if `endTime` has been explicitly set.
  var hasEndTime: Bool {return self._endTime != nil}
  /// Clears the value of `endTime`. Subsequent reads from it will return its default value.
  mutating func clearEndTime() {self._endTime = nil}

  /// Coins are the tokens locked within the lock, kept in the module account.
  var coins: [Cosmos_Base_V1beta1_Coin] = []

  /// Reward Receiver Address is the address that would be receiving rewards for
  /// the incentives for the lock. This is set to owner by default and can be
  /// changed via separate msg.
  var rewardReceiverAddress: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _duration: SwiftProtobuf.Google_Protobuf_Duration? = nil
  fileprivate var _endTime: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
}

/// QueryCondition is a struct used for querying locks upon different conditions.
/// Duration field and timestamp fields could be optional, depending on the
/// LockQueryType.
struct Osmosis_Lockup_QueryCondition {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// LockQueryType is a type of lock query, ByLockDuration | ByLockTime
  var lockQueryType: Osmosis_Lockup_LockQueryType = .byDuration

  /// Denom represents the token denomination we are looking to lock up
  var denom: String = String()

  /// Duration is used to query locks with longer duration than the specified
  /// duration. Duration field must not be nil when the lock query type is
  /// `ByLockDuration`.
  var duration: SwiftProtobuf.Google_Protobuf_Duration {
    get {return _duration ?? SwiftProtobuf.Google_Protobuf_Duration()}
    set {_duration = newValue}
  }
  /// Returns true if `duration` has been explicitly set.
  var hasDuration: Bool {return self._duration != nil}
  /// Clears the value of `duration`. Subsequent reads from it will return its default value.
  mutating func clearDuration() {self._duration = nil}

  /// Timestamp is used by locks started before the specified duration.
  /// Timestamp field must not be nil when the lock query type is `ByLockTime`.
  /// Querying locks with timestamp is currently not implemented.
  var timestamp: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _timestamp ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_timestamp = newValue}
  }
  /// Returns true if `timestamp` has been explicitly set.
  var hasTimestamp: Bool {return self._timestamp != nil}
  /// Clears the value of `timestamp`. Subsequent reads from it will return its default value.
  mutating func clearTimestamp() {self._timestamp = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _duration: SwiftProtobuf.Google_Protobuf_Duration? = nil
  fileprivate var _timestamp: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
}

/// SyntheticLock is creating virtual lockup where new denom is combination of
/// original denom and synthetic suffix. At the time of synthetic lockup creation
/// and deletion, accumulation store is also being updated and on querier side,
/// they can query as freely as native lockup.
struct Osmosis_Lockup_SyntheticLock {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// Underlying Lock ID is the underlying native lock's id for this synthetic
  /// lockup. A synthetic lock MUST have an underlying lock.
  var underlyingLockID: UInt64 = 0

  /// SynthDenom is the synthetic denom that is a combination of
  /// gamm share + bonding status + validator address.
  var synthDenom: String = String()

  /// used for unbonding synthetic lockups, for active synthetic lockups, this
  /// value is set to uninitialized value
  var endTime: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _endTime ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_endTime = newValue}
  }
  /// Returns true if `endTime` has been explicitly set.
  var hasEndTime: Bool {return self._endTime != nil}
  /// Clears the value of `endTime`. Subsequent reads from it will return its default value.
  mutating func clearEndTime() {self._endTime = nil}

  /// Duration is the duration for a synthetic lock to mature
  /// at the point of unbonding has started.
  var duration: SwiftProtobuf.Google_Protobuf_Duration {
    get {return _duration ?? SwiftProtobuf.Google_Protobuf_Duration()}
    set {_duration = newValue}
  }
  /// Returns true if `duration` has been explicitly set.
  var hasDuration: Bool {return self._duration != nil}
  /// Clears the value of `duration`. Subsequent reads from it will return its default value.
  mutating func clearDuration() {self._duration = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _endTime: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
  fileprivate var _duration: SwiftProtobuf.Google_Protobuf_Duration? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Osmosis_Lockup_LockQueryType: @unchecked Sendable {}
extension Osmosis_Lockup_PeriodLock: @unchecked Sendable {}
extension Osmosis_Lockup_QueryCondition: @unchecked Sendable {}
extension Osmosis_Lockup_SyntheticLock: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "osmosis.lockup"

extension Osmosis_Lockup_LockQueryType: SwiftProtobuf._ProtoNameProviding {
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    0: .same(proto: "ByDuration"),
    1: .same(proto: "ByTime"),
    2: .same(proto: "NoLock"),
    3: .same(proto: "ByGroup"),
  ]
}

extension Osmosis_Lockup_PeriodLock: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".PeriodLock"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "ID"),
    2: .same(proto: "owner"),
    3: .same(proto: "duration"),
    4: .standard(proto: "end_time"),
    5: .same(proto: "coins"),
    6: .standard(proto: "reward_receiver_address"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.id) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.owner) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._duration) }()
      case 4: try { try decoder.decodeSingularMessageField(value: &self._endTime) }()
      case 5: try { try decoder.decodeRepeatedMessageField(value: &self.coins) }()
      case 6: try { try decoder.decodeSingularStringField(value: &self.rewardReceiverAddress) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if self.id != 0 {
      try visitor.visitSingularUInt64Field(value: self.id, fieldNumber: 1)
    }
    if !self.owner.isEmpty {
      try visitor.visitSingularStringField(value: self.owner, fieldNumber: 2)
    }
    try { if let v = self._duration {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    try { if let v = self._endTime {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
    } }()
    if !self.coins.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.coins, fieldNumber: 5)
    }
    if !self.rewardReceiverAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.rewardReceiverAddress, fieldNumber: 6)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Lockup_PeriodLock, rhs: Osmosis_Lockup_PeriodLock) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs.owner != rhs.owner {return false}
    if lhs._duration != rhs._duration {return false}
    if lhs._endTime != rhs._endTime {return false}
    if lhs.coins != rhs.coins {return false}
    if lhs.rewardReceiverAddress != rhs.rewardReceiverAddress {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Osmosis_Lockup_QueryCondition: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryCondition"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "lock_query_type"),
    2: .same(proto: "denom"),
    3: .same(proto: "duration"),
    4: .same(proto: "timestamp"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularEnumField(value: &self.lockQueryType) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.denom) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._duration) }()
      case 4: try { try decoder.decodeSingularMessageField(value: &self._timestamp) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if self.lockQueryType != .byDuration {
      try visitor.visitSingularEnumField(value: self.lockQueryType, fieldNumber: 1)
    }
    if !self.denom.isEmpty {
      try visitor.visitSingularStringField(value: self.denom, fieldNumber: 2)
    }
    try { if let v = self._duration {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    try { if let v = self._timestamp {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Lockup_QueryCondition, rhs: Osmosis_Lockup_QueryCondition) -> Bool {
    if lhs.lockQueryType != rhs.lockQueryType {return false}
    if lhs.denom != rhs.denom {return false}
    if lhs._duration != rhs._duration {return false}
    if lhs._timestamp != rhs._timestamp {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Osmosis_Lockup_SyntheticLock: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".SyntheticLock"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "underlying_lock_id"),
    2: .standard(proto: "synth_denom"),
    3: .standard(proto: "end_time"),
    4: .same(proto: "duration"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.underlyingLockID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.synthDenom) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._endTime) }()
      case 4: try { try decoder.decodeSingularMessageField(value: &self._duration) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if self.underlyingLockID != 0 {
      try visitor.visitSingularUInt64Field(value: self.underlyingLockID, fieldNumber: 1)
    }
    if !self.synthDenom.isEmpty {
      try visitor.visitSingularStringField(value: self.synthDenom, fieldNumber: 2)
    }
    try { if let v = self._endTime {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    try { if let v = self._duration {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Lockup_SyntheticLock, rhs: Osmosis_Lockup_SyntheticLock) -> Bool {
    if lhs.underlyingLockID != rhs.underlyingLockID {return false}
    if lhs.synthDenom != rhs.synthDenom {return false}
    if lhs._endTime != rhs._endTime {return false}
    if lhs._duration != rhs._duration {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
