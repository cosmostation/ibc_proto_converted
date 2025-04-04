// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: ibc/lightclients/solomachine/v3/solomachine.proto
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

/// ClientState defines a solo machine client that tracks the current consensus
/// state and if the client is frozen.
struct Ibc_Lightclients_Solomachine_V3_ClientState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// latest sequence of the client state
  var sequence: UInt64 = 0

  /// frozen sequence of the solo machine
  var isFrozen: Bool = false

  var consensusState: Ibc_Lightclients_Solomachine_V3_ConsensusState {
    get {return _consensusState ?? Ibc_Lightclients_Solomachine_V3_ConsensusState()}
    set {_consensusState = newValue}
  }
  /// Returns true if `consensusState` has been explicitly set.
  var hasConsensusState: Bool {return self._consensusState != nil}
  /// Clears the value of `consensusState`. Subsequent reads from it will return its default value.
  mutating func clearConsensusState() {self._consensusState = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _consensusState: Ibc_Lightclients_Solomachine_V3_ConsensusState? = nil
}

/// ConsensusState defines a solo machine consensus state. The sequence of a
/// consensus state is contained in the "height" key used in storing the
/// consensus state.
struct Ibc_Lightclients_Solomachine_V3_ConsensusState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// public key of the solo machine
  var publicKey: SwiftProtobuf.Google_Protobuf_Any {
    get {return _publicKey ?? SwiftProtobuf.Google_Protobuf_Any()}
    set {_publicKey = newValue}
  }
  /// Returns true if `publicKey` has been explicitly set.
  var hasPublicKey: Bool {return self._publicKey != nil}
  /// Clears the value of `publicKey`. Subsequent reads from it will return its default value.
  mutating func clearPublicKey() {self._publicKey = nil}

  /// diversifier allows the same public key to be reused across different solo
  /// machine clients (potentially on different chains) without being considered
  /// misbehaviour.
  var diversifier: String = String()

  var timestamp: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _publicKey: SwiftProtobuf.Google_Protobuf_Any? = nil
}

/// Header defines a solo machine consensus header
struct Ibc_Lightclients_Solomachine_V3_Header {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var timestamp: UInt64 = 0

  var signature: Data = Data()

  var newPublicKey: SwiftProtobuf.Google_Protobuf_Any {
    get {return _newPublicKey ?? SwiftProtobuf.Google_Protobuf_Any()}
    set {_newPublicKey = newValue}
  }
  /// Returns true if `newPublicKey` has been explicitly set.
  var hasNewPublicKey: Bool {return self._newPublicKey != nil}
  /// Clears the value of `newPublicKey`. Subsequent reads from it will return its default value.
  mutating func clearNewPublicKey() {self._newPublicKey = nil}

  var newDiversifier: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _newPublicKey: SwiftProtobuf.Google_Protobuf_Any? = nil
}

/// Misbehaviour defines misbehaviour for a solo machine which consists
/// of a sequence and two signatures over different messages at that sequence.
struct Ibc_Lightclients_Solomachine_V3_Misbehaviour {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var sequence: UInt64 = 0

  var signatureOne: Ibc_Lightclients_Solomachine_V3_SignatureAndData {
    get {return _signatureOne ?? Ibc_Lightclients_Solomachine_V3_SignatureAndData()}
    set {_signatureOne = newValue}
  }
  /// Returns true if `signatureOne` has been explicitly set.
  var hasSignatureOne: Bool {return self._signatureOne != nil}
  /// Clears the value of `signatureOne`. Subsequent reads from it will return its default value.
  mutating func clearSignatureOne() {self._signatureOne = nil}

  var signatureTwo: Ibc_Lightclients_Solomachine_V3_SignatureAndData {
    get {return _signatureTwo ?? Ibc_Lightclients_Solomachine_V3_SignatureAndData()}
    set {_signatureTwo = newValue}
  }
  /// Returns true if `signatureTwo` has been explicitly set.
  var hasSignatureTwo: Bool {return self._signatureTwo != nil}
  /// Clears the value of `signatureTwo`. Subsequent reads from it will return its default value.
  mutating func clearSignatureTwo() {self._signatureTwo = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _signatureOne: Ibc_Lightclients_Solomachine_V3_SignatureAndData? = nil
  fileprivate var _signatureTwo: Ibc_Lightclients_Solomachine_V3_SignatureAndData? = nil
}

/// SignatureAndData contains a signature and the data signed over to create that
/// signature.
struct Ibc_Lightclients_Solomachine_V3_SignatureAndData {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var signature: Data = Data()

  var path: Data = Data()

  var data: Data = Data()

  var timestamp: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// TimestampedSignatureData contains the signature data and the timestamp of the
/// signature.
struct Ibc_Lightclients_Solomachine_V3_TimestampedSignatureData {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var signatureData: Data = Data()

  var timestamp: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// SignBytes defines the signed bytes used for signature verification.
struct Ibc_Lightclients_Solomachine_V3_SignBytes {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// the sequence number
  var sequence: UInt64 = 0

  /// the proof timestamp
  var timestamp: UInt64 = 0

  /// the public key diversifier
  var diversifier: String = String()

  /// the standardised path bytes
  var path: Data = Data()

  /// the marshaled data bytes
  var data: Data = Data()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// HeaderData returns the SignBytes data for update verification.
struct Ibc_Lightclients_Solomachine_V3_HeaderData {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// header public key
  var newPubKey: SwiftProtobuf.Google_Protobuf_Any {
    get {return _newPubKey ?? SwiftProtobuf.Google_Protobuf_Any()}
    set {_newPubKey = newValue}
  }
  /// Returns true if `newPubKey` has been explicitly set.
  var hasNewPubKey: Bool {return self._newPubKey != nil}
  /// Clears the value of `newPubKey`. Subsequent reads from it will return its default value.
  mutating func clearNewPubKey() {self._newPubKey = nil}

  /// header diversifier
  var newDiversifier: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _newPubKey: SwiftProtobuf.Google_Protobuf_Any? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Ibc_Lightclients_Solomachine_V3_ClientState: @unchecked Sendable {}
extension Ibc_Lightclients_Solomachine_V3_ConsensusState: @unchecked Sendable {}
extension Ibc_Lightclients_Solomachine_V3_Header: @unchecked Sendable {}
extension Ibc_Lightclients_Solomachine_V3_Misbehaviour: @unchecked Sendable {}
extension Ibc_Lightclients_Solomachine_V3_SignatureAndData: @unchecked Sendable {}
extension Ibc_Lightclients_Solomachine_V3_TimestampedSignatureData: @unchecked Sendable {}
extension Ibc_Lightclients_Solomachine_V3_SignBytes: @unchecked Sendable {}
extension Ibc_Lightclients_Solomachine_V3_HeaderData: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "ibc.lightclients.solomachine.v3"

extension Ibc_Lightclients_Solomachine_V3_ClientState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ClientState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "sequence"),
    2: .standard(proto: "is_frozen"),
    3: .standard(proto: "consensus_state"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.sequence) }()
      case 2: try { try decoder.decodeSingularBoolField(value: &self.isFrozen) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._consensusState) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if self.sequence != 0 {
      try visitor.visitSingularUInt64Field(value: self.sequence, fieldNumber: 1)
    }
    if self.isFrozen != false {
      try visitor.visitSingularBoolField(value: self.isFrozen, fieldNumber: 2)
    }
    try { if let v = self._consensusState {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ibc_Lightclients_Solomachine_V3_ClientState, rhs: Ibc_Lightclients_Solomachine_V3_ClientState) -> Bool {
    if lhs.sequence != rhs.sequence {return false}
    if lhs.isFrozen != rhs.isFrozen {return false}
    if lhs._consensusState != rhs._consensusState {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Ibc_Lightclients_Solomachine_V3_ConsensusState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ConsensusState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "public_key"),
    2: .same(proto: "diversifier"),
    3: .same(proto: "timestamp"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._publicKey) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.diversifier) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.timestamp) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._publicKey {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    if !self.diversifier.isEmpty {
      try visitor.visitSingularStringField(value: self.diversifier, fieldNumber: 2)
    }
    if self.timestamp != 0 {
      try visitor.visitSingularUInt64Field(value: self.timestamp, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ibc_Lightclients_Solomachine_V3_ConsensusState, rhs: Ibc_Lightclients_Solomachine_V3_ConsensusState) -> Bool {
    if lhs._publicKey != rhs._publicKey {return false}
    if lhs.diversifier != rhs.diversifier {return false}
    if lhs.timestamp != rhs.timestamp {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Ibc_Lightclients_Solomachine_V3_Header: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Header"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "timestamp"),
    2: .same(proto: "signature"),
    3: .standard(proto: "new_public_key"),
    4: .standard(proto: "new_diversifier"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.timestamp) }()
      case 2: try { try decoder.decodeSingularBytesField(value: &self.signature) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._newPublicKey) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.newDiversifier) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if self.timestamp != 0 {
      try visitor.visitSingularUInt64Field(value: self.timestamp, fieldNumber: 1)
    }
    if !self.signature.isEmpty {
      try visitor.visitSingularBytesField(value: self.signature, fieldNumber: 2)
    }
    try { if let v = self._newPublicKey {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    if !self.newDiversifier.isEmpty {
      try visitor.visitSingularStringField(value: self.newDiversifier, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ibc_Lightclients_Solomachine_V3_Header, rhs: Ibc_Lightclients_Solomachine_V3_Header) -> Bool {
    if lhs.timestamp != rhs.timestamp {return false}
    if lhs.signature != rhs.signature {return false}
    if lhs._newPublicKey != rhs._newPublicKey {return false}
    if lhs.newDiversifier != rhs.newDiversifier {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Ibc_Lightclients_Solomachine_V3_Misbehaviour: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Misbehaviour"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "sequence"),
    2: .standard(proto: "signature_one"),
    3: .standard(proto: "signature_two"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.sequence) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._signatureOne) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._signatureTwo) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if self.sequence != 0 {
      try visitor.visitSingularUInt64Field(value: self.sequence, fieldNumber: 1)
    }
    try { if let v = self._signatureOne {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try { if let v = self._signatureTwo {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ibc_Lightclients_Solomachine_V3_Misbehaviour, rhs: Ibc_Lightclients_Solomachine_V3_Misbehaviour) -> Bool {
    if lhs.sequence != rhs.sequence {return false}
    if lhs._signatureOne != rhs._signatureOne {return false}
    if lhs._signatureTwo != rhs._signatureTwo {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Ibc_Lightclients_Solomachine_V3_SignatureAndData: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".SignatureAndData"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "signature"),
    2: .same(proto: "path"),
    3: .same(proto: "data"),
    4: .same(proto: "timestamp"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBytesField(value: &self.signature) }()
      case 2: try { try decoder.decodeSingularBytesField(value: &self.path) }()
      case 3: try { try decoder.decodeSingularBytesField(value: &self.data) }()
      case 4: try { try decoder.decodeSingularUInt64Field(value: &self.timestamp) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.signature.isEmpty {
      try visitor.visitSingularBytesField(value: self.signature, fieldNumber: 1)
    }
    if !self.path.isEmpty {
      try visitor.visitSingularBytesField(value: self.path, fieldNumber: 2)
    }
    if !self.data.isEmpty {
      try visitor.visitSingularBytesField(value: self.data, fieldNumber: 3)
    }
    if self.timestamp != 0 {
      try visitor.visitSingularUInt64Field(value: self.timestamp, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ibc_Lightclients_Solomachine_V3_SignatureAndData, rhs: Ibc_Lightclients_Solomachine_V3_SignatureAndData) -> Bool {
    if lhs.signature != rhs.signature {return false}
    if lhs.path != rhs.path {return false}
    if lhs.data != rhs.data {return false}
    if lhs.timestamp != rhs.timestamp {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Ibc_Lightclients_Solomachine_V3_TimestampedSignatureData: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".TimestampedSignatureData"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "signature_data"),
    2: .same(proto: "timestamp"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBytesField(value: &self.signatureData) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.timestamp) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.signatureData.isEmpty {
      try visitor.visitSingularBytesField(value: self.signatureData, fieldNumber: 1)
    }
    if self.timestamp != 0 {
      try visitor.visitSingularUInt64Field(value: self.timestamp, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ibc_Lightclients_Solomachine_V3_TimestampedSignatureData, rhs: Ibc_Lightclients_Solomachine_V3_TimestampedSignatureData) -> Bool {
    if lhs.signatureData != rhs.signatureData {return false}
    if lhs.timestamp != rhs.timestamp {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Ibc_Lightclients_Solomachine_V3_SignBytes: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".SignBytes"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "sequence"),
    2: .same(proto: "timestamp"),
    3: .same(proto: "diversifier"),
    4: .same(proto: "path"),
    5: .same(proto: "data"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.sequence) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.timestamp) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.diversifier) }()
      case 4: try { try decoder.decodeSingularBytesField(value: &self.path) }()
      case 5: try { try decoder.decodeSingularBytesField(value: &self.data) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.sequence != 0 {
      try visitor.visitSingularUInt64Field(value: self.sequence, fieldNumber: 1)
    }
    if self.timestamp != 0 {
      try visitor.visitSingularUInt64Field(value: self.timestamp, fieldNumber: 2)
    }
    if !self.diversifier.isEmpty {
      try visitor.visitSingularStringField(value: self.diversifier, fieldNumber: 3)
    }
    if !self.path.isEmpty {
      try visitor.visitSingularBytesField(value: self.path, fieldNumber: 4)
    }
    if !self.data.isEmpty {
      try visitor.visitSingularBytesField(value: self.data, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ibc_Lightclients_Solomachine_V3_SignBytes, rhs: Ibc_Lightclients_Solomachine_V3_SignBytes) -> Bool {
    if lhs.sequence != rhs.sequence {return false}
    if lhs.timestamp != rhs.timestamp {return false}
    if lhs.diversifier != rhs.diversifier {return false}
    if lhs.path != rhs.path {return false}
    if lhs.data != rhs.data {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Ibc_Lightclients_Solomachine_V3_HeaderData: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".HeaderData"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "new_pub_key"),
    2: .standard(proto: "new_diversifier"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._newPubKey) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.newDiversifier) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._newPubKey {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    if !self.newDiversifier.isEmpty {
      try visitor.visitSingularStringField(value: self.newDiversifier, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ibc_Lightclients_Solomachine_V3_HeaderData, rhs: Ibc_Lightclients_Solomachine_V3_HeaderData) -> Bool {
    if lhs._newPubKey != rhs._newPubKey {return false}
    if lhs.newDiversifier != rhs.newDiversifier {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
