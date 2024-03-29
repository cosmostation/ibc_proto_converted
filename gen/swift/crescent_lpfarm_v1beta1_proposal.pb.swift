// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: crescent/lpfarm/v1beta1/proposal.proto
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

struct Crescent_Lpfarm_V1beta1_FarmingPlanProposal {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var title: String = String()

  var description_p: String = String()

  var createPlanRequests: [Crescent_Lpfarm_V1beta1_CreatePlanRequest] = []

  var terminatePlanRequests: [Crescent_Lpfarm_V1beta1_TerminatePlanRequest] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Crescent_Lpfarm_V1beta1_CreatePlanRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var description_p: String = String()

  var farmingPoolAddress: String = String()

  var rewardAllocations: [Crescent_Lpfarm_V1beta1_RewardAllocation] = []

  var startTime: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _startTime ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_startTime = newValue}
  }
  /// Returns true if `startTime` has been explicitly set.
  var hasStartTime: Bool {return self._startTime != nil}
  /// Clears the value of `startTime`. Subsequent reads from it will return its default value.
  mutating func clearStartTime() {self._startTime = nil}

  var endTime: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _endTime ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_endTime = newValue}
  }
  /// Returns true if `endTime` has been explicitly set.
  var hasEndTime: Bool {return self._endTime != nil}
  /// Clears the value of `endTime`. Subsequent reads from it will return its default value.
  mutating func clearEndTime() {self._endTime = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _startTime: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
  fileprivate var _endTime: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
}

struct Crescent_Lpfarm_V1beta1_TerminatePlanRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var planID: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Crescent_Lpfarm_V1beta1_FarmingPlanProposal: @unchecked Sendable {}
extension Crescent_Lpfarm_V1beta1_CreatePlanRequest: @unchecked Sendable {}
extension Crescent_Lpfarm_V1beta1_TerminatePlanRequest: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "crescent.lpfarm.v1beta1"

extension Crescent_Lpfarm_V1beta1_FarmingPlanProposal: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".FarmingPlanProposal"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "title"),
    2: .same(proto: "description"),
    3: .standard(proto: "create_plan_requests"),
    4: .standard(proto: "terminate_plan_requests"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.title) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.description_p) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.createPlanRequests) }()
      case 4: try { try decoder.decodeRepeatedMessageField(value: &self.terminatePlanRequests) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.title.isEmpty {
      try visitor.visitSingularStringField(value: self.title, fieldNumber: 1)
    }
    if !self.description_p.isEmpty {
      try visitor.visitSingularStringField(value: self.description_p, fieldNumber: 2)
    }
    if !self.createPlanRequests.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.createPlanRequests, fieldNumber: 3)
    }
    if !self.terminatePlanRequests.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.terminatePlanRequests, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Crescent_Lpfarm_V1beta1_FarmingPlanProposal, rhs: Crescent_Lpfarm_V1beta1_FarmingPlanProposal) -> Bool {
    if lhs.title != rhs.title {return false}
    if lhs.description_p != rhs.description_p {return false}
    if lhs.createPlanRequests != rhs.createPlanRequests {return false}
    if lhs.terminatePlanRequests != rhs.terminatePlanRequests {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Crescent_Lpfarm_V1beta1_CreatePlanRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".CreatePlanRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "description"),
    2: .standard(proto: "farming_pool_address"),
    3: .standard(proto: "reward_allocations"),
    4: .standard(proto: "start_time"),
    5: .standard(proto: "end_time"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.description_p) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.farmingPoolAddress) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.rewardAllocations) }()
      case 4: try { try decoder.decodeSingularMessageField(value: &self._startTime) }()
      case 5: try { try decoder.decodeSingularMessageField(value: &self._endTime) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.description_p.isEmpty {
      try visitor.visitSingularStringField(value: self.description_p, fieldNumber: 1)
    }
    if !self.farmingPoolAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.farmingPoolAddress, fieldNumber: 2)
    }
    if !self.rewardAllocations.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.rewardAllocations, fieldNumber: 3)
    }
    try { if let v = self._startTime {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
    } }()
    try { if let v = self._endTime {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 5)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Crescent_Lpfarm_V1beta1_CreatePlanRequest, rhs: Crescent_Lpfarm_V1beta1_CreatePlanRequest) -> Bool {
    if lhs.description_p != rhs.description_p {return false}
    if lhs.farmingPoolAddress != rhs.farmingPoolAddress {return false}
    if lhs.rewardAllocations != rhs.rewardAllocations {return false}
    if lhs._startTime != rhs._startTime {return false}
    if lhs._endTime != rhs._endTime {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Crescent_Lpfarm_V1beta1_TerminatePlanRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".TerminatePlanRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "plan_id"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.planID) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.planID != 0 {
      try visitor.visitSingularUInt64Field(value: self.planID, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Crescent_Lpfarm_V1beta1_TerminatePlanRequest, rhs: Crescent_Lpfarm_V1beta1_TerminatePlanRequest) -> Bool {
    if lhs.planID != rhs.planID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
