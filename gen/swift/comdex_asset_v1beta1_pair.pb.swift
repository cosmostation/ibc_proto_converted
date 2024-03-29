// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: comdex/asset/v1beta1/pair.proto
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

struct Comdex_Asset_V1beta1_Pair {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var id: UInt64 = 0

  var assetIn: UInt64 = 0

  var assetOut: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Comdex_Asset_V1beta1_PairInfo {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var id: UInt64 = 0

  var assetIn: UInt64 = 0

  var denomIn: String = String()

  var assetOut: UInt64 = 0

  var denomOut: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Comdex_Asset_V1beta1_AssetPair {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var id: UInt64 = 0

  var name: String = String()

  var denom: String = String()

  var decimals: String = String()

  var isOnChain: Bool = false

  var isOraclePriceRequired: Bool = false

  var isCdpMintable: Bool = false

  var assetOut: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Comdex_Asset_V1beta1_Pair: @unchecked Sendable {}
extension Comdex_Asset_V1beta1_PairInfo: @unchecked Sendable {}
extension Comdex_Asset_V1beta1_AssetPair: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "comdex.asset.v1beta1"

extension Comdex_Asset_V1beta1_Pair: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Pair"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
    2: .standard(proto: "asset_in"),
    3: .standard(proto: "asset_out"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.id) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.assetIn) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.assetOut) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.id != 0 {
      try visitor.visitSingularUInt64Field(value: self.id, fieldNumber: 1)
    }
    if self.assetIn != 0 {
      try visitor.visitSingularUInt64Field(value: self.assetIn, fieldNumber: 2)
    }
    if self.assetOut != 0 {
      try visitor.visitSingularUInt64Field(value: self.assetOut, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Comdex_Asset_V1beta1_Pair, rhs: Comdex_Asset_V1beta1_Pair) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs.assetIn != rhs.assetIn {return false}
    if lhs.assetOut != rhs.assetOut {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Comdex_Asset_V1beta1_PairInfo: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".PairInfo"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
    2: .standard(proto: "asset_in"),
    3: .standard(proto: "denom_in"),
    4: .standard(proto: "asset_out"),
    5: .standard(proto: "denom_out"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.id) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.assetIn) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.denomIn) }()
      case 4: try { try decoder.decodeSingularUInt64Field(value: &self.assetOut) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.denomOut) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.id != 0 {
      try visitor.visitSingularUInt64Field(value: self.id, fieldNumber: 1)
    }
    if self.assetIn != 0 {
      try visitor.visitSingularUInt64Field(value: self.assetIn, fieldNumber: 2)
    }
    if !self.denomIn.isEmpty {
      try visitor.visitSingularStringField(value: self.denomIn, fieldNumber: 3)
    }
    if self.assetOut != 0 {
      try visitor.visitSingularUInt64Field(value: self.assetOut, fieldNumber: 4)
    }
    if !self.denomOut.isEmpty {
      try visitor.visitSingularStringField(value: self.denomOut, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Comdex_Asset_V1beta1_PairInfo, rhs: Comdex_Asset_V1beta1_PairInfo) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs.assetIn != rhs.assetIn {return false}
    if lhs.denomIn != rhs.denomIn {return false}
    if lhs.assetOut != rhs.assetOut {return false}
    if lhs.denomOut != rhs.denomOut {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Comdex_Asset_V1beta1_AssetPair: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".AssetPair"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
    2: .same(proto: "name"),
    3: .same(proto: "denom"),
    4: .same(proto: "decimals"),
    5: .standard(proto: "is_on_chain"),
    6: .standard(proto: "is_oracle_price_required"),
    7: .standard(proto: "is_cdp_mintable"),
    8: .standard(proto: "asset_out"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.id) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.name) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.denom) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.decimals) }()
      case 5: try { try decoder.decodeSingularBoolField(value: &self.isOnChain) }()
      case 6: try { try decoder.decodeSingularBoolField(value: &self.isOraclePriceRequired) }()
      case 7: try { try decoder.decodeSingularBoolField(value: &self.isCdpMintable) }()
      case 8: try { try decoder.decodeSingularUInt64Field(value: &self.assetOut) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.id != 0 {
      try visitor.visitSingularUInt64Field(value: self.id, fieldNumber: 1)
    }
    if !self.name.isEmpty {
      try visitor.visitSingularStringField(value: self.name, fieldNumber: 2)
    }
    if !self.denom.isEmpty {
      try visitor.visitSingularStringField(value: self.denom, fieldNumber: 3)
    }
    if !self.decimals.isEmpty {
      try visitor.visitSingularStringField(value: self.decimals, fieldNumber: 4)
    }
    if self.isOnChain != false {
      try visitor.visitSingularBoolField(value: self.isOnChain, fieldNumber: 5)
    }
    if self.isOraclePriceRequired != false {
      try visitor.visitSingularBoolField(value: self.isOraclePriceRequired, fieldNumber: 6)
    }
    if self.isCdpMintable != false {
      try visitor.visitSingularBoolField(value: self.isCdpMintable, fieldNumber: 7)
    }
    if self.assetOut != 0 {
      try visitor.visitSingularUInt64Field(value: self.assetOut, fieldNumber: 8)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Comdex_Asset_V1beta1_AssetPair, rhs: Comdex_Asset_V1beta1_AssetPair) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs.name != rhs.name {return false}
    if lhs.denom != rhs.denom {return false}
    if lhs.decimals != rhs.decimals {return false}
    if lhs.isOnChain != rhs.isOnChain {return false}
    if lhs.isOraclePriceRequired != rhs.isOraclePriceRequired {return false}
    if lhs.isCdpMintable != rhs.isCdpMintable {return false}
    if lhs.assetOut != rhs.assetOut {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
