// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: mars/incentives/v1beta1/store.proto
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

/// Schedule defines the parameters of an incentives releasing schedule
struct Mars_Incentives_V1beta1_Schedule {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// Id is the identifier of this incentives schedule
  var id: UInt64 = 0

  /// StartTime is the UNIX timestamp of which this incentives schedule shall begin
  var startTime: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _startTime ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_startTime = newValue}
  }
  /// Returns true if `startTime` has been explicitly set.
  var hasStartTime: Bool {return self._startTime != nil}
  /// Clears the value of `startTime`. Subsequent reads from it will return its default value.
  mutating func clearStartTime() {self._startTime = nil}

  /// EndTime is the UNIX timestamp of which this incentives schedule shall finish
  var endTime: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _endTime ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_endTime = newValue}
  }
  /// Returns true if `endTime` has been explicitly set.
  var hasEndTime: Bool {return self._endTime != nil}
  /// Clears the value of `endTime`. Subsequent reads from it will return its default value.
  mutating func clearEndTime() {self._endTime = nil}

  /// TotalAmount is the total amount of coins that shall be released to stakers
  /// throughout the span of this incentives schedule
  var totalAmount: [Cosmos_Base_V1beta1_Coin] = []

  /// ReleasedAmount is the amount of coins that have already been released to
  /// the stakers as part of this incentives schedule
  var releasedAmount: [Cosmos_Base_V1beta1_Coin] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _startTime: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
  fileprivate var _endTime: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Mars_Incentives_V1beta1_Schedule: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "mars.incentives.v1beta1"

extension Mars_Incentives_V1beta1_Schedule: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Schedule"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
    2: .standard(proto: "start_time"),
    3: .standard(proto: "end_time"),
    4: .standard(proto: "total_amount"),
    5: .standard(proto: "released_amount"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.id) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._startTime) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._endTime) }()
      case 4: try { try decoder.decodeRepeatedMessageField(value: &self.totalAmount) }()
      case 5: try { try decoder.decodeRepeatedMessageField(value: &self.releasedAmount) }()
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
    try { if let v = self._startTime {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try { if let v = self._endTime {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    if !self.totalAmount.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.totalAmount, fieldNumber: 4)
    }
    if !self.releasedAmount.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.releasedAmount, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Mars_Incentives_V1beta1_Schedule, rhs: Mars_Incentives_V1beta1_Schedule) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs._startTime != rhs._startTime {return false}
    if lhs._endTime != rhs._endTime {return false}
    if lhs.totalAmount != rhs.totalAmount {return false}
    if lhs.releasedAmount != rhs.releasedAmount {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
