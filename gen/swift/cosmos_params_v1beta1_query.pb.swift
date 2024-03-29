// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: cosmos/params/v1beta1/query.proto
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

/// QueryParamsRequest is request type for the Query/Params RPC method.
struct Cosmos_Params_V1beta1_QueryParamsRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// subspace defines the module to query the parameter for.
  var subspace: String = String()

  /// key defines the key of the parameter in the subspace.
  var key: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// QueryParamsResponse is response type for the Query/Params RPC method.
struct Cosmos_Params_V1beta1_QueryParamsResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// param defines the queried parameter.
  var param: Cosmos_Params_V1beta1_ParamChange {
    get {return _param ?? Cosmos_Params_V1beta1_ParamChange()}
    set {_param = newValue}
  }
  /// Returns true if `param` has been explicitly set.
  var hasParam: Bool {return self._param != nil}
  /// Clears the value of `param`. Subsequent reads from it will return its default value.
  mutating func clearParam() {self._param = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _param: Cosmos_Params_V1beta1_ParamChange? = nil
}

/// QuerySubspacesRequest defines a request type for querying for all registered
/// subspaces and all keys for a subspace.
///
/// Since: cosmos-sdk 0.46
struct Cosmos_Params_V1beta1_QuerySubspacesRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// QuerySubspacesResponse defines the response types for querying for all
/// registered subspaces and all keys for a subspace.
///
/// Since: cosmos-sdk 0.46
struct Cosmos_Params_V1beta1_QuerySubspacesResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var subspaces: [Cosmos_Params_V1beta1_Subspace] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// Subspace defines a parameter subspace name and all the keys that exist for
/// the subspace.
///
/// Since: cosmos-sdk 0.46
struct Cosmos_Params_V1beta1_Subspace {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var subspace: String = String()

  var keys: [String] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Cosmos_Params_V1beta1_QueryParamsRequest: @unchecked Sendable {}
extension Cosmos_Params_V1beta1_QueryParamsResponse: @unchecked Sendable {}
extension Cosmos_Params_V1beta1_QuerySubspacesRequest: @unchecked Sendable {}
extension Cosmos_Params_V1beta1_QuerySubspacesResponse: @unchecked Sendable {}
extension Cosmos_Params_V1beta1_Subspace: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "cosmos.params.v1beta1"

extension Cosmos_Params_V1beta1_QueryParamsRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryParamsRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "subspace"),
    2: .same(proto: "key"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.subspace) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.key) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.subspace.isEmpty {
      try visitor.visitSingularStringField(value: self.subspace, fieldNumber: 1)
    }
    if !self.key.isEmpty {
      try visitor.visitSingularStringField(value: self.key, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Cosmos_Params_V1beta1_QueryParamsRequest, rhs: Cosmos_Params_V1beta1_QueryParamsRequest) -> Bool {
    if lhs.subspace != rhs.subspace {return false}
    if lhs.key != rhs.key {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Cosmos_Params_V1beta1_QueryParamsResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryParamsResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "param"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._param) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._param {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Cosmos_Params_V1beta1_QueryParamsResponse, rhs: Cosmos_Params_V1beta1_QueryParamsResponse) -> Bool {
    if lhs._param != rhs._param {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Cosmos_Params_V1beta1_QuerySubspacesRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QuerySubspacesRequest"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Cosmos_Params_V1beta1_QuerySubspacesRequest, rhs: Cosmos_Params_V1beta1_QuerySubspacesRequest) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Cosmos_Params_V1beta1_QuerySubspacesResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QuerySubspacesResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "subspaces"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.subspaces) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.subspaces.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.subspaces, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Cosmos_Params_V1beta1_QuerySubspacesResponse, rhs: Cosmos_Params_V1beta1_QuerySubspacesResponse) -> Bool {
    if lhs.subspaces != rhs.subspaces {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Cosmos_Params_V1beta1_Subspace: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Subspace"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "subspace"),
    2: .same(proto: "keys"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.subspace) }()
      case 2: try { try decoder.decodeRepeatedStringField(value: &self.keys) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.subspace.isEmpty {
      try visitor.visitSingularStringField(value: self.subspace, fieldNumber: 1)
    }
    if !self.keys.isEmpty {
      try visitor.visitRepeatedStringField(value: self.keys, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Cosmos_Params_V1beta1_Subspace, rhs: Cosmos_Params_V1beta1_Subspace) -> Bool {
    if lhs.subspace != rhs.subspace {return false}
    if lhs.keys != rhs.keys {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
