// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: crescent/marketmaker/v1beta1/proposal.proto
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

struct Crescent_Marketmaker_V1beta1_MarketMakerProposal {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// title specifies the title of the proposal
  var title: String = String()

  /// description specifies the description of the proposal
  var description_p: String = String()

  /// set the market makers to eligible, refund deposit
  var inclusions: [Crescent_Marketmaker_V1beta1_MarketMakerHandle] = []

  /// delete existing eligible market makers
  var exclusions: [Crescent_Marketmaker_V1beta1_MarketMakerHandle] = []

  /// delete the not eligible market makers, refund deposit
  var rejections: [Crescent_Marketmaker_V1beta1_MarketMakerHandle] = []

  /// distribute claimable incentive to eligible market makers
  var distributions: [Crescent_Marketmaker_V1beta1_IncentiveDistribution] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Crescent_Marketmaker_V1beta1_MarketMakerHandle {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var address: String = String()

  var pairID: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Crescent_Marketmaker_V1beta1_IncentiveDistribution {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var address: String = String()

  var pairID: UInt64 = 0

  var amount: [Cosmos_Base_V1beta1_Coin] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Crescent_Marketmaker_V1beta1_MarketMakerProposal: @unchecked Sendable {}
extension Crescent_Marketmaker_V1beta1_MarketMakerHandle: @unchecked Sendable {}
extension Crescent_Marketmaker_V1beta1_IncentiveDistribution: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "crescent.marketmaker.v1beta1"

extension Crescent_Marketmaker_V1beta1_MarketMakerProposal: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MarketMakerProposal"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "title"),
    2: .same(proto: "description"),
    3: .same(proto: "inclusions"),
    4: .same(proto: "exclusions"),
    5: .same(proto: "rejections"),
    6: .same(proto: "distributions"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.title) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.description_p) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.inclusions) }()
      case 4: try { try decoder.decodeRepeatedMessageField(value: &self.exclusions) }()
      case 5: try { try decoder.decodeRepeatedMessageField(value: &self.rejections) }()
      case 6: try { try decoder.decodeRepeatedMessageField(value: &self.distributions) }()
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
    if !self.inclusions.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.inclusions, fieldNumber: 3)
    }
    if !self.exclusions.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.exclusions, fieldNumber: 4)
    }
    if !self.rejections.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.rejections, fieldNumber: 5)
    }
    if !self.distributions.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.distributions, fieldNumber: 6)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Crescent_Marketmaker_V1beta1_MarketMakerProposal, rhs: Crescent_Marketmaker_V1beta1_MarketMakerProposal) -> Bool {
    if lhs.title != rhs.title {return false}
    if lhs.description_p != rhs.description_p {return false}
    if lhs.inclusions != rhs.inclusions {return false}
    if lhs.exclusions != rhs.exclusions {return false}
    if lhs.rejections != rhs.rejections {return false}
    if lhs.distributions != rhs.distributions {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Crescent_Marketmaker_V1beta1_MarketMakerHandle: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MarketMakerHandle"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "address"),
    2: .standard(proto: "pair_id"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.address) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.pairID) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.address.isEmpty {
      try visitor.visitSingularStringField(value: self.address, fieldNumber: 1)
    }
    if self.pairID != 0 {
      try visitor.visitSingularUInt64Field(value: self.pairID, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Crescent_Marketmaker_V1beta1_MarketMakerHandle, rhs: Crescent_Marketmaker_V1beta1_MarketMakerHandle) -> Bool {
    if lhs.address != rhs.address {return false}
    if lhs.pairID != rhs.pairID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Crescent_Marketmaker_V1beta1_IncentiveDistribution: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".IncentiveDistribution"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "address"),
    2: .standard(proto: "pair_id"),
    3: .same(proto: "amount"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.address) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.pairID) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.amount) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.address.isEmpty {
      try visitor.visitSingularStringField(value: self.address, fieldNumber: 1)
    }
    if self.pairID != 0 {
      try visitor.visitSingularUInt64Field(value: self.pairID, fieldNumber: 2)
    }
    if !self.amount.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.amount, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Crescent_Marketmaker_V1beta1_IncentiveDistribution, rhs: Crescent_Marketmaker_V1beta1_IncentiveDistribution) -> Bool {
    if lhs.address != rhs.address {return false}
    if lhs.pairID != rhs.pairID {return false}
    if lhs.amount != rhs.amount {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
