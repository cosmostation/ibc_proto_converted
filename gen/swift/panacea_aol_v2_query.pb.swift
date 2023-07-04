// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: panacea/aol/v2/query.proto
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

/// QueryTopicRequest is the request type for the Query/Topic RPC method.
struct Panacea_Aol_V2_QueryTopicRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var ownerAddress: String = String()

  var topicName: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// QueryTopicResponse is the response type for the Query/Topic RPC method.
struct Panacea_Aol_V2_QueryTopicResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var topic: Panacea_Aol_V2_Topic {
    get {return _topic ?? Panacea_Aol_V2_Topic()}
    set {_topic = newValue}
  }
  /// Returns true if `topic` has been explicitly set.
  var hasTopic: Bool {return self._topic != nil}
  /// Clears the value of `topic`. Subsequent reads from it will return its default value.
  mutating func clearTopic() {self._topic = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _topic: Panacea_Aol_V2_Topic? = nil
}

/// QueryTopicsRequest is the request type for the Query/Topics RPC method.
struct Panacea_Aol_V2_QueryTopicsRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var ownerAddress: String = String()

  var pagination: Cosmos_Base_Query_V1beta1_PageRequest {
    get {return _pagination ?? Cosmos_Base_Query_V1beta1_PageRequest()}
    set {_pagination = newValue}
  }
  /// Returns true if `pagination` has been explicitly set.
  var hasPagination: Bool {return self._pagination != nil}
  /// Clears the value of `pagination`. Subsequent reads from it will return its default value.
  mutating func clearPagination() {self._pagination = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _pagination: Cosmos_Base_Query_V1beta1_PageRequest? = nil
}

/// QueryTopicsResponse is the response type for the Query/Topics RPC method.
struct Panacea_Aol_V2_QueryTopicsResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var topicNames: [String] = []

  var pagination: Cosmos_Base_Query_V1beta1_PageResponse {
    get {return _pagination ?? Cosmos_Base_Query_V1beta1_PageResponse()}
    set {_pagination = newValue}
  }
  /// Returns true if `pagination` has been explicitly set.
  var hasPagination: Bool {return self._pagination != nil}
  /// Clears the value of `pagination`. Subsequent reads from it will return its default value.
  mutating func clearPagination() {self._pagination = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _pagination: Cosmos_Base_Query_V1beta1_PageResponse? = nil
}

/// QueryWriterRequest is the request type for the Query/Writer RPC method.
struct Panacea_Aol_V2_QueryWriterRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var ownerAddress: String = String()

  var topicName: String = String()

  var writerAddress: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// QueryWriterResponse is the response type for the Query/Writer RPC method.
struct Panacea_Aol_V2_QueryWriterResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var writer: Panacea_Aol_V2_Writer {
    get {return _writer ?? Panacea_Aol_V2_Writer()}
    set {_writer = newValue}
  }
  /// Returns true if `writer` has been explicitly set.
  var hasWriter: Bool {return self._writer != nil}
  /// Clears the value of `writer`. Subsequent reads from it will return its default value.
  mutating func clearWriter() {self._writer = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _writer: Panacea_Aol_V2_Writer? = nil
}

/// QueryWritersRequest is the request type for the Query/Writers RPC method.
struct Panacea_Aol_V2_QueryWritersRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var ownerAddress: String = String()

  var topicName: String = String()

  var pagination: Cosmos_Base_Query_V1beta1_PageRequest {
    get {return _pagination ?? Cosmos_Base_Query_V1beta1_PageRequest()}
    set {_pagination = newValue}
  }
  /// Returns true if `pagination` has been explicitly set.
  var hasPagination: Bool {return self._pagination != nil}
  /// Clears the value of `pagination`. Subsequent reads from it will return its default value.
  mutating func clearPagination() {self._pagination = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _pagination: Cosmos_Base_Query_V1beta1_PageRequest? = nil
}

/// QueryWritersResponse is the response type for the Query/Writers RPC method.
struct Panacea_Aol_V2_QueryWritersResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var writerAddresses: [String] = []

  var pagination: Cosmos_Base_Query_V1beta1_PageResponse {
    get {return _pagination ?? Cosmos_Base_Query_V1beta1_PageResponse()}
    set {_pagination = newValue}
  }
  /// Returns true if `pagination` has been explicitly set.
  var hasPagination: Bool {return self._pagination != nil}
  /// Clears the value of `pagination`. Subsequent reads from it will return its default value.
  mutating func clearPagination() {self._pagination = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _pagination: Cosmos_Base_Query_V1beta1_PageResponse? = nil
}

/// QueryRecordRequest is the request type for the Query/Record RPC method.
struct Panacea_Aol_V2_QueryRecordRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var ownerAddress: String = String()

  var topicName: String = String()

  var offset: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// QueryRecordResponse is the response type for the Query/Record RPC method.
struct Panacea_Aol_V2_QueryRecordResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var record: Panacea_Aol_V2_Record {
    get {return _record ?? Panacea_Aol_V2_Record()}
    set {_record = newValue}
  }
  /// Returns true if `record` has been explicitly set.
  var hasRecord: Bool {return self._record != nil}
  /// Clears the value of `record`. Subsequent reads from it will return its default value.
  mutating func clearRecord() {self._record = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _record: Panacea_Aol_V2_Record? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Panacea_Aol_V2_QueryTopicRequest: @unchecked Sendable {}
extension Panacea_Aol_V2_QueryTopicResponse: @unchecked Sendable {}
extension Panacea_Aol_V2_QueryTopicsRequest: @unchecked Sendable {}
extension Panacea_Aol_V2_QueryTopicsResponse: @unchecked Sendable {}
extension Panacea_Aol_V2_QueryWriterRequest: @unchecked Sendable {}
extension Panacea_Aol_V2_QueryWriterResponse: @unchecked Sendable {}
extension Panacea_Aol_V2_QueryWritersRequest: @unchecked Sendable {}
extension Panacea_Aol_V2_QueryWritersResponse: @unchecked Sendable {}
extension Panacea_Aol_V2_QueryRecordRequest: @unchecked Sendable {}
extension Panacea_Aol_V2_QueryRecordResponse: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "panacea.aol.v2"

extension Panacea_Aol_V2_QueryTopicRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryTopicRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "owner_address"),
    2: .standard(proto: "topic_name"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.ownerAddress) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.topicName) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.ownerAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.ownerAddress, fieldNumber: 1)
    }
    if !self.topicName.isEmpty {
      try visitor.visitSingularStringField(value: self.topicName, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Panacea_Aol_V2_QueryTopicRequest, rhs: Panacea_Aol_V2_QueryTopicRequest) -> Bool {
    if lhs.ownerAddress != rhs.ownerAddress {return false}
    if lhs.topicName != rhs.topicName {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Panacea_Aol_V2_QueryTopicResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryTopicResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "topic"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._topic) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._topic {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Panacea_Aol_V2_QueryTopicResponse, rhs: Panacea_Aol_V2_QueryTopicResponse) -> Bool {
    if lhs._topic != rhs._topic {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Panacea_Aol_V2_QueryTopicsRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryTopicsRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "owner_address"),
    2: .same(proto: "pagination"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.ownerAddress) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._pagination) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.ownerAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.ownerAddress, fieldNumber: 1)
    }
    try { if let v = self._pagination {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Panacea_Aol_V2_QueryTopicsRequest, rhs: Panacea_Aol_V2_QueryTopicsRequest) -> Bool {
    if lhs.ownerAddress != rhs.ownerAddress {return false}
    if lhs._pagination != rhs._pagination {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Panacea_Aol_V2_QueryTopicsResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryTopicsResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "topic_names"),
    2: .same(proto: "pagination"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedStringField(value: &self.topicNames) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._pagination) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.topicNames.isEmpty {
      try visitor.visitRepeatedStringField(value: self.topicNames, fieldNumber: 1)
    }
    try { if let v = self._pagination {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Panacea_Aol_V2_QueryTopicsResponse, rhs: Panacea_Aol_V2_QueryTopicsResponse) -> Bool {
    if lhs.topicNames != rhs.topicNames {return false}
    if lhs._pagination != rhs._pagination {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Panacea_Aol_V2_QueryWriterRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryWriterRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "owner_address"),
    2: .standard(proto: "topic_name"),
    3: .standard(proto: "writer_address"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.ownerAddress) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.topicName) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.writerAddress) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.ownerAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.ownerAddress, fieldNumber: 1)
    }
    if !self.topicName.isEmpty {
      try visitor.visitSingularStringField(value: self.topicName, fieldNumber: 2)
    }
    if !self.writerAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.writerAddress, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Panacea_Aol_V2_QueryWriterRequest, rhs: Panacea_Aol_V2_QueryWriterRequest) -> Bool {
    if lhs.ownerAddress != rhs.ownerAddress {return false}
    if lhs.topicName != rhs.topicName {return false}
    if lhs.writerAddress != rhs.writerAddress {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Panacea_Aol_V2_QueryWriterResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryWriterResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "writer"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._writer) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._writer {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Panacea_Aol_V2_QueryWriterResponse, rhs: Panacea_Aol_V2_QueryWriterResponse) -> Bool {
    if lhs._writer != rhs._writer {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Panacea_Aol_V2_QueryWritersRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryWritersRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "owner_address"),
    2: .standard(proto: "topic_name"),
    3: .same(proto: "pagination"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.ownerAddress) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.topicName) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._pagination) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.ownerAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.ownerAddress, fieldNumber: 1)
    }
    if !self.topicName.isEmpty {
      try visitor.visitSingularStringField(value: self.topicName, fieldNumber: 2)
    }
    try { if let v = self._pagination {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Panacea_Aol_V2_QueryWritersRequest, rhs: Panacea_Aol_V2_QueryWritersRequest) -> Bool {
    if lhs.ownerAddress != rhs.ownerAddress {return false}
    if lhs.topicName != rhs.topicName {return false}
    if lhs._pagination != rhs._pagination {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Panacea_Aol_V2_QueryWritersResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryWritersResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "writer_addresses"),
    2: .same(proto: "pagination"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedStringField(value: &self.writerAddresses) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._pagination) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.writerAddresses.isEmpty {
      try visitor.visitRepeatedStringField(value: self.writerAddresses, fieldNumber: 1)
    }
    try { if let v = self._pagination {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Panacea_Aol_V2_QueryWritersResponse, rhs: Panacea_Aol_V2_QueryWritersResponse) -> Bool {
    if lhs.writerAddresses != rhs.writerAddresses {return false}
    if lhs._pagination != rhs._pagination {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Panacea_Aol_V2_QueryRecordRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryRecordRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "owner_address"),
    2: .standard(proto: "topic_name"),
    3: .same(proto: "offset"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.ownerAddress) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.topicName) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.offset) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.ownerAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.ownerAddress, fieldNumber: 1)
    }
    if !self.topicName.isEmpty {
      try visitor.visitSingularStringField(value: self.topicName, fieldNumber: 2)
    }
    if self.offset != 0 {
      try visitor.visitSingularUInt64Field(value: self.offset, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Panacea_Aol_V2_QueryRecordRequest, rhs: Panacea_Aol_V2_QueryRecordRequest) -> Bool {
    if lhs.ownerAddress != rhs.ownerAddress {return false}
    if lhs.topicName != rhs.topicName {return false}
    if lhs.offset != rhs.offset {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Panacea_Aol_V2_QueryRecordResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryRecordResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "record"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._record) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._record {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Panacea_Aol_V2_QueryRecordResponse, rhs: Panacea_Aol_V2_QueryRecordResponse) -> Bool {
    if lhs._record != rhs._record {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}