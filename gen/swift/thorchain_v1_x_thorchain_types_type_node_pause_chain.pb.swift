// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: thorchain/v1/x/thorchain/types/type_node_pause_chain.proto
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

struct Types_NodePauseChain {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var nodeAddress: Data = Data()

  var blockHeight: Int64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Types_NodePauseChain: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "types"

extension Types_NodePauseChain: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".NodePauseChain"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "node_address"),
    2: .standard(proto: "block_height"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBytesField(value: &self.nodeAddress) }()
      case 2: try { try decoder.decodeSingularInt64Field(value: &self.blockHeight) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.nodeAddress.isEmpty {
      try visitor.visitSingularBytesField(value: self.nodeAddress, fieldNumber: 1)
    }
    if self.blockHeight != 0 {
      try visitor.visitSingularInt64Field(value: self.blockHeight, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Types_NodePauseChain, rhs: Types_NodePauseChain) -> Bool {
    if lhs.nodeAddress != rhs.nodeAddress {return false}
    if lhs.blockHeight != rhs.blockHeight {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}