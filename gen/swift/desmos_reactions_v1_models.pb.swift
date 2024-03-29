// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: desmos/reactions/v1/models.proto
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

/// Reaction contains the data of a single post reaction
struct Desmos_Reactions_V1_Reaction {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// Id of the subspace inside which the reaction has been put
  var subspaceID: UInt64 = 0

  /// Id of the post to which the reaction is associated
  var postID: UInt64 = 0

  /// Id of the reaction within the post
  var id: UInt32 = 0

  /// Value of the reaction.
  var value: SwiftProtobuf.Google_Protobuf_Any {
    get {return _value ?? SwiftProtobuf.Google_Protobuf_Any()}
    set {_value = newValue}
  }
  /// Returns true if `value` has been explicitly set.
  var hasValue: Bool {return self._value != nil}
  /// Clears the value of `value`. Subsequent reads from it will return its default value.
  mutating func clearValue() {self._value = nil}

  /// Author of the reaction
  var author: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _value: SwiftProtobuf.Google_Protobuf_Any? = nil
}

/// RegisteredReactionValue contains the details of a reaction value that
/// references a reaction registered within the subspace
struct Desmos_Reactions_V1_RegisteredReactionValue {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// Id of the registered reaction
  var registeredReactionID: UInt32 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// FreeTextValue contains the details of a reaction value that
/// is made of free text
struct Desmos_Reactions_V1_FreeTextValue {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var text: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// RegisteredReaction contains the details of a registered reaction within a
/// subspace
struct Desmos_Reactions_V1_RegisteredReaction {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// Id of the subspace for which this reaction has been registered
  var subspaceID: UInt64 = 0

  /// Id of the registered reaction
  var id: UInt32 = 0

  /// Unique shorthand code associated to this reaction
  var shorthandCode: String = String()

  /// Value that should be displayed when using this reaction
  var displayValue: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// SubspaceReactionsParams contains the params related to a single subspace
/// reactions
struct Desmos_Reactions_V1_SubspaceReactionsParams {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// Id of the subspace for which these params are valid
  var subspaceID: UInt64 = 0

  /// Params related to RegisteredReactionValue reactions
  var registeredReaction: Desmos_Reactions_V1_RegisteredReactionValueParams {
    get {return _registeredReaction ?? Desmos_Reactions_V1_RegisteredReactionValueParams()}
    set {_registeredReaction = newValue}
  }
  /// Returns true if `registeredReaction` has been explicitly set.
  var hasRegisteredReaction: Bool {return self._registeredReaction != nil}
  /// Clears the value of `registeredReaction`. Subsequent reads from it will return its default value.
  mutating func clearRegisteredReaction() {self._registeredReaction = nil}

  /// Params related to FreeTextValue reactions
  var freeText: Desmos_Reactions_V1_FreeTextValueParams {
    get {return _freeText ?? Desmos_Reactions_V1_FreeTextValueParams()}
    set {_freeText = newValue}
  }
  /// Returns true if `freeText` has been explicitly set.
  var hasFreeText: Bool {return self._freeText != nil}
  /// Clears the value of `freeText`. Subsequent reads from it will return its default value.
  mutating func clearFreeText() {self._freeText = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _registeredReaction: Desmos_Reactions_V1_RegisteredReactionValueParams? = nil
  fileprivate var _freeText: Desmos_Reactions_V1_FreeTextValueParams? = nil
}

/// FreeTextValueParams contains the params for FreeTextValue based reactions
struct Desmos_Reactions_V1_FreeTextValueParams {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// Whether FreeTextValue reactions should be enabled
  var enabled: Bool = false

  /// The max length that FreeTextValue reactions should have
  var maxLength: UInt32 = 0

  /// RegEx that each FreeTextValue should respect.
  /// This is useful to limit what characters can be used as a reaction.
  var regEx: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// RegisteredReactionValueParams contains the params for RegisteredReactionValue
/// based reactions
struct Desmos_Reactions_V1_RegisteredReactionValueParams {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// Whether RegisteredReactionValue reactions should be enabled
  var enabled: Bool = false

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Desmos_Reactions_V1_Reaction: @unchecked Sendable {}
extension Desmos_Reactions_V1_RegisteredReactionValue: @unchecked Sendable {}
extension Desmos_Reactions_V1_FreeTextValue: @unchecked Sendable {}
extension Desmos_Reactions_V1_RegisteredReaction: @unchecked Sendable {}
extension Desmos_Reactions_V1_SubspaceReactionsParams: @unchecked Sendable {}
extension Desmos_Reactions_V1_FreeTextValueParams: @unchecked Sendable {}
extension Desmos_Reactions_V1_RegisteredReactionValueParams: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "desmos.reactions.v1"

extension Desmos_Reactions_V1_Reaction: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Reaction"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "subspace_id"),
    2: .standard(proto: "post_id"),
    3: .same(proto: "id"),
    4: .same(proto: "value"),
    5: .same(proto: "author"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.subspaceID) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.postID) }()
      case 3: try { try decoder.decodeSingularUInt32Field(value: &self.id) }()
      case 4: try { try decoder.decodeSingularMessageField(value: &self._value) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.author) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if self.subspaceID != 0 {
      try visitor.visitSingularUInt64Field(value: self.subspaceID, fieldNumber: 1)
    }
    if self.postID != 0 {
      try visitor.visitSingularUInt64Field(value: self.postID, fieldNumber: 2)
    }
    if self.id != 0 {
      try visitor.visitSingularUInt32Field(value: self.id, fieldNumber: 3)
    }
    try { if let v = self._value {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
    } }()
    if !self.author.isEmpty {
      try visitor.visitSingularStringField(value: self.author, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Desmos_Reactions_V1_Reaction, rhs: Desmos_Reactions_V1_Reaction) -> Bool {
    if lhs.subspaceID != rhs.subspaceID {return false}
    if lhs.postID != rhs.postID {return false}
    if lhs.id != rhs.id {return false}
    if lhs._value != rhs._value {return false}
    if lhs.author != rhs.author {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Desmos_Reactions_V1_RegisteredReactionValue: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".RegisteredReactionValue"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "registered_reaction_id"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt32Field(value: &self.registeredReactionID) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.registeredReactionID != 0 {
      try visitor.visitSingularUInt32Field(value: self.registeredReactionID, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Desmos_Reactions_V1_RegisteredReactionValue, rhs: Desmos_Reactions_V1_RegisteredReactionValue) -> Bool {
    if lhs.registeredReactionID != rhs.registeredReactionID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Desmos_Reactions_V1_FreeTextValue: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".FreeTextValue"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "text"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.text) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.text.isEmpty {
      try visitor.visitSingularStringField(value: self.text, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Desmos_Reactions_V1_FreeTextValue, rhs: Desmos_Reactions_V1_FreeTextValue) -> Bool {
    if lhs.text != rhs.text {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Desmos_Reactions_V1_RegisteredReaction: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".RegisteredReaction"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "subspace_id"),
    2: .same(proto: "id"),
    3: .standard(proto: "shorthand_code"),
    4: .standard(proto: "display_value"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.subspaceID) }()
      case 2: try { try decoder.decodeSingularUInt32Field(value: &self.id) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.shorthandCode) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.displayValue) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.subspaceID != 0 {
      try visitor.visitSingularUInt64Field(value: self.subspaceID, fieldNumber: 1)
    }
    if self.id != 0 {
      try visitor.visitSingularUInt32Field(value: self.id, fieldNumber: 2)
    }
    if !self.shorthandCode.isEmpty {
      try visitor.visitSingularStringField(value: self.shorthandCode, fieldNumber: 3)
    }
    if !self.displayValue.isEmpty {
      try visitor.visitSingularStringField(value: self.displayValue, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Desmos_Reactions_V1_RegisteredReaction, rhs: Desmos_Reactions_V1_RegisteredReaction) -> Bool {
    if lhs.subspaceID != rhs.subspaceID {return false}
    if lhs.id != rhs.id {return false}
    if lhs.shorthandCode != rhs.shorthandCode {return false}
    if lhs.displayValue != rhs.displayValue {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Desmos_Reactions_V1_SubspaceReactionsParams: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".SubspaceReactionsParams"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "subspace_id"),
    2: .standard(proto: "registered_reaction"),
    3: .standard(proto: "free_text"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.subspaceID) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._registeredReaction) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._freeText) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if self.subspaceID != 0 {
      try visitor.visitSingularUInt64Field(value: self.subspaceID, fieldNumber: 1)
    }
    try { if let v = self._registeredReaction {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try { if let v = self._freeText {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Desmos_Reactions_V1_SubspaceReactionsParams, rhs: Desmos_Reactions_V1_SubspaceReactionsParams) -> Bool {
    if lhs.subspaceID != rhs.subspaceID {return false}
    if lhs._registeredReaction != rhs._registeredReaction {return false}
    if lhs._freeText != rhs._freeText {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Desmos_Reactions_V1_FreeTextValueParams: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".FreeTextValueParams"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "enabled"),
    2: .standard(proto: "max_length"),
    3: .standard(proto: "reg_ex"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBoolField(value: &self.enabled) }()
      case 2: try { try decoder.decodeSingularUInt32Field(value: &self.maxLength) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.regEx) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.enabled != false {
      try visitor.visitSingularBoolField(value: self.enabled, fieldNumber: 1)
    }
    if self.maxLength != 0 {
      try visitor.visitSingularUInt32Field(value: self.maxLength, fieldNumber: 2)
    }
    if !self.regEx.isEmpty {
      try visitor.visitSingularStringField(value: self.regEx, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Desmos_Reactions_V1_FreeTextValueParams, rhs: Desmos_Reactions_V1_FreeTextValueParams) -> Bool {
    if lhs.enabled != rhs.enabled {return false}
    if lhs.maxLength != rhs.maxLength {return false}
    if lhs.regEx != rhs.regEx {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Desmos_Reactions_V1_RegisteredReactionValueParams: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".RegisteredReactionValueParams"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "enabled"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBoolField(value: &self.enabled) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.enabled != false {
      try visitor.visitSingularBoolField(value: self.enabled, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Desmos_Reactions_V1_RegisteredReactionValueParams, rhs: Desmos_Reactions_V1_RegisteredReactionValueParams) -> Bool {
    if lhs.enabled != rhs.enabled {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
