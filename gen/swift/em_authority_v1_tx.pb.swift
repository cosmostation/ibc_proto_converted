// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: em/authority/v1/tx.proto
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

struct Em_Authority_V1_MsgCreateIssuer {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var authority: String = String()

  var issuer: String = String()

  var denominations: [Em_Authority_V1_Denomination] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Em_Authority_V1_Denomination {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// base represents the base denom (should be the DenomUnit with exponent = 0).
  var base: String = String()

  /// display indicates the suggested denom that should be
  /// displayed in clients.
  var display: String = String()

  var description_p: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Em_Authority_V1_MsgCreateIssuerResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Em_Authority_V1_MsgDestroyIssuer {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var authority: String = String()

  var issuer: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Em_Authority_V1_MsgDestroyIssuerResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Em_Authority_V1_MsgSetGasPrices {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var authority: String = String()

  var gasPrices: [Cosmos_Base_V1beta1_DecCoin] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Em_Authority_V1_MsgSetGasPricesResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Em_Authority_V1_MsgReplaceAuthority {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var authority: String = String()

  var newAuthority: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Em_Authority_V1_MsgReplaceAuthorityResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var newAuthorityAddress: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Em_Authority_V1_MsgScheduleUpgrade {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var authority: String = String()

  var plan: Cosmos_Upgrade_V1beta1_Plan {
    get {return _plan ?? Cosmos_Upgrade_V1beta1_Plan()}
    set {_plan = newValue}
  }
  /// Returns true if `plan` has been explicitly set.
  var hasPlan: Bool {return self._plan != nil}
  /// Clears the value of `plan`. Subsequent reads from it will return its default value.
  mutating func clearPlan() {self._plan = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _plan: Cosmos_Upgrade_V1beta1_Plan? = nil
}

struct Em_Authority_V1_MsgScheduleUpgradeResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Em_Authority_V1_MsgSetParameters {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var authority: String = String()

  var changes: [Cosmos_Params_V1beta1_ParamChange] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Em_Authority_V1_MsgSetParametersResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Em_Authority_V1_MsgCreateIssuer: @unchecked Sendable {}
extension Em_Authority_V1_Denomination: @unchecked Sendable {}
extension Em_Authority_V1_MsgCreateIssuerResponse: @unchecked Sendable {}
extension Em_Authority_V1_MsgDestroyIssuer: @unchecked Sendable {}
extension Em_Authority_V1_MsgDestroyIssuerResponse: @unchecked Sendable {}
extension Em_Authority_V1_MsgSetGasPrices: @unchecked Sendable {}
extension Em_Authority_V1_MsgSetGasPricesResponse: @unchecked Sendable {}
extension Em_Authority_V1_MsgReplaceAuthority: @unchecked Sendable {}
extension Em_Authority_V1_MsgReplaceAuthorityResponse: @unchecked Sendable {}
extension Em_Authority_V1_MsgScheduleUpgrade: @unchecked Sendable {}
extension Em_Authority_V1_MsgScheduleUpgradeResponse: @unchecked Sendable {}
extension Em_Authority_V1_MsgSetParameters: @unchecked Sendable {}
extension Em_Authority_V1_MsgSetParametersResponse: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "em.authority.v1"

extension Em_Authority_V1_MsgCreateIssuer: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgCreateIssuer"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "authority"),
    2: .same(proto: "issuer"),
    3: .same(proto: "denominations"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.authority) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.issuer) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.denominations) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.authority.isEmpty {
      try visitor.visitSingularStringField(value: self.authority, fieldNumber: 1)
    }
    if !self.issuer.isEmpty {
      try visitor.visitSingularStringField(value: self.issuer, fieldNumber: 2)
    }
    if !self.denominations.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.denominations, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Em_Authority_V1_MsgCreateIssuer, rhs: Em_Authority_V1_MsgCreateIssuer) -> Bool {
    if lhs.authority != rhs.authority {return false}
    if lhs.issuer != rhs.issuer {return false}
    if lhs.denominations != rhs.denominations {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Em_Authority_V1_Denomination: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Denomination"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "base"),
    2: .same(proto: "display"),
    3: .same(proto: "description"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.base) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.display) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.description_p) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.base.isEmpty {
      try visitor.visitSingularStringField(value: self.base, fieldNumber: 1)
    }
    if !self.display.isEmpty {
      try visitor.visitSingularStringField(value: self.display, fieldNumber: 2)
    }
    if !self.description_p.isEmpty {
      try visitor.visitSingularStringField(value: self.description_p, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Em_Authority_V1_Denomination, rhs: Em_Authority_V1_Denomination) -> Bool {
    if lhs.base != rhs.base {return false}
    if lhs.display != rhs.display {return false}
    if lhs.description_p != rhs.description_p {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Em_Authority_V1_MsgCreateIssuerResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgCreateIssuerResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Em_Authority_V1_MsgCreateIssuerResponse, rhs: Em_Authority_V1_MsgCreateIssuerResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Em_Authority_V1_MsgDestroyIssuer: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgDestroyIssuer"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "authority"),
    2: .same(proto: "issuer"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.authority) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.issuer) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.authority.isEmpty {
      try visitor.visitSingularStringField(value: self.authority, fieldNumber: 1)
    }
    if !self.issuer.isEmpty {
      try visitor.visitSingularStringField(value: self.issuer, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Em_Authority_V1_MsgDestroyIssuer, rhs: Em_Authority_V1_MsgDestroyIssuer) -> Bool {
    if lhs.authority != rhs.authority {return false}
    if lhs.issuer != rhs.issuer {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Em_Authority_V1_MsgDestroyIssuerResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgDestroyIssuerResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Em_Authority_V1_MsgDestroyIssuerResponse, rhs: Em_Authority_V1_MsgDestroyIssuerResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Em_Authority_V1_MsgSetGasPrices: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgSetGasPrices"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "authority"),
    2: .standard(proto: "gas_prices"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.authority) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.gasPrices) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.authority.isEmpty {
      try visitor.visitSingularStringField(value: self.authority, fieldNumber: 1)
    }
    if !self.gasPrices.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.gasPrices, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Em_Authority_V1_MsgSetGasPrices, rhs: Em_Authority_V1_MsgSetGasPrices) -> Bool {
    if lhs.authority != rhs.authority {return false}
    if lhs.gasPrices != rhs.gasPrices {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Em_Authority_V1_MsgSetGasPricesResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgSetGasPricesResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Em_Authority_V1_MsgSetGasPricesResponse, rhs: Em_Authority_V1_MsgSetGasPricesResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Em_Authority_V1_MsgReplaceAuthority: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgReplaceAuthority"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "authority"),
    2: .standard(proto: "new_authority"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.authority) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.newAuthority) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.authority.isEmpty {
      try visitor.visitSingularStringField(value: self.authority, fieldNumber: 1)
    }
    if !self.newAuthority.isEmpty {
      try visitor.visitSingularStringField(value: self.newAuthority, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Em_Authority_V1_MsgReplaceAuthority, rhs: Em_Authority_V1_MsgReplaceAuthority) -> Bool {
    if lhs.authority != rhs.authority {return false}
    if lhs.newAuthority != rhs.newAuthority {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Em_Authority_V1_MsgReplaceAuthorityResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgReplaceAuthorityResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "new_authority_address"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.newAuthorityAddress) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.newAuthorityAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.newAuthorityAddress, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Em_Authority_V1_MsgReplaceAuthorityResponse, rhs: Em_Authority_V1_MsgReplaceAuthorityResponse) -> Bool {
    if lhs.newAuthorityAddress != rhs.newAuthorityAddress {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Em_Authority_V1_MsgScheduleUpgrade: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgScheduleUpgrade"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "authority"),
    2: .same(proto: "plan"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.authority) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._plan) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.authority.isEmpty {
      try visitor.visitSingularStringField(value: self.authority, fieldNumber: 1)
    }
    try { if let v = self._plan {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Em_Authority_V1_MsgScheduleUpgrade, rhs: Em_Authority_V1_MsgScheduleUpgrade) -> Bool {
    if lhs.authority != rhs.authority {return false}
    if lhs._plan != rhs._plan {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Em_Authority_V1_MsgScheduleUpgradeResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgScheduleUpgradeResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Em_Authority_V1_MsgScheduleUpgradeResponse, rhs: Em_Authority_V1_MsgScheduleUpgradeResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Em_Authority_V1_MsgSetParameters: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgSetParameters"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "authority"),
    2: .same(proto: "changes"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.authority) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.changes) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.authority.isEmpty {
      try visitor.visitSingularStringField(value: self.authority, fieldNumber: 1)
    }
    if !self.changes.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.changes, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Em_Authority_V1_MsgSetParameters, rhs: Em_Authority_V1_MsgSetParameters) -> Bool {
    if lhs.authority != rhs.authority {return false}
    if lhs.changes != rhs.changes {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Em_Authority_V1_MsgSetParametersResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgSetParametersResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Em_Authority_V1_MsgSetParametersResponse, rhs: Em_Authority_V1_MsgSetParametersResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}