// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: coreum/asset/nft/v1/genesis.proto
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

/// GenesisState defines the nftasset module's genesis state.
struct Coreum_Asset_Nft_V1_GenesisState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// params defines all the parameters of the module.
  var params: Coreum_Asset_Nft_V1_Params {
    get {return _params ?? Coreum_Asset_Nft_V1_Params()}
    set {_params = newValue}
  }
  /// Returns true if `params` has been explicitly set.
  var hasParams: Bool {return self._params != nil}
  /// Clears the value of `params`. Subsequent reads from it will return its default value.
  mutating func clearParams() {self._params = nil}

  /// class_definitions keep the non-fungible token class definitions state
  var classDefinitions: [Coreum_Asset_Nft_V1_ClassDefinition] = []

  var frozenNfts: [Coreum_Asset_Nft_V1_FrozenNFT] = []

  var whitelistedNftAccounts: [Coreum_Asset_Nft_V1_WhitelistedNFTAccounts] = []

  var burntNfts: [Coreum_Asset_Nft_V1_BurntNFT] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _params: Coreum_Asset_Nft_V1_Params? = nil
}

struct Coreum_Asset_Nft_V1_FrozenNFT {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var classID: String = String()

  var nftIds: [String] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Coreum_Asset_Nft_V1_WhitelistedNFTAccounts {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var classID: String = String()

  var nftID: String = String()

  var accounts: [String] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Coreum_Asset_Nft_V1_BurntNFT {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var classID: String = String()

  var nftIds: [String] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Coreum_Asset_Nft_V1_GenesisState: @unchecked Sendable {}
extension Coreum_Asset_Nft_V1_FrozenNFT: @unchecked Sendable {}
extension Coreum_Asset_Nft_V1_WhitelistedNFTAccounts: @unchecked Sendable {}
extension Coreum_Asset_Nft_V1_BurntNFT: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "coreum.asset.nft.v1"

extension Coreum_Asset_Nft_V1_GenesisState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GenesisState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "params"),
    2: .standard(proto: "class_definitions"),
    3: .standard(proto: "frozen_nfts"),
    4: .standard(proto: "whitelisted_nft_accounts"),
    5: .standard(proto: "burnt_nfts"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._params) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.classDefinitions) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.frozenNfts) }()
      case 4: try { try decoder.decodeRepeatedMessageField(value: &self.whitelistedNftAccounts) }()
      case 5: try { try decoder.decodeRepeatedMessageField(value: &self.burntNfts) }()
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
    if !self.classDefinitions.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.classDefinitions, fieldNumber: 2)
    }
    if !self.frozenNfts.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.frozenNfts, fieldNumber: 3)
    }
    if !self.whitelistedNftAccounts.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.whitelistedNftAccounts, fieldNumber: 4)
    }
    if !self.burntNfts.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.burntNfts, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Coreum_Asset_Nft_V1_GenesisState, rhs: Coreum_Asset_Nft_V1_GenesisState) -> Bool {
    if lhs._params != rhs._params {return false}
    if lhs.classDefinitions != rhs.classDefinitions {return false}
    if lhs.frozenNfts != rhs.frozenNfts {return false}
    if lhs.whitelistedNftAccounts != rhs.whitelistedNftAccounts {return false}
    if lhs.burntNfts != rhs.burntNfts {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Coreum_Asset_Nft_V1_FrozenNFT: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".FrozenNFT"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "classID"),
    2: .same(proto: "nftIDs"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.classID) }()
      case 2: try { try decoder.decodeRepeatedStringField(value: &self.nftIds) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.classID.isEmpty {
      try visitor.visitSingularStringField(value: self.classID, fieldNumber: 1)
    }
    if !self.nftIds.isEmpty {
      try visitor.visitRepeatedStringField(value: self.nftIds, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Coreum_Asset_Nft_V1_FrozenNFT, rhs: Coreum_Asset_Nft_V1_FrozenNFT) -> Bool {
    if lhs.classID != rhs.classID {return false}
    if lhs.nftIds != rhs.nftIds {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Coreum_Asset_Nft_V1_WhitelistedNFTAccounts: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".WhitelistedNFTAccounts"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "classID"),
    2: .same(proto: "nftID"),
    4: .same(proto: "accounts"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.classID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.nftID) }()
      case 4: try { try decoder.decodeRepeatedStringField(value: &self.accounts) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.classID.isEmpty {
      try visitor.visitSingularStringField(value: self.classID, fieldNumber: 1)
    }
    if !self.nftID.isEmpty {
      try visitor.visitSingularStringField(value: self.nftID, fieldNumber: 2)
    }
    if !self.accounts.isEmpty {
      try visitor.visitRepeatedStringField(value: self.accounts, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Coreum_Asset_Nft_V1_WhitelistedNFTAccounts, rhs: Coreum_Asset_Nft_V1_WhitelistedNFTAccounts) -> Bool {
    if lhs.classID != rhs.classID {return false}
    if lhs.nftID != rhs.nftID {return false}
    if lhs.accounts != rhs.accounts {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Coreum_Asset_Nft_V1_BurntNFT: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".BurntNFT"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "classID"),
    2: .same(proto: "nftIDs"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.classID) }()
      case 2: try { try decoder.decodeRepeatedStringField(value: &self.nftIds) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.classID.isEmpty {
      try visitor.visitSingularStringField(value: self.classID, fieldNumber: 1)
    }
    if !self.nftIds.isEmpty {
      try visitor.visitRepeatedStringField(value: self.nftIds, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Coreum_Asset_Nft_V1_BurntNFT, rhs: Coreum_Asset_Nft_V1_BurntNFT) -> Bool {
    if lhs.classID != rhs.classID {return false}
    if lhs.nftIds != rhs.nftIds {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
