// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: mars/incentives/v1beta1/tx.proto
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

/// MsgCreateSchedule defines the message for creating a new incentives schedule.
///
/// This message is typically executed via a governance proposal with the gov
/// module being the executing authority.
struct Mars_Incentives_V1beta1_MsgCreateSchedule {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// Authority is the account executing the safety fund spend.
  /// It should be the gov module account.
  var authority: String = String()

  /// StartTime is the timestamp at which this incentives schedule shall begin.
  var startTime: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _startTime ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_startTime = newValue}
  }
  /// Returns true if `startTime` has been explicitly set.
  var hasStartTime: Bool {return self._startTime != nil}
  /// Clears the value of `startTime`. Subsequent reads from it will return its default value.
  mutating func clearStartTime() {self._startTime = nil}

  /// EndTime is the timestamp at which this incentives schedule shall finish.
  var endTime: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _endTime ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_endTime = newValue}
  }
  /// Returns true if `endTime` has been explicitly set.
  var hasEndTime: Bool {return self._endTime != nil}
  /// Clears the value of `endTime`. Subsequent reads from it will return its default value.
  mutating func clearEndTime() {self._endTime = nil}

  /// Amount is the total amount of coins that shall be released to stakers
  /// throughout the span of this incentives schedule.
  var amount: [Cosmos_Base_V1beta1_Coin] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _startTime: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
  fileprivate var _endTime: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
}

/// MsgCreateScheduleResponse defines the response to executing a
/// MsgCreateSchedule message.
struct Mars_Incentives_V1beta1_MsgCreateScheduleResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgTerminateSchedules defines the message for terminating one or more
/// existing incentives schedules.
///
/// This message is typically executed via a governance proposal with the gov
/// module being the executing authority.
struct Mars_Incentives_V1beta1_MsgTerminateSchedules {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// Authority is the account executing the safety fund spend.
  /// It should be the gov module account.
  var authority: String = String()

  /// Ids is the array of identifiers of the incentives schedules which are to be
  /// terminated.
  var ids: [UInt64] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgTerminateSchedulesResponse defines the response to executing a
/// MsgTerminateSchedules message.
struct Mars_Incentives_V1beta1_MsgTerminateSchedulesResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// RefundedAmount is the unreleased incentives that were refunded to the
  /// community pool.
  var refundedAmount: [Cosmos_Base_V1beta1_Coin] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Mars_Incentives_V1beta1_MsgCreateSchedule: @unchecked Sendable {}
extension Mars_Incentives_V1beta1_MsgCreateScheduleResponse: @unchecked Sendable {}
extension Mars_Incentives_V1beta1_MsgTerminateSchedules: @unchecked Sendable {}
extension Mars_Incentives_V1beta1_MsgTerminateSchedulesResponse: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "mars.incentives.v1beta1"

extension Mars_Incentives_V1beta1_MsgCreateSchedule: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgCreateSchedule"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "authority"),
    2: .standard(proto: "start_time"),
    3: .standard(proto: "end_time"),
    4: .same(proto: "amount"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.authority) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._startTime) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._endTime) }()
      case 4: try { try decoder.decodeRepeatedMessageField(value: &self.amount) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.authority.isEmpty {
      try visitor.visitSingularStringField(value: self.authority, fieldNumber: 1)
    }
    try { if let v = self._startTime {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try { if let v = self._endTime {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    if !self.amount.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.amount, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Mars_Incentives_V1beta1_MsgCreateSchedule, rhs: Mars_Incentives_V1beta1_MsgCreateSchedule) -> Bool {
    if lhs.authority != rhs.authority {return false}
    if lhs._startTime != rhs._startTime {return false}
    if lhs._endTime != rhs._endTime {return false}
    if lhs.amount != rhs.amount {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Mars_Incentives_V1beta1_MsgCreateScheduleResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgCreateScheduleResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Mars_Incentives_V1beta1_MsgCreateScheduleResponse, rhs: Mars_Incentives_V1beta1_MsgCreateScheduleResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Mars_Incentives_V1beta1_MsgTerminateSchedules: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgTerminateSchedules"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "authority"),
    2: .same(proto: "ids"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.authority) }()
      case 2: try { try decoder.decodeRepeatedUInt64Field(value: &self.ids) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.authority.isEmpty {
      try visitor.visitSingularStringField(value: self.authority, fieldNumber: 1)
    }
    if !self.ids.isEmpty {
      try visitor.visitPackedUInt64Field(value: self.ids, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Mars_Incentives_V1beta1_MsgTerminateSchedules, rhs: Mars_Incentives_V1beta1_MsgTerminateSchedules) -> Bool {
    if lhs.authority != rhs.authority {return false}
    if lhs.ids != rhs.ids {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Mars_Incentives_V1beta1_MsgTerminateSchedulesResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgTerminateSchedulesResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    5: .standard(proto: "refunded_amount"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 5: try { try decoder.decodeRepeatedMessageField(value: &self.refundedAmount) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.refundedAmount.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.refundedAmount, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Mars_Incentives_V1beta1_MsgTerminateSchedulesResponse, rhs: Mars_Incentives_V1beta1_MsgTerminateSchedulesResponse) -> Bool {
    if lhs.refundedAmount != rhs.refundedAmount {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}