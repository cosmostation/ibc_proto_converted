// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: stafihub/rdex/tx.proto
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

struct Stafihub_Stafihub_Rdex_MsgCreatePool {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var creator: String = String()

  var token0: Cosmos_Base_V1beta1_Coin {
    get {return _token0 ?? Cosmos_Base_V1beta1_Coin()}
    set {_token0 = newValue}
  }
  /// Returns true if `token0` has been explicitly set.
  var hasToken0: Bool {return self._token0 != nil}
  /// Clears the value of `token0`. Subsequent reads from it will return its default value.
  mutating func clearToken0() {self._token0 = nil}

  var token1: Cosmos_Base_V1beta1_Coin {
    get {return _token1 ?? Cosmos_Base_V1beta1_Coin()}
    set {_token1 = newValue}
  }
  /// Returns true if `token1` has been explicitly set.
  var hasToken1: Bool {return self._token1 != nil}
  /// Clears the value of `token1`. Subsequent reads from it will return its default value.
  mutating func clearToken1() {self._token1 = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _token0: Cosmos_Base_V1beta1_Coin? = nil
  fileprivate var _token1: Cosmos_Base_V1beta1_Coin? = nil
}

struct Stafihub_Stafihub_Rdex_MsgCreatePoolResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Rdex_MsgAddLiquidity {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var creator: String = String()

  var swapPoolIndex: UInt32 = 0

  var token0: Cosmos_Base_V1beta1_Coin {
    get {return _token0 ?? Cosmos_Base_V1beta1_Coin()}
    set {_token0 = newValue}
  }
  /// Returns true if `token0` has been explicitly set.
  var hasToken0: Bool {return self._token0 != nil}
  /// Clears the value of `token0`. Subsequent reads from it will return its default value.
  mutating func clearToken0() {self._token0 = nil}

  var token1: Cosmos_Base_V1beta1_Coin {
    get {return _token1 ?? Cosmos_Base_V1beta1_Coin()}
    set {_token1 = newValue}
  }
  /// Returns true if `token1` has been explicitly set.
  var hasToken1: Bool {return self._token1 != nil}
  /// Clears the value of `token1`. Subsequent reads from it will return its default value.
  mutating func clearToken1() {self._token1 = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _token0: Cosmos_Base_V1beta1_Coin? = nil
  fileprivate var _token1: Cosmos_Base_V1beta1_Coin? = nil
}

struct Stafihub_Stafihub_Rdex_MsgAddLiquidityResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Rdex_MsgSwap {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var creator: String = String()

  var swapPoolIndex: UInt32 = 0

  var inputToken: Cosmos_Base_V1beta1_Coin {
    get {return _inputToken ?? Cosmos_Base_V1beta1_Coin()}
    set {_inputToken = newValue}
  }
  /// Returns true if `inputToken` has been explicitly set.
  var hasInputToken: Bool {return self._inputToken != nil}
  /// Clears the value of `inputToken`. Subsequent reads from it will return its default value.
  mutating func clearInputToken() {self._inputToken = nil}

  var minOutToken: Cosmos_Base_V1beta1_Coin {
    get {return _minOutToken ?? Cosmos_Base_V1beta1_Coin()}
    set {_minOutToken = newValue}
  }
  /// Returns true if `minOutToken` has been explicitly set.
  var hasMinOutToken: Bool {return self._minOutToken != nil}
  /// Clears the value of `minOutToken`. Subsequent reads from it will return its default value.
  mutating func clearMinOutToken() {self._minOutToken = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _inputToken: Cosmos_Base_V1beta1_Coin? = nil
  fileprivate var _minOutToken: Cosmos_Base_V1beta1_Coin? = nil
}

struct Stafihub_Stafihub_Rdex_MsgSwapResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Rdex_MsgRemoveLiquidity {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var creator: String = String()

  var swapPoolIndex: UInt32 = 0

  var rmUnit: String = String()

  var swapUnit: String = String()

  var minOutToken0: Cosmos_Base_V1beta1_Coin {
    get {return _minOutToken0 ?? Cosmos_Base_V1beta1_Coin()}
    set {_minOutToken0 = newValue}
  }
  /// Returns true if `minOutToken0` has been explicitly set.
  var hasMinOutToken0: Bool {return self._minOutToken0 != nil}
  /// Clears the value of `minOutToken0`. Subsequent reads from it will return its default value.
  mutating func clearMinOutToken0() {self._minOutToken0 = nil}

  var minOutToken1: Cosmos_Base_V1beta1_Coin {
    get {return _minOutToken1 ?? Cosmos_Base_V1beta1_Coin()}
    set {_minOutToken1 = newValue}
  }
  /// Returns true if `minOutToken1` has been explicitly set.
  var hasMinOutToken1: Bool {return self._minOutToken1 != nil}
  /// Clears the value of `minOutToken1`. Subsequent reads from it will return its default value.
  mutating func clearMinOutToken1() {self._minOutToken1 = nil}

  var inputTokenDenom: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _minOutToken0: Cosmos_Base_V1beta1_Coin? = nil
  fileprivate var _minOutToken1: Cosmos_Base_V1beta1_Coin? = nil
}

struct Stafihub_Stafihub_Rdex_MsgRemoveLiquidityResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Rdex_MsgToggleProviderSwitch {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var creator: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Rdex_MsgToggleProviderSwitchResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Rdex_MsgAddProvider {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var creator: String = String()

  var userAddress: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Rdex_MsgAddProviderResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Rdex_MsgRmProvider {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var creator: String = String()

  var userAddress: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Rdex_MsgRmProviderResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Rdex_MsgAddPoolCreator {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var creator: String = String()

  var userAddress: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Rdex_MsgAddPoolCreatorResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Rdex_MsgRmPoolCreator {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var creator: String = String()

  var userAddress: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Rdex_MsgRmPoolCreatorResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Stafihub_Stafihub_Rdex_MsgCreatePool: @unchecked Sendable {}
extension Stafihub_Stafihub_Rdex_MsgCreatePoolResponse: @unchecked Sendable {}
extension Stafihub_Stafihub_Rdex_MsgAddLiquidity: @unchecked Sendable {}
extension Stafihub_Stafihub_Rdex_MsgAddLiquidityResponse: @unchecked Sendable {}
extension Stafihub_Stafihub_Rdex_MsgSwap: @unchecked Sendable {}
extension Stafihub_Stafihub_Rdex_MsgSwapResponse: @unchecked Sendable {}
extension Stafihub_Stafihub_Rdex_MsgRemoveLiquidity: @unchecked Sendable {}
extension Stafihub_Stafihub_Rdex_MsgRemoveLiquidityResponse: @unchecked Sendable {}
extension Stafihub_Stafihub_Rdex_MsgToggleProviderSwitch: @unchecked Sendable {}
extension Stafihub_Stafihub_Rdex_MsgToggleProviderSwitchResponse: @unchecked Sendable {}
extension Stafihub_Stafihub_Rdex_MsgAddProvider: @unchecked Sendable {}
extension Stafihub_Stafihub_Rdex_MsgAddProviderResponse: @unchecked Sendable {}
extension Stafihub_Stafihub_Rdex_MsgRmProvider: @unchecked Sendable {}
extension Stafihub_Stafihub_Rdex_MsgRmProviderResponse: @unchecked Sendable {}
extension Stafihub_Stafihub_Rdex_MsgAddPoolCreator: @unchecked Sendable {}
extension Stafihub_Stafihub_Rdex_MsgAddPoolCreatorResponse: @unchecked Sendable {}
extension Stafihub_Stafihub_Rdex_MsgRmPoolCreator: @unchecked Sendable {}
extension Stafihub_Stafihub_Rdex_MsgRmPoolCreatorResponse: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "stafihub.stafihub.rdex"

extension Stafihub_Stafihub_Rdex_MsgCreatePool: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgCreatePool"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "creator"),
    2: .same(proto: "token0"),
    3: .same(proto: "token1"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.creator) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._token0) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._token1) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.creator.isEmpty {
      try visitor.visitSingularStringField(value: self.creator, fieldNumber: 1)
    }
    try { if let v = self._token0 {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try { if let v = self._token1 {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Rdex_MsgCreatePool, rhs: Stafihub_Stafihub_Rdex_MsgCreatePool) -> Bool {
    if lhs.creator != rhs.creator {return false}
    if lhs._token0 != rhs._token0 {return false}
    if lhs._token1 != rhs._token1 {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Rdex_MsgCreatePoolResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgCreatePoolResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Rdex_MsgCreatePoolResponse, rhs: Stafihub_Stafihub_Rdex_MsgCreatePoolResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Rdex_MsgAddLiquidity: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgAddLiquidity"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "creator"),
    2: .same(proto: "swapPoolIndex"),
    3: .same(proto: "token0"),
    4: .same(proto: "token1"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.creator) }()
      case 2: try { try decoder.decodeSingularUInt32Field(value: &self.swapPoolIndex) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._token0) }()
      case 4: try { try decoder.decodeSingularMessageField(value: &self._token1) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.creator.isEmpty {
      try visitor.visitSingularStringField(value: self.creator, fieldNumber: 1)
    }
    if self.swapPoolIndex != 0 {
      try visitor.visitSingularUInt32Field(value: self.swapPoolIndex, fieldNumber: 2)
    }
    try { if let v = self._token0 {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    try { if let v = self._token1 {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Rdex_MsgAddLiquidity, rhs: Stafihub_Stafihub_Rdex_MsgAddLiquidity) -> Bool {
    if lhs.creator != rhs.creator {return false}
    if lhs.swapPoolIndex != rhs.swapPoolIndex {return false}
    if lhs._token0 != rhs._token0 {return false}
    if lhs._token1 != rhs._token1 {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Rdex_MsgAddLiquidityResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgAddLiquidityResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Rdex_MsgAddLiquidityResponse, rhs: Stafihub_Stafihub_Rdex_MsgAddLiquidityResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Rdex_MsgSwap: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgSwap"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "creator"),
    2: .same(proto: "swapPoolIndex"),
    3: .same(proto: "inputToken"),
    4: .same(proto: "minOutToken"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.creator) }()
      case 2: try { try decoder.decodeSingularUInt32Field(value: &self.swapPoolIndex) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._inputToken) }()
      case 4: try { try decoder.decodeSingularMessageField(value: &self._minOutToken) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.creator.isEmpty {
      try visitor.visitSingularStringField(value: self.creator, fieldNumber: 1)
    }
    if self.swapPoolIndex != 0 {
      try visitor.visitSingularUInt32Field(value: self.swapPoolIndex, fieldNumber: 2)
    }
    try { if let v = self._inputToken {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    try { if let v = self._minOutToken {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Rdex_MsgSwap, rhs: Stafihub_Stafihub_Rdex_MsgSwap) -> Bool {
    if lhs.creator != rhs.creator {return false}
    if lhs.swapPoolIndex != rhs.swapPoolIndex {return false}
    if lhs._inputToken != rhs._inputToken {return false}
    if lhs._minOutToken != rhs._minOutToken {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Rdex_MsgSwapResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgSwapResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Rdex_MsgSwapResponse, rhs: Stafihub_Stafihub_Rdex_MsgSwapResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Rdex_MsgRemoveLiquidity: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgRemoveLiquidity"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "creator"),
    2: .same(proto: "swapPoolIndex"),
    3: .same(proto: "rmUnit"),
    4: .same(proto: "swapUnit"),
    5: .same(proto: "minOutToken0"),
    6: .same(proto: "minOutToken1"),
    7: .same(proto: "inputTokenDenom"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.creator) }()
      case 2: try { try decoder.decodeSingularUInt32Field(value: &self.swapPoolIndex) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.rmUnit) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.swapUnit) }()
      case 5: try { try decoder.decodeSingularMessageField(value: &self._minOutToken0) }()
      case 6: try { try decoder.decodeSingularMessageField(value: &self._minOutToken1) }()
      case 7: try { try decoder.decodeSingularStringField(value: &self.inputTokenDenom) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.creator.isEmpty {
      try visitor.visitSingularStringField(value: self.creator, fieldNumber: 1)
    }
    if self.swapPoolIndex != 0 {
      try visitor.visitSingularUInt32Field(value: self.swapPoolIndex, fieldNumber: 2)
    }
    if !self.rmUnit.isEmpty {
      try visitor.visitSingularStringField(value: self.rmUnit, fieldNumber: 3)
    }
    if !self.swapUnit.isEmpty {
      try visitor.visitSingularStringField(value: self.swapUnit, fieldNumber: 4)
    }
    try { if let v = self._minOutToken0 {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 5)
    } }()
    try { if let v = self._minOutToken1 {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 6)
    } }()
    if !self.inputTokenDenom.isEmpty {
      try visitor.visitSingularStringField(value: self.inputTokenDenom, fieldNumber: 7)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Rdex_MsgRemoveLiquidity, rhs: Stafihub_Stafihub_Rdex_MsgRemoveLiquidity) -> Bool {
    if lhs.creator != rhs.creator {return false}
    if lhs.swapPoolIndex != rhs.swapPoolIndex {return false}
    if lhs.rmUnit != rhs.rmUnit {return false}
    if lhs.swapUnit != rhs.swapUnit {return false}
    if lhs._minOutToken0 != rhs._minOutToken0 {return false}
    if lhs._minOutToken1 != rhs._minOutToken1 {return false}
    if lhs.inputTokenDenom != rhs.inputTokenDenom {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Rdex_MsgRemoveLiquidityResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgRemoveLiquidityResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Rdex_MsgRemoveLiquidityResponse, rhs: Stafihub_Stafihub_Rdex_MsgRemoveLiquidityResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Rdex_MsgToggleProviderSwitch: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgToggleProviderSwitch"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "creator"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.creator) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.creator.isEmpty {
      try visitor.visitSingularStringField(value: self.creator, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Rdex_MsgToggleProviderSwitch, rhs: Stafihub_Stafihub_Rdex_MsgToggleProviderSwitch) -> Bool {
    if lhs.creator != rhs.creator {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Rdex_MsgToggleProviderSwitchResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgToggleProviderSwitchResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Rdex_MsgToggleProviderSwitchResponse, rhs: Stafihub_Stafihub_Rdex_MsgToggleProviderSwitchResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Rdex_MsgAddProvider: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgAddProvider"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "creator"),
    2: .same(proto: "userAddress"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.creator) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.userAddress) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.creator.isEmpty {
      try visitor.visitSingularStringField(value: self.creator, fieldNumber: 1)
    }
    if !self.userAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.userAddress, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Rdex_MsgAddProvider, rhs: Stafihub_Stafihub_Rdex_MsgAddProvider) -> Bool {
    if lhs.creator != rhs.creator {return false}
    if lhs.userAddress != rhs.userAddress {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Rdex_MsgAddProviderResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgAddProviderResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Rdex_MsgAddProviderResponse, rhs: Stafihub_Stafihub_Rdex_MsgAddProviderResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Rdex_MsgRmProvider: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgRmProvider"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "creator"),
    2: .same(proto: "userAddress"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.creator) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.userAddress) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.creator.isEmpty {
      try visitor.visitSingularStringField(value: self.creator, fieldNumber: 1)
    }
    if !self.userAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.userAddress, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Rdex_MsgRmProvider, rhs: Stafihub_Stafihub_Rdex_MsgRmProvider) -> Bool {
    if lhs.creator != rhs.creator {return false}
    if lhs.userAddress != rhs.userAddress {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Rdex_MsgRmProviderResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgRmProviderResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Rdex_MsgRmProviderResponse, rhs: Stafihub_Stafihub_Rdex_MsgRmProviderResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Rdex_MsgAddPoolCreator: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgAddPoolCreator"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "creator"),
    2: .same(proto: "userAddress"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.creator) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.userAddress) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.creator.isEmpty {
      try visitor.visitSingularStringField(value: self.creator, fieldNumber: 1)
    }
    if !self.userAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.userAddress, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Rdex_MsgAddPoolCreator, rhs: Stafihub_Stafihub_Rdex_MsgAddPoolCreator) -> Bool {
    if lhs.creator != rhs.creator {return false}
    if lhs.userAddress != rhs.userAddress {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Rdex_MsgAddPoolCreatorResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgAddPoolCreatorResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Rdex_MsgAddPoolCreatorResponse, rhs: Stafihub_Stafihub_Rdex_MsgAddPoolCreatorResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Rdex_MsgRmPoolCreator: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgRmPoolCreator"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "creator"),
    2: .same(proto: "userAddress"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.creator) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.userAddress) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.creator.isEmpty {
      try visitor.visitSingularStringField(value: self.creator, fieldNumber: 1)
    }
    if !self.userAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.userAddress, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Rdex_MsgRmPoolCreator, rhs: Stafihub_Stafihub_Rdex_MsgRmPoolCreator) -> Bool {
    if lhs.creator != rhs.creator {return false}
    if lhs.userAddress != rhs.userAddress {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Rdex_MsgRmPoolCreatorResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgRmPoolCreatorResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Rdex_MsgRmPoolCreatorResponse, rhs: Stafihub_Stafihub_Rdex_MsgRmPoolCreatorResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
