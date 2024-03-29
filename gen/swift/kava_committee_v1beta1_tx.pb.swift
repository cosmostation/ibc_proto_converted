// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: kava/committee/v1beta1/tx.proto
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

/// MsgSubmitProposal is used by committee members to create a new proposal that they can vote on.
struct Kava_Committee_V1beta1_MsgSubmitProposal {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var pubProposal: SwiftProtobuf.Google_Protobuf_Any {
    get {return _pubProposal ?? SwiftProtobuf.Google_Protobuf_Any()}
    set {_pubProposal = newValue}
  }
  /// Returns true if `pubProposal` has been explicitly set.
  var hasPubProposal: Bool {return self._pubProposal != nil}
  /// Clears the value of `pubProposal`. Subsequent reads from it will return its default value.
  mutating func clearPubProposal() {self._pubProposal = nil}

  var proposer: String = String()

  var committeeID: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _pubProposal: SwiftProtobuf.Google_Protobuf_Any? = nil
}

/// MsgSubmitProposalResponse defines the SubmitProposal response type
struct Kava_Committee_V1beta1_MsgSubmitProposalResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var proposalID: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgVote is submitted by committee members to vote on proposals.
struct Kava_Committee_V1beta1_MsgVote {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var proposalID: UInt64 = 0

  var voter: String = String()

  var voteType: Kava_Committee_V1beta1_VoteType = .unspecified

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgVoteResponse defines the Vote response type
struct Kava_Committee_V1beta1_MsgVoteResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Kava_Committee_V1beta1_MsgSubmitProposal: @unchecked Sendable {}
extension Kava_Committee_V1beta1_MsgSubmitProposalResponse: @unchecked Sendable {}
extension Kava_Committee_V1beta1_MsgVote: @unchecked Sendable {}
extension Kava_Committee_V1beta1_MsgVoteResponse: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "kava.committee.v1beta1"

extension Kava_Committee_V1beta1_MsgSubmitProposal: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgSubmitProposal"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "pub_proposal"),
    2: .same(proto: "proposer"),
    3: .standard(proto: "committee_id"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._pubProposal) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.proposer) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.committeeID) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._pubProposal {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    if !self.proposer.isEmpty {
      try visitor.visitSingularStringField(value: self.proposer, fieldNumber: 2)
    }
    if self.committeeID != 0 {
      try visitor.visitSingularUInt64Field(value: self.committeeID, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kava_Committee_V1beta1_MsgSubmitProposal, rhs: Kava_Committee_V1beta1_MsgSubmitProposal) -> Bool {
    if lhs._pubProposal != rhs._pubProposal {return false}
    if lhs.proposer != rhs.proposer {return false}
    if lhs.committeeID != rhs.committeeID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Kava_Committee_V1beta1_MsgSubmitProposalResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgSubmitProposalResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "proposal_id"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.proposalID) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.proposalID != 0 {
      try visitor.visitSingularUInt64Field(value: self.proposalID, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kava_Committee_V1beta1_MsgSubmitProposalResponse, rhs: Kava_Committee_V1beta1_MsgSubmitProposalResponse) -> Bool {
    if lhs.proposalID != rhs.proposalID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Kava_Committee_V1beta1_MsgVote: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgVote"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "proposal_id"),
    2: .same(proto: "voter"),
    3: .standard(proto: "vote_type"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.proposalID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.voter) }()
      case 3: try { try decoder.decodeSingularEnumField(value: &self.voteType) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.proposalID != 0 {
      try visitor.visitSingularUInt64Field(value: self.proposalID, fieldNumber: 1)
    }
    if !self.voter.isEmpty {
      try visitor.visitSingularStringField(value: self.voter, fieldNumber: 2)
    }
    if self.voteType != .unspecified {
      try visitor.visitSingularEnumField(value: self.voteType, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kava_Committee_V1beta1_MsgVote, rhs: Kava_Committee_V1beta1_MsgVote) -> Bool {
    if lhs.proposalID != rhs.proposalID {return false}
    if lhs.voter != rhs.voter {return false}
    if lhs.voteType != rhs.voteType {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Kava_Committee_V1beta1_MsgVoteResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgVoteResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kava_Committee_V1beta1_MsgVoteResponse, rhs: Kava_Committee_V1beta1_MsgVoteResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
