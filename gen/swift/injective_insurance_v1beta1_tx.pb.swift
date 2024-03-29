// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: injective/insurance/v1beta1/tx.proto
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

/// MsgCreateInsuranceFund a message to create an insurance fund for a derivative
/// market.
struct Injective_Insurance_V1beta1_MsgCreateInsuranceFund {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// Creator of the insurance fund.
  var sender: String = String()

  /// Ticker for the derivative market.
  var ticker: String = String()

  /// Coin denom to use for the market quote denom
  var quoteDenom: String = String()

  /// Oracle base currency of the derivative market OR the oracle symbol for the
  /// binary options market.
  var oracleBase: String = String()

  /// Oracle quote currency of the derivative market OR the oracle provider for
  /// the binary options market.
  var oracleQuote: String = String()

  /// Oracle type of the binary options or derivative market
  var oracleType: Injective_Oracle_V1beta1_OracleType = .unspecified

  /// Expiration time of the derivative market. Should be -1 for perpetual or -2
  /// for binary options markets.
  var expiry: Int64 = 0

  /// Initial deposit of the insurance fund
  var initialDeposit: Cosmos_Base_V1beta1_Coin {
    get {return _initialDeposit ?? Cosmos_Base_V1beta1_Coin()}
    set {_initialDeposit = newValue}
  }
  /// Returns true if `initialDeposit` has been explicitly set.
  var hasInitialDeposit: Bool {return self._initialDeposit != nil}
  /// Clears the value of `initialDeposit`. Subsequent reads from it will return its default value.
  mutating func clearInitialDeposit() {self._initialDeposit = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _initialDeposit: Cosmos_Base_V1beta1_Coin? = nil
}

struct Injective_Insurance_V1beta1_MsgCreateInsuranceFundResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgUnderwrite defines a message for depositing coins to underwrite an
/// insurance fund
struct Injective_Insurance_V1beta1_MsgUnderwrite {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// Address of the underwriter.
  var sender: String = String()

  /// MarketID of the insurance fund.
  var marketID: String = String()

  /// Amount of quote_denom to underwrite the insurance fund.
  var deposit: Cosmos_Base_V1beta1_Coin {
    get {return _deposit ?? Cosmos_Base_V1beta1_Coin()}
    set {_deposit = newValue}
  }
  /// Returns true if `deposit` has been explicitly set.
  var hasDeposit: Bool {return self._deposit != nil}
  /// Clears the value of `deposit`. Subsequent reads from it will return its default value.
  mutating func clearDeposit() {self._deposit = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _deposit: Cosmos_Base_V1beta1_Coin? = nil
}

struct Injective_Insurance_V1beta1_MsgUnderwriteResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgRequestRedemption defines a message for requesting a redemption of the
/// sender's insurance fund tokens
struct Injective_Insurance_V1beta1_MsgRequestRedemption {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// Address of the underwriter requesting a redemption.
  var sender: String = String()

  /// MarketID of the insurance fund.
  var marketID: String = String()

  /// Insurance fund share token amount to be redeemed.
  var amount: Cosmos_Base_V1beta1_Coin {
    get {return _amount ?? Cosmos_Base_V1beta1_Coin()}
    set {_amount = newValue}
  }
  /// Returns true if `amount` has been explicitly set.
  var hasAmount: Bool {return self._amount != nil}
  /// Clears the value of `amount`. Subsequent reads from it will return its default value.
  mutating func clearAmount() {self._amount = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _amount: Cosmos_Base_V1beta1_Coin? = nil
}

struct Injective_Insurance_V1beta1_MsgRequestRedemptionResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Injective_Insurance_V1beta1_MsgUpdateParams {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// authority is the address of the governance account.
  var authority: String = String()

  /// params defines the insurance parameters to update.
  ///
  /// NOTE: All parameters must be supplied.
  var params: Injective_Insurance_V1beta1_Params {
    get {return _params ?? Injective_Insurance_V1beta1_Params()}
    set {_params = newValue}
  }
  /// Returns true if `params` has been explicitly set.
  var hasParams: Bool {return self._params != nil}
  /// Clears the value of `params`. Subsequent reads from it will return its default value.
  mutating func clearParams() {self._params = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _params: Injective_Insurance_V1beta1_Params? = nil
}

struct Injective_Insurance_V1beta1_MsgUpdateParamsResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Injective_Insurance_V1beta1_MsgCreateInsuranceFund: @unchecked Sendable {}
extension Injective_Insurance_V1beta1_MsgCreateInsuranceFundResponse: @unchecked Sendable {}
extension Injective_Insurance_V1beta1_MsgUnderwrite: @unchecked Sendable {}
extension Injective_Insurance_V1beta1_MsgUnderwriteResponse: @unchecked Sendable {}
extension Injective_Insurance_V1beta1_MsgRequestRedemption: @unchecked Sendable {}
extension Injective_Insurance_V1beta1_MsgRequestRedemptionResponse: @unchecked Sendable {}
extension Injective_Insurance_V1beta1_MsgUpdateParams: @unchecked Sendable {}
extension Injective_Insurance_V1beta1_MsgUpdateParamsResponse: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "injective.insurance.v1beta1"

extension Injective_Insurance_V1beta1_MsgCreateInsuranceFund: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgCreateInsuranceFund"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "sender"),
    2: .same(proto: "ticker"),
    3: .standard(proto: "quote_denom"),
    4: .standard(proto: "oracle_base"),
    5: .standard(proto: "oracle_quote"),
    6: .standard(proto: "oracle_type"),
    7: .same(proto: "expiry"),
    8: .standard(proto: "initial_deposit"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.sender) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.ticker) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.quoteDenom) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.oracleBase) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.oracleQuote) }()
      case 6: try { try decoder.decodeSingularEnumField(value: &self.oracleType) }()
      case 7: try { try decoder.decodeSingularInt64Field(value: &self.expiry) }()
      case 8: try { try decoder.decodeSingularMessageField(value: &self._initialDeposit) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.sender.isEmpty {
      try visitor.visitSingularStringField(value: self.sender, fieldNumber: 1)
    }
    if !self.ticker.isEmpty {
      try visitor.visitSingularStringField(value: self.ticker, fieldNumber: 2)
    }
    if !self.quoteDenom.isEmpty {
      try visitor.visitSingularStringField(value: self.quoteDenom, fieldNumber: 3)
    }
    if !self.oracleBase.isEmpty {
      try visitor.visitSingularStringField(value: self.oracleBase, fieldNumber: 4)
    }
    if !self.oracleQuote.isEmpty {
      try visitor.visitSingularStringField(value: self.oracleQuote, fieldNumber: 5)
    }
    if self.oracleType != .unspecified {
      try visitor.visitSingularEnumField(value: self.oracleType, fieldNumber: 6)
    }
    if self.expiry != 0 {
      try visitor.visitSingularInt64Field(value: self.expiry, fieldNumber: 7)
    }
    try { if let v = self._initialDeposit {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 8)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Injective_Insurance_V1beta1_MsgCreateInsuranceFund, rhs: Injective_Insurance_V1beta1_MsgCreateInsuranceFund) -> Bool {
    if lhs.sender != rhs.sender {return false}
    if lhs.ticker != rhs.ticker {return false}
    if lhs.quoteDenom != rhs.quoteDenom {return false}
    if lhs.oracleBase != rhs.oracleBase {return false}
    if lhs.oracleQuote != rhs.oracleQuote {return false}
    if lhs.oracleType != rhs.oracleType {return false}
    if lhs.expiry != rhs.expiry {return false}
    if lhs._initialDeposit != rhs._initialDeposit {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Injective_Insurance_V1beta1_MsgCreateInsuranceFundResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgCreateInsuranceFundResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Injective_Insurance_V1beta1_MsgCreateInsuranceFundResponse, rhs: Injective_Insurance_V1beta1_MsgCreateInsuranceFundResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Injective_Insurance_V1beta1_MsgUnderwrite: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgUnderwrite"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "sender"),
    2: .standard(proto: "market_id"),
    3: .same(proto: "deposit"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.sender) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.marketID) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._deposit) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.sender.isEmpty {
      try visitor.visitSingularStringField(value: self.sender, fieldNumber: 1)
    }
    if !self.marketID.isEmpty {
      try visitor.visitSingularStringField(value: self.marketID, fieldNumber: 2)
    }
    try { if let v = self._deposit {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Injective_Insurance_V1beta1_MsgUnderwrite, rhs: Injective_Insurance_V1beta1_MsgUnderwrite) -> Bool {
    if lhs.sender != rhs.sender {return false}
    if lhs.marketID != rhs.marketID {return false}
    if lhs._deposit != rhs._deposit {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Injective_Insurance_V1beta1_MsgUnderwriteResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgUnderwriteResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Injective_Insurance_V1beta1_MsgUnderwriteResponse, rhs: Injective_Insurance_V1beta1_MsgUnderwriteResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Injective_Insurance_V1beta1_MsgRequestRedemption: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgRequestRedemption"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "sender"),
    2: .standard(proto: "market_id"),
    3: .same(proto: "amount"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.sender) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.marketID) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._amount) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.sender.isEmpty {
      try visitor.visitSingularStringField(value: self.sender, fieldNumber: 1)
    }
    if !self.marketID.isEmpty {
      try visitor.visitSingularStringField(value: self.marketID, fieldNumber: 2)
    }
    try { if let v = self._amount {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Injective_Insurance_V1beta1_MsgRequestRedemption, rhs: Injective_Insurance_V1beta1_MsgRequestRedemption) -> Bool {
    if lhs.sender != rhs.sender {return false}
    if lhs.marketID != rhs.marketID {return false}
    if lhs._amount != rhs._amount {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Injective_Insurance_V1beta1_MsgRequestRedemptionResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgRequestRedemptionResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Injective_Insurance_V1beta1_MsgRequestRedemptionResponse, rhs: Injective_Insurance_V1beta1_MsgRequestRedemptionResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Injective_Insurance_V1beta1_MsgUpdateParams: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgUpdateParams"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "authority"),
    2: .same(proto: "params"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.authority) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._params) }()
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
    try { if let v = self._params {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Injective_Insurance_V1beta1_MsgUpdateParams, rhs: Injective_Insurance_V1beta1_MsgUpdateParams) -> Bool {
    if lhs.authority != rhs.authority {return false}
    if lhs._params != rhs._params {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Injective_Insurance_V1beta1_MsgUpdateParamsResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgUpdateParamsResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Injective_Insurance_V1beta1_MsgUpdateParamsResponse, rhs: Injective_Insurance_V1beta1_MsgUpdateParamsResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
