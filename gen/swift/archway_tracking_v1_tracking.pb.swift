// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: archway/tracking/v1/tracking.proto
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

/// ContractOperation denotes which operation consumed gas.
enum Archway_Tracking_V1_ContractOperation: SwiftProtobuf.Enum {
  typealias RawValue = Int

  /// Invalid or unknown operation
  case unspecified // = 0

  /// Instantiate operation
  case instantiation // = 1

  /// Execute operation
  case execution // = 2

  /// Query
  case query // = 3

  /// Migrate operation
  case migrate // = 4

  /// IBC operations
  case ibc // = 5

  /// Sudo operation
  case sudo // = 6

  /// Reply callback operation
  case reply // = 7
  case UNRECOGNIZED(Int)

  init() {
    self = .unspecified
  }

  init?(rawValue: Int) {
    switch rawValue {
    case 0: self = .unspecified
    case 1: self = .instantiation
    case 2: self = .execution
    case 3: self = .query
    case 4: self = .migrate
    case 5: self = .ibc
    case 6: self = .sudo
    case 7: self = .reply
    default: self = .UNRECOGNIZED(rawValue)
    }
  }

  var rawValue: Int {
    switch self {
    case .unspecified: return 0
    case .instantiation: return 1
    case .execution: return 2
    case .query: return 3
    case .migrate: return 4
    case .ibc: return 5
    case .sudo: return 6
    case .reply: return 7
    case .UNRECOGNIZED(let i): return i
    }
  }

}

#if swift(>=4.2)

extension Archway_Tracking_V1_ContractOperation: CaseIterable {
  // The compiler won't synthesize support with the UNRECOGNIZED case.
  static var allCases: [Archway_Tracking_V1_ContractOperation] = [
    .unspecified,
    .instantiation,
    .execution,
    .query,
    .migrate,
    .ibc,
    .sudo,
    .reply,
  ]
}

#endif  // swift(>=4.2)

/// TxInfo keeps a transaction gas tracking data.
/// Object is being created at the module EndBlocker.
struct Archway_Tracking_V1_TxInfo {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// id defines the unique transaction ID.
  var id: UInt64 = 0

  /// height defines the block height of the transaction.
  var height: Int64 = 0

  /// total_gas defines total gas consumption by the transaction.
  /// It is the sum of gas consumed by all contract operations (VM + SDK gas).
  var totalGas: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// ContractOperationInfo keeps a single contract operation gas consumption data.
/// Object is being created by the IngestGasRecord call from the wasmd.
struct Archway_Tracking_V1_ContractOperationInfo {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// id defines the unique operation ID.
  var id: UInt64 = 0

  /// tx_id defines a transaction ID operation relates to (TxInfo.id).
  var txID: UInt64 = 0

  /// contract_address defines the contract address operation relates to.
  var contractAddress: String = String()

  /// operation_type defines the gas consumption type.
  var operationType: Archway_Tracking_V1_ContractOperation = .unspecified

  /// vm_gas is the gas consumption reported by the WASM VM.
  /// Value is adjusted by this module (CalculateUpdatedGas func).
  var vmGas: UInt64 = 0

  /// sdk_gas is the gas consumption reported by the SDK gas meter and the WASM
  /// GasRegister (cost of Execute/Query/etc). Value is adjusted by this module
  /// (CalculateUpdatedGas func).
  var sdkGas: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// BlockTracking is the tracking information for a block.
struct Archway_Tracking_V1_BlockTracking {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// txs defines the list of transactions tracked in the block.
  var txs: [Archway_Tracking_V1_TxTracking] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// TxTracking is the tracking information for a single transaction.
struct Archway_Tracking_V1_TxTracking {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// info defines the transaction details.
  var info: Archway_Tracking_V1_TxInfo {
    get {return _info ?? Archway_Tracking_V1_TxInfo()}
    set {_info = newValue}
  }
  /// Returns true if `info` has been explicitly set.
  var hasInfo: Bool {return self._info != nil}
  /// Clears the value of `info`. Subsequent reads from it will return its default value.
  mutating func clearInfo() {self._info = nil}

  /// contract_operations defines the list of contract operations consumed by the
  /// transaction.
  var contractOperations: [Archway_Tracking_V1_ContractOperationInfo] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _info: Archway_Tracking_V1_TxInfo? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Archway_Tracking_V1_ContractOperation: @unchecked Sendable {}
extension Archway_Tracking_V1_TxInfo: @unchecked Sendable {}
extension Archway_Tracking_V1_ContractOperationInfo: @unchecked Sendable {}
extension Archway_Tracking_V1_BlockTracking: @unchecked Sendable {}
extension Archway_Tracking_V1_TxTracking: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "archway.tracking.v1"

extension Archway_Tracking_V1_ContractOperation: SwiftProtobuf._ProtoNameProviding {
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    0: .same(proto: "CONTRACT_OPERATION_UNSPECIFIED"),
    1: .same(proto: "CONTRACT_OPERATION_INSTANTIATION"),
    2: .same(proto: "CONTRACT_OPERATION_EXECUTION"),
    3: .same(proto: "CONTRACT_OPERATION_QUERY"),
    4: .same(proto: "CONTRACT_OPERATION_MIGRATE"),
    5: .same(proto: "CONTRACT_OPERATION_IBC"),
    6: .same(proto: "CONTRACT_OPERATION_SUDO"),
    7: .same(proto: "CONTRACT_OPERATION_REPLY"),
  ]
}

extension Archway_Tracking_V1_TxInfo: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".TxInfo"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
    2: .same(proto: "height"),
    3: .standard(proto: "total_gas"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.id) }()
      case 2: try { try decoder.decodeSingularInt64Field(value: &self.height) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.totalGas) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.id != 0 {
      try visitor.visitSingularUInt64Field(value: self.id, fieldNumber: 1)
    }
    if self.height != 0 {
      try visitor.visitSingularInt64Field(value: self.height, fieldNumber: 2)
    }
    if self.totalGas != 0 {
      try visitor.visitSingularUInt64Field(value: self.totalGas, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Archway_Tracking_V1_TxInfo, rhs: Archway_Tracking_V1_TxInfo) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs.height != rhs.height {return false}
    if lhs.totalGas != rhs.totalGas {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Archway_Tracking_V1_ContractOperationInfo: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ContractOperationInfo"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
    2: .standard(proto: "tx_id"),
    3: .standard(proto: "contract_address"),
    4: .standard(proto: "operation_type"),
    5: .standard(proto: "vm_gas"),
    6: .standard(proto: "sdk_gas"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.id) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.txID) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.contractAddress) }()
      case 4: try { try decoder.decodeSingularEnumField(value: &self.operationType) }()
      case 5: try { try decoder.decodeSingularUInt64Field(value: &self.vmGas) }()
      case 6: try { try decoder.decodeSingularUInt64Field(value: &self.sdkGas) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.id != 0 {
      try visitor.visitSingularUInt64Field(value: self.id, fieldNumber: 1)
    }
    if self.txID != 0 {
      try visitor.visitSingularUInt64Field(value: self.txID, fieldNumber: 2)
    }
    if !self.contractAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.contractAddress, fieldNumber: 3)
    }
    if self.operationType != .unspecified {
      try visitor.visitSingularEnumField(value: self.operationType, fieldNumber: 4)
    }
    if self.vmGas != 0 {
      try visitor.visitSingularUInt64Field(value: self.vmGas, fieldNumber: 5)
    }
    if self.sdkGas != 0 {
      try visitor.visitSingularUInt64Field(value: self.sdkGas, fieldNumber: 6)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Archway_Tracking_V1_ContractOperationInfo, rhs: Archway_Tracking_V1_ContractOperationInfo) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs.txID != rhs.txID {return false}
    if lhs.contractAddress != rhs.contractAddress {return false}
    if lhs.operationType != rhs.operationType {return false}
    if lhs.vmGas != rhs.vmGas {return false}
    if lhs.sdkGas != rhs.sdkGas {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Archway_Tracking_V1_BlockTracking: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".BlockTracking"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "txs"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.txs) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.txs.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.txs, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Archway_Tracking_V1_BlockTracking, rhs: Archway_Tracking_V1_BlockTracking) -> Bool {
    if lhs.txs != rhs.txs {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Archway_Tracking_V1_TxTracking: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".TxTracking"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "info"),
    2: .standard(proto: "contract_operations"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._info) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.contractOperations) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._info {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    if !self.contractOperations.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.contractOperations, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Archway_Tracking_V1_TxTracking, rhs: Archway_Tracking_V1_TxTracking) -> Bool {
    if lhs._info != rhs._info {return false}
    if lhs.contractOperations != rhs.contractOperations {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
