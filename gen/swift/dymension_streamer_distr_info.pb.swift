// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: dymension/streamer/distr_info.proto
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

struct Dymensionxyz_Dymension_Streamer_DistrInfo {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var totalWeight: String = String()

  var records: [Dymensionxyz_Dymension_Streamer_DistrRecord] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Dymensionxyz_Dymension_Streamer_DistrRecord {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var gaugeID: UInt64 = 0

  var weight: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Dymensionxyz_Dymension_Streamer_DistrInfo: @unchecked Sendable {}
extension Dymensionxyz_Dymension_Streamer_DistrRecord: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "dymensionxyz.dymension.streamer"

extension Dymensionxyz_Dymension_Streamer_DistrInfo: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".DistrInfo"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "total_weight"),
    2: .same(proto: "records"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.totalWeight) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.records) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.totalWeight.isEmpty {
      try visitor.visitSingularStringField(value: self.totalWeight, fieldNumber: 1)
    }
    if !self.records.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.records, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Dymensionxyz_Dymension_Streamer_DistrInfo, rhs: Dymensionxyz_Dymension_Streamer_DistrInfo) -> Bool {
    if lhs.totalWeight != rhs.totalWeight {return false}
    if lhs.records != rhs.records {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Dymensionxyz_Dymension_Streamer_DistrRecord: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".DistrRecord"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "gauge_id"),
    2: .same(proto: "weight"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.gaugeID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.weight) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.gaugeID != 0 {
      try visitor.visitSingularUInt64Field(value: self.gaugeID, fieldNumber: 1)
    }
    if !self.weight.isEmpty {
      try visitor.visitSingularStringField(value: self.weight, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Dymensionxyz_Dymension_Streamer_DistrRecord, rhs: Dymensionxyz_Dymension_Streamer_DistrRecord) -> Bool {
    if lhs.gaugeID != rhs.gaugeID {return false}
    if lhs.weight != rhs.weight {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
