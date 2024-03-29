// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: umee/ugov/v1/query.proto
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

/// QueryMinGasPrice is a request type.
struct Umee_Ugov_V1_QueryMinGasPrice {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// QueryMinGasPriceResponse response type.
struct Umee_Ugov_V1_QueryMinGasPriceResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var minGasPrice: Cosmos_Base_V1beta1_DecCoin {
    get {return _minGasPrice ?? Cosmos_Base_V1beta1_DecCoin()}
    set {_minGasPrice = newValue}
  }
  /// Returns true if `minGasPrice` has been explicitly set.
  var hasMinGasPrice: Bool {return self._minGasPrice != nil}
  /// Clears the value of `minGasPrice`. Subsequent reads from it will return its default value.
  mutating func clearMinGasPrice() {self._minGasPrice = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _minGasPrice: Cosmos_Base_V1beta1_DecCoin? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Umee_Ugov_V1_QueryMinGasPrice: @unchecked Sendable {}
extension Umee_Ugov_V1_QueryMinGasPriceResponse: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "umee.ugov.v1"

extension Umee_Ugov_V1_QueryMinGasPrice: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryMinGasPrice"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Umee_Ugov_V1_QueryMinGasPrice, rhs: Umee_Ugov_V1_QueryMinGasPrice) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Umee_Ugov_V1_QueryMinGasPriceResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryMinGasPriceResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "min_gas_price"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._minGasPrice) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._minGasPrice {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Umee_Ugov_V1_QueryMinGasPriceResponse, rhs: Umee_Ugov_V1_QueryMinGasPriceResponse) -> Bool {
    if lhs._minGasPrice != rhs._minGasPrice {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
