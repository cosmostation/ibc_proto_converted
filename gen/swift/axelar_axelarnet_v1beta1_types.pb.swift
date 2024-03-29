// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: axelar/axelarnet/v1beta1/types.proto
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

struct Axelar_Axelarnet_V1beta1_IBCTransfer {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var sender: Data = Data()

  var receiver: String = String()

  var token: Cosmos_Base_V1beta1_Coin {
    get {return _token ?? Cosmos_Base_V1beta1_Coin()}
    set {_token = newValue}
  }
  /// Returns true if `token` has been explicitly set.
  var hasToken: Bool {return self._token != nil}
  /// Clears the value of `token`. Subsequent reads from it will return its default value.
  mutating func clearToken() {self._token = nil}

  var portID: String = String()

  var channelID: String = String()

  var sequence: UInt64 = 0

  var id: UInt64 = 0

  var status: Axelar_Axelarnet_V1beta1_IBCTransfer.Status = .unspecified

  var unknownFields = SwiftProtobuf.UnknownStorage()

  enum Status: SwiftProtobuf.Enum {
    typealias RawValue = Int
    case unspecified // = 0
    case pending // = 1
    case completed // = 2
    case failed // = 3
    case UNRECOGNIZED(Int)

    init() {
      self = .unspecified
    }

    init?(rawValue: Int) {
      switch rawValue {
      case 0: self = .unspecified
      case 1: self = .pending
      case 2: self = .completed
      case 3: self = .failed
      default: self = .UNRECOGNIZED(rawValue)
      }
    }

    var rawValue: Int {
      switch self {
      case .unspecified: return 0
      case .pending: return 1
      case .completed: return 2
      case .failed: return 3
      case .UNRECOGNIZED(let i): return i
      }
    }

  }

  init() {}

  fileprivate var _token: Cosmos_Base_V1beta1_Coin? = nil
}

#if swift(>=4.2)

extension Axelar_Axelarnet_V1beta1_IBCTransfer.Status: CaseIterable {
  // The compiler won't synthesize support with the UNRECOGNIZED case.
  static var allCases: [Axelar_Axelarnet_V1beta1_IBCTransfer.Status] = [
    .unspecified,
    .pending,
    .completed,
    .failed,
  ]
}

#endif  // swift(>=4.2)

struct Axelar_Axelarnet_V1beta1_CosmosChain {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var name: String = String()

  var ibcPath: String = String()

  var assets: [Axelar_Axelarnet_V1beta1_Asset] = []

  var addrPrefix: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Axelar_Axelarnet_V1beta1_Asset {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var denom: String = String()

  var minAmount: Data = Data()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Axelar_Axelarnet_V1beta1_Fee {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var amount: Cosmos_Base_V1beta1_Coin {
    get {return _amount ?? Cosmos_Base_V1beta1_Coin()}
    set {_amount = newValue}
  }
  /// Returns true if `amount` has been explicitly set.
  var hasAmount: Bool {return self._amount != nil}
  /// Clears the value of `amount`. Subsequent reads from it will return its default value.
  mutating func clearAmount() {self._amount = nil}

  var recipient: Data = Data()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _amount: Cosmos_Base_V1beta1_Coin? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Axelar_Axelarnet_V1beta1_IBCTransfer: @unchecked Sendable {}
extension Axelar_Axelarnet_V1beta1_IBCTransfer.Status: @unchecked Sendable {}
extension Axelar_Axelarnet_V1beta1_CosmosChain: @unchecked Sendable {}
extension Axelar_Axelarnet_V1beta1_Asset: @unchecked Sendable {}
extension Axelar_Axelarnet_V1beta1_Fee: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "axelar.axelarnet.v1beta1"

extension Axelar_Axelarnet_V1beta1_IBCTransfer: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".IBCTransfer"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "sender"),
    2: .same(proto: "receiver"),
    3: .same(proto: "token"),
    4: .standard(proto: "port_id"),
    5: .standard(proto: "channel_id"),
    6: .same(proto: "sequence"),
    7: .same(proto: "id"),
    8: .same(proto: "status"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBytesField(value: &self.sender) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.receiver) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._token) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.portID) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.channelID) }()
      case 6: try { try decoder.decodeSingularUInt64Field(value: &self.sequence) }()
      case 7: try { try decoder.decodeSingularUInt64Field(value: &self.id) }()
      case 8: try { try decoder.decodeSingularEnumField(value: &self.status) }()
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
      try visitor.visitSingularBytesField(value: self.sender, fieldNumber: 1)
    }
    if !self.receiver.isEmpty {
      try visitor.visitSingularStringField(value: self.receiver, fieldNumber: 2)
    }
    try { if let v = self._token {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    if !self.portID.isEmpty {
      try visitor.visitSingularStringField(value: self.portID, fieldNumber: 4)
    }
    if !self.channelID.isEmpty {
      try visitor.visitSingularStringField(value: self.channelID, fieldNumber: 5)
    }
    if self.sequence != 0 {
      try visitor.visitSingularUInt64Field(value: self.sequence, fieldNumber: 6)
    }
    if self.id != 0 {
      try visitor.visitSingularUInt64Field(value: self.id, fieldNumber: 7)
    }
    if self.status != .unspecified {
      try visitor.visitSingularEnumField(value: self.status, fieldNumber: 8)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Axelar_Axelarnet_V1beta1_IBCTransfer, rhs: Axelar_Axelarnet_V1beta1_IBCTransfer) -> Bool {
    if lhs.sender != rhs.sender {return false}
    if lhs.receiver != rhs.receiver {return false}
    if lhs._token != rhs._token {return false}
    if lhs.portID != rhs.portID {return false}
    if lhs.channelID != rhs.channelID {return false}
    if lhs.sequence != rhs.sequence {return false}
    if lhs.id != rhs.id {return false}
    if lhs.status != rhs.status {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Axelar_Axelarnet_V1beta1_IBCTransfer.Status: SwiftProtobuf._ProtoNameProviding {
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    0: .same(proto: "STATUS_UNSPECIFIED"),
    1: .same(proto: "STATUS_PENDING"),
    2: .same(proto: "STATUS_COMPLETED"),
    3: .same(proto: "STATUS_FAILED"),
  ]
}

extension Axelar_Axelarnet_V1beta1_CosmosChain: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".CosmosChain"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "name"),
    2: .standard(proto: "ibc_path"),
    3: .same(proto: "assets"),
    4: .standard(proto: "addr_prefix"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.name) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.ibcPath) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.assets) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.addrPrefix) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.name.isEmpty {
      try visitor.visitSingularStringField(value: self.name, fieldNumber: 1)
    }
    if !self.ibcPath.isEmpty {
      try visitor.visitSingularStringField(value: self.ibcPath, fieldNumber: 2)
    }
    if !self.assets.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.assets, fieldNumber: 3)
    }
    if !self.addrPrefix.isEmpty {
      try visitor.visitSingularStringField(value: self.addrPrefix, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Axelar_Axelarnet_V1beta1_CosmosChain, rhs: Axelar_Axelarnet_V1beta1_CosmosChain) -> Bool {
    if lhs.name != rhs.name {return false}
    if lhs.ibcPath != rhs.ibcPath {return false}
    if lhs.assets != rhs.assets {return false}
    if lhs.addrPrefix != rhs.addrPrefix {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Axelar_Axelarnet_V1beta1_Asset: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Asset"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "denom"),
    2: .standard(proto: "min_amount"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.denom) }()
      case 2: try { try decoder.decodeSingularBytesField(value: &self.minAmount) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.denom.isEmpty {
      try visitor.visitSingularStringField(value: self.denom, fieldNumber: 1)
    }
    if !self.minAmount.isEmpty {
      try visitor.visitSingularBytesField(value: self.minAmount, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Axelar_Axelarnet_V1beta1_Asset, rhs: Axelar_Axelarnet_V1beta1_Asset) -> Bool {
    if lhs.denom != rhs.denom {return false}
    if lhs.minAmount != rhs.minAmount {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Axelar_Axelarnet_V1beta1_Fee: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Fee"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "amount"),
    2: .same(proto: "recipient"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._amount) }()
      case 2: try { try decoder.decodeSingularBytesField(value: &self.recipient) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._amount {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    if !self.recipient.isEmpty {
      try visitor.visitSingularBytesField(value: self.recipient, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Axelar_Axelarnet_V1beta1_Fee, rhs: Axelar_Axelarnet_V1beta1_Fee) -> Bool {
    if lhs._amount != rhs._amount {return false}
    if lhs.recipient != rhs.recipient {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
