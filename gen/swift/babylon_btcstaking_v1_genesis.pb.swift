// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: babylon/btcstaking/v1/genesis.proto
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

/// GenesisState defines the btcstaking module's genesis state.
struct Babylon_Btcstaking_V1_GenesisState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// different versions of params used through the history of the chain
  var params: [Babylon_Btcstaking_V1_Params] = []

  /// finality_providers all the finality providers registered.
  var finalityProviders: [Babylon_Btcstaking_V1_FinalityProvider] = []

  /// btc_delegations all the btc delegations in the state.
  var btcDelegations: [Babylon_Btcstaking_V1_BTCDelegation] = []

  /// block_height_chains the block height of babylon and bitcoin.
  var blockHeightChains: [Babylon_Btcstaking_V1_BlockHeightBbnToBtc] = []

  /// btc_delegators contains all the btc delegators with the associated finality provider.
  var btcDelegators: [Babylon_Btcstaking_V1_BTCDelegator] = []

  /// all the events and its indexes.
  var events: [Babylon_Btcstaking_V1_EventIndex] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// BlockHeightBbnToBtc stores the btc <-> bbn block.
struct Babylon_Btcstaking_V1_BlockHeightBbnToBtc {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// block_height_bbn is the height of the block in the babylon chain.
  var blockHeightBbn: UInt64 = 0

  /// block_height_btc is the height of the block in the BTC.
  var blockHeightBtc: UInt32 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// BTCDelegator BTC delegator information with the associated finality provider.
struct Babylon_Btcstaking_V1_BTCDelegator {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// idx the btc delegator index.
  var idx: Babylon_Btcstaking_V1_BTCDelegatorDelegationIndex {
    get {return _idx ?? Babylon_Btcstaking_V1_BTCDelegatorDelegationIndex()}
    set {_idx = newValue}
  }
  /// Returns true if `idx` has been explicitly set.
  var hasIdx: Bool {return self._idx != nil}
  /// Clears the value of `idx`. Subsequent reads from it will return its default value.
  mutating func clearIdx() {self._idx = nil}

  /// fp_btc_pk the finality provider btc public key.
  var fpBtcPk: Data = Data()

  /// del_btc_pk the delegator btc public key.
  var delBtcPk: Data = Data()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _idx: Babylon_Btcstaking_V1_BTCDelegatorDelegationIndex? = nil
}

/// EventIndex contains the event and its index.
struct Babylon_Btcstaking_V1_EventIndex {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// idx is the index the event was stored.
  var idx: UInt64 = 0

  /// block_height_btc is the height of the block in the BTC chain.
  var blockHeightBtc: UInt32 = 0

  /// event the event stored.
  var event: Babylon_Btcstaking_V1_EventPowerDistUpdate {
    get {return _event ?? Babylon_Btcstaking_V1_EventPowerDistUpdate()}
    set {_event = newValue}
  }
  /// Returns true if `event` has been explicitly set.
  var hasEvent: Bool {return self._event != nil}
  /// Clears the value of `event`. Subsequent reads from it will return its default value.
  mutating func clearEvent() {self._event = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _event: Babylon_Btcstaking_V1_EventPowerDistUpdate? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Babylon_Btcstaking_V1_GenesisState: @unchecked Sendable {}
extension Babylon_Btcstaking_V1_BlockHeightBbnToBtc: @unchecked Sendable {}
extension Babylon_Btcstaking_V1_BTCDelegator: @unchecked Sendable {}
extension Babylon_Btcstaking_V1_EventIndex: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "babylon.btcstaking.v1"

extension Babylon_Btcstaking_V1_GenesisState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GenesisState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "params"),
    2: .standard(proto: "finality_providers"),
    3: .standard(proto: "btc_delegations"),
    5: .standard(proto: "block_height_chains"),
    6: .standard(proto: "btc_delegators"),
    7: .same(proto: "events"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.params) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.finalityProviders) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.btcDelegations) }()
      case 5: try { try decoder.decodeRepeatedMessageField(value: &self.blockHeightChains) }()
      case 6: try { try decoder.decodeRepeatedMessageField(value: &self.btcDelegators) }()
      case 7: try { try decoder.decodeRepeatedMessageField(value: &self.events) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.params.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.params, fieldNumber: 1)
    }
    if !self.finalityProviders.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.finalityProviders, fieldNumber: 2)
    }
    if !self.btcDelegations.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.btcDelegations, fieldNumber: 3)
    }
    if !self.blockHeightChains.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.blockHeightChains, fieldNumber: 5)
    }
    if !self.btcDelegators.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.btcDelegators, fieldNumber: 6)
    }
    if !self.events.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.events, fieldNumber: 7)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Btcstaking_V1_GenesisState, rhs: Babylon_Btcstaking_V1_GenesisState) -> Bool {
    if lhs.params != rhs.params {return false}
    if lhs.finalityProviders != rhs.finalityProviders {return false}
    if lhs.btcDelegations != rhs.btcDelegations {return false}
    if lhs.blockHeightChains != rhs.blockHeightChains {return false}
    if lhs.btcDelegators != rhs.btcDelegators {return false}
    if lhs.events != rhs.events {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Babylon_Btcstaking_V1_BlockHeightBbnToBtc: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".BlockHeightBbnToBtc"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "block_height_bbn"),
    2: .standard(proto: "block_height_btc"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.blockHeightBbn) }()
      case 2: try { try decoder.decodeSingularUInt32Field(value: &self.blockHeightBtc) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.blockHeightBbn != 0 {
      try visitor.visitSingularUInt64Field(value: self.blockHeightBbn, fieldNumber: 1)
    }
    if self.blockHeightBtc != 0 {
      try visitor.visitSingularUInt32Field(value: self.blockHeightBtc, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Btcstaking_V1_BlockHeightBbnToBtc, rhs: Babylon_Btcstaking_V1_BlockHeightBbnToBtc) -> Bool {
    if lhs.blockHeightBbn != rhs.blockHeightBbn {return false}
    if lhs.blockHeightBtc != rhs.blockHeightBtc {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Babylon_Btcstaking_V1_BTCDelegator: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".BTCDelegator"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "idx"),
    2: .standard(proto: "fp_btc_pk"),
    3: .standard(proto: "del_btc_pk"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._idx) }()
      case 2: try { try decoder.decodeSingularBytesField(value: &self.fpBtcPk) }()
      case 3: try { try decoder.decodeSingularBytesField(value: &self.delBtcPk) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._idx {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    if !self.fpBtcPk.isEmpty {
      try visitor.visitSingularBytesField(value: self.fpBtcPk, fieldNumber: 2)
    }
    if !self.delBtcPk.isEmpty {
      try visitor.visitSingularBytesField(value: self.delBtcPk, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Btcstaking_V1_BTCDelegator, rhs: Babylon_Btcstaking_V1_BTCDelegator) -> Bool {
    if lhs._idx != rhs._idx {return false}
    if lhs.fpBtcPk != rhs.fpBtcPk {return false}
    if lhs.delBtcPk != rhs.delBtcPk {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Babylon_Btcstaking_V1_EventIndex: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".EventIndex"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "idx"),
    2: .standard(proto: "block_height_btc"),
    3: .same(proto: "event"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.idx) }()
      case 2: try { try decoder.decodeSingularUInt32Field(value: &self.blockHeightBtc) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._event) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if self.idx != 0 {
      try visitor.visitSingularUInt64Field(value: self.idx, fieldNumber: 1)
    }
    if self.blockHeightBtc != 0 {
      try visitor.visitSingularUInt32Field(value: self.blockHeightBtc, fieldNumber: 2)
    }
    try { if let v = self._event {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Btcstaking_V1_EventIndex, rhs: Babylon_Btcstaking_V1_EventIndex) -> Bool {
    if lhs.idx != rhs.idx {return false}
    if lhs.blockHeightBtc != rhs.blockHeightBtc {return false}
    if lhs._event != rhs._event {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
