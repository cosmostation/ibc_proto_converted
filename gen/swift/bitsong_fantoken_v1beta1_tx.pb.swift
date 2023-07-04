// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: bitsong/fantoken/v1beta1/tx.proto
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

/// MsgIssue defines a message for issuing a new fan token
struct Bitsong_Fantoken_MsgIssue {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// symbol which corresponds to the symbol of the fan token. It is a string and cannot change for the whole life of the fan token
  var symbol: String = String()

  /// name which corresponds to the name of the fan token. It is a string and cannot change for the whole life of the fan token
  var name: String = String()

  /// max_supply that represents the maximum number of possible mintable tokens. It is an integer number, expressed in micro unit 10^6
  var maxSupply: String = String()

  /// authority which is who can set a new uri metadata
  var authority: String = String()

  /// minter who is who can mint new fantoken and disable the minter process, the minter key also pay the gas fee
  var minter: String = String()

  /// URI which is the current uri of the fan token. It is a string can change during the fan token lifecycle thanks to the MsgEdit
  var uri: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgIssueResponse defines the MsgIssue response type
struct Bitsong_Fantoken_MsgIssueResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgDisableMint defines a message for disable the mint function
struct Bitsong_Fantoken_MsgDisableMint {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var denom: String = String()

  var minter: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgDisableMintResponse defines the MsgDisableMint response type
struct Bitsong_Fantoken_MsgDisableMintResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgMint defines a message for minting a new fan token
struct Bitsong_Fantoken_MsgMint {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var recipient: String = String()

  /// coin mean the amount + denom, eg: 10000ftFADJID34MCDM
  var coin: Cosmos_Base_V1beta1_Coin {
    get {return _coin ?? Cosmos_Base_V1beta1_Coin()}
    set {_coin = newValue}
  }
  /// Returns true if `coin` has been explicitly set.
  var hasCoin: Bool {return self._coin != nil}
  /// Clears the value of `coin`. Subsequent reads from it will return its default value.
  mutating func clearCoin() {self._coin = nil}

  var minter: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _coin: Cosmos_Base_V1beta1_Coin? = nil
}

/// MsgMintResponse defines the MsgMint response type
struct Bitsong_Fantoken_MsgMintResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgBurn defines a message for burning some fan tokens
struct Bitsong_Fantoken_MsgBurn {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// coin mean the amount + denom, eg: 10000ftFADJID34MCDM
  var coin: Cosmos_Base_V1beta1_Coin {
    get {return _coin ?? Cosmos_Base_V1beta1_Coin()}
    set {_coin = newValue}
  }
  /// Returns true if `coin` has been explicitly set.
  var hasCoin: Bool {return self._coin != nil}
  /// Clears the value of `coin`. Subsequent reads from it will return its default value.
  mutating func clearCoin() {self._coin = nil}

  var sender: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _coin: Cosmos_Base_V1beta1_Coin? = nil
}

/// MsgBurnResponse defines the MsgBurn response type
struct Bitsong_Fantoken_MsgBurnResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgSetMinter defines a message for changing the fan token minter address
struct Bitsong_Fantoken_MsgSetMinter {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// denom the fan token denom
  var denom: String = String()

  /// old_minter, the actual minter
  var oldMinter: String = String()

  /// new_minter, the new fan token minter
  var newMinter: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgSetMinterResponse defines the MsgTransferAuthority response type
struct Bitsong_Fantoken_MsgSetMinterResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgSetAuthority defines a message for changing the fan token minter address
struct Bitsong_Fantoken_MsgSetAuthority {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// denom the fan token denom
  var denom: String = String()

  /// old_authority, the actual metadata authority
  var oldAuthority: String = String()

  /// new_authority, the new fan token metadata authority
  var newAuthority: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgSetAuthorityResponse defines the MsgTransferAuthority response type
struct Bitsong_Fantoken_MsgSetAuthorityResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Bitsong_Fantoken_MsgSetUri {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var authority: String = String()

  var denom: String = String()

  var uri: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Bitsong_Fantoken_MsgSetUriResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Bitsong_Fantoken_MsgIssue: @unchecked Sendable {}
extension Bitsong_Fantoken_MsgIssueResponse: @unchecked Sendable {}
extension Bitsong_Fantoken_MsgDisableMint: @unchecked Sendable {}
extension Bitsong_Fantoken_MsgDisableMintResponse: @unchecked Sendable {}
extension Bitsong_Fantoken_MsgMint: @unchecked Sendable {}
extension Bitsong_Fantoken_MsgMintResponse: @unchecked Sendable {}
extension Bitsong_Fantoken_MsgBurn: @unchecked Sendable {}
extension Bitsong_Fantoken_MsgBurnResponse: @unchecked Sendable {}
extension Bitsong_Fantoken_MsgSetMinter: @unchecked Sendable {}
extension Bitsong_Fantoken_MsgSetMinterResponse: @unchecked Sendable {}
extension Bitsong_Fantoken_MsgSetAuthority: @unchecked Sendable {}
extension Bitsong_Fantoken_MsgSetAuthorityResponse: @unchecked Sendable {}
extension Bitsong_Fantoken_MsgSetUri: @unchecked Sendable {}
extension Bitsong_Fantoken_MsgSetUriResponse: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "bitsong.fantoken"

extension Bitsong_Fantoken_MsgIssue: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgIssue"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "symbol"),
    2: .same(proto: "name"),
    3: .standard(proto: "max_supply"),
    4: .same(proto: "authority"),
    5: .same(proto: "minter"),
    6: .same(proto: "uri"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.symbol) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.name) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.maxSupply) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.authority) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.minter) }()
      case 6: try { try decoder.decodeSingularStringField(value: &self.uri) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.symbol.isEmpty {
      try visitor.visitSingularStringField(value: self.symbol, fieldNumber: 1)
    }
    if !self.name.isEmpty {
      try visitor.visitSingularStringField(value: self.name, fieldNumber: 2)
    }
    if !self.maxSupply.isEmpty {
      try visitor.visitSingularStringField(value: self.maxSupply, fieldNumber: 3)
    }
    if !self.authority.isEmpty {
      try visitor.visitSingularStringField(value: self.authority, fieldNumber: 4)
    }
    if !self.minter.isEmpty {
      try visitor.visitSingularStringField(value: self.minter, fieldNumber: 5)
    }
    if !self.uri.isEmpty {
      try visitor.visitSingularStringField(value: self.uri, fieldNumber: 6)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Bitsong_Fantoken_MsgIssue, rhs: Bitsong_Fantoken_MsgIssue) -> Bool {
    if lhs.symbol != rhs.symbol {return false}
    if lhs.name != rhs.name {return false}
    if lhs.maxSupply != rhs.maxSupply {return false}
    if lhs.authority != rhs.authority {return false}
    if lhs.minter != rhs.minter {return false}
    if lhs.uri != rhs.uri {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Bitsong_Fantoken_MsgIssueResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgIssueResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Bitsong_Fantoken_MsgIssueResponse, rhs: Bitsong_Fantoken_MsgIssueResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Bitsong_Fantoken_MsgDisableMint: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgDisableMint"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "denom"),
    2: .same(proto: "minter"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.denom) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.minter) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.denom.isEmpty {
      try visitor.visitSingularStringField(value: self.denom, fieldNumber: 1)
    }
    if !self.minter.isEmpty {
      try visitor.visitSingularStringField(value: self.minter, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Bitsong_Fantoken_MsgDisableMint, rhs: Bitsong_Fantoken_MsgDisableMint) -> Bool {
    if lhs.denom != rhs.denom {return false}
    if lhs.minter != rhs.minter {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Bitsong_Fantoken_MsgDisableMintResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgDisableMintResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Bitsong_Fantoken_MsgDisableMintResponse, rhs: Bitsong_Fantoken_MsgDisableMintResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Bitsong_Fantoken_MsgMint: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgMint"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "recipient"),
    2: .same(proto: "coin"),
    3: .same(proto: "minter"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.recipient) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._coin) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.minter) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.recipient.isEmpty {
      try visitor.visitSingularStringField(value: self.recipient, fieldNumber: 1)
    }
    try { if let v = self._coin {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    if !self.minter.isEmpty {
      try visitor.visitSingularStringField(value: self.minter, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Bitsong_Fantoken_MsgMint, rhs: Bitsong_Fantoken_MsgMint) -> Bool {
    if lhs.recipient != rhs.recipient {return false}
    if lhs._coin != rhs._coin {return false}
    if lhs.minter != rhs.minter {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Bitsong_Fantoken_MsgMintResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgMintResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Bitsong_Fantoken_MsgMintResponse, rhs: Bitsong_Fantoken_MsgMintResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Bitsong_Fantoken_MsgBurn: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgBurn"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "coin"),
    2: .same(proto: "sender"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._coin) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.sender) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._coin {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    if !self.sender.isEmpty {
      try visitor.visitSingularStringField(value: self.sender, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Bitsong_Fantoken_MsgBurn, rhs: Bitsong_Fantoken_MsgBurn) -> Bool {
    if lhs._coin != rhs._coin {return false}
    if lhs.sender != rhs.sender {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Bitsong_Fantoken_MsgBurnResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgBurnResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Bitsong_Fantoken_MsgBurnResponse, rhs: Bitsong_Fantoken_MsgBurnResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Bitsong_Fantoken_MsgSetMinter: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgSetMinter"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "denom"),
    2: .standard(proto: "old_minter"),
    3: .standard(proto: "new_minter"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.denom) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.oldMinter) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.newMinter) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.denom.isEmpty {
      try visitor.visitSingularStringField(value: self.denom, fieldNumber: 1)
    }
    if !self.oldMinter.isEmpty {
      try visitor.visitSingularStringField(value: self.oldMinter, fieldNumber: 2)
    }
    if !self.newMinter.isEmpty {
      try visitor.visitSingularStringField(value: self.newMinter, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Bitsong_Fantoken_MsgSetMinter, rhs: Bitsong_Fantoken_MsgSetMinter) -> Bool {
    if lhs.denom != rhs.denom {return false}
    if lhs.oldMinter != rhs.oldMinter {return false}
    if lhs.newMinter != rhs.newMinter {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Bitsong_Fantoken_MsgSetMinterResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgSetMinterResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Bitsong_Fantoken_MsgSetMinterResponse, rhs: Bitsong_Fantoken_MsgSetMinterResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Bitsong_Fantoken_MsgSetAuthority: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgSetAuthority"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "denom"),
    2: .standard(proto: "old_authority"),
    3: .standard(proto: "new_authority"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.denom) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.oldAuthority) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.newAuthority) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.denom.isEmpty {
      try visitor.visitSingularStringField(value: self.denom, fieldNumber: 1)
    }
    if !self.oldAuthority.isEmpty {
      try visitor.visitSingularStringField(value: self.oldAuthority, fieldNumber: 2)
    }
    if !self.newAuthority.isEmpty {
      try visitor.visitSingularStringField(value: self.newAuthority, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Bitsong_Fantoken_MsgSetAuthority, rhs: Bitsong_Fantoken_MsgSetAuthority) -> Bool {
    if lhs.denom != rhs.denom {return false}
    if lhs.oldAuthority != rhs.oldAuthority {return false}
    if lhs.newAuthority != rhs.newAuthority {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Bitsong_Fantoken_MsgSetAuthorityResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgSetAuthorityResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Bitsong_Fantoken_MsgSetAuthorityResponse, rhs: Bitsong_Fantoken_MsgSetAuthorityResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Bitsong_Fantoken_MsgSetUri: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgSetUri"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "authority"),
    2: .same(proto: "denom"),
    3: .same(proto: "uri"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.authority) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.denom) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.uri) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.authority.isEmpty {
      try visitor.visitSingularStringField(value: self.authority, fieldNumber: 1)
    }
    if !self.denom.isEmpty {
      try visitor.visitSingularStringField(value: self.denom, fieldNumber: 2)
    }
    if !self.uri.isEmpty {
      try visitor.visitSingularStringField(value: self.uri, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Bitsong_Fantoken_MsgSetUri, rhs: Bitsong_Fantoken_MsgSetUri) -> Bool {
    if lhs.authority != rhs.authority {return false}
    if lhs.denom != rhs.denom {return false}
    if lhs.uri != rhs.uri {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Bitsong_Fantoken_MsgSetUriResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgSetUriResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Bitsong_Fantoken_MsgSetUriResponse, rhs: Bitsong_Fantoken_MsgSetUriResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}