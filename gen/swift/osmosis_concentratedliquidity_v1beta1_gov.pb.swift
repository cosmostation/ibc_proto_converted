// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: osmosis/concentratedliquidity/v1beta1/gov.proto
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

/// CreateConcentratedLiquidityPoolsProposal is a gov Content type for creating
/// concentrated liquidity pools. If a CreateConcentratedLiquidityPoolsProposal
/// passes, the pools are created via pool manager module account.
struct Osmosis_Concentratedliquidity_V1beta1_CreateConcentratedLiquidityPoolsProposal {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var title: String = String()

  var description_p: String = String()

  var poolRecords: [Osmosis_Concentratedliquidity_V1beta1_PoolRecord] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// TickSpacingDecreaseProposal is a gov Content type for proposing a tick
/// spacing decrease for a pool. The proposal will fail if one of the pools do
/// not exist, or if the new tick spacing is not less than the current tick
/// spacing.
struct Osmosis_Concentratedliquidity_V1beta1_TickSpacingDecreaseProposal {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var title: String = String()

  var description_p: String = String()

  var poolIDToTickSpacingRecords: [Osmosis_Concentratedliquidity_V1beta1_PoolIdToTickSpacingRecord] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// PoolIdToTickSpacingRecord is a struct that contains a pool id to new tick
/// spacing pair.
struct Osmosis_Concentratedliquidity_V1beta1_PoolIdToTickSpacingRecord {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var poolID: UInt64 = 0

  var newTickSpacing: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Osmosis_Concentratedliquidity_V1beta1_PoolRecord {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var denom0: String = String()

  var denom1: String = String()

  var tickSpacing: UInt64 = 0

  /// DEPRECATED
  var exponentAtPriceOne: String = String()

  var spreadFactor: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Osmosis_Concentratedliquidity_V1beta1_CreateConcentratedLiquidityPoolsProposal: @unchecked Sendable {}
extension Osmosis_Concentratedliquidity_V1beta1_TickSpacingDecreaseProposal: @unchecked Sendable {}
extension Osmosis_Concentratedliquidity_V1beta1_PoolIdToTickSpacingRecord: @unchecked Sendable {}
extension Osmosis_Concentratedliquidity_V1beta1_PoolRecord: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "osmosis.concentratedliquidity.v1beta1"

extension Osmosis_Concentratedliquidity_V1beta1_CreateConcentratedLiquidityPoolsProposal: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".CreateConcentratedLiquidityPoolsProposal"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "title"),
    2: .same(proto: "description"),
    3: .standard(proto: "pool_records"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.title) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.description_p) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.poolRecords) }()
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
    if !self.poolRecords.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.poolRecords, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Concentratedliquidity_V1beta1_CreateConcentratedLiquidityPoolsProposal, rhs: Osmosis_Concentratedliquidity_V1beta1_CreateConcentratedLiquidityPoolsProposal) -> Bool {
    if lhs.title != rhs.title {return false}
    if lhs.description_p != rhs.description_p {return false}
    if lhs.poolRecords != rhs.poolRecords {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Osmosis_Concentratedliquidity_V1beta1_TickSpacingDecreaseProposal: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".TickSpacingDecreaseProposal"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "title"),
    2: .same(proto: "description"),
    3: .standard(proto: "pool_id_to_tick_spacing_records"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.title) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.description_p) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.poolIDToTickSpacingRecords) }()
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
    if !self.poolIDToTickSpacingRecords.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.poolIDToTickSpacingRecords, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Concentratedliquidity_V1beta1_TickSpacingDecreaseProposal, rhs: Osmosis_Concentratedliquidity_V1beta1_TickSpacingDecreaseProposal) -> Bool {
    if lhs.title != rhs.title {return false}
    if lhs.description_p != rhs.description_p {return false}
    if lhs.poolIDToTickSpacingRecords != rhs.poolIDToTickSpacingRecords {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Osmosis_Concentratedliquidity_V1beta1_PoolIdToTickSpacingRecord: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".PoolIdToTickSpacingRecord"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "pool_id"),
    2: .standard(proto: "new_tick_spacing"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.poolID) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.newTickSpacing) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.poolID != 0 {
      try visitor.visitSingularUInt64Field(value: self.poolID, fieldNumber: 1)
    }
    if self.newTickSpacing != 0 {
      try visitor.visitSingularUInt64Field(value: self.newTickSpacing, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Concentratedliquidity_V1beta1_PoolIdToTickSpacingRecord, rhs: Osmosis_Concentratedliquidity_V1beta1_PoolIdToTickSpacingRecord) -> Bool {
    if lhs.poolID != rhs.poolID {return false}
    if lhs.newTickSpacing != rhs.newTickSpacing {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Osmosis_Concentratedliquidity_V1beta1_PoolRecord: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".PoolRecord"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "denom0"),
    2: .same(proto: "denom1"),
    3: .standard(proto: "tick_spacing"),
    4: .standard(proto: "exponent_at_price_one"),
    5: .standard(proto: "spread_factor"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.denom0) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.denom1) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.tickSpacing) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.exponentAtPriceOne) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.spreadFactor) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.denom0.isEmpty {
      try visitor.visitSingularStringField(value: self.denom0, fieldNumber: 1)
    }
    if !self.denom1.isEmpty {
      try visitor.visitSingularStringField(value: self.denom1, fieldNumber: 2)
    }
    if self.tickSpacing != 0 {
      try visitor.visitSingularUInt64Field(value: self.tickSpacing, fieldNumber: 3)
    }
    if !self.exponentAtPriceOne.isEmpty {
      try visitor.visitSingularStringField(value: self.exponentAtPriceOne, fieldNumber: 4)
    }
    if !self.spreadFactor.isEmpty {
      try visitor.visitSingularStringField(value: self.spreadFactor, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Concentratedliquidity_V1beta1_PoolRecord, rhs: Osmosis_Concentratedliquidity_V1beta1_PoolRecord) -> Bool {
    if lhs.denom0 != rhs.denom0 {return false}
    if lhs.denom1 != rhs.denom1 {return false}
    if lhs.tickSpacing != rhs.tickSpacing {return false}
    if lhs.exponentAtPriceOne != rhs.exponentAtPriceOne {return false}
    if lhs.spreadFactor != rhs.spreadFactor {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
