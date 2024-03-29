// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: stafihub/rvalidator/genesis.proto
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

/// GenesisState defines the rvalidator module's genesis state.
struct Stafihub_Stafihub_Rvalidator_GenesisState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var params: Stafihub_Stafihub_Rvalidator_Params {
    get {return _params ?? Stafihub_Stafihub_Rvalidator_Params()}
    set {_params = newValue}
  }
  /// Returns true if `params` has been explicitly set.
  var hasParams: Bool {return self._params != nil}
  /// Clears the value of `params`. Subsequent reads from it will return its default value.
  mutating func clearParams() {self._params = nil}

  var selectedRvalidatorList: [Stafihub_Stafihub_Rvalidator_RValidator] = []

  var latestVotedCycleList: [Stafihub_Stafihub_Rvalidator_Cycle] = []

  var latestDealedCycleList: [Stafihub_Stafihub_Rvalidator_Cycle] = []

  var cycleSecondsList: [Stafihub_Stafihub_Rvalidator_CycleSeconds] = []

  var shuffleSecondsList: [Stafihub_Stafihub_Rvalidator_ShuffleSeconds] = []

  /// this line is used by starport scaffolding # genesis/proto/state
  var dealingRvalidatorList: [Stafihub_Stafihub_Rvalidator_DealingRValidator] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _params: Stafihub_Stafihub_Rvalidator_Params? = nil
}

struct Stafihub_Stafihub_Rvalidator_RValidator {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var denom: String = String()

  var poolAddress: String = String()

  var valAddress: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Rvalidator_DealingRValidator {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var denom: String = String()

  var poolAddress: String = String()

  var oldValAddress: String = String()

  var newValAddress: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Rvalidator_Cycle {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var denom: String = String()

  var poolAddress: String = String()

  var version: UInt64 = 0

  var number: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Rvalidator_CycleSeconds {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var denom: String = String()

  var version: UInt64 = 0

  var seconds: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Rvalidator_ShuffleSeconds {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var denom: String = String()

  var version: UInt64 = 0

  var seconds: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Stafihub_Stafihub_Rvalidator_GenesisState: @unchecked Sendable {}
extension Stafihub_Stafihub_Rvalidator_RValidator: @unchecked Sendable {}
extension Stafihub_Stafihub_Rvalidator_DealingRValidator: @unchecked Sendable {}
extension Stafihub_Stafihub_Rvalidator_Cycle: @unchecked Sendable {}
extension Stafihub_Stafihub_Rvalidator_CycleSeconds: @unchecked Sendable {}
extension Stafihub_Stafihub_Rvalidator_ShuffleSeconds: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "stafihub.stafihub.rvalidator"

extension Stafihub_Stafihub_Rvalidator_GenesisState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GenesisState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "params"),
    2: .same(proto: "selectedRValidatorList"),
    3: .same(proto: "latestVotedCycleList"),
    4: .same(proto: "latestDealedCycleList"),
    5: .same(proto: "cycleSecondsList"),
    6: .same(proto: "shuffleSecondsList"),
    7: .same(proto: "dealingRValidatorList"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._params) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.selectedRvalidatorList) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.latestVotedCycleList) }()
      case 4: try { try decoder.decodeRepeatedMessageField(value: &self.latestDealedCycleList) }()
      case 5: try { try decoder.decodeRepeatedMessageField(value: &self.cycleSecondsList) }()
      case 6: try { try decoder.decodeRepeatedMessageField(value: &self.shuffleSecondsList) }()
      case 7: try { try decoder.decodeRepeatedMessageField(value: &self.dealingRvalidatorList) }()
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
    if !self.selectedRvalidatorList.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.selectedRvalidatorList, fieldNumber: 2)
    }
    if !self.latestVotedCycleList.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.latestVotedCycleList, fieldNumber: 3)
    }
    if !self.latestDealedCycleList.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.latestDealedCycleList, fieldNumber: 4)
    }
    if !self.cycleSecondsList.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.cycleSecondsList, fieldNumber: 5)
    }
    if !self.shuffleSecondsList.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.shuffleSecondsList, fieldNumber: 6)
    }
    if !self.dealingRvalidatorList.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.dealingRvalidatorList, fieldNumber: 7)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Rvalidator_GenesisState, rhs: Stafihub_Stafihub_Rvalidator_GenesisState) -> Bool {
    if lhs._params != rhs._params {return false}
    if lhs.selectedRvalidatorList != rhs.selectedRvalidatorList {return false}
    if lhs.latestVotedCycleList != rhs.latestVotedCycleList {return false}
    if lhs.latestDealedCycleList != rhs.latestDealedCycleList {return false}
    if lhs.cycleSecondsList != rhs.cycleSecondsList {return false}
    if lhs.shuffleSecondsList != rhs.shuffleSecondsList {return false}
    if lhs.dealingRvalidatorList != rhs.dealingRvalidatorList {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Rvalidator_RValidator: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".RValidator"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "denom"),
    2: .same(proto: "poolAddress"),
    3: .same(proto: "valAddress"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.denom) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.poolAddress) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.valAddress) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.denom.isEmpty {
      try visitor.visitSingularStringField(value: self.denom, fieldNumber: 1)
    }
    if !self.poolAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.poolAddress, fieldNumber: 2)
    }
    if !self.valAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.valAddress, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Rvalidator_RValidator, rhs: Stafihub_Stafihub_Rvalidator_RValidator) -> Bool {
    if lhs.denom != rhs.denom {return false}
    if lhs.poolAddress != rhs.poolAddress {return false}
    if lhs.valAddress != rhs.valAddress {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Rvalidator_DealingRValidator: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".DealingRValidator"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "denom"),
    2: .same(proto: "poolAddress"),
    3: .same(proto: "oldValAddress"),
    4: .same(proto: "newValAddress"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.denom) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.poolAddress) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.oldValAddress) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.newValAddress) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.denom.isEmpty {
      try visitor.visitSingularStringField(value: self.denom, fieldNumber: 1)
    }
    if !self.poolAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.poolAddress, fieldNumber: 2)
    }
    if !self.oldValAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.oldValAddress, fieldNumber: 3)
    }
    if !self.newValAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.newValAddress, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Rvalidator_DealingRValidator, rhs: Stafihub_Stafihub_Rvalidator_DealingRValidator) -> Bool {
    if lhs.denom != rhs.denom {return false}
    if lhs.poolAddress != rhs.poolAddress {return false}
    if lhs.oldValAddress != rhs.oldValAddress {return false}
    if lhs.newValAddress != rhs.newValAddress {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Rvalidator_Cycle: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Cycle"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "denom"),
    2: .same(proto: "poolAddress"),
    3: .same(proto: "version"),
    4: .same(proto: "number"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.denom) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.poolAddress) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.version) }()
      case 4: try { try decoder.decodeSingularUInt64Field(value: &self.number) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.denom.isEmpty {
      try visitor.visitSingularStringField(value: self.denom, fieldNumber: 1)
    }
    if !self.poolAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.poolAddress, fieldNumber: 2)
    }
    if self.version != 0 {
      try visitor.visitSingularUInt64Field(value: self.version, fieldNumber: 3)
    }
    if self.number != 0 {
      try visitor.visitSingularUInt64Field(value: self.number, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Rvalidator_Cycle, rhs: Stafihub_Stafihub_Rvalidator_Cycle) -> Bool {
    if lhs.denom != rhs.denom {return false}
    if lhs.poolAddress != rhs.poolAddress {return false}
    if lhs.version != rhs.version {return false}
    if lhs.number != rhs.number {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Rvalidator_CycleSeconds: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".CycleSeconds"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "denom"),
    2: .same(proto: "version"),
    3: .same(proto: "seconds"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.denom) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.version) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.seconds) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.denom.isEmpty {
      try visitor.visitSingularStringField(value: self.denom, fieldNumber: 1)
    }
    if self.version != 0 {
      try visitor.visitSingularUInt64Field(value: self.version, fieldNumber: 2)
    }
    if self.seconds != 0 {
      try visitor.visitSingularUInt64Field(value: self.seconds, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Rvalidator_CycleSeconds, rhs: Stafihub_Stafihub_Rvalidator_CycleSeconds) -> Bool {
    if lhs.denom != rhs.denom {return false}
    if lhs.version != rhs.version {return false}
    if lhs.seconds != rhs.seconds {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Rvalidator_ShuffleSeconds: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ShuffleSeconds"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "denom"),
    2: .same(proto: "version"),
    3: .same(proto: "seconds"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.denom) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.version) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.seconds) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.denom.isEmpty {
      try visitor.visitSingularStringField(value: self.denom, fieldNumber: 1)
    }
    if self.version != 0 {
      try visitor.visitSingularUInt64Field(value: self.version, fieldNumber: 2)
    }
    if self.seconds != 0 {
      try visitor.visitSingularUInt64Field(value: self.seconds, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Rvalidator_ShuffleSeconds, rhs: Stafihub_Stafihub_Rvalidator_ShuffleSeconds) -> Bool {
    if lhs.denom != rhs.denom {return false}
    if lhs.version != rhs.version {return false}
    if lhs.seconds != rhs.seconds {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
