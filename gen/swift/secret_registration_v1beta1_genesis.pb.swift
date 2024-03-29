// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: secret/registration/v1beta1/genesis.proto
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

struct Secret_Registration_V1beta1_GenesisState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var registration: [Secret_Registration_V1beta1_RegistrationNodeInfo] = []

  var nodeExchMasterKey: Secret_Registration_V1beta1_MasterKey {
    get {return _nodeExchMasterKey ?? Secret_Registration_V1beta1_MasterKey()}
    set {_nodeExchMasterKey = newValue}
  }
  /// Returns true if `nodeExchMasterKey` has been explicitly set.
  var hasNodeExchMasterKey: Bool {return self._nodeExchMasterKey != nil}
  /// Clears the value of `nodeExchMasterKey`. Subsequent reads from it will return its default value.
  mutating func clearNodeExchMasterKey() {self._nodeExchMasterKey = nil}

  var ioMasterKey: Secret_Registration_V1beta1_MasterKey {
    get {return _ioMasterKey ?? Secret_Registration_V1beta1_MasterKey()}
    set {_ioMasterKey = newValue}
  }
  /// Returns true if `ioMasterKey` has been explicitly set.
  var hasIoMasterKey: Bool {return self._ioMasterKey != nil}
  /// Clears the value of `ioMasterKey`. Subsequent reads from it will return its default value.
  mutating func clearIoMasterKey() {self._ioMasterKey = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _nodeExchMasterKey: Secret_Registration_V1beta1_MasterKey? = nil
  fileprivate var _ioMasterKey: Secret_Registration_V1beta1_MasterKey? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Secret_Registration_V1beta1_GenesisState: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "secret.registration.v1beta1"

extension Secret_Registration_V1beta1_GenesisState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GenesisState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "registration"),
    2: .standard(proto: "node_exch_master_key"),
    3: .standard(proto: "io_master_key"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.registration) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._nodeExchMasterKey) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._ioMasterKey) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.registration.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.registration, fieldNumber: 1)
    }
    try { if let v = self._nodeExchMasterKey {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try { if let v = self._ioMasterKey {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Secret_Registration_V1beta1_GenesisState, rhs: Secret_Registration_V1beta1_GenesisState) -> Bool {
    if lhs.registration != rhs.registration {return false}
    if lhs._nodeExchMasterKey != rhs._nodeExchMasterKey {return false}
    if lhs._ioMasterKey != rhs._ioMasterKey {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
