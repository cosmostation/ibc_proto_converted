// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: comdex/locker/v1beta1/genesis.proto
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

struct Comdex_Locker_V1beta1_GenesisState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var lockers: [Comdex_Locker_V1beta1_Locker] = []

  var lockerProductAssetMapping: [Comdex_Locker_V1beta1_LockerProductAssetMapping] = []

  var lockerTotalRewardsByAssetAppWise: [Comdex_Locker_V1beta1_LockerTotalRewardsByAssetAppWise] = []

  var lockerLookupTable: [Comdex_Locker_V1beta1_LockerLookupTableData] = []

  var userLockerAssetMapping: [Comdex_Locker_V1beta1_UserAppAssetLockerMapping] = []

  var params: Comdex_Locker_V1beta1_Params {
    get {return _params ?? Comdex_Locker_V1beta1_Params()}
    set {_params = newValue}
  }
  /// Returns true if `params` has been explicitly set.
  var hasParams: Bool {return self._params != nil}
  /// Clears the value of `params`. Subsequent reads from it will return its default value.
  mutating func clearParams() {self._params = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _params: Comdex_Locker_V1beta1_Params? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Comdex_Locker_V1beta1_GenesisState: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "comdex.locker.v1beta1"

extension Comdex_Locker_V1beta1_GenesisState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GenesisState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "lockers"),
    2: .same(proto: "lockerProductAssetMapping"),
    3: .same(proto: "lockerTotalRewardsByAssetAppWise"),
    4: .same(proto: "lockerLookupTable"),
    5: .same(proto: "userLockerAssetMapping"),
    6: .same(proto: "params"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.lockers) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.lockerProductAssetMapping) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.lockerTotalRewardsByAssetAppWise) }()
      case 4: try { try decoder.decodeRepeatedMessageField(value: &self.lockerLookupTable) }()
      case 5: try { try decoder.decodeRepeatedMessageField(value: &self.userLockerAssetMapping) }()
      case 6: try { try decoder.decodeSingularMessageField(value: &self._params) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.lockers.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.lockers, fieldNumber: 1)
    }
    if !self.lockerProductAssetMapping.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.lockerProductAssetMapping, fieldNumber: 2)
    }
    if !self.lockerTotalRewardsByAssetAppWise.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.lockerTotalRewardsByAssetAppWise, fieldNumber: 3)
    }
    if !self.lockerLookupTable.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.lockerLookupTable, fieldNumber: 4)
    }
    if !self.userLockerAssetMapping.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.userLockerAssetMapping, fieldNumber: 5)
    }
    try { if let v = self._params {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 6)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Comdex_Locker_V1beta1_GenesisState, rhs: Comdex_Locker_V1beta1_GenesisState) -> Bool {
    if lhs.lockers != rhs.lockers {return false}
    if lhs.lockerProductAssetMapping != rhs.lockerProductAssetMapping {return false}
    if lhs.lockerTotalRewardsByAssetAppWise != rhs.lockerTotalRewardsByAssetAppWise {return false}
    if lhs.lockerLookupTable != rhs.lockerLookupTable {return false}
    if lhs.userLockerAssetMapping != rhs.userLockerAssetMapping {return false}
    if lhs._params != rhs._params {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
