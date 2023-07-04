// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: stafihub/rvalidator/proposal.proto
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

enum Stafihub_Stafihub_Rvalidator_UpdateRValidatorStatus: SwiftProtobuf.Enum {
  typealias RawValue = Int
  case unspecified // = 0
  case success // = 1
  case failed // = 2
  case UNRECOGNIZED(Int)

  init() {
    self = .unspecified
  }

  init?(rawValue: Int) {
    switch rawValue {
    case 0: self = .unspecified
    case 1: self = .success
    case 2: self = .failed
    default: self = .UNRECOGNIZED(rawValue)
    }
  }

  var rawValue: Int {
    switch self {
    case .unspecified: return 0
    case .success: return 1
    case .failed: return 2
    case .UNRECOGNIZED(let i): return i
    }
  }

}

#if swift(>=4.2)

extension Stafihub_Stafihub_Rvalidator_UpdateRValidatorStatus: CaseIterable {
  // The compiler won't synthesize support with the UNRECOGNIZED case.
  static var allCases: [Stafihub_Stafihub_Rvalidator_UpdateRValidatorStatus] = [
    .unspecified,
    .success,
    .failed,
  ]
}

#endif  // swift(>=4.2)

struct Stafihub_Stafihub_Rvalidator_UpdateRValidatorProposal {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var creator: String = String()

  var denom: String = String()

  var poolAddress: String = String()

  var oldAddress: String = String()

  var newAddress: String = String()

  var propID: String = String()

  var cycle: Stafihub_Stafihub_Rvalidator_Cycle {
    get {return _cycle ?? Stafihub_Stafihub_Rvalidator_Cycle()}
    set {_cycle = newValue}
  }
  /// Returns true if `cycle` has been explicitly set.
  var hasCycle: Bool {return self._cycle != nil}
  /// Clears the value of `cycle`. Subsequent reads from it will return its default value.
  mutating func clearCycle() {self._cycle = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _cycle: Stafihub_Stafihub_Rvalidator_Cycle? = nil
}

struct Stafihub_Stafihub_Rvalidator_UpdateRValidatorReportProposal {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var creator: String = String()

  var denom: String = String()

  var poolAddress: String = String()

  var propID: String = String()

  var cycle: Stafihub_Stafihub_Rvalidator_Cycle {
    get {return _cycle ?? Stafihub_Stafihub_Rvalidator_Cycle()}
    set {_cycle = newValue}
  }
  /// Returns true if `cycle` has been explicitly set.
  var hasCycle: Bool {return self._cycle != nil}
  /// Clears the value of `cycle`. Subsequent reads from it will return its default value.
  mutating func clearCycle() {self._cycle = nil}

  var status: Stafihub_Stafihub_Rvalidator_UpdateRValidatorStatus = .unspecified

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _cycle: Stafihub_Stafihub_Rvalidator_Cycle? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Stafihub_Stafihub_Rvalidator_UpdateRValidatorStatus: @unchecked Sendable {}
extension Stafihub_Stafihub_Rvalidator_UpdateRValidatorProposal: @unchecked Sendable {}
extension Stafihub_Stafihub_Rvalidator_UpdateRValidatorReportProposal: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "stafihub.stafihub.rvalidator"

extension Stafihub_Stafihub_Rvalidator_UpdateRValidatorStatus: SwiftProtobuf._ProtoNameProviding {
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    0: .same(proto: "UPDATE_RVALIDATOR_STATUS_UNSPECIFIED"),
    1: .same(proto: "UPDATE_RVALIDATOR_STATUS_SUCCESS"),
    2: .same(proto: "UPDATE_RVALIDATOR_STATUS_FAILED"),
  ]
}

extension Stafihub_Stafihub_Rvalidator_UpdateRValidatorProposal: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".UpdateRValidatorProposal"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "creator"),
    2: .same(proto: "denom"),
    3: .same(proto: "poolAddress"),
    4: .same(proto: "oldAddress"),
    5: .same(proto: "newAddress"),
    6: .same(proto: "propId"),
    7: .same(proto: "cycle"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.creator) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.denom) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.poolAddress) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.oldAddress) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.newAddress) }()
      case 6: try { try decoder.decodeSingularStringField(value: &self.propID) }()
      case 7: try { try decoder.decodeSingularMessageField(value: &self._cycle) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.creator.isEmpty {
      try visitor.visitSingularStringField(value: self.creator, fieldNumber: 1)
    }
    if !self.denom.isEmpty {
      try visitor.visitSingularStringField(value: self.denom, fieldNumber: 2)
    }
    if !self.poolAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.poolAddress, fieldNumber: 3)
    }
    if !self.oldAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.oldAddress, fieldNumber: 4)
    }
    if !self.newAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.newAddress, fieldNumber: 5)
    }
    if !self.propID.isEmpty {
      try visitor.visitSingularStringField(value: self.propID, fieldNumber: 6)
    }
    try { if let v = self._cycle {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 7)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Rvalidator_UpdateRValidatorProposal, rhs: Stafihub_Stafihub_Rvalidator_UpdateRValidatorProposal) -> Bool {
    if lhs.creator != rhs.creator {return false}
    if lhs.denom != rhs.denom {return false}
    if lhs.poolAddress != rhs.poolAddress {return false}
    if lhs.oldAddress != rhs.oldAddress {return false}
    if lhs.newAddress != rhs.newAddress {return false}
    if lhs.propID != rhs.propID {return false}
    if lhs._cycle != rhs._cycle {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Rvalidator_UpdateRValidatorReportProposal: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".UpdateRValidatorReportProposal"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "creator"),
    2: .same(proto: "denom"),
    3: .same(proto: "poolAddress"),
    4: .same(proto: "propId"),
    5: .same(proto: "cycle"),
    6: .same(proto: "status"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.creator) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.denom) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.poolAddress) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.propID) }()
      case 5: try { try decoder.decodeSingularMessageField(value: &self._cycle) }()
      case 6: try { try decoder.decodeSingularEnumField(value: &self.status) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.creator.isEmpty {
      try visitor.visitSingularStringField(value: self.creator, fieldNumber: 1)
    }
    if !self.denom.isEmpty {
      try visitor.visitSingularStringField(value: self.denom, fieldNumber: 2)
    }
    if !self.poolAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.poolAddress, fieldNumber: 3)
    }
    if !self.propID.isEmpty {
      try visitor.visitSingularStringField(value: self.propID, fieldNumber: 4)
    }
    try { if let v = self._cycle {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 5)
    } }()
    if self.status != .unspecified {
      try visitor.visitSingularEnumField(value: self.status, fieldNumber: 6)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Rvalidator_UpdateRValidatorReportProposal, rhs: Stafihub_Stafihub_Rvalidator_UpdateRValidatorReportProposal) -> Bool {
    if lhs.creator != rhs.creator {return false}
    if lhs.denom != rhs.denom {return false}
    if lhs.poolAddress != rhs.poolAddress {return false}
    if lhs.propID != rhs.propID {return false}
    if lhs._cycle != rhs._cycle {return false}
    if lhs.status != rhs.status {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}