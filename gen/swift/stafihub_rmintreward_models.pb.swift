// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: stafihub/rmintreward/models.proto
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

struct Stafihub_Stafihub_Rmintreward_MintRewardAct {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var begin: Int64 = 0

  var end: Int64 = 0

  var lockedBlocks: Int64 = 0

  var totalRtokenAmount: String = String()

  var totalNativeTokenAmount: String = String()

  var tokenRewardInfos: [Stafihub_Stafihub_Rmintreward_TokenRewardInfo] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Rmintreward_MintRewardActPost {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var begin: Int64 = 0

  var end: Int64 = 0

  var lockedBlocks: Int64 = 0

  var tokenRewardInfos: [Stafihub_Stafihub_Rmintreward_TokenRewardInfoPost] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Rmintreward_TokenRewardInfo {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var denom: String = String()

  var rewardRate: String = String()

  var totalRewardAmount: String = String()

  var leftAmount: String = String()

  var userLimit: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Rmintreward_TokenRewardInfoPost {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var denom: String = String()

  var rewardRate: String = String()

  var totalRewardAmount: String = String()

  var userLimit: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Rmintreward_UserClaimInfo {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var mintRtokenAmount: String = String()

  var nativeTokenAmount: String = String()

  var mintBlock: Int64 = 0

  var latestClaimedBlock: Int64 = 0

  var tokenClaimInfos: [Stafihub_Stafihub_Rmintreward_TokenClaimInfo] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Rmintreward_TokenClaimInfo {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var denom: String = String()

  var totalRewardAmount: String = String()

  var totalClaimedAmount: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Rmintreward_Acts {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var acts: [UInt64] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Stafihub_Stafihub_Rmintreward_MintRewardAct: @unchecked Sendable {}
extension Stafihub_Stafihub_Rmintreward_MintRewardActPost: @unchecked Sendable {}
extension Stafihub_Stafihub_Rmintreward_TokenRewardInfo: @unchecked Sendable {}
extension Stafihub_Stafihub_Rmintreward_TokenRewardInfoPost: @unchecked Sendable {}
extension Stafihub_Stafihub_Rmintreward_UserClaimInfo: @unchecked Sendable {}
extension Stafihub_Stafihub_Rmintreward_TokenClaimInfo: @unchecked Sendable {}
extension Stafihub_Stafihub_Rmintreward_Acts: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "stafihub.stafihub.rmintreward"

extension Stafihub_Stafihub_Rmintreward_MintRewardAct: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MintRewardAct"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "begin"),
    2: .same(proto: "end"),
    3: .same(proto: "lockedBlocks"),
    5: .same(proto: "totalRTokenAmount"),
    6: .same(proto: "totalNativeTokenAmount"),
    7: .same(proto: "tokenRewardInfos"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularInt64Field(value: &self.begin) }()
      case 2: try { try decoder.decodeSingularInt64Field(value: &self.end) }()
      case 3: try { try decoder.decodeSingularInt64Field(value: &self.lockedBlocks) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.totalRtokenAmount) }()
      case 6: try { try decoder.decodeSingularStringField(value: &self.totalNativeTokenAmount) }()
      case 7: try { try decoder.decodeRepeatedMessageField(value: &self.tokenRewardInfos) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.begin != 0 {
      try visitor.visitSingularInt64Field(value: self.begin, fieldNumber: 1)
    }
    if self.end != 0 {
      try visitor.visitSingularInt64Field(value: self.end, fieldNumber: 2)
    }
    if self.lockedBlocks != 0 {
      try visitor.visitSingularInt64Field(value: self.lockedBlocks, fieldNumber: 3)
    }
    if !self.totalRtokenAmount.isEmpty {
      try visitor.visitSingularStringField(value: self.totalRtokenAmount, fieldNumber: 5)
    }
    if !self.totalNativeTokenAmount.isEmpty {
      try visitor.visitSingularStringField(value: self.totalNativeTokenAmount, fieldNumber: 6)
    }
    if !self.tokenRewardInfos.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.tokenRewardInfos, fieldNumber: 7)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Rmintreward_MintRewardAct, rhs: Stafihub_Stafihub_Rmintreward_MintRewardAct) -> Bool {
    if lhs.begin != rhs.begin {return false}
    if lhs.end != rhs.end {return false}
    if lhs.lockedBlocks != rhs.lockedBlocks {return false}
    if lhs.totalRtokenAmount != rhs.totalRtokenAmount {return false}
    if lhs.totalNativeTokenAmount != rhs.totalNativeTokenAmount {return false}
    if lhs.tokenRewardInfos != rhs.tokenRewardInfos {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Rmintreward_MintRewardActPost: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MintRewardActPost"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "begin"),
    2: .same(proto: "end"),
    3: .same(proto: "lockedBlocks"),
    7: .same(proto: "tokenRewardInfos"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularInt64Field(value: &self.begin) }()
      case 2: try { try decoder.decodeSingularInt64Field(value: &self.end) }()
      case 3: try { try decoder.decodeSingularInt64Field(value: &self.lockedBlocks) }()
      case 7: try { try decoder.decodeRepeatedMessageField(value: &self.tokenRewardInfos) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.begin != 0 {
      try visitor.visitSingularInt64Field(value: self.begin, fieldNumber: 1)
    }
    if self.end != 0 {
      try visitor.visitSingularInt64Field(value: self.end, fieldNumber: 2)
    }
    if self.lockedBlocks != 0 {
      try visitor.visitSingularInt64Field(value: self.lockedBlocks, fieldNumber: 3)
    }
    if !self.tokenRewardInfos.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.tokenRewardInfos, fieldNumber: 7)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Rmintreward_MintRewardActPost, rhs: Stafihub_Stafihub_Rmintreward_MintRewardActPost) -> Bool {
    if lhs.begin != rhs.begin {return false}
    if lhs.end != rhs.end {return false}
    if lhs.lockedBlocks != rhs.lockedBlocks {return false}
    if lhs.tokenRewardInfos != rhs.tokenRewardInfos {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Rmintreward_TokenRewardInfo: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".TokenRewardInfo"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "denom"),
    2: .same(proto: "rewardRate"),
    3: .same(proto: "totalRewardAmount"),
    4: .same(proto: "leftAmount"),
    5: .same(proto: "userLimit"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.denom) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.rewardRate) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.totalRewardAmount) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.leftAmount) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.userLimit) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.denom.isEmpty {
      try visitor.visitSingularStringField(value: self.denom, fieldNumber: 1)
    }
    if !self.rewardRate.isEmpty {
      try visitor.visitSingularStringField(value: self.rewardRate, fieldNumber: 2)
    }
    if !self.totalRewardAmount.isEmpty {
      try visitor.visitSingularStringField(value: self.totalRewardAmount, fieldNumber: 3)
    }
    if !self.leftAmount.isEmpty {
      try visitor.visitSingularStringField(value: self.leftAmount, fieldNumber: 4)
    }
    if !self.userLimit.isEmpty {
      try visitor.visitSingularStringField(value: self.userLimit, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Rmintreward_TokenRewardInfo, rhs: Stafihub_Stafihub_Rmintreward_TokenRewardInfo) -> Bool {
    if lhs.denom != rhs.denom {return false}
    if lhs.rewardRate != rhs.rewardRate {return false}
    if lhs.totalRewardAmount != rhs.totalRewardAmount {return false}
    if lhs.leftAmount != rhs.leftAmount {return false}
    if lhs.userLimit != rhs.userLimit {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Rmintreward_TokenRewardInfoPost: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".TokenRewardInfoPost"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "denom"),
    2: .same(proto: "rewardRate"),
    3: .same(proto: "totalRewardAmount"),
    5: .same(proto: "userLimit"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.denom) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.rewardRate) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.totalRewardAmount) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.userLimit) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.denom.isEmpty {
      try visitor.visitSingularStringField(value: self.denom, fieldNumber: 1)
    }
    if !self.rewardRate.isEmpty {
      try visitor.visitSingularStringField(value: self.rewardRate, fieldNumber: 2)
    }
    if !self.totalRewardAmount.isEmpty {
      try visitor.visitSingularStringField(value: self.totalRewardAmount, fieldNumber: 3)
    }
    if !self.userLimit.isEmpty {
      try visitor.visitSingularStringField(value: self.userLimit, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Rmintreward_TokenRewardInfoPost, rhs: Stafihub_Stafihub_Rmintreward_TokenRewardInfoPost) -> Bool {
    if lhs.denom != rhs.denom {return false}
    if lhs.rewardRate != rhs.rewardRate {return false}
    if lhs.totalRewardAmount != rhs.totalRewardAmount {return false}
    if lhs.userLimit != rhs.userLimit {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Rmintreward_UserClaimInfo: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".UserClaimInfo"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "mintRTokenAmount"),
    2: .same(proto: "nativeTokenAmount"),
    3: .same(proto: "mintBlock"),
    4: .same(proto: "latestClaimedBlock"),
    5: .same(proto: "TokenClaimInfos"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.mintRtokenAmount) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.nativeTokenAmount) }()
      case 3: try { try decoder.decodeSingularInt64Field(value: &self.mintBlock) }()
      case 4: try { try decoder.decodeSingularInt64Field(value: &self.latestClaimedBlock) }()
      case 5: try { try decoder.decodeRepeatedMessageField(value: &self.tokenClaimInfos) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.mintRtokenAmount.isEmpty {
      try visitor.visitSingularStringField(value: self.mintRtokenAmount, fieldNumber: 1)
    }
    if !self.nativeTokenAmount.isEmpty {
      try visitor.visitSingularStringField(value: self.nativeTokenAmount, fieldNumber: 2)
    }
    if self.mintBlock != 0 {
      try visitor.visitSingularInt64Field(value: self.mintBlock, fieldNumber: 3)
    }
    if self.latestClaimedBlock != 0 {
      try visitor.visitSingularInt64Field(value: self.latestClaimedBlock, fieldNumber: 4)
    }
    if !self.tokenClaimInfos.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.tokenClaimInfos, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Rmintreward_UserClaimInfo, rhs: Stafihub_Stafihub_Rmintreward_UserClaimInfo) -> Bool {
    if lhs.mintRtokenAmount != rhs.mintRtokenAmount {return false}
    if lhs.nativeTokenAmount != rhs.nativeTokenAmount {return false}
    if lhs.mintBlock != rhs.mintBlock {return false}
    if lhs.latestClaimedBlock != rhs.latestClaimedBlock {return false}
    if lhs.tokenClaimInfos != rhs.tokenClaimInfos {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Rmintreward_TokenClaimInfo: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".TokenClaimInfo"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "denom"),
    2: .same(proto: "totalRewardAmount"),
    3: .same(proto: "totalClaimedAmount"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.denom) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.totalRewardAmount) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.totalClaimedAmount) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.denom.isEmpty {
      try visitor.visitSingularStringField(value: self.denom, fieldNumber: 1)
    }
    if !self.totalRewardAmount.isEmpty {
      try visitor.visitSingularStringField(value: self.totalRewardAmount, fieldNumber: 2)
    }
    if !self.totalClaimedAmount.isEmpty {
      try visitor.visitSingularStringField(value: self.totalClaimedAmount, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Rmintreward_TokenClaimInfo, rhs: Stafihub_Stafihub_Rmintreward_TokenClaimInfo) -> Bool {
    if lhs.denom != rhs.denom {return false}
    if lhs.totalRewardAmount != rhs.totalRewardAmount {return false}
    if lhs.totalClaimedAmount != rhs.totalClaimedAmount {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Rmintreward_Acts: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Acts"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "acts"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedUInt64Field(value: &self.acts) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.acts.isEmpty {
      try visitor.visitPackedUInt64Field(value: self.acts, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Rmintreward_Acts, rhs: Stafihub_Stafihub_Rmintreward_Acts) -> Bool {
    if lhs.acts != rhs.acts {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}