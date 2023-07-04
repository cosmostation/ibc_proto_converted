// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: panacea/datadeal/v2alpha1/genesis.proto
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

/// GenesisState defines the datadeal module's genesis state.
struct Panacea_Datadeal_V2alpha1_GenesisState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var deals: Dictionary<UInt64,Panacea_Datadeal_V2alpha1_Deal> = [:]

  var dataCerts: Dictionary<String,Panacea_Datadeal_V2alpha1_DataCert> = [:]

  var nextDealNumber: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Panacea_Datadeal_V2alpha1_GenesisState: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "panacea.datadeal.v2alpha1"

extension Panacea_Datadeal_V2alpha1_GenesisState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GenesisState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "deals"),
    2: .standard(proto: "data_certs"),
    3: .standard(proto: "next_deal_number"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeMapField(fieldType: SwiftProtobuf._ProtobufMessageMap<SwiftProtobuf.ProtobufUInt64,Panacea_Datadeal_V2alpha1_Deal>.self, value: &self.deals) }()
      case 2: try { try decoder.decodeMapField(fieldType: SwiftProtobuf._ProtobufMessageMap<SwiftProtobuf.ProtobufString,Panacea_Datadeal_V2alpha1_DataCert>.self, value: &self.dataCerts) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.nextDealNumber) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.deals.isEmpty {
      try visitor.visitMapField(fieldType: SwiftProtobuf._ProtobufMessageMap<SwiftProtobuf.ProtobufUInt64,Panacea_Datadeal_V2alpha1_Deal>.self, value: self.deals, fieldNumber: 1)
    }
    if !self.dataCerts.isEmpty {
      try visitor.visitMapField(fieldType: SwiftProtobuf._ProtobufMessageMap<SwiftProtobuf.ProtobufString,Panacea_Datadeal_V2alpha1_DataCert>.self, value: self.dataCerts, fieldNumber: 2)
    }
    if self.nextDealNumber != 0 {
      try visitor.visitSingularUInt64Field(value: self.nextDealNumber, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Panacea_Datadeal_V2alpha1_GenesisState, rhs: Panacea_Datadeal_V2alpha1_GenesisState) -> Bool {
    if lhs.deals != rhs.deals {return false}
    if lhs.dataCerts != rhs.dataCerts {return false}
    if lhs.nextDealNumber != rhs.nextDealNumber {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}