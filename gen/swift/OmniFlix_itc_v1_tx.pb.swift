// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: OmniFlix/itc/v1/tx.proto
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

struct OmniFlix_Itc_V1_MsgCreateCampaign {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var name: String {
    get {return _storage._name}
    set {_uniqueStorage()._name = newValue}
  }

  var description_p: String {
    get {return _storage._description_p}
    set {_uniqueStorage()._description_p = newValue}
  }

  var interaction: OmniFlix_Itc_V1_InteractionType {
    get {return _storage._interaction}
    set {_uniqueStorage()._interaction = newValue}
  }

  var claimType: OmniFlix_Itc_V1_ClaimType {
    get {return _storage._claimType}
    set {_uniqueStorage()._claimType = newValue}
  }

  var nftDenomID: String {
    get {return _storage._nftDenomID}
    set {_uniqueStorage()._nftDenomID = newValue}
  }

  var tokensPerClaim: Cosmos_Base_V1beta1_Coin {
    get {return _storage._tokensPerClaim ?? Cosmos_Base_V1beta1_Coin()}
    set {_uniqueStorage()._tokensPerClaim = newValue}
  }
  /// Returns true if `tokensPerClaim` has been explicitly set.
  var hasTokensPerClaim: Bool {return _storage._tokensPerClaim != nil}
  /// Clears the value of `tokensPerClaim`. Subsequent reads from it will return its default value.
  mutating func clearTokensPerClaim() {_uniqueStorage()._tokensPerClaim = nil}

  var maxAllowedClaims: UInt64 {
    get {return _storage._maxAllowedClaims}
    set {_uniqueStorage()._maxAllowedClaims = newValue}
  }

  var deposit: Cosmos_Base_V1beta1_Coin {
    get {return _storage._deposit ?? Cosmos_Base_V1beta1_Coin()}
    set {_uniqueStorage()._deposit = newValue}
  }
  /// Returns true if `deposit` has been explicitly set.
  var hasDeposit: Bool {return _storage._deposit != nil}
  /// Clears the value of `deposit`. Subsequent reads from it will return its default value.
  mutating func clearDeposit() {_uniqueStorage()._deposit = nil}

  var nftMintDetails: OmniFlix_Itc_V1_NFTDetails {
    get {return _storage._nftMintDetails ?? OmniFlix_Itc_V1_NFTDetails()}
    set {_uniqueStorage()._nftMintDetails = newValue}
  }
  /// Returns true if `nftMintDetails` has been explicitly set.
  var hasNftMintDetails: Bool {return _storage._nftMintDetails != nil}
  /// Clears the value of `nftMintDetails`. Subsequent reads from it will return its default value.
  mutating func clearNftMintDetails() {_uniqueStorage()._nftMintDetails = nil}

  var startTime: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _storage._startTime ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_uniqueStorage()._startTime = newValue}
  }
  /// Returns true if `startTime` has been explicitly set.
  var hasStartTime: Bool {return _storage._startTime != nil}
  /// Clears the value of `startTime`. Subsequent reads from it will return its default value.
  mutating func clearStartTime() {_uniqueStorage()._startTime = nil}

  var duration: SwiftProtobuf.Google_Protobuf_Duration {
    get {return _storage._duration ?? SwiftProtobuf.Google_Protobuf_Duration()}
    set {_uniqueStorage()._duration = newValue}
  }
  /// Returns true if `duration` has been explicitly set.
  var hasDuration: Bool {return _storage._duration != nil}
  /// Clears the value of `duration`. Subsequent reads from it will return its default value.
  mutating func clearDuration() {_uniqueStorage()._duration = nil}

  var distribution: OmniFlix_Itc_V1_Distribution {
    get {return _storage._distribution ?? OmniFlix_Itc_V1_Distribution()}
    set {_uniqueStorage()._distribution = newValue}
  }
  /// Returns true if `distribution` has been explicitly set.
  var hasDistribution: Bool {return _storage._distribution != nil}
  /// Clears the value of `distribution`. Subsequent reads from it will return its default value.
  mutating func clearDistribution() {_uniqueStorage()._distribution = nil}

  var creator: String {
    get {return _storage._creator}
    set {_uniqueStorage()._creator = newValue}
  }

  var creationFee: Cosmos_Base_V1beta1_Coin {
    get {return _storage._creationFee ?? Cosmos_Base_V1beta1_Coin()}
    set {_uniqueStorage()._creationFee = newValue}
  }
  /// Returns true if `creationFee` has been explicitly set.
  var hasCreationFee: Bool {return _storage._creationFee != nil}
  /// Clears the value of `creationFee`. Subsequent reads from it will return its default value.
  mutating func clearCreationFee() {_uniqueStorage()._creationFee = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _storage = _StorageClass.defaultInstance
}

struct OmniFlix_Itc_V1_MsgCreateCampaignResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct OmniFlix_Itc_V1_MsgCancelCampaign {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var campaignID: UInt64 = 0

  var creator: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct OmniFlix_Itc_V1_MsgCancelCampaignResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct OmniFlix_Itc_V1_MsgClaim {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var campaignID: UInt64 = 0

  var nftID: String = String()

  var interaction: OmniFlix_Itc_V1_InteractionType = .burn

  var claimer: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct OmniFlix_Itc_V1_MsgClaimResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct OmniFlix_Itc_V1_MsgDepositCampaign {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var campaignID: UInt64 = 0

  var amount: Cosmos_Base_V1beta1_Coin {
    get {return _amount ?? Cosmos_Base_V1beta1_Coin()}
    set {_amount = newValue}
  }
  /// Returns true if `amount` has been explicitly set.
  var hasAmount: Bool {return self._amount != nil}
  /// Clears the value of `amount`. Subsequent reads from it will return its default value.
  mutating func clearAmount() {self._amount = nil}

  var depositor: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _amount: Cosmos_Base_V1beta1_Coin? = nil
}

struct OmniFlix_Itc_V1_MsgDepositCampaignResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgUpdateParams is the Msg/UpdateParams request type.
///
/// Since: cosmos-sdk 0.47
struct OmniFlix_Itc_V1_MsgUpdateParams {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// authority is the address of the governance account.
  var authority: String = String()

  /// params defines the x/itc parameters to update.
  ///
  /// NOTE: All parameters must be supplied.
  var params: OmniFlix_Itc_V1_Params {
    get {return _params ?? OmniFlix_Itc_V1_Params()}
    set {_params = newValue}
  }
  /// Returns true if `params` has been explicitly set.
  var hasParams: Bool {return self._params != nil}
  /// Clears the value of `params`. Subsequent reads from it will return its default value.
  mutating func clearParams() {self._params = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _params: OmniFlix_Itc_V1_Params? = nil
}

/// MsgUpdateParamsResponse defines the response structure for executing a
/// MsgUpdateParams message.
///
/// Since: cosmos-sdk 0.47
struct OmniFlix_Itc_V1_MsgUpdateParamsResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension OmniFlix_Itc_V1_MsgCreateCampaign: @unchecked Sendable {}
extension OmniFlix_Itc_V1_MsgCreateCampaignResponse: @unchecked Sendable {}
extension OmniFlix_Itc_V1_MsgCancelCampaign: @unchecked Sendable {}
extension OmniFlix_Itc_V1_MsgCancelCampaignResponse: @unchecked Sendable {}
extension OmniFlix_Itc_V1_MsgClaim: @unchecked Sendable {}
extension OmniFlix_Itc_V1_MsgClaimResponse: @unchecked Sendable {}
extension OmniFlix_Itc_V1_MsgDepositCampaign: @unchecked Sendable {}
extension OmniFlix_Itc_V1_MsgDepositCampaignResponse: @unchecked Sendable {}
extension OmniFlix_Itc_V1_MsgUpdateParams: @unchecked Sendable {}
extension OmniFlix_Itc_V1_MsgUpdateParamsResponse: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "OmniFlix.itc.v1"

extension OmniFlix_Itc_V1_MsgCreateCampaign: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgCreateCampaign"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "name"),
    2: .same(proto: "description"),
    3: .same(proto: "interaction"),
    4: .standard(proto: "claim_type"),
    5: .standard(proto: "nft_denom_id"),
    6: .standard(proto: "tokens_per_claim"),
    7: .standard(proto: "max_allowed_claims"),
    8: .same(proto: "deposit"),
    9: .standard(proto: "nft_mint_details"),
    10: .standard(proto: "start_time"),
    11: .same(proto: "duration"),
    12: .same(proto: "distribution"),
    13: .same(proto: "creator"),
    14: .standard(proto: "creation_fee"),
  ]

  fileprivate class _StorageClass {
    var _name: String = String()
    var _description_p: String = String()
    var _interaction: OmniFlix_Itc_V1_InteractionType = .burn
    var _claimType: OmniFlix_Itc_V1_ClaimType = .ft
    var _nftDenomID: String = String()
    var _tokensPerClaim: Cosmos_Base_V1beta1_Coin? = nil
    var _maxAllowedClaims: UInt64 = 0
    var _deposit: Cosmos_Base_V1beta1_Coin? = nil
    var _nftMintDetails: OmniFlix_Itc_V1_NFTDetails? = nil
    var _startTime: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
    var _duration: SwiftProtobuf.Google_Protobuf_Duration? = nil
    var _distribution: OmniFlix_Itc_V1_Distribution? = nil
    var _creator: String = String()
    var _creationFee: Cosmos_Base_V1beta1_Coin? = nil

    static let defaultInstance = _StorageClass()

    private init() {}

    init(copying source: _StorageClass) {
      _name = source._name
      _description_p = source._description_p
      _interaction = source._interaction
      _claimType = source._claimType
      _nftDenomID = source._nftDenomID
      _tokensPerClaim = source._tokensPerClaim
      _maxAllowedClaims = source._maxAllowedClaims
      _deposit = source._deposit
      _nftMintDetails = source._nftMintDetails
      _startTime = source._startTime
      _duration = source._duration
      _distribution = source._distribution
      _creator = source._creator
      _creationFee = source._creationFee
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
        case 1: try { try decoder.decodeSingularStringField(value: &_storage._name) }()
        case 2: try { try decoder.decodeSingularStringField(value: &_storage._description_p) }()
        case 3: try { try decoder.decodeSingularEnumField(value: &_storage._interaction) }()
        case 4: try { try decoder.decodeSingularEnumField(value: &_storage._claimType) }()
        case 5: try { try decoder.decodeSingularStringField(value: &_storage._nftDenomID) }()
        case 6: try { try decoder.decodeSingularMessageField(value: &_storage._tokensPerClaim) }()
        case 7: try { try decoder.decodeSingularUInt64Field(value: &_storage._maxAllowedClaims) }()
        case 8: try { try decoder.decodeSingularMessageField(value: &_storage._deposit) }()
        case 9: try { try decoder.decodeSingularMessageField(value: &_storage._nftMintDetails) }()
        case 10: try { try decoder.decodeSingularMessageField(value: &_storage._startTime) }()
        case 11: try { try decoder.decodeSingularMessageField(value: &_storage._duration) }()
        case 12: try { try decoder.decodeSingularMessageField(value: &_storage._distribution) }()
        case 13: try { try decoder.decodeSingularStringField(value: &_storage._creator) }()
        case 14: try { try decoder.decodeSingularMessageField(value: &_storage._creationFee) }()
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
      if !_storage._name.isEmpty {
        try visitor.visitSingularStringField(value: _storage._name, fieldNumber: 1)
      }
      if !_storage._description_p.isEmpty {
        try visitor.visitSingularStringField(value: _storage._description_p, fieldNumber: 2)
      }
      if _storage._interaction != .burn {
        try visitor.visitSingularEnumField(value: _storage._interaction, fieldNumber: 3)
      }
      if _storage._claimType != .ft {
        try visitor.visitSingularEnumField(value: _storage._claimType, fieldNumber: 4)
      }
      if !_storage._nftDenomID.isEmpty {
        try visitor.visitSingularStringField(value: _storage._nftDenomID, fieldNumber: 5)
      }
      try { if let v = _storage._tokensPerClaim {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 6)
      } }()
      if _storage._maxAllowedClaims != 0 {
        try visitor.visitSingularUInt64Field(value: _storage._maxAllowedClaims, fieldNumber: 7)
      }
      try { if let v = _storage._deposit {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 8)
      } }()
      try { if let v = _storage._nftMintDetails {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 9)
      } }()
      try { if let v = _storage._startTime {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 10)
      } }()
      try { if let v = _storage._duration {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 11)
      } }()
      try { if let v = _storage._distribution {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 12)
      } }()
      if !_storage._creator.isEmpty {
        try visitor.visitSingularStringField(value: _storage._creator, fieldNumber: 13)
      }
      try { if let v = _storage._creationFee {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 14)
      } }()
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: OmniFlix_Itc_V1_MsgCreateCampaign, rhs: OmniFlix_Itc_V1_MsgCreateCampaign) -> Bool {
    if lhs._storage !== rhs._storage {
      let storagesAreEqual: Bool = withExtendedLifetime((lhs._storage, rhs._storage)) { (_args: (_StorageClass, _StorageClass)) in
        let _storage = _args.0
        let rhs_storage = _args.1
        if _storage._name != rhs_storage._name {return false}
        if _storage._description_p != rhs_storage._description_p {return false}
        if _storage._interaction != rhs_storage._interaction {return false}
        if _storage._claimType != rhs_storage._claimType {return false}
        if _storage._nftDenomID != rhs_storage._nftDenomID {return false}
        if _storage._tokensPerClaim != rhs_storage._tokensPerClaim {return false}
        if _storage._maxAllowedClaims != rhs_storage._maxAllowedClaims {return false}
        if _storage._deposit != rhs_storage._deposit {return false}
        if _storage._nftMintDetails != rhs_storage._nftMintDetails {return false}
        if _storage._startTime != rhs_storage._startTime {return false}
        if _storage._duration != rhs_storage._duration {return false}
        if _storage._distribution != rhs_storage._distribution {return false}
        if _storage._creator != rhs_storage._creator {return false}
        if _storage._creationFee != rhs_storage._creationFee {return false}
        return true
      }
      if !storagesAreEqual {return false}
    }
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension OmniFlix_Itc_V1_MsgCreateCampaignResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgCreateCampaignResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: OmniFlix_Itc_V1_MsgCreateCampaignResponse, rhs: OmniFlix_Itc_V1_MsgCreateCampaignResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension OmniFlix_Itc_V1_MsgCancelCampaign: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgCancelCampaign"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "campaign_id"),
    2: .same(proto: "creator"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.campaignID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.creator) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.campaignID != 0 {
      try visitor.visitSingularUInt64Field(value: self.campaignID, fieldNumber: 1)
    }
    if !self.creator.isEmpty {
      try visitor.visitSingularStringField(value: self.creator, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: OmniFlix_Itc_V1_MsgCancelCampaign, rhs: OmniFlix_Itc_V1_MsgCancelCampaign) -> Bool {
    if lhs.campaignID != rhs.campaignID {return false}
    if lhs.creator != rhs.creator {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension OmniFlix_Itc_V1_MsgCancelCampaignResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgCancelCampaignResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: OmniFlix_Itc_V1_MsgCancelCampaignResponse, rhs: OmniFlix_Itc_V1_MsgCancelCampaignResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension OmniFlix_Itc_V1_MsgClaim: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgClaim"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "campaign_id"),
    2: .standard(proto: "nft_id"),
    3: .same(proto: "interaction"),
    4: .same(proto: "claimer"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.campaignID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.nftID) }()
      case 3: try { try decoder.decodeSingularEnumField(value: &self.interaction) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.claimer) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.campaignID != 0 {
      try visitor.visitSingularUInt64Field(value: self.campaignID, fieldNumber: 1)
    }
    if !self.nftID.isEmpty {
      try visitor.visitSingularStringField(value: self.nftID, fieldNumber: 2)
    }
    if self.interaction != .burn {
      try visitor.visitSingularEnumField(value: self.interaction, fieldNumber: 3)
    }
    if !self.claimer.isEmpty {
      try visitor.visitSingularStringField(value: self.claimer, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: OmniFlix_Itc_V1_MsgClaim, rhs: OmniFlix_Itc_V1_MsgClaim) -> Bool {
    if lhs.campaignID != rhs.campaignID {return false}
    if lhs.nftID != rhs.nftID {return false}
    if lhs.interaction != rhs.interaction {return false}
    if lhs.claimer != rhs.claimer {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension OmniFlix_Itc_V1_MsgClaimResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgClaimResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: OmniFlix_Itc_V1_MsgClaimResponse, rhs: OmniFlix_Itc_V1_MsgClaimResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension OmniFlix_Itc_V1_MsgDepositCampaign: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgDepositCampaign"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "campaign_id"),
    2: .same(proto: "amount"),
    3: .same(proto: "depositor"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.campaignID) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._amount) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.depositor) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if self.campaignID != 0 {
      try visitor.visitSingularUInt64Field(value: self.campaignID, fieldNumber: 1)
    }
    try { if let v = self._amount {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    if !self.depositor.isEmpty {
      try visitor.visitSingularStringField(value: self.depositor, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: OmniFlix_Itc_V1_MsgDepositCampaign, rhs: OmniFlix_Itc_V1_MsgDepositCampaign) -> Bool {
    if lhs.campaignID != rhs.campaignID {return false}
    if lhs._amount != rhs._amount {return false}
    if lhs.depositor != rhs.depositor {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension OmniFlix_Itc_V1_MsgDepositCampaignResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgDepositCampaignResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: OmniFlix_Itc_V1_MsgDepositCampaignResponse, rhs: OmniFlix_Itc_V1_MsgDepositCampaignResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension OmniFlix_Itc_V1_MsgUpdateParams: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgUpdateParams"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "authority"),
    2: .same(proto: "params"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.authority) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._params) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.authority.isEmpty {
      try visitor.visitSingularStringField(value: self.authority, fieldNumber: 1)
    }
    try { if let v = self._params {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: OmniFlix_Itc_V1_MsgUpdateParams, rhs: OmniFlix_Itc_V1_MsgUpdateParams) -> Bool {
    if lhs.authority != rhs.authority {return false}
    if lhs._params != rhs._params {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension OmniFlix_Itc_V1_MsgUpdateParamsResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgUpdateParamsResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: OmniFlix_Itc_V1_MsgUpdateParamsResponse, rhs: OmniFlix_Itc_V1_MsgUpdateParamsResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
