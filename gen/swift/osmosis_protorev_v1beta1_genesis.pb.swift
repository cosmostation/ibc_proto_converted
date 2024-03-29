// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: osmosis/protorev/v1beta1/genesis.proto
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

/// GenesisState defines the protorev module's genesis state.
struct Osmosis_Protorev_V1beta1_GenesisState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// Parameters for the protorev module.
  var params: Osmosis_Protorev_V1beta1_Params {
    get {return _params ?? Osmosis_Protorev_V1beta1_Params()}
    set {_params = newValue}
  }
  /// Returns true if `params` has been explicitly set.
  var hasParams: Bool {return self._params != nil}
  /// Clears the value of `params`. Subsequent reads from it will return its default value.
  mutating func clearParams() {self._params = nil}

  /// Token pair arb routes for the protorev module (hot routes).
  var tokenPairArbRoutes: [Osmosis_Protorev_V1beta1_TokenPairArbRoutes] = []

  /// The base denominations being used to create cyclic arbitrage routes via the
  /// highest liquidity method.
  var baseDenoms: [Osmosis_Protorev_V1beta1_BaseDenom] = []

  /// The pool weights that are being used to calculate the weight (compute cost)
  /// of each route.
  var poolWeights: Osmosis_Protorev_V1beta1_PoolWeights {
    get {return _poolWeights ?? Osmosis_Protorev_V1beta1_PoolWeights()}
    set {_poolWeights = newValue}
  }
  /// Returns true if `poolWeights` has been explicitly set.
  var hasPoolWeights: Bool {return self._poolWeights != nil}
  /// Clears the value of `poolWeights`. Subsequent reads from it will return its default value.
  mutating func clearPoolWeights() {self._poolWeights = nil}

  /// The number of days since module genesis.
  var daysSinceModuleGenesis: UInt64 = 0

  /// The fees the developer account has accumulated over time.
  var developerFees: [Cosmos_Base_V1beta1_Coin] = []

  /// The latest block height that the module has processed.
  var latestBlockHeight: UInt64 = 0

  /// The developer account address of the module.
  var developerAddress: String = String()

  /// Max pool points per block i.e. the maximum compute time (in ms)
  /// that protorev can use per block.
  var maxPoolPointsPerBlock: UInt64 = 0

  /// Max pool points per tx i.e. the maximum compute time (in ms) that
  /// protorev can use per tx.
  var maxPoolPointsPerTx: UInt64 = 0

  /// The number of pool points that have been consumed in the current block.
  var pointCountForBlock: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _params: Osmosis_Protorev_V1beta1_Params? = nil
  fileprivate var _poolWeights: Osmosis_Protorev_V1beta1_PoolWeights? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Osmosis_Protorev_V1beta1_GenesisState: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "osmosis.protorev.v1beta1"

extension Osmosis_Protorev_V1beta1_GenesisState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GenesisState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "params"),
    2: .standard(proto: "token_pair_arb_routes"),
    3: .standard(proto: "base_denoms"),
    4: .standard(proto: "pool_weights"),
    5: .standard(proto: "days_since_module_genesis"),
    6: .standard(proto: "developer_fees"),
    7: .standard(proto: "latest_block_height"),
    8: .standard(proto: "developer_address"),
    9: .standard(proto: "max_pool_points_per_block"),
    10: .standard(proto: "max_pool_points_per_tx"),
    11: .standard(proto: "point_count_for_block"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._params) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.tokenPairArbRoutes) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.baseDenoms) }()
      case 4: try { try decoder.decodeSingularMessageField(value: &self._poolWeights) }()
      case 5: try { try decoder.decodeSingularUInt64Field(value: &self.daysSinceModuleGenesis) }()
      case 6: try { try decoder.decodeRepeatedMessageField(value: &self.developerFees) }()
      case 7: try { try decoder.decodeSingularUInt64Field(value: &self.latestBlockHeight) }()
      case 8: try { try decoder.decodeSingularStringField(value: &self.developerAddress) }()
      case 9: try { try decoder.decodeSingularUInt64Field(value: &self.maxPoolPointsPerBlock) }()
      case 10: try { try decoder.decodeSingularUInt64Field(value: &self.maxPoolPointsPerTx) }()
      case 11: try { try decoder.decodeSingularUInt64Field(value: &self.pointCountForBlock) }()
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
    if !self.tokenPairArbRoutes.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.tokenPairArbRoutes, fieldNumber: 2)
    }
    if !self.baseDenoms.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.baseDenoms, fieldNumber: 3)
    }
    try { if let v = self._poolWeights {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
    } }()
    if self.daysSinceModuleGenesis != 0 {
      try visitor.visitSingularUInt64Field(value: self.daysSinceModuleGenesis, fieldNumber: 5)
    }
    if !self.developerFees.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.developerFees, fieldNumber: 6)
    }
    if self.latestBlockHeight != 0 {
      try visitor.visitSingularUInt64Field(value: self.latestBlockHeight, fieldNumber: 7)
    }
    if !self.developerAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.developerAddress, fieldNumber: 8)
    }
    if self.maxPoolPointsPerBlock != 0 {
      try visitor.visitSingularUInt64Field(value: self.maxPoolPointsPerBlock, fieldNumber: 9)
    }
    if self.maxPoolPointsPerTx != 0 {
      try visitor.visitSingularUInt64Field(value: self.maxPoolPointsPerTx, fieldNumber: 10)
    }
    if self.pointCountForBlock != 0 {
      try visitor.visitSingularUInt64Field(value: self.pointCountForBlock, fieldNumber: 11)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Protorev_V1beta1_GenesisState, rhs: Osmosis_Protorev_V1beta1_GenesisState) -> Bool {
    if lhs._params != rhs._params {return false}
    if lhs.tokenPairArbRoutes != rhs.tokenPairArbRoutes {return false}
    if lhs.baseDenoms != rhs.baseDenoms {return false}
    if lhs._poolWeights != rhs._poolWeights {return false}
    if lhs.daysSinceModuleGenesis != rhs.daysSinceModuleGenesis {return false}
    if lhs.developerFees != rhs.developerFees {return false}
    if lhs.latestBlockHeight != rhs.latestBlockHeight {return false}
    if lhs.developerAddress != rhs.developerAddress {return false}
    if lhs.maxPoolPointsPerBlock != rhs.maxPoolPointsPerBlock {return false}
    if lhs.maxPoolPointsPerTx != rhs.maxPoolPointsPerTx {return false}
    if lhs.pointCountForBlock != rhs.pointCountForBlock {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
