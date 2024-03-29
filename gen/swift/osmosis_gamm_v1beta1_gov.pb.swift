// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: osmosis/gamm/v1beta1/gov.proto
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

/// ReplaceMigrationRecordsProposal is a gov Content type for updating the
/// migration records. If a ReplaceMigrationRecordsProposal passes, the
/// proposal’s records override the existing MigrationRecords set in the module.
/// Each record specifies a single connection between a single balancer pool and
/// a single concentrated pool.
struct Osmosis_Gamm_V1beta1_ReplaceMigrationRecordsProposal {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var title: String = String()

  var description_p: String = String()

  var records: [Osmosis_Gamm_V1beta1_BalancerToConcentratedPoolLink] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// For example: if the existing DistrRecords were:
/// [(Balancer 1, CL 5), (Balancer 2, CL 6), (Balancer 3, CL 7)]
/// And an UpdateMigrationRecordsProposal includes
/// [(Balancer 2, CL 0), (Balancer 3, CL 4), (Balancer 4, CL 10)]
/// This would leave Balancer 1 record, delete Balancer 2 record,
/// Edit Balancer 3 record, and Add Balancer 4 record
/// The result MigrationRecords in state would be:
/// [(Balancer 1, CL 5), (Balancer 3, CL 4), (Balancer 4, CL 10)]
struct Osmosis_Gamm_V1beta1_UpdateMigrationRecordsProposal {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var title: String = String()

  var description_p: String = String()

  var records: [Osmosis_Gamm_V1beta1_BalancerToConcentratedPoolLink] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Osmosis_Gamm_V1beta1_ReplaceMigrationRecordsProposal: @unchecked Sendable {}
extension Osmosis_Gamm_V1beta1_UpdateMigrationRecordsProposal: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "osmosis.gamm.v1beta1"

extension Osmosis_Gamm_V1beta1_ReplaceMigrationRecordsProposal: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ReplaceMigrationRecordsProposal"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "title"),
    2: .same(proto: "description"),
    3: .same(proto: "records"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.title) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.description_p) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.records) }()
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
    if !self.records.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.records, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Gamm_V1beta1_ReplaceMigrationRecordsProposal, rhs: Osmosis_Gamm_V1beta1_ReplaceMigrationRecordsProposal) -> Bool {
    if lhs.title != rhs.title {return false}
    if lhs.description_p != rhs.description_p {return false}
    if lhs.records != rhs.records {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Osmosis_Gamm_V1beta1_UpdateMigrationRecordsProposal: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".UpdateMigrationRecordsProposal"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "title"),
    2: .same(proto: "description"),
    3: .same(proto: "records"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.title) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.description_p) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.records) }()
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
    if !self.records.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.records, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Gamm_V1beta1_UpdateMigrationRecordsProposal, rhs: Osmosis_Gamm_V1beta1_UpdateMigrationRecordsProposal) -> Bool {
    if lhs.title != rhs.title {return false}
    if lhs.description_p != rhs.description_p {return false}
    if lhs.records != rhs.records {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
