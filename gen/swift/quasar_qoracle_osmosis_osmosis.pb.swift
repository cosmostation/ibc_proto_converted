// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: quasar/qoracle/osmosis/osmosis.proto
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

struct Quasarlabs_Quasarnode_Qoracle_Osmosis_OsmosisRequestState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var packetSequence: UInt64 = 0

  var acknowledged: Bool = false

  var failed: Bool = false

  var updatedAtHeight: Int64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Quasarlabs_Quasarnode_Qoracle_Osmosis_IncentivizedPools {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var incentivizedPools: [Osmosis_Poolincentives_V1beta1_IncentivizedPool] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Quasarlabs_Quasarnode_Qoracle_Osmosis_EpochsInfo {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var epochsInfo: [Osmosis_Epochs_V1beta1_EpochInfo] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Quasarlabs_Quasarnode_Qoracle_Osmosis_OsmosisRequestState: @unchecked Sendable {}
extension Quasarlabs_Quasarnode_Qoracle_Osmosis_IncentivizedPools: @unchecked Sendable {}
extension Quasarlabs_Quasarnode_Qoracle_Osmosis_EpochsInfo: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "quasarlabs.quasarnode.qoracle.osmosis"

extension Quasarlabs_Quasarnode_Qoracle_Osmosis_OsmosisRequestState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".OsmosisRequestState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "packet_sequence"),
    2: .same(proto: "acknowledged"),
    3: .same(proto: "failed"),
    4: .standard(proto: "updated_at_height"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.packetSequence) }()
      case 2: try { try decoder.decodeSingularBoolField(value: &self.acknowledged) }()
      case 3: try { try decoder.decodeSingularBoolField(value: &self.failed) }()
      case 4: try { try decoder.decodeSingularInt64Field(value: &self.updatedAtHeight) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.packetSequence != 0 {
      try visitor.visitSingularUInt64Field(value: self.packetSequence, fieldNumber: 1)
    }
    if self.acknowledged != false {
      try visitor.visitSingularBoolField(value: self.acknowledged, fieldNumber: 2)
    }
    if self.failed != false {
      try visitor.visitSingularBoolField(value: self.failed, fieldNumber: 3)
    }
    if self.updatedAtHeight != 0 {
      try visitor.visitSingularInt64Field(value: self.updatedAtHeight, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Quasarlabs_Quasarnode_Qoracle_Osmosis_OsmosisRequestState, rhs: Quasarlabs_Quasarnode_Qoracle_Osmosis_OsmosisRequestState) -> Bool {
    if lhs.packetSequence != rhs.packetSequence {return false}
    if lhs.acknowledged != rhs.acknowledged {return false}
    if lhs.failed != rhs.failed {return false}
    if lhs.updatedAtHeight != rhs.updatedAtHeight {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Quasarlabs_Quasarnode_Qoracle_Osmosis_IncentivizedPools: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".IncentivizedPools"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "incentivized_pools"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.incentivizedPools) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.incentivizedPools.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.incentivizedPools, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Quasarlabs_Quasarnode_Qoracle_Osmosis_IncentivizedPools, rhs: Quasarlabs_Quasarnode_Qoracle_Osmosis_IncentivizedPools) -> Bool {
    if lhs.incentivizedPools != rhs.incentivizedPools {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Quasarlabs_Quasarnode_Qoracle_Osmosis_EpochsInfo: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".EpochsInfo"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "epochs_info"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.epochsInfo) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.epochsInfo.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.epochsInfo, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Quasarlabs_Quasarnode_Qoracle_Osmosis_EpochsInfo, rhs: Quasarlabs_Quasarnode_Qoracle_Osmosis_EpochsInfo) -> Bool {
    if lhs.epochsInfo != rhs.epochsInfo {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}