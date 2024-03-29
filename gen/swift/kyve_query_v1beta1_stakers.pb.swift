// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: kyve/query/v1beta1/stakers.proto
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

/// StakerStatus ...
enum Kyve_Query_V1beta1_StakerStatus: SwiftProtobuf.Enum {
  typealias RawValue = Int

  /// STAKER_STATUS_UNSPECIFIED ...
  case unspecified // = 0

  /// STAKER_STATUS_ACTIVE ...
  case active // = 1

  /// STAKER_STATUS_INACTIVE ...
  case inactive // = 2
  case UNRECOGNIZED(Int)

  init() {
    self = .unspecified
  }

  init?(rawValue: Int) {
    switch rawValue {
    case 0: self = .unspecified
    case 1: self = .active
    case 2: self = .inactive
    default: self = .UNRECOGNIZED(rawValue)
    }
  }

  var rawValue: Int {
    switch self {
    case .unspecified: return 0
    case .active: return 1
    case .inactive: return 2
    case .UNRECOGNIZED(let i): return i
    }
  }

}

#if swift(>=4.2)

extension Kyve_Query_V1beta1_StakerStatus: CaseIterable {
  // The compiler won't synthesize support with the UNRECOGNIZED case.
  static var allCases: [Kyve_Query_V1beta1_StakerStatus] = [
    .unspecified,
    .active,
    .inactive,
  ]
}

#endif  // swift(>=4.2)

/// QueryStakersRequest is the request type for the Query/Stakers RPC method.
struct Kyve_Query_V1beta1_QueryStakersRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// pagination defines an optional pagination for the request.
  var pagination: Cosmos_Base_Query_V1beta1_PageRequest {
    get {return _pagination ?? Cosmos_Base_Query_V1beta1_PageRequest()}
    set {_pagination = newValue}
  }
  /// Returns true if `pagination` has been explicitly set.
  var hasPagination: Bool {return self._pagination != nil}
  /// Clears the value of `pagination`. Subsequent reads from it will return its default value.
  mutating func clearPagination() {self._pagination = nil}

  /// status looks whether a staker is participating in pools or not
  var status: Kyve_Query_V1beta1_StakerStatus = .unspecified

  /// search searches for moniker OR address
  var search: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _pagination: Cosmos_Base_Query_V1beta1_PageRequest? = nil
}

/// QueryStakersResponse is the response type for the Query/Stakers RPC method.
struct Kyve_Query_V1beta1_QueryStakersResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// stakers ...
  var stakers: [Kyve_Query_V1beta1_FullStaker] = []

  /// pagination defines the pagination in the response.
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

/// QueryStakerRequest is the request type for the Query/Staker RPC method.
struct Kyve_Query_V1beta1_QueryStakerRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// address ...
  var address: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// QueryStakerResponse is the response type for the Query/Staker RPC method.
struct Kyve_Query_V1beta1_QueryStakerResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// staker ...
  var staker: Kyve_Query_V1beta1_FullStaker {
    get {return _staker ?? Kyve_Query_V1beta1_FullStaker()}
    set {_staker = newValue}
  }
  /// Returns true if `staker` has been explicitly set.
  var hasStaker: Bool {return self._staker != nil}
  /// Clears the value of `staker`. Subsequent reads from it will return its default value.
  mutating func clearStaker() {self._staker = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _staker: Kyve_Query_V1beta1_FullStaker? = nil
}

/// QueryStakersByPoolRequest is the request type for the Query/Staker RPC method.
struct Kyve_Query_V1beta1_QueryStakersByPoolRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// pool_id ...
  var poolID: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// QueryStakersByPoolResponse is the response type for the Query/Staker RPC method.
struct Kyve_Query_V1beta1_QueryStakersByPoolResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// stakers ...
  var stakers: [Kyve_Query_V1beta1_StakerPoolResponse] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// StakerPoolResponse ...
struct Kyve_Query_V1beta1_StakerPoolResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// staker ...
  var staker: Kyve_Query_V1beta1_FullStaker {
    get {return _storage._staker ?? Kyve_Query_V1beta1_FullStaker()}
    set {_uniqueStorage()._staker = newValue}
  }
  /// Returns true if `staker` has been explicitly set.
  var hasStaker: Bool {return _storage._staker != nil}
  /// Clears the value of `staker`. Subsequent reads from it will return its default value.
  mutating func clearStaker() {_uniqueStorage()._staker = nil}

  /// valaccount ...
  var valaccount: Kyve_Stakers_V1beta1_Valaccount {
    get {return _storage._valaccount ?? Kyve_Stakers_V1beta1_Valaccount()}
    set {_uniqueStorage()._valaccount = newValue}
  }
  /// Returns true if `valaccount` has been explicitly set.
  var hasValaccount: Bool {return _storage._valaccount != nil}
  /// Clears the value of `valaccount`. Subsequent reads from it will return its default value.
  mutating func clearValaccount() {_uniqueStorage()._valaccount = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _storage = _StorageClass.defaultInstance
}

/// QueryStakersByPoolCountRequest ...
struct Kyve_Query_V1beta1_QueryStakersByPoolCountRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// pagination defines an optional pagination for the request.
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

/// QueryStakersByPoolCountResponse ...
struct Kyve_Query_V1beta1_QueryStakersByPoolCountResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// stakers ...
  var stakers: [Kyve_Query_V1beta1_FullStaker] = []

  /// pagination defines the pagination in the response.
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

#if swift(>=5.5) && canImport(_Concurrency)
extension Kyve_Query_V1beta1_StakerStatus: @unchecked Sendable {}
extension Kyve_Query_V1beta1_QueryStakersRequest: @unchecked Sendable {}
extension Kyve_Query_V1beta1_QueryStakersResponse: @unchecked Sendable {}
extension Kyve_Query_V1beta1_QueryStakerRequest: @unchecked Sendable {}
extension Kyve_Query_V1beta1_QueryStakerResponse: @unchecked Sendable {}
extension Kyve_Query_V1beta1_QueryStakersByPoolRequest: @unchecked Sendable {}
extension Kyve_Query_V1beta1_QueryStakersByPoolResponse: @unchecked Sendable {}
extension Kyve_Query_V1beta1_StakerPoolResponse: @unchecked Sendable {}
extension Kyve_Query_V1beta1_QueryStakersByPoolCountRequest: @unchecked Sendable {}
extension Kyve_Query_V1beta1_QueryStakersByPoolCountResponse: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "kyve.query.v1beta1"

extension Kyve_Query_V1beta1_StakerStatus: SwiftProtobuf._ProtoNameProviding {
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    0: .same(proto: "STAKER_STATUS_UNSPECIFIED"),
    1: .same(proto: "STAKER_STATUS_ACTIVE"),
    2: .same(proto: "STAKER_STATUS_INACTIVE"),
  ]
}

extension Kyve_Query_V1beta1_QueryStakersRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryStakersRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "pagination"),
    2: .same(proto: "status"),
    3: .same(proto: "search"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._pagination) }()
      case 2: try { try decoder.decodeSingularEnumField(value: &self.status) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.search) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._pagination {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    if self.status != .unspecified {
      try visitor.visitSingularEnumField(value: self.status, fieldNumber: 2)
    }
    if !self.search.isEmpty {
      try visitor.visitSingularStringField(value: self.search, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kyve_Query_V1beta1_QueryStakersRequest, rhs: Kyve_Query_V1beta1_QueryStakersRequest) -> Bool {
    if lhs._pagination != rhs._pagination {return false}
    if lhs.status != rhs.status {return false}
    if lhs.search != rhs.search {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Kyve_Query_V1beta1_QueryStakersResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryStakersResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "stakers"),
    2: .same(proto: "pagination"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.stakers) }()
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
    if !self.stakers.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.stakers, fieldNumber: 1)
    }
    try { if let v = self._pagination {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kyve_Query_V1beta1_QueryStakersResponse, rhs: Kyve_Query_V1beta1_QueryStakersResponse) -> Bool {
    if lhs.stakers != rhs.stakers {return false}
    if lhs._pagination != rhs._pagination {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Kyve_Query_V1beta1_QueryStakerRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryStakerRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "address"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.address) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.address.isEmpty {
      try visitor.visitSingularStringField(value: self.address, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kyve_Query_V1beta1_QueryStakerRequest, rhs: Kyve_Query_V1beta1_QueryStakerRequest) -> Bool {
    if lhs.address != rhs.address {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Kyve_Query_V1beta1_QueryStakerResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryStakerResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "staker"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._staker) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._staker {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kyve_Query_V1beta1_QueryStakerResponse, rhs: Kyve_Query_V1beta1_QueryStakerResponse) -> Bool {
    if lhs._staker != rhs._staker {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Kyve_Query_V1beta1_QueryStakersByPoolRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryStakersByPoolRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "pool_id"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.poolID) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.poolID != 0 {
      try visitor.visitSingularUInt64Field(value: self.poolID, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kyve_Query_V1beta1_QueryStakersByPoolRequest, rhs: Kyve_Query_V1beta1_QueryStakersByPoolRequest) -> Bool {
    if lhs.poolID != rhs.poolID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Kyve_Query_V1beta1_QueryStakersByPoolResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryStakersByPoolResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "stakers"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.stakers) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.stakers.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.stakers, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kyve_Query_V1beta1_QueryStakersByPoolResponse, rhs: Kyve_Query_V1beta1_QueryStakersByPoolResponse) -> Bool {
    if lhs.stakers != rhs.stakers {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Kyve_Query_V1beta1_StakerPoolResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".StakerPoolResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "staker"),
    2: .same(proto: "valaccount"),
  ]

  fileprivate class _StorageClass {
    var _staker: Kyve_Query_V1beta1_FullStaker? = nil
    var _valaccount: Kyve_Stakers_V1beta1_Valaccount? = nil

    static let defaultInstance = _StorageClass()

    private init() {}

    init(copying source: _StorageClass) {
      _staker = source._staker
      _valaccount = source._valaccount
    }
  }

  fileprivate mutating func _uniqueStorage() -> _StorageClass {
    if !isKnownUniquelyReferenced(&_storage) {
      _storage = _StorageClass(copying: _storage)
    }
    return _storage
  }

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    _ = _uniqueStorage()
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      while let fieldNumber = try decoder.nextFieldNumber() {
        // The use of inline closures is to circumvent an issue where the compiler
        // allocates stack space for every case branch when no optimizations are
        // enabled. https://github.com/apple/swift-protobuf/issues/1034
        switch fieldNumber {
        case 1: try { try decoder.decodeSingularMessageField(value: &_storage._staker) }()
        case 2: try { try decoder.decodeSingularMessageField(value: &_storage._valaccount) }()
        default: break
        }
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every if/case branch local when no optimizations
      // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
      // https://github.com/apple/swift-protobuf/issues/1182
      try { if let v = _storage._staker {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
      } }()
      try { if let v = _storage._valaccount {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
      } }()
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kyve_Query_V1beta1_StakerPoolResponse, rhs: Kyve_Query_V1beta1_StakerPoolResponse) -> Bool {
    if lhs._storage !== rhs._storage {
      let storagesAreEqual: Bool = withExtendedLifetime((lhs._storage, rhs._storage)) { (_args: (_StorageClass, _StorageClass)) in
        let _storage = _args.0
        let rhs_storage = _args.1
        if _storage._staker != rhs_storage._staker {return false}
        if _storage._valaccount != rhs_storage._valaccount {return false}
        return true
      }
      if !storagesAreEqual {return false}
    }
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Kyve_Query_V1beta1_QueryStakersByPoolCountRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryStakersByPoolCountRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "pagination"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._pagination) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._pagination {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kyve_Query_V1beta1_QueryStakersByPoolCountRequest, rhs: Kyve_Query_V1beta1_QueryStakersByPoolCountRequest) -> Bool {
    if lhs._pagination != rhs._pagination {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Kyve_Query_V1beta1_QueryStakersByPoolCountResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryStakersByPoolCountResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "stakers"),
    2: .same(proto: "pagination"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.stakers) }()
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
    if !self.stakers.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.stakers, fieldNumber: 1)
    }
    try { if let v = self._pagination {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kyve_Query_V1beta1_QueryStakersByPoolCountResponse, rhs: Kyve_Query_V1beta1_QueryStakersByPoolCountResponse) -> Bool {
    if lhs.stakers != rhs.stakers {return false}
    if lhs._pagination != rhs._pagination {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
