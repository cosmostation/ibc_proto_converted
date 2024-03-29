// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: stafihub/ledger/proposal.proto
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

struct Stafihub_Stafihub_Ledger_SetChainEraProposal {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var proposer: String = String()

  var denom: String = String()

  var era: UInt32 = 0

  var propID: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Ledger_BondReportProposal {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var proposer: String = String()

  var denom: String = String()

  var shotID: String = String()

  var action: Stafihub_Stafihub_Ledger_BondAction = .bondOnly

  var propID: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Ledger_ActiveReportProposal {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var proposer: String = String()

  var denom: String = String()

  var shotID: String = String()

  var staked: String = String()

  var unstaked: String = String()

  var propID: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Ledger_TransferReportProposal {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var proposer: String = String()

  var denom: String = String()

  var shotID: String = String()

  var propID: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Ledger_ExecuteBondProposal {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var proposer: String = String()

  var denom: String = String()

  var bonder: String = String()

  var pool: String = String()

  var txhash: String = String()

  var amount: String = String()

  var propID: String = String()

  var state: Stafihub_Stafihub_Ledger_LiquidityBondState = .verifyOk

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Ledger_InterchainTxProposal {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var proposer: String = String()

  var denom: String = String()

  var poolAddress: String = String()

  var era: UInt32 = 0

  var txType: Stafihub_Stafihub_Ledger_OriginalTxType = .dealEraupdated

  var factor: UInt32 = 0

  var msgs: [SwiftProtobuf.Google_Protobuf_Any] = []

  var propID: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Stafihub_Stafihub_Ledger_SetChainEraProposal: @unchecked Sendable {}
extension Stafihub_Stafihub_Ledger_BondReportProposal: @unchecked Sendable {}
extension Stafihub_Stafihub_Ledger_ActiveReportProposal: @unchecked Sendable {}
extension Stafihub_Stafihub_Ledger_TransferReportProposal: @unchecked Sendable {}
extension Stafihub_Stafihub_Ledger_ExecuteBondProposal: @unchecked Sendable {}
extension Stafihub_Stafihub_Ledger_InterchainTxProposal: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "stafihub.stafihub.ledger"

extension Stafihub_Stafihub_Ledger_SetChainEraProposal: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".SetChainEraProposal"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "proposer"),
    2: .same(proto: "denom"),
    3: .same(proto: "era"),
    4: .same(proto: "propId"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.proposer) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.denom) }()
      case 3: try { try decoder.decodeSingularUInt32Field(value: &self.era) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.propID) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.proposer.isEmpty {
      try visitor.visitSingularStringField(value: self.proposer, fieldNumber: 1)
    }
    if !self.denom.isEmpty {
      try visitor.visitSingularStringField(value: self.denom, fieldNumber: 2)
    }
    if self.era != 0 {
      try visitor.visitSingularUInt32Field(value: self.era, fieldNumber: 3)
    }
    if !self.propID.isEmpty {
      try visitor.visitSingularStringField(value: self.propID, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Ledger_SetChainEraProposal, rhs: Stafihub_Stafihub_Ledger_SetChainEraProposal) -> Bool {
    if lhs.proposer != rhs.proposer {return false}
    if lhs.denom != rhs.denom {return false}
    if lhs.era != rhs.era {return false}
    if lhs.propID != rhs.propID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Ledger_BondReportProposal: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".BondReportProposal"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "proposer"),
    2: .same(proto: "denom"),
    3: .same(proto: "shotId"),
    4: .same(proto: "action"),
    5: .same(proto: "propId"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.proposer) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.denom) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.shotID) }()
      case 4: try { try decoder.decodeSingularEnumField(value: &self.action) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.propID) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.proposer.isEmpty {
      try visitor.visitSingularStringField(value: self.proposer, fieldNumber: 1)
    }
    if !self.denom.isEmpty {
      try visitor.visitSingularStringField(value: self.denom, fieldNumber: 2)
    }
    if !self.shotID.isEmpty {
      try visitor.visitSingularStringField(value: self.shotID, fieldNumber: 3)
    }
    if self.action != .bondOnly {
      try visitor.visitSingularEnumField(value: self.action, fieldNumber: 4)
    }
    if !self.propID.isEmpty {
      try visitor.visitSingularStringField(value: self.propID, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Ledger_BondReportProposal, rhs: Stafihub_Stafihub_Ledger_BondReportProposal) -> Bool {
    if lhs.proposer != rhs.proposer {return false}
    if lhs.denom != rhs.denom {return false}
    if lhs.shotID != rhs.shotID {return false}
    if lhs.action != rhs.action {return false}
    if lhs.propID != rhs.propID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Ledger_ActiveReportProposal: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ActiveReportProposal"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "proposer"),
    2: .same(proto: "denom"),
    3: .same(proto: "shotId"),
    4: .same(proto: "staked"),
    5: .same(proto: "unstaked"),
    6: .same(proto: "propId"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.proposer) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.denom) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.shotID) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.staked) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.unstaked) }()
      case 6: try { try decoder.decodeSingularStringField(value: &self.propID) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.proposer.isEmpty {
      try visitor.visitSingularStringField(value: self.proposer, fieldNumber: 1)
    }
    if !self.denom.isEmpty {
      try visitor.visitSingularStringField(value: self.denom, fieldNumber: 2)
    }
    if !self.shotID.isEmpty {
      try visitor.visitSingularStringField(value: self.shotID, fieldNumber: 3)
    }
    if !self.staked.isEmpty {
      try visitor.visitSingularStringField(value: self.staked, fieldNumber: 4)
    }
    if !self.unstaked.isEmpty {
      try visitor.visitSingularStringField(value: self.unstaked, fieldNumber: 5)
    }
    if !self.propID.isEmpty {
      try visitor.visitSingularStringField(value: self.propID, fieldNumber: 6)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Ledger_ActiveReportProposal, rhs: Stafihub_Stafihub_Ledger_ActiveReportProposal) -> Bool {
    if lhs.proposer != rhs.proposer {return false}
    if lhs.denom != rhs.denom {return false}
    if lhs.shotID != rhs.shotID {return false}
    if lhs.staked != rhs.staked {return false}
    if lhs.unstaked != rhs.unstaked {return false}
    if lhs.propID != rhs.propID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Ledger_TransferReportProposal: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".TransferReportProposal"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "proposer"),
    2: .same(proto: "denom"),
    3: .same(proto: "shotId"),
    4: .same(proto: "propId"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.proposer) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.denom) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.shotID) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.propID) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.proposer.isEmpty {
      try visitor.visitSingularStringField(value: self.proposer, fieldNumber: 1)
    }
    if !self.denom.isEmpty {
      try visitor.visitSingularStringField(value: self.denom, fieldNumber: 2)
    }
    if !self.shotID.isEmpty {
      try visitor.visitSingularStringField(value: self.shotID, fieldNumber: 3)
    }
    if !self.propID.isEmpty {
      try visitor.visitSingularStringField(value: self.propID, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Ledger_TransferReportProposal, rhs: Stafihub_Stafihub_Ledger_TransferReportProposal) -> Bool {
    if lhs.proposer != rhs.proposer {return false}
    if lhs.denom != rhs.denom {return false}
    if lhs.shotID != rhs.shotID {return false}
    if lhs.propID != rhs.propID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Ledger_ExecuteBondProposal: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ExecuteBondProposal"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "proposer"),
    2: .same(proto: "denom"),
    3: .same(proto: "bonder"),
    4: .same(proto: "pool"),
    5: .same(proto: "txhash"),
    6: .same(proto: "amount"),
    7: .same(proto: "propId"),
    8: .same(proto: "state"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.proposer) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.denom) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.bonder) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.pool) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.txhash) }()
      case 6: try { try decoder.decodeSingularStringField(value: &self.amount) }()
      case 7: try { try decoder.decodeSingularStringField(value: &self.propID) }()
      case 8: try { try decoder.decodeSingularEnumField(value: &self.state) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.proposer.isEmpty {
      try visitor.visitSingularStringField(value: self.proposer, fieldNumber: 1)
    }
    if !self.denom.isEmpty {
      try visitor.visitSingularStringField(value: self.denom, fieldNumber: 2)
    }
    if !self.bonder.isEmpty {
      try visitor.visitSingularStringField(value: self.bonder, fieldNumber: 3)
    }
    if !self.pool.isEmpty {
      try visitor.visitSingularStringField(value: self.pool, fieldNumber: 4)
    }
    if !self.txhash.isEmpty {
      try visitor.visitSingularStringField(value: self.txhash, fieldNumber: 5)
    }
    if !self.amount.isEmpty {
      try visitor.visitSingularStringField(value: self.amount, fieldNumber: 6)
    }
    if !self.propID.isEmpty {
      try visitor.visitSingularStringField(value: self.propID, fieldNumber: 7)
    }
    if self.state != .verifyOk {
      try visitor.visitSingularEnumField(value: self.state, fieldNumber: 8)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Ledger_ExecuteBondProposal, rhs: Stafihub_Stafihub_Ledger_ExecuteBondProposal) -> Bool {
    if lhs.proposer != rhs.proposer {return false}
    if lhs.denom != rhs.denom {return false}
    if lhs.bonder != rhs.bonder {return false}
    if lhs.pool != rhs.pool {return false}
    if lhs.txhash != rhs.txhash {return false}
    if lhs.amount != rhs.amount {return false}
    if lhs.propID != rhs.propID {return false}
    if lhs.state != rhs.state {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Ledger_InterchainTxProposal: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".InterchainTxProposal"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "proposer"),
    2: .same(proto: "denom"),
    3: .same(proto: "poolAddress"),
    4: .same(proto: "era"),
    5: .same(proto: "txType"),
    6: .same(proto: "factor"),
    7: .same(proto: "msgs"),
    8: .same(proto: "propId"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.proposer) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.denom) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.poolAddress) }()
      case 4: try { try decoder.decodeSingularUInt32Field(value: &self.era) }()
      case 5: try { try decoder.decodeSingularEnumField(value: &self.txType) }()
      case 6: try { try decoder.decodeSingularUInt32Field(value: &self.factor) }()
      case 7: try { try decoder.decodeRepeatedMessageField(value: &self.msgs) }()
      case 8: try { try decoder.decodeSingularStringField(value: &self.propID) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.proposer.isEmpty {
      try visitor.visitSingularStringField(value: self.proposer, fieldNumber: 1)
    }
    if !self.denom.isEmpty {
      try visitor.visitSingularStringField(value: self.denom, fieldNumber: 2)
    }
    if !self.poolAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.poolAddress, fieldNumber: 3)
    }
    if self.era != 0 {
      try visitor.visitSingularUInt32Field(value: self.era, fieldNumber: 4)
    }
    if self.txType != .dealEraupdated {
      try visitor.visitSingularEnumField(value: self.txType, fieldNumber: 5)
    }
    if self.factor != 0 {
      try visitor.visitSingularUInt32Field(value: self.factor, fieldNumber: 6)
    }
    if !self.msgs.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.msgs, fieldNumber: 7)
    }
    if !self.propID.isEmpty {
      try visitor.visitSingularStringField(value: self.propID, fieldNumber: 8)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Ledger_InterchainTxProposal, rhs: Stafihub_Stafihub_Ledger_InterchainTxProposal) -> Bool {
    if lhs.proposer != rhs.proposer {return false}
    if lhs.denom != rhs.denom {return false}
    if lhs.poolAddress != rhs.poolAddress {return false}
    if lhs.era != rhs.era {return false}
    if lhs.txType != rhs.txType {return false}
    if lhs.factor != rhs.factor {return false}
    if lhs.msgs != rhs.msgs {return false}
    if lhs.propID != rhs.propID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
