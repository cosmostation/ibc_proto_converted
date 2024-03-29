// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: kava/evmutil/v1beta1/conversion_pair.proto
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

/// ConversionPair defines a Kava ERC20 address and corresponding denom that is
/// allowed to be converted between ERC20 and sdk.Coin
struct Kava_Evmutil_V1beta1_ConversionPair {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// ERC20 address of the token on the Kava EVM
  var kavaErc20Address: Data = Data()

  /// Denom of the corresponding sdk.Coin
  var denom: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// AllowedCosmosCoinERC20Token defines allowed cosmos-sdk denom & metadata
/// for evm token representations of sdk assets.
/// NOTE: once evm token contracts are deployed, changes to metadata for a given
/// cosmos_denom will not change metadata of deployed contract.
struct Kava_Evmutil_V1beta1_AllowedCosmosCoinERC20Token {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// Denom of the sdk.Coin
  var cosmosDenom: String = String()

  /// Name of ERC20 contract
  var name: String = String()

  /// Symbol of ERC20 contract
  var symbol: String = String()

  /// Number of decimals ERC20 contract is deployed with.
  var decimals: UInt32 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Kava_Evmutil_V1beta1_ConversionPair: @unchecked Sendable {}
extension Kava_Evmutil_V1beta1_AllowedCosmosCoinERC20Token: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "kava.evmutil.v1beta1"

extension Kava_Evmutil_V1beta1_ConversionPair: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ConversionPair"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "kava_erc20_address"),
    2: .same(proto: "denom"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBytesField(value: &self.kavaErc20Address) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.denom) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.kavaErc20Address.isEmpty {
      try visitor.visitSingularBytesField(value: self.kavaErc20Address, fieldNumber: 1)
    }
    if !self.denom.isEmpty {
      try visitor.visitSingularStringField(value: self.denom, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kava_Evmutil_V1beta1_ConversionPair, rhs: Kava_Evmutil_V1beta1_ConversionPair) -> Bool {
    if lhs.kavaErc20Address != rhs.kavaErc20Address {return false}
    if lhs.denom != rhs.denom {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Kava_Evmutil_V1beta1_AllowedCosmosCoinERC20Token: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".AllowedCosmosCoinERC20Token"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "cosmos_denom"),
    2: .same(proto: "name"),
    3: .same(proto: "symbol"),
    4: .same(proto: "decimals"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.cosmosDenom) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.name) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.symbol) }()
      case 4: try { try decoder.decodeSingularUInt32Field(value: &self.decimals) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.cosmosDenom.isEmpty {
      try visitor.visitSingularStringField(value: self.cosmosDenom, fieldNumber: 1)
    }
    if !self.name.isEmpty {
      try visitor.visitSingularStringField(value: self.name, fieldNumber: 2)
    }
    if !self.symbol.isEmpty {
      try visitor.visitSingularStringField(value: self.symbol, fieldNumber: 3)
    }
    if self.decimals != 0 {
      try visitor.visitSingularUInt32Field(value: self.decimals, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kava_Evmutil_V1beta1_AllowedCosmosCoinERC20Token, rhs: Kava_Evmutil_V1beta1_AllowedCosmosCoinERC20Token) -> Bool {
    if lhs.cosmosDenom != rhs.cosmosDenom {return false}
    if lhs.name != rhs.name {return false}
    if lhs.symbol != rhs.symbol {return false}
    if lhs.decimals != rhs.decimals {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
