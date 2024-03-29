// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: coreum/asset/ft/v1/event.proto
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

/// EventIssued is emitted on MsgIssue.
struct Coreum_Asset_Ft_V1_EventIssued {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var denom: String = String()

  var issuer: String = String()

  var symbol: String = String()

  var subunit: String = String()

  var precision: UInt32 = 0

  var initialAmount: String = String()

  var description_p: String = String()

  var features: [Coreum_Asset_Ft_V1_Feature] = []

  var burnRate: String = String()

  var sendCommissionRate: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Coreum_Asset_Ft_V1_EventFrozenAmountChanged {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var account: String = String()

  var denom: String = String()

  var previousAmount: String = String()

  var currentAmount: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Coreum_Asset_Ft_V1_EventWhitelistedAmountChanged {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var account: String = String()

  var denom: String = String()

  var previousAmount: String = String()

  var currentAmount: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Coreum_Asset_Ft_V1_EventIssued: @unchecked Sendable {}
extension Coreum_Asset_Ft_V1_EventFrozenAmountChanged: @unchecked Sendable {}
extension Coreum_Asset_Ft_V1_EventWhitelistedAmountChanged: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "coreum.asset.ft.v1"

extension Coreum_Asset_Ft_V1_EventIssued: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".EventIssued"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "denom"),
    2: .same(proto: "issuer"),
    3: .same(proto: "symbol"),
    4: .same(proto: "subunit"),
    5: .same(proto: "precision"),
    6: .standard(proto: "initial_amount"),
    7: .same(proto: "description"),
    8: .same(proto: "features"),
    9: .standard(proto: "burn_rate"),
    10: .standard(proto: "send_commission_rate"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.denom) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.issuer) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.symbol) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.subunit) }()
      case 5: try { try decoder.decodeSingularUInt32Field(value: &self.precision) }()
      case 6: try { try decoder.decodeSingularStringField(value: &self.initialAmount) }()
      case 7: try { try decoder.decodeSingularStringField(value: &self.description_p) }()
      case 8: try { try decoder.decodeRepeatedEnumField(value: &self.features) }()
      case 9: try { try decoder.decodeSingularStringField(value: &self.burnRate) }()
      case 10: try { try decoder.decodeSingularStringField(value: &self.sendCommissionRate) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.denom.isEmpty {
      try visitor.visitSingularStringField(value: self.denom, fieldNumber: 1)
    }
    if !self.issuer.isEmpty {
      try visitor.visitSingularStringField(value: self.issuer, fieldNumber: 2)
    }
    if !self.symbol.isEmpty {
      try visitor.visitSingularStringField(value: self.symbol, fieldNumber: 3)
    }
    if !self.subunit.isEmpty {
      try visitor.visitSingularStringField(value: self.subunit, fieldNumber: 4)
    }
    if self.precision != 0 {
      try visitor.visitSingularUInt32Field(value: self.precision, fieldNumber: 5)
    }
    if !self.initialAmount.isEmpty {
      try visitor.visitSingularStringField(value: self.initialAmount, fieldNumber: 6)
    }
    if !self.description_p.isEmpty {
      try visitor.visitSingularStringField(value: self.description_p, fieldNumber: 7)
    }
    if !self.features.isEmpty {
      try visitor.visitPackedEnumField(value: self.features, fieldNumber: 8)
    }
    if !self.burnRate.isEmpty {
      try visitor.visitSingularStringField(value: self.burnRate, fieldNumber: 9)
    }
    if !self.sendCommissionRate.isEmpty {
      try visitor.visitSingularStringField(value: self.sendCommissionRate, fieldNumber: 10)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Coreum_Asset_Ft_V1_EventIssued, rhs: Coreum_Asset_Ft_V1_EventIssued) -> Bool {
    if lhs.denom != rhs.denom {return false}
    if lhs.issuer != rhs.issuer {return false}
    if lhs.symbol != rhs.symbol {return false}
    if lhs.subunit != rhs.subunit {return false}
    if lhs.precision != rhs.precision {return false}
    if lhs.initialAmount != rhs.initialAmount {return false}
    if lhs.description_p != rhs.description_p {return false}
    if lhs.features != rhs.features {return false}
    if lhs.burnRate != rhs.burnRate {return false}
    if lhs.sendCommissionRate != rhs.sendCommissionRate {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Coreum_Asset_Ft_V1_EventFrozenAmountChanged: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".EventFrozenAmountChanged"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "account"),
    2: .same(proto: "denom"),
    3: .standard(proto: "previous_amount"),
    4: .standard(proto: "current_amount"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.account) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.denom) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.previousAmount) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.currentAmount) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.account.isEmpty {
      try visitor.visitSingularStringField(value: self.account, fieldNumber: 1)
    }
    if !self.denom.isEmpty {
      try visitor.visitSingularStringField(value: self.denom, fieldNumber: 2)
    }
    if !self.previousAmount.isEmpty {
      try visitor.visitSingularStringField(value: self.previousAmount, fieldNumber: 3)
    }
    if !self.currentAmount.isEmpty {
      try visitor.visitSingularStringField(value: self.currentAmount, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Coreum_Asset_Ft_V1_EventFrozenAmountChanged, rhs: Coreum_Asset_Ft_V1_EventFrozenAmountChanged) -> Bool {
    if lhs.account != rhs.account {return false}
    if lhs.denom != rhs.denom {return false}
    if lhs.previousAmount != rhs.previousAmount {return false}
    if lhs.currentAmount != rhs.currentAmount {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Coreum_Asset_Ft_V1_EventWhitelistedAmountChanged: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".EventWhitelistedAmountChanged"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "account"),
    2: .same(proto: "denom"),
    3: .standard(proto: "previous_amount"),
    4: .standard(proto: "current_amount"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.account) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.denom) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.previousAmount) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.currentAmount) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.account.isEmpty {
      try visitor.visitSingularStringField(value: self.account, fieldNumber: 1)
    }
    if !self.denom.isEmpty {
      try visitor.visitSingularStringField(value: self.denom, fieldNumber: 2)
    }
    if !self.previousAmount.isEmpty {
      try visitor.visitSingularStringField(value: self.previousAmount, fieldNumber: 3)
    }
    if !self.currentAmount.isEmpty {
      try visitor.visitSingularStringField(value: self.currentAmount, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Coreum_Asset_Ft_V1_EventWhitelistedAmountChanged, rhs: Coreum_Asset_Ft_V1_EventWhitelistedAmountChanged) -> Bool {
    if lhs.account != rhs.account {return false}
    if lhs.denom != rhs.denom {return false}
    if lhs.previousAmount != rhs.previousAmount {return false}
    if lhs.currentAmount != rhs.currentAmount {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
