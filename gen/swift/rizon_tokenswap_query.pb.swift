// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: rizon/tokenswap/query.proto
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

/// QueryTokenswapRequest is request type for the Query/Tokenswap RPC method
struct Rizonworld_Rizon_Tokenswap_QueryTokenswapRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// tx_hash defines the tx hash to query for
  var txHash: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// QueryTokenswapResponse is response type for the Query/Tokenswap RPC method
struct Rizonworld_Rizon_Tokenswap_QueryTokenswapResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// tokenswap defines the tokenswap info
  var tokenswap: Rizonworld_Rizon_Tokenswap_Tokenswap {
    get {return _tokenswap ?? Rizonworld_Rizon_Tokenswap_Tokenswap()}
    set {_tokenswap = newValue}
  }
  /// Returns true if `tokenswap` has been explicitly set.
  var hasTokenswap: Bool {return self._tokenswap != nil}
  /// Clears the value of `tokenswap`. Subsequent reads from it will return its default value.
  mutating func clearTokenswap() {self._tokenswap = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _tokenswap: Rizonworld_Rizon_Tokenswap_Tokenswap? = nil
}

/// QuerySwappedAmountRequest is request type for the Query/SwappedAmount RPC method
struct Rizonworld_Rizon_Tokenswap_QuerySwappedAmountRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// QuerySwappedAmountResponse is response type for the Query/SwappedAmount RPC method
struct Rizonworld_Rizon_Tokenswap_QuerySwappedAmountResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// amount defines current swapped amount of tokenswap
  var swappedAmount: Rizonworld_Rizon_Tokenswap_SwappedAmount {
    get {return _swappedAmount ?? Rizonworld_Rizon_Tokenswap_SwappedAmount()}
    set {_swappedAmount = newValue}
  }
  /// Returns true if `swappedAmount` has been explicitly set.
  var hasSwappedAmount: Bool {return self._swappedAmount != nil}
  /// Clears the value of `swappedAmount`. Subsequent reads from it will return its default value.
  mutating func clearSwappedAmount() {self._swappedAmount = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _swappedAmount: Rizonworld_Rizon_Tokenswap_SwappedAmount? = nil
}

/// QueryParamsRequest is request type for the Query/Params RPC method
struct Rizonworld_Rizon_Tokenswap_QueryParamsRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// QueryParamsResponse is response type for the Query/Params RPC method
struct Rizonworld_Rizon_Tokenswap_QueryParamsResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// params defines the parameters of tokenswap
  var params: Rizonworld_Rizon_Tokenswap_Params {
    get {return _params ?? Rizonworld_Rizon_Tokenswap_Params()}
    set {_params = newValue}
  }
  /// Returns true if `params` has been explicitly set.
  var hasParams: Bool {return self._params != nil}
  /// Clears the value of `params`. Subsequent reads from it will return its default value.
  mutating func clearParams() {self._params = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _params: Rizonworld_Rizon_Tokenswap_Params? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Rizonworld_Rizon_Tokenswap_QueryTokenswapRequest: @unchecked Sendable {}
extension Rizonworld_Rizon_Tokenswap_QueryTokenswapResponse: @unchecked Sendable {}
extension Rizonworld_Rizon_Tokenswap_QuerySwappedAmountRequest: @unchecked Sendable {}
extension Rizonworld_Rizon_Tokenswap_QuerySwappedAmountResponse: @unchecked Sendable {}
extension Rizonworld_Rizon_Tokenswap_QueryParamsRequest: @unchecked Sendable {}
extension Rizonworld_Rizon_Tokenswap_QueryParamsResponse: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "rizonworld.rizon.tokenswap"

extension Rizonworld_Rizon_Tokenswap_QueryTokenswapRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryTokenswapRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "tx_hash"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.txHash) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.txHash.isEmpty {
      try visitor.visitSingularStringField(value: self.txHash, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Rizonworld_Rizon_Tokenswap_QueryTokenswapRequest, rhs: Rizonworld_Rizon_Tokenswap_QueryTokenswapRequest) -> Bool {
    if lhs.txHash != rhs.txHash {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Rizonworld_Rizon_Tokenswap_QueryTokenswapResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryTokenswapResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "tokenswap"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._tokenswap) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._tokenswap {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Rizonworld_Rizon_Tokenswap_QueryTokenswapResponse, rhs: Rizonworld_Rizon_Tokenswap_QueryTokenswapResponse) -> Bool {
    if lhs._tokenswap != rhs._tokenswap {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Rizonworld_Rizon_Tokenswap_QuerySwappedAmountRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QuerySwappedAmountRequest"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Rizonworld_Rizon_Tokenswap_QuerySwappedAmountRequest, rhs: Rizonworld_Rizon_Tokenswap_QuerySwappedAmountRequest) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Rizonworld_Rizon_Tokenswap_QuerySwappedAmountResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QuerySwappedAmountResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "swapped_amount"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._swappedAmount) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._swappedAmount {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Rizonworld_Rizon_Tokenswap_QuerySwappedAmountResponse, rhs: Rizonworld_Rizon_Tokenswap_QuerySwappedAmountResponse) -> Bool {
    if lhs._swappedAmount != rhs._swappedAmount {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Rizonworld_Rizon_Tokenswap_QueryParamsRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryParamsRequest"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Rizonworld_Rizon_Tokenswap_QueryParamsRequest, rhs: Rizonworld_Rizon_Tokenswap_QueryParamsRequest) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Rizonworld_Rizon_Tokenswap_QueryParamsResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryParamsResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "params"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._params) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._params {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Rizonworld_Rizon_Tokenswap_QueryParamsResponse, rhs: Rizonworld_Rizon_Tokenswap_QueryParamsResponse) -> Bool {
    if lhs._params != rhs._params {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
