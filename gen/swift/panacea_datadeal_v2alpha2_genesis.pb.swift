// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: panacea/datadeal/v2alpha2/genesis.proto
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

/// GenesisState defines the datadeal module's genesis state.
struct Panacea_Datadeal_V2alpha2_GenesisState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var deals: [Panacea_Datadeal_V2alpha2_Deal] = []

  var nextDealNumber: UInt64 = 0

  var dataSales: [Panacea_Datadeal_V2alpha2_DataSale] = []

  var dataVerificationVotes: [Panacea_Datadeal_V2alpha2_DataVerificationVote] = []

  var dataDeliveryVotes: [Panacea_Datadeal_V2alpha2_DataDeliveryVote] = []

  var dataVerificationQueueElements: [Panacea_Datadeal_V2alpha2_DataVerificationQueueElement] = []

  var dataDeliveryQueueElements: [Panacea_Datadeal_V2alpha2_DataDeliveryQueueElement] = []

  var dealQueueElements: [Panacea_Datadeal_V2alpha2_DealQueueElement] = []

  var params: Panacea_Datadeal_V2alpha2_Params {
    get {return _params ?? Panacea_Datadeal_V2alpha2_Params()}
    set {_params = newValue}
  }
  /// Returns true if `params` has been explicitly set.
  var hasParams: Bool {return self._params != nil}
  /// Clears the value of `params`. Subsequent reads from it will return its default value.
  mutating func clearParams() {self._params = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _params: Panacea_Datadeal_V2alpha2_Params? = nil
}

/// Params defines the datadeal module's params.
struct Panacea_Datadeal_V2alpha2_Params {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var dealDeactivationParam: Int64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// DataVerificationQueue defines a data verification queue.
struct Panacea_Datadeal_V2alpha2_DataVerificationQueueElement {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var dataHash: String = String()

  var dealID: UInt64 = 0

  var votingEndTime: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _votingEndTime ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_votingEndTime = newValue}
  }
  /// Returns true if `votingEndTime` has been explicitly set.
  var hasVotingEndTime: Bool {return self._votingEndTime != nil}
  /// Clears the value of `votingEndTime`. Subsequent reads from it will return its default value.
  mutating func clearVotingEndTime() {self._votingEndTime = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _votingEndTime: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
}

/// DataDeliveryQueue defines a data delivery queue.
struct Panacea_Datadeal_V2alpha2_DataDeliveryQueueElement {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var dataHash: String = String()

  var dealID: UInt64 = 0

  var votingEndTime: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _votingEndTime ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_votingEndTime = newValue}
  }
  /// Returns true if `votingEndTime` has been explicitly set.
  var hasVotingEndTime: Bool {return self._votingEndTime != nil}
  /// Clears the value of `votingEndTime`. Subsequent reads from it will return its default value.
  mutating func clearVotingEndTime() {self._votingEndTime = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _votingEndTime: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
}

/// DealQueue defines a deal queue.
struct Panacea_Datadeal_V2alpha2_DealQueueElement {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var dealID: UInt64 = 0

  var deactivationHeight: Int64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Panacea_Datadeal_V2alpha2_GenesisState: @unchecked Sendable {}
extension Panacea_Datadeal_V2alpha2_Params: @unchecked Sendable {}
extension Panacea_Datadeal_V2alpha2_DataVerificationQueueElement: @unchecked Sendable {}
extension Panacea_Datadeal_V2alpha2_DataDeliveryQueueElement: @unchecked Sendable {}
extension Panacea_Datadeal_V2alpha2_DealQueueElement: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "panacea.datadeal.v2alpha2"

extension Panacea_Datadeal_V2alpha2_GenesisState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GenesisState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "deals"),
    2: .standard(proto: "next_deal_number"),
    3: .standard(proto: "data_sales"),
    4: .standard(proto: "data_verification_votes"),
    5: .standard(proto: "data_delivery_votes"),
    6: .standard(proto: "data_verification_queue_elements"),
    7: .standard(proto: "data_delivery_queue_elements"),
    8: .standard(proto: "deal_queue_elements"),
    9: .same(proto: "params"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.deals) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.nextDealNumber) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.dataSales) }()
      case 4: try { try decoder.decodeRepeatedMessageField(value: &self.dataVerificationVotes) }()
      case 5: try { try decoder.decodeRepeatedMessageField(value: &self.dataDeliveryVotes) }()
      case 6: try { try decoder.decodeRepeatedMessageField(value: &self.dataVerificationQueueElements) }()
      case 7: try { try decoder.decodeRepeatedMessageField(value: &self.dataDeliveryQueueElements) }()
      case 8: try { try decoder.decodeRepeatedMessageField(value: &self.dealQueueElements) }()
      case 9: try { try decoder.decodeSingularMessageField(value: &self._params) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.deals.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.deals, fieldNumber: 1)
    }
    if self.nextDealNumber != 0 {
      try visitor.visitSingularUInt64Field(value: self.nextDealNumber, fieldNumber: 2)
    }
    if !self.dataSales.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.dataSales, fieldNumber: 3)
    }
    if !self.dataVerificationVotes.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.dataVerificationVotes, fieldNumber: 4)
    }
    if !self.dataDeliveryVotes.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.dataDeliveryVotes, fieldNumber: 5)
    }
    if !self.dataVerificationQueueElements.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.dataVerificationQueueElements, fieldNumber: 6)
    }
    if !self.dataDeliveryQueueElements.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.dataDeliveryQueueElements, fieldNumber: 7)
    }
    if !self.dealQueueElements.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.dealQueueElements, fieldNumber: 8)
    }
    try { if let v = self._params {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 9)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Panacea_Datadeal_V2alpha2_GenesisState, rhs: Panacea_Datadeal_V2alpha2_GenesisState) -> Bool {
    if lhs.deals != rhs.deals {return false}
    if lhs.nextDealNumber != rhs.nextDealNumber {return false}
    if lhs.dataSales != rhs.dataSales {return false}
    if lhs.dataVerificationVotes != rhs.dataVerificationVotes {return false}
    if lhs.dataDeliveryVotes != rhs.dataDeliveryVotes {return false}
    if lhs.dataVerificationQueueElements != rhs.dataVerificationQueueElements {return false}
    if lhs.dataDeliveryQueueElements != rhs.dataDeliveryQueueElements {return false}
    if lhs.dealQueueElements != rhs.dealQueueElements {return false}
    if lhs._params != rhs._params {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Panacea_Datadeal_V2alpha2_Params: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Params"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "deal_deactivation_param"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularInt64Field(value: &self.dealDeactivationParam) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.dealDeactivationParam != 0 {
      try visitor.visitSingularInt64Field(value: self.dealDeactivationParam, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Panacea_Datadeal_V2alpha2_Params, rhs: Panacea_Datadeal_V2alpha2_Params) -> Bool {
    if lhs.dealDeactivationParam != rhs.dealDeactivationParam {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Panacea_Datadeal_V2alpha2_DataVerificationQueueElement: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".DataVerificationQueueElement"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "data_hash"),
    2: .standard(proto: "deal_id"),
    3: .standard(proto: "voting_end_time"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.dataHash) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.dealID) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._votingEndTime) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.dataHash.isEmpty {
      try visitor.visitSingularStringField(value: self.dataHash, fieldNumber: 1)
    }
    if self.dealID != 0 {
      try visitor.visitSingularUInt64Field(value: self.dealID, fieldNumber: 2)
    }
    try { if let v = self._votingEndTime {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Panacea_Datadeal_V2alpha2_DataVerificationQueueElement, rhs: Panacea_Datadeal_V2alpha2_DataVerificationQueueElement) -> Bool {
    if lhs.dataHash != rhs.dataHash {return false}
    if lhs.dealID != rhs.dealID {return false}
    if lhs._votingEndTime != rhs._votingEndTime {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Panacea_Datadeal_V2alpha2_DataDeliveryQueueElement: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".DataDeliveryQueueElement"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "data_hash"),
    2: .standard(proto: "deal_id"),
    3: .standard(proto: "voting_end_time"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.dataHash) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.dealID) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._votingEndTime) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.dataHash.isEmpty {
      try visitor.visitSingularStringField(value: self.dataHash, fieldNumber: 1)
    }
    if self.dealID != 0 {
      try visitor.visitSingularUInt64Field(value: self.dealID, fieldNumber: 2)
    }
    try { if let v = self._votingEndTime {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Panacea_Datadeal_V2alpha2_DataDeliveryQueueElement, rhs: Panacea_Datadeal_V2alpha2_DataDeliveryQueueElement) -> Bool {
    if lhs.dataHash != rhs.dataHash {return false}
    if lhs.dealID != rhs.dealID {return false}
    if lhs._votingEndTime != rhs._votingEndTime {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Panacea_Datadeal_V2alpha2_DealQueueElement: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".DealQueueElement"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "deal_id"),
    2: .standard(proto: "deactivation_height"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.dealID) }()
      case 2: try { try decoder.decodeSingularInt64Field(value: &self.deactivationHeight) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.dealID != 0 {
      try visitor.visitSingularUInt64Field(value: self.dealID, fieldNumber: 1)
    }
    if self.deactivationHeight != 0 {
      try visitor.visitSingularInt64Field(value: self.deactivationHeight, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Panacea_Datadeal_V2alpha2_DealQueueElement, rhs: Panacea_Datadeal_V2alpha2_DealQueueElement) -> Bool {
    if lhs.dealID != rhs.dealID {return false}
    if lhs.deactivationHeight != rhs.deactivationHeight {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
