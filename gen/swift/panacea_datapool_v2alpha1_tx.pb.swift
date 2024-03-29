// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: panacea/datapool/v2alpha1/tx.proto
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

/// MsgCreatePool defines the Msg/CreatePool request type.
struct Panacea_Datapool_V2alpha1_MsgCreatePool {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// 'panacea1' address
  var curator: String = String()

  /// deposit
  var deposit: Cosmos_Base_V1beta1_Coin {
    get {return _deposit ?? Cosmos_Base_V1beta1_Coin()}
    set {_deposit = newValue}
  }
  /// Returns true if `deposit` has been explicitly set.
  var hasDeposit: Bool {return self._deposit != nil}
  /// Clears the value of `deposit`. Subsequent reads from it will return its default value.
  mutating func clearDeposit() {self._deposit = nil}

  /// pool parameters
  var poolParams: Panacea_Datapool_V2alpha1_PoolParams {
    get {return _poolParams ?? Panacea_Datapool_V2alpha1_PoolParams()}
    set {_poolParams = newValue}
  }
  /// Returns true if `poolParams` has been explicitly set.
  var hasPoolParams: Bool {return self._poolParams != nil}
  /// Clears the value of `poolParams`. Subsequent reads from it will return its default value.
  mutating func clearPoolParams() {self._poolParams = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _deposit: Cosmos_Base_V1beta1_Coin? = nil
  fileprivate var _poolParams: Panacea_Datapool_V2alpha1_PoolParams? = nil
}

/// MsgCreatePoolResponse defines the Msg/CreatePool response type.
struct Panacea_Datapool_V2alpha1_MsgCreatePoolResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var poolID: UInt64 = 0

  /// Always 1 for v0
  var round: UInt64 = 0

  /// A NFT that presents the right to curate this pool continuously
  var curationNftID: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgSellData defines the Msg/SellData request type.
struct Panacea_Datapool_V2alpha1_MsgSellData {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// certificate for data validation
  var cert: Panacea_Datapool_V2alpha1_DataCert {
    get {return _cert ?? Panacea_Datapool_V2alpha1_DataCert()}
    set {_cert = newValue}
  }
  /// Returns true if `cert` has been explicitly set.
  var hasCert: Bool {return self._cert != nil}
  /// Clears the value of `cert`. Subsequent reads from it will return its default value.
  mutating func clearCert() {self._cert = nil}

  /// 'panacea1' address of seller
  var seller: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _cert: Panacea_Datapool_V2alpha1_DataCert? = nil
}

/// MsgSellDataResponse defines the Msg/SellData response type.
struct Panacea_Datapool_V2alpha1_MsgSellDataResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgBuyDataPass defines the Msg/BuyDataPass request type.
struct Panacea_Datapool_V2alpha1_MsgBuyDataPass {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var poolID: UInt64 = 0

  var round: UInt64 = 0

  var payment: Cosmos_Base_V1beta1_Coin {
    get {return _payment ?? Cosmos_Base_V1beta1_Coin()}
    set {_payment = newValue}
  }
  /// Returns true if `payment` has been explicitly set.
  var hasPayment: Bool {return self._payment != nil}
  /// Clears the value of `payment`. Subsequent reads from it will return its default value.
  mutating func clearPayment() {self._payment = nil}

  /// 'panacea1' address of buyer
  var buyer: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _payment: Cosmos_Base_V1beta1_Coin? = nil
}

/// MsgBuyDataPassResponse defines the Msg/BuyDataPass response type.
struct Panacea_Datapool_V2alpha1_MsgBuyDataPassResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var poolID: UInt64 = 0

  var round: UInt64 = 0

  var dataPassID: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgRedeemDataPass defines the Msg/RedeemDataPass request type.
struct Panacea_Datapool_V2alpha1_MsgRedeemDataPass {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var poolID: UInt64 = 0

  var round: UInt64 = 0

  var dataPassID: UInt64 = 0

  /// 'panacea1' address
  var redeemer: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgRedeemDataPassResponse defines the Msg/RedeemDataPass response type.
struct Panacea_Datapool_V2alpha1_MsgRedeemDataPassResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var receipt: Panacea_Datapool_V2alpha1_DataPassRedeemReceipt {
    get {return _receipt ?? Panacea_Datapool_V2alpha1_DataPassRedeemReceipt()}
    set {_receipt = newValue}
  }
  /// Returns true if `receipt` has been explicitly set.
  var hasReceipt: Bool {return self._receipt != nil}
  /// Clears the value of `receipt`. Subsequent reads from it will return its default value.
  mutating func clearReceipt() {self._receipt = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _receipt: Panacea_Datapool_V2alpha1_DataPassRedeemReceipt? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Panacea_Datapool_V2alpha1_MsgCreatePool: @unchecked Sendable {}
extension Panacea_Datapool_V2alpha1_MsgCreatePoolResponse: @unchecked Sendable {}
extension Panacea_Datapool_V2alpha1_MsgSellData: @unchecked Sendable {}
extension Panacea_Datapool_V2alpha1_MsgSellDataResponse: @unchecked Sendable {}
extension Panacea_Datapool_V2alpha1_MsgBuyDataPass: @unchecked Sendable {}
extension Panacea_Datapool_V2alpha1_MsgBuyDataPassResponse: @unchecked Sendable {}
extension Panacea_Datapool_V2alpha1_MsgRedeemDataPass: @unchecked Sendable {}
extension Panacea_Datapool_V2alpha1_MsgRedeemDataPassResponse: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "panacea.datapool.v2alpha1"

extension Panacea_Datapool_V2alpha1_MsgCreatePool: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgCreatePool"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "curator"),
    2: .same(proto: "deposit"),
    3: .standard(proto: "pool_params"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.curator) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._deposit) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._poolParams) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.curator.isEmpty {
      try visitor.visitSingularStringField(value: self.curator, fieldNumber: 1)
    }
    try { if let v = self._deposit {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try { if let v = self._poolParams {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Panacea_Datapool_V2alpha1_MsgCreatePool, rhs: Panacea_Datapool_V2alpha1_MsgCreatePool) -> Bool {
    if lhs.curator != rhs.curator {return false}
    if lhs._deposit != rhs._deposit {return false}
    if lhs._poolParams != rhs._poolParams {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Panacea_Datapool_V2alpha1_MsgCreatePoolResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgCreatePoolResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "pool_id"),
    2: .same(proto: "round"),
    3: .standard(proto: "curation_nft_id"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.poolID) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.round) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.curationNftID) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.poolID != 0 {
      try visitor.visitSingularUInt64Field(value: self.poolID, fieldNumber: 1)
    }
    if self.round != 0 {
      try visitor.visitSingularUInt64Field(value: self.round, fieldNumber: 2)
    }
    if self.curationNftID != 0 {
      try visitor.visitSingularUInt64Field(value: self.curationNftID, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Panacea_Datapool_V2alpha1_MsgCreatePoolResponse, rhs: Panacea_Datapool_V2alpha1_MsgCreatePoolResponse) -> Bool {
    if lhs.poolID != rhs.poolID {return false}
    if lhs.round != rhs.round {return false}
    if lhs.curationNftID != rhs.curationNftID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Panacea_Datapool_V2alpha1_MsgSellData: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgSellData"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "cert"),
    2: .same(proto: "seller"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._cert) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.seller) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._cert {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    if !self.seller.isEmpty {
      try visitor.visitSingularStringField(value: self.seller, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Panacea_Datapool_V2alpha1_MsgSellData, rhs: Panacea_Datapool_V2alpha1_MsgSellData) -> Bool {
    if lhs._cert != rhs._cert {return false}
    if lhs.seller != rhs.seller {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Panacea_Datapool_V2alpha1_MsgSellDataResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgSellDataResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Panacea_Datapool_V2alpha1_MsgSellDataResponse, rhs: Panacea_Datapool_V2alpha1_MsgSellDataResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Panacea_Datapool_V2alpha1_MsgBuyDataPass: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgBuyDataPass"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "pool_id"),
    2: .same(proto: "round"),
    3: .same(proto: "payment"),
    4: .same(proto: "buyer"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.poolID) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.round) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._payment) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.buyer) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if self.poolID != 0 {
      try visitor.visitSingularUInt64Field(value: self.poolID, fieldNumber: 1)
    }
    if self.round != 0 {
      try visitor.visitSingularUInt64Field(value: self.round, fieldNumber: 2)
    }
    try { if let v = self._payment {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    if !self.buyer.isEmpty {
      try visitor.visitSingularStringField(value: self.buyer, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Panacea_Datapool_V2alpha1_MsgBuyDataPass, rhs: Panacea_Datapool_V2alpha1_MsgBuyDataPass) -> Bool {
    if lhs.poolID != rhs.poolID {return false}
    if lhs.round != rhs.round {return false}
    if lhs._payment != rhs._payment {return false}
    if lhs.buyer != rhs.buyer {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Panacea_Datapool_V2alpha1_MsgBuyDataPassResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgBuyDataPassResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "pool_id"),
    2: .same(proto: "round"),
    3: .standard(proto: "data_pass_id"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.poolID) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.round) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.dataPassID) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.poolID != 0 {
      try visitor.visitSingularUInt64Field(value: self.poolID, fieldNumber: 1)
    }
    if self.round != 0 {
      try visitor.visitSingularUInt64Field(value: self.round, fieldNumber: 2)
    }
    if self.dataPassID != 0 {
      try visitor.visitSingularUInt64Field(value: self.dataPassID, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Panacea_Datapool_V2alpha1_MsgBuyDataPassResponse, rhs: Panacea_Datapool_V2alpha1_MsgBuyDataPassResponse) -> Bool {
    if lhs.poolID != rhs.poolID {return false}
    if lhs.round != rhs.round {return false}
    if lhs.dataPassID != rhs.dataPassID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Panacea_Datapool_V2alpha1_MsgRedeemDataPass: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgRedeemDataPass"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "pool_id"),
    2: .same(proto: "round"),
    3: .standard(proto: "data_pass_id"),
    4: .same(proto: "redeemer"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.poolID) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.round) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.dataPassID) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.redeemer) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.poolID != 0 {
      try visitor.visitSingularUInt64Field(value: self.poolID, fieldNumber: 1)
    }
    if self.round != 0 {
      try visitor.visitSingularUInt64Field(value: self.round, fieldNumber: 2)
    }
    if self.dataPassID != 0 {
      try visitor.visitSingularUInt64Field(value: self.dataPassID, fieldNumber: 3)
    }
    if !self.redeemer.isEmpty {
      try visitor.visitSingularStringField(value: self.redeemer, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Panacea_Datapool_V2alpha1_MsgRedeemDataPass, rhs: Panacea_Datapool_V2alpha1_MsgRedeemDataPass) -> Bool {
    if lhs.poolID != rhs.poolID {return false}
    if lhs.round != rhs.round {return false}
    if lhs.dataPassID != rhs.dataPassID {return false}
    if lhs.redeemer != rhs.redeemer {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Panacea_Datapool_V2alpha1_MsgRedeemDataPassResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgRedeemDataPassResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "receipt"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._receipt) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._receipt {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Panacea_Datapool_V2alpha1_MsgRedeemDataPassResponse, rhs: Panacea_Datapool_V2alpha1_MsgRedeemDataPassResponse) -> Bool {
    if lhs._receipt != rhs._receipt {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
