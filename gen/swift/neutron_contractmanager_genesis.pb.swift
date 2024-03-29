// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: neutron/contractmanager/genesis.proto
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

/// Failure message contains information about ACK failures and can be used to
/// replay ACK in case of requirement.
struct Neutron_Contractmanager_Failure {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// ChannelId
  var channelID: String = String()

  /// Address of the failed contract
  var address: String = String()

  /// id of the failure under specific address
  var id: UInt64 = 0

  /// ACK id to restore
  var ackID: UInt64 = 0

  /// Acknowledgement type
  var ackType: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// GenesisState defines the contractmanager module's genesis state.
struct Neutron_Contractmanager_GenesisState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var params: Neutron_Contractmanager_Params {
    get {return _params ?? Neutron_Contractmanager_Params()}
    set {_params = newValue}
  }
  /// Returns true if `params` has been explicitly set.
  var hasParams: Bool {return self._params != nil}
  /// Clears the value of `params`. Subsequent reads from it will return its default value.
  mutating func clearParams() {self._params = nil}

  /// List of the contract failures
  var failuresList: [Neutron_Contractmanager_Failure] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _params: Neutron_Contractmanager_Params? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Neutron_Contractmanager_Failure: @unchecked Sendable {}
extension Neutron_Contractmanager_GenesisState: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "neutron.contractmanager"

extension Neutron_Contractmanager_Failure: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Failure"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "channel_id"),
    2: .same(proto: "address"),
    3: .same(proto: "id"),
    4: .standard(proto: "ack_id"),
    5: .standard(proto: "ack_type"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.channelID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.address) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.id) }()
      case 4: try { try decoder.decodeSingularUInt64Field(value: &self.ackID) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.ackType) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.channelID.isEmpty {
      try visitor.visitSingularStringField(value: self.channelID, fieldNumber: 1)
    }
    if !self.address.isEmpty {
      try visitor.visitSingularStringField(value: self.address, fieldNumber: 2)
    }
    if self.id != 0 {
      try visitor.visitSingularUInt64Field(value: self.id, fieldNumber: 3)
    }
    if self.ackID != 0 {
      try visitor.visitSingularUInt64Field(value: self.ackID, fieldNumber: 4)
    }
    if !self.ackType.isEmpty {
      try visitor.visitSingularStringField(value: self.ackType, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Neutron_Contractmanager_Failure, rhs: Neutron_Contractmanager_Failure) -> Bool {
    if lhs.channelID != rhs.channelID {return false}
    if lhs.address != rhs.address {return false}
    if lhs.id != rhs.id {return false}
    if lhs.ackID != rhs.ackID {return false}
    if lhs.ackType != rhs.ackType {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Neutron_Contractmanager_GenesisState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GenesisState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "params"),
    2: .standard(proto: "failures_list"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._params) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.failuresList) }()
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
    if !self.failuresList.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.failuresList, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Neutron_Contractmanager_GenesisState, rhs: Neutron_Contractmanager_GenesisState) -> Bool {
    if lhs._params != rhs._params {return false}
    if lhs.failuresList != rhs.failuresList {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
