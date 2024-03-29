// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: irismod/nft/nft.proto
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

/// BaseNFT defines a non-fungible token
struct Irismod_Nft_BaseNFT {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var id: String = String()

  var name: String = String()

  var uri: String = String()

  var data: String = String()

  var owner: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// Denom defines a type of NFT
struct Irismod_Nft_Denom {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var id: String = String()

  var name: String = String()

  var schema: String = String()

  var creator: String = String()

  var symbol: String = String()

  var mintRestricted: Bool = false

  var updateRestricted: Bool = false

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// IDCollection defines a type of collection with specified ID
struct Irismod_Nft_IDCollection {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var denomID: String = String()

  var tokenIds: [String] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// Owner defines a type of owner
struct Irismod_Nft_Owner {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var address: String = String()

  var idCollections: [Irismod_Nft_IDCollection] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// Collection defines a type of collection
struct Irismod_Nft_Collection {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var denom: Irismod_Nft_Denom {
    get {return _denom ?? Irismod_Nft_Denom()}
    set {_denom = newValue}
  }
  /// Returns true if `denom` has been explicitly set.
  var hasDenom: Bool {return self._denom != nil}
  /// Clears the value of `denom`. Subsequent reads from it will return its default value.
  mutating func clearDenom() {self._denom = nil}

  var nfts: [Irismod_Nft_BaseNFT] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _denom: Irismod_Nft_Denom? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Irismod_Nft_BaseNFT: @unchecked Sendable {}
extension Irismod_Nft_Denom: @unchecked Sendable {}
extension Irismod_Nft_IDCollection: @unchecked Sendable {}
extension Irismod_Nft_Owner: @unchecked Sendable {}
extension Irismod_Nft_Collection: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "irismod.nft"

extension Irismod_Nft_BaseNFT: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".BaseNFT"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
    2: .same(proto: "name"),
    3: .same(proto: "uri"),
    4: .same(proto: "data"),
    5: .same(proto: "owner"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.id) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.name) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.uri) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.data) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.owner) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.id.isEmpty {
      try visitor.visitSingularStringField(value: self.id, fieldNumber: 1)
    }
    if !self.name.isEmpty {
      try visitor.visitSingularStringField(value: self.name, fieldNumber: 2)
    }
    if !self.uri.isEmpty {
      try visitor.visitSingularStringField(value: self.uri, fieldNumber: 3)
    }
    if !self.data.isEmpty {
      try visitor.visitSingularStringField(value: self.data, fieldNumber: 4)
    }
    if !self.owner.isEmpty {
      try visitor.visitSingularStringField(value: self.owner, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Irismod_Nft_BaseNFT, rhs: Irismod_Nft_BaseNFT) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs.name != rhs.name {return false}
    if lhs.uri != rhs.uri {return false}
    if lhs.data != rhs.data {return false}
    if lhs.owner != rhs.owner {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Irismod_Nft_Denom: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Denom"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
    2: .same(proto: "name"),
    3: .same(proto: "schema"),
    4: .same(proto: "creator"),
    5: .same(proto: "symbol"),
    6: .standard(proto: "mint_restricted"),
    7: .standard(proto: "update_restricted"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.id) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.name) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.schema) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.creator) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.symbol) }()
      case 6: try { try decoder.decodeSingularBoolField(value: &self.mintRestricted) }()
      case 7: try { try decoder.decodeSingularBoolField(value: &self.updateRestricted) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.id.isEmpty {
      try visitor.visitSingularStringField(value: self.id, fieldNumber: 1)
    }
    if !self.name.isEmpty {
      try visitor.visitSingularStringField(value: self.name, fieldNumber: 2)
    }
    if !self.schema.isEmpty {
      try visitor.visitSingularStringField(value: self.schema, fieldNumber: 3)
    }
    if !self.creator.isEmpty {
      try visitor.visitSingularStringField(value: self.creator, fieldNumber: 4)
    }
    if !self.symbol.isEmpty {
      try visitor.visitSingularStringField(value: self.symbol, fieldNumber: 5)
    }
    if self.mintRestricted != false {
      try visitor.visitSingularBoolField(value: self.mintRestricted, fieldNumber: 6)
    }
    if self.updateRestricted != false {
      try visitor.visitSingularBoolField(value: self.updateRestricted, fieldNumber: 7)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Irismod_Nft_Denom, rhs: Irismod_Nft_Denom) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs.name != rhs.name {return false}
    if lhs.schema != rhs.schema {return false}
    if lhs.creator != rhs.creator {return false}
    if lhs.symbol != rhs.symbol {return false}
    if lhs.mintRestricted != rhs.mintRestricted {return false}
    if lhs.updateRestricted != rhs.updateRestricted {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Irismod_Nft_IDCollection: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".IDCollection"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "denom_id"),
    2: .standard(proto: "token_ids"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.denomID) }()
      case 2: try { try decoder.decodeRepeatedStringField(value: &self.tokenIds) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.denomID.isEmpty {
      try visitor.visitSingularStringField(value: self.denomID, fieldNumber: 1)
    }
    if !self.tokenIds.isEmpty {
      try visitor.visitRepeatedStringField(value: self.tokenIds, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Irismod_Nft_IDCollection, rhs: Irismod_Nft_IDCollection) -> Bool {
    if lhs.denomID != rhs.denomID {return false}
    if lhs.tokenIds != rhs.tokenIds {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Irismod_Nft_Owner: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Owner"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "address"),
    2: .standard(proto: "id_collections"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.address) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.idCollections) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.address.isEmpty {
      try visitor.visitSingularStringField(value: self.address, fieldNumber: 1)
    }
    if !self.idCollections.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.idCollections, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Irismod_Nft_Owner, rhs: Irismod_Nft_Owner) -> Bool {
    if lhs.address != rhs.address {return false}
    if lhs.idCollections != rhs.idCollections {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Irismod_Nft_Collection: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Collection"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "denom"),
    2: .same(proto: "nfts"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._denom) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.nfts) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._denom {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    if !self.nfts.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.nfts, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Irismod_Nft_Collection, rhs: Irismod_Nft_Collection) -> Bool {
    if lhs._denom != rhs._denom {return false}
    if lhs.nfts != rhs.nfts {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
