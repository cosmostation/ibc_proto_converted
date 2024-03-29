// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: em/market/v1/query.proto
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

struct Em_Market_V1_QueryByAccountRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var address: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Em_Market_V1_QueryByAccountResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var orders: [Em_Market_V1_Order] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Em_Market_V1_QueryInstrumentsRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Em_Market_V1_QueryInstrumentsResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var instruments: [Em_Market_V1_QueryInstrumentsResponse.Element] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  struct Element {
    // SwiftProtobuf.Message conformance is added in an extension below. See the
    // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
    // methods supported on all messages.

    var source: String = String()

    var destination: String = String()

    var lastPrice: String = String()

    var bestPrice: String = String()

    var lastTraded: SwiftProtobuf.Google_Protobuf_Timestamp {
      get {return _lastTraded ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
      set {_lastTraded = newValue}
    }
    /// Returns true if `lastTraded` has been explicitly set.
    var hasLastTraded: Bool {return self._lastTraded != nil}
    /// Clears the value of `lastTraded`. Subsequent reads from it will return its default value.
    mutating func clearLastTraded() {self._lastTraded = nil}

    var unknownFields = SwiftProtobuf.UnknownStorage()

    init() {}

    fileprivate var _lastTraded: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
  }

  init() {}
}

struct Em_Market_V1_QueryInstrumentRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var source: String = String()

  var destination: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Em_Market_V1_QueryInstrumentResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var source: String = String()

  var destination: String = String()

  var orders: [Em_Market_V1_QueryOrderResponse] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Em_Market_V1_QueryOrderResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var id: UInt64 = 0

  var owner: String = String()

  var sourceRemaining: String = String()

  var clientOrderID: String = String()

  var price: String = String()

  var created: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _created ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_created = newValue}
  }
  /// Returns true if `created` has been explicitly set.
  var hasCreated: Bool {return self._created != nil}
  /// Clears the value of `created`. Subsequent reads from it will return its default value.
  mutating func clearCreated() {self._created = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _created: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Em_Market_V1_QueryByAccountRequest: @unchecked Sendable {}
extension Em_Market_V1_QueryByAccountResponse: @unchecked Sendable {}
extension Em_Market_V1_QueryInstrumentsRequest: @unchecked Sendable {}
extension Em_Market_V1_QueryInstrumentsResponse: @unchecked Sendable {}
extension Em_Market_V1_QueryInstrumentsResponse.Element: @unchecked Sendable {}
extension Em_Market_V1_QueryInstrumentRequest: @unchecked Sendable {}
extension Em_Market_V1_QueryInstrumentResponse: @unchecked Sendable {}
extension Em_Market_V1_QueryOrderResponse: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "em.market.v1"

extension Em_Market_V1_QueryByAccountRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryByAccountRequest"
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

  static func ==(lhs: Em_Market_V1_QueryByAccountRequest, rhs: Em_Market_V1_QueryByAccountRequest) -> Bool {
    if lhs.address != rhs.address {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Em_Market_V1_QueryByAccountResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryByAccountResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "orders"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.orders) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.orders.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.orders, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Em_Market_V1_QueryByAccountResponse, rhs: Em_Market_V1_QueryByAccountResponse) -> Bool {
    if lhs.orders != rhs.orders {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Em_Market_V1_QueryInstrumentsRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryInstrumentsRequest"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Em_Market_V1_QueryInstrumentsRequest, rhs: Em_Market_V1_QueryInstrumentsRequest) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Em_Market_V1_QueryInstrumentsResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryInstrumentsResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "instruments"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.instruments) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.instruments.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.instruments, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Em_Market_V1_QueryInstrumentsResponse, rhs: Em_Market_V1_QueryInstrumentsResponse) -> Bool {
    if lhs.instruments != rhs.instruments {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Em_Market_V1_QueryInstrumentsResponse.Element: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = Em_Market_V1_QueryInstrumentsResponse.protoMessageName + ".Element"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "source"),
    2: .same(proto: "destination"),
    3: .standard(proto: "last_price"),
    4: .standard(proto: "best_price"),
    5: .standard(proto: "last_traded"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.source) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.destination) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.lastPrice) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.bestPrice) }()
      case 5: try { try decoder.decodeSingularMessageField(value: &self._lastTraded) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.source.isEmpty {
      try visitor.visitSingularStringField(value: self.source, fieldNumber: 1)
    }
    if !self.destination.isEmpty {
      try visitor.visitSingularStringField(value: self.destination, fieldNumber: 2)
    }
    if !self.lastPrice.isEmpty {
      try visitor.visitSingularStringField(value: self.lastPrice, fieldNumber: 3)
    }
    if !self.bestPrice.isEmpty {
      try visitor.visitSingularStringField(value: self.bestPrice, fieldNumber: 4)
    }
    try { if let v = self._lastTraded {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 5)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Em_Market_V1_QueryInstrumentsResponse.Element, rhs: Em_Market_V1_QueryInstrumentsResponse.Element) -> Bool {
    if lhs.source != rhs.source {return false}
    if lhs.destination != rhs.destination {return false}
    if lhs.lastPrice != rhs.lastPrice {return false}
    if lhs.bestPrice != rhs.bestPrice {return false}
    if lhs._lastTraded != rhs._lastTraded {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Em_Market_V1_QueryInstrumentRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryInstrumentRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "source"),
    2: .same(proto: "destination"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.source) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.destination) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.source.isEmpty {
      try visitor.visitSingularStringField(value: self.source, fieldNumber: 1)
    }
    if !self.destination.isEmpty {
      try visitor.visitSingularStringField(value: self.destination, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Em_Market_V1_QueryInstrumentRequest, rhs: Em_Market_V1_QueryInstrumentRequest) -> Bool {
    if lhs.source != rhs.source {return false}
    if lhs.destination != rhs.destination {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Em_Market_V1_QueryInstrumentResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryInstrumentResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "source"),
    2: .same(proto: "destination"),
    3: .same(proto: "orders"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.source) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.destination) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.orders) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.source.isEmpty {
      try visitor.visitSingularStringField(value: self.source, fieldNumber: 1)
    }
    if !self.destination.isEmpty {
      try visitor.visitSingularStringField(value: self.destination, fieldNumber: 2)
    }
    if !self.orders.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.orders, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Em_Market_V1_QueryInstrumentResponse, rhs: Em_Market_V1_QueryInstrumentResponse) -> Bool {
    if lhs.source != rhs.source {return false}
    if lhs.destination != rhs.destination {return false}
    if lhs.orders != rhs.orders {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Em_Market_V1_QueryOrderResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryOrderResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
    2: .same(proto: "owner"),
    3: .standard(proto: "source_remaining"),
    4: .standard(proto: "client_order_id"),
    5: .same(proto: "price"),
    6: .same(proto: "created"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.id) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.owner) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.sourceRemaining) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.clientOrderID) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.price) }()
      case 6: try { try decoder.decodeSingularMessageField(value: &self._created) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if self.id != 0 {
      try visitor.visitSingularUInt64Field(value: self.id, fieldNumber: 1)
    }
    if !self.owner.isEmpty {
      try visitor.visitSingularStringField(value: self.owner, fieldNumber: 2)
    }
    if !self.sourceRemaining.isEmpty {
      try visitor.visitSingularStringField(value: self.sourceRemaining, fieldNumber: 3)
    }
    if !self.clientOrderID.isEmpty {
      try visitor.visitSingularStringField(value: self.clientOrderID, fieldNumber: 4)
    }
    if !self.price.isEmpty {
      try visitor.visitSingularStringField(value: self.price, fieldNumber: 5)
    }
    try { if let v = self._created {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 6)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Em_Market_V1_QueryOrderResponse, rhs: Em_Market_V1_QueryOrderResponse) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs.owner != rhs.owner {return false}
    if lhs.sourceRemaining != rhs.sourceRemaining {return false}
    if lhs.clientOrderID != rhs.clientOrderID {return false}
    if lhs.price != rhs.price {return false}
    if lhs._created != rhs._created {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
