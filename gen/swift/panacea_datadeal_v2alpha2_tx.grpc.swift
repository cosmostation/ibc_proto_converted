//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: panacea/datadeal/v2alpha2/tx.proto
//

//
// Copyright 2018, gRPC Authors All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//
import GRPC
import NIO
import NIOConcurrencyHelpers
import SwiftProtobuf


/// Msg defines the Msg service.
///
/// Usage: instantiate `Panacea_Datadeal_V2alpha2_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Panacea_Datadeal_V2alpha2_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Panacea_Datadeal_V2alpha2_MsgClientInterceptorFactoryProtocol? { get }

  func createDeal(
    _ request: Panacea_Datadeal_V2alpha2_MsgCreateDeal,
    callOptions: CallOptions?
  ) -> UnaryCall<Panacea_Datadeal_V2alpha2_MsgCreateDeal, Panacea_Datadeal_V2alpha2_MsgCreateDealResponse>

  func sellData(
    _ request: Panacea_Datadeal_V2alpha2_MsgSellData,
    callOptions: CallOptions?
  ) -> UnaryCall<Panacea_Datadeal_V2alpha2_MsgSellData, Panacea_Datadeal_V2alpha2_MsgSellDataResponse>

  func voteDataVerification(
    _ request: Panacea_Datadeal_V2alpha2_MsgVoteDataVerification,
    callOptions: CallOptions?
  ) -> UnaryCall<Panacea_Datadeal_V2alpha2_MsgVoteDataVerification, Panacea_Datadeal_V2alpha2_MsgVoteDataVerificationResponse>

  func voteDataDelivery(
    _ request: Panacea_Datadeal_V2alpha2_MsgVoteDataDelivery,
    callOptions: CallOptions?
  ) -> UnaryCall<Panacea_Datadeal_V2alpha2_MsgVoteDataDelivery, Panacea_Datadeal_V2alpha2_MsgVoteDataDeliveryResponse>

  func deactivateDeal(
    _ request: Panacea_Datadeal_V2alpha2_MsgDeactivateDeal,
    callOptions: CallOptions?
  ) -> UnaryCall<Panacea_Datadeal_V2alpha2_MsgDeactivateDeal, Panacea_Datadeal_V2alpha2_MsgDeactivateDealResponse>

  func reRequestDataDeliveryVote(
    _ request: Panacea_Datadeal_V2alpha2_MsgReRequestDataDeliveryVote,
    callOptions: CallOptions?
  ) -> UnaryCall<Panacea_Datadeal_V2alpha2_MsgReRequestDataDeliveryVote, Panacea_Datadeal_V2alpha2_MsgReRequestDataDeliveryVoteResponse>
}

extension Panacea_Datadeal_V2alpha2_MsgClientProtocol {
  internal var serviceName: String {
    return "panacea.datadeal.v2alpha2.Msg"
  }

  /// CreateDeal defines a method for creating a deal.
  ///
  /// - Parameters:
  ///   - request: Request to send to CreateDeal.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func createDeal(
    _ request: Panacea_Datadeal_V2alpha2_MsgCreateDeal,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Panacea_Datadeal_V2alpha2_MsgCreateDeal, Panacea_Datadeal_V2alpha2_MsgCreateDealResponse> {
    return self.makeUnaryCall(
      path: Panacea_Datadeal_V2alpha2_MsgClientMetadata.Methods.createDeal.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCreateDealInterceptors() ?? []
    )
  }

  /// SellData defines a method for selling a data.
  ///
  /// - Parameters:
  ///   - request: Request to send to SellData.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func sellData(
    _ request: Panacea_Datadeal_V2alpha2_MsgSellData,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Panacea_Datadeal_V2alpha2_MsgSellData, Panacea_Datadeal_V2alpha2_MsgSellDataResponse> {
    return self.makeUnaryCall(
      path: Panacea_Datadeal_V2alpha2_MsgClientMetadata.Methods.sellData.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSellDataInterceptors() ?? []
    )
  }

  /// VoteDataVerification defines a method for voting data verification.
  ///
  /// - Parameters:
  ///   - request: Request to send to VoteDataVerification.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func voteDataVerification(
    _ request: Panacea_Datadeal_V2alpha2_MsgVoteDataVerification,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Panacea_Datadeal_V2alpha2_MsgVoteDataVerification, Panacea_Datadeal_V2alpha2_MsgVoteDataVerificationResponse> {
    return self.makeUnaryCall(
      path: Panacea_Datadeal_V2alpha2_MsgClientMetadata.Methods.voteDataVerification.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeVoteDataVerificationInterceptors() ?? []
    )
  }

  /// VoteDataDelivery defines a method for voting data delivery.
  ///
  /// - Parameters:
  ///   - request: Request to send to VoteDataDelivery.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func voteDataDelivery(
    _ request: Panacea_Datadeal_V2alpha2_MsgVoteDataDelivery,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Panacea_Datadeal_V2alpha2_MsgVoteDataDelivery, Panacea_Datadeal_V2alpha2_MsgVoteDataDeliveryResponse> {
    return self.makeUnaryCall(
      path: Panacea_Datadeal_V2alpha2_MsgClientMetadata.Methods.voteDataDelivery.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeVoteDataDeliveryInterceptors() ?? []
    )
  }

  /// DeactivateDeal defines a method for deactivating the deal.
  ///
  /// - Parameters:
  ///   - request: Request to send to DeactivateDeal.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func deactivateDeal(
    _ request: Panacea_Datadeal_V2alpha2_MsgDeactivateDeal,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Panacea_Datadeal_V2alpha2_MsgDeactivateDeal, Panacea_Datadeal_V2alpha2_MsgDeactivateDealResponse> {
    return self.makeUnaryCall(
      path: Panacea_Datadeal_V2alpha2_MsgClientMetadata.Methods.deactivateDeal.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDeactivateDealInterceptors() ?? []
    )
  }

  /// ReRequestDataDeliveryVote defines a method for requesting DataDeliveryVote.
  ///
  /// - Parameters:
  ///   - request: Request to send to ReRequestDataDeliveryVote.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func reRequestDataDeliveryVote(
    _ request: Panacea_Datadeal_V2alpha2_MsgReRequestDataDeliveryVote,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Panacea_Datadeal_V2alpha2_MsgReRequestDataDeliveryVote, Panacea_Datadeal_V2alpha2_MsgReRequestDataDeliveryVoteResponse> {
    return self.makeUnaryCall(
      path: Panacea_Datadeal_V2alpha2_MsgClientMetadata.Methods.reRequestDataDeliveryVote.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeReRequestDataDeliveryVoteInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Panacea_Datadeal_V2alpha2_MsgClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Panacea_Datadeal_V2alpha2_MsgNIOClient")
internal final class Panacea_Datadeal_V2alpha2_MsgClient: Panacea_Datadeal_V2alpha2_MsgClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Panacea_Datadeal_V2alpha2_MsgClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Panacea_Datadeal_V2alpha2_MsgClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the panacea.datadeal.v2alpha2.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Panacea_Datadeal_V2alpha2_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Panacea_Datadeal_V2alpha2_MsgNIOClient: Panacea_Datadeal_V2alpha2_MsgClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Panacea_Datadeal_V2alpha2_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the panacea.datadeal.v2alpha2.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Panacea_Datadeal_V2alpha2_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Msg defines the Msg service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Panacea_Datadeal_V2alpha2_MsgAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Panacea_Datadeal_V2alpha2_MsgClientInterceptorFactoryProtocol? { get }

  func makeCreateDealCall(
    _ request: Panacea_Datadeal_V2alpha2_MsgCreateDeal,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Panacea_Datadeal_V2alpha2_MsgCreateDeal, Panacea_Datadeal_V2alpha2_MsgCreateDealResponse>

  func makeSellDataCall(
    _ request: Panacea_Datadeal_V2alpha2_MsgSellData,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Panacea_Datadeal_V2alpha2_MsgSellData, Panacea_Datadeal_V2alpha2_MsgSellDataResponse>

  func makeVoteDataVerificationCall(
    _ request: Panacea_Datadeal_V2alpha2_MsgVoteDataVerification,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Panacea_Datadeal_V2alpha2_MsgVoteDataVerification, Panacea_Datadeal_V2alpha2_MsgVoteDataVerificationResponse>

  func makeVoteDataDeliveryCall(
    _ request: Panacea_Datadeal_V2alpha2_MsgVoteDataDelivery,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Panacea_Datadeal_V2alpha2_MsgVoteDataDelivery, Panacea_Datadeal_V2alpha2_MsgVoteDataDeliveryResponse>

  func makeDeactivateDealCall(
    _ request: Panacea_Datadeal_V2alpha2_MsgDeactivateDeal,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Panacea_Datadeal_V2alpha2_MsgDeactivateDeal, Panacea_Datadeal_V2alpha2_MsgDeactivateDealResponse>

  func makeReRequestDataDeliveryVoteCall(
    _ request: Panacea_Datadeal_V2alpha2_MsgReRequestDataDeliveryVote,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Panacea_Datadeal_V2alpha2_MsgReRequestDataDeliveryVote, Panacea_Datadeal_V2alpha2_MsgReRequestDataDeliveryVoteResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Panacea_Datadeal_V2alpha2_MsgAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Panacea_Datadeal_V2alpha2_MsgClientMetadata.serviceDescriptor
  }

  internal var interceptors: Panacea_Datadeal_V2alpha2_MsgClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeCreateDealCall(
    _ request: Panacea_Datadeal_V2alpha2_MsgCreateDeal,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Panacea_Datadeal_V2alpha2_MsgCreateDeal, Panacea_Datadeal_V2alpha2_MsgCreateDealResponse> {
    return self.makeAsyncUnaryCall(
      path: Panacea_Datadeal_V2alpha2_MsgClientMetadata.Methods.createDeal.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCreateDealInterceptors() ?? []
    )
  }

  internal func makeSellDataCall(
    _ request: Panacea_Datadeal_V2alpha2_MsgSellData,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Panacea_Datadeal_V2alpha2_MsgSellData, Panacea_Datadeal_V2alpha2_MsgSellDataResponse> {
    return self.makeAsyncUnaryCall(
      path: Panacea_Datadeal_V2alpha2_MsgClientMetadata.Methods.sellData.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSellDataInterceptors() ?? []
    )
  }

  internal func makeVoteDataVerificationCall(
    _ request: Panacea_Datadeal_V2alpha2_MsgVoteDataVerification,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Panacea_Datadeal_V2alpha2_MsgVoteDataVerification, Panacea_Datadeal_V2alpha2_MsgVoteDataVerificationResponse> {
    return self.makeAsyncUnaryCall(
      path: Panacea_Datadeal_V2alpha2_MsgClientMetadata.Methods.voteDataVerification.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeVoteDataVerificationInterceptors() ?? []
    )
  }

  internal func makeVoteDataDeliveryCall(
    _ request: Panacea_Datadeal_V2alpha2_MsgVoteDataDelivery,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Panacea_Datadeal_V2alpha2_MsgVoteDataDelivery, Panacea_Datadeal_V2alpha2_MsgVoteDataDeliveryResponse> {
    return self.makeAsyncUnaryCall(
      path: Panacea_Datadeal_V2alpha2_MsgClientMetadata.Methods.voteDataDelivery.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeVoteDataDeliveryInterceptors() ?? []
    )
  }

  internal func makeDeactivateDealCall(
    _ request: Panacea_Datadeal_V2alpha2_MsgDeactivateDeal,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Panacea_Datadeal_V2alpha2_MsgDeactivateDeal, Panacea_Datadeal_V2alpha2_MsgDeactivateDealResponse> {
    return self.makeAsyncUnaryCall(
      path: Panacea_Datadeal_V2alpha2_MsgClientMetadata.Methods.deactivateDeal.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDeactivateDealInterceptors() ?? []
    )
  }

  internal func makeReRequestDataDeliveryVoteCall(
    _ request: Panacea_Datadeal_V2alpha2_MsgReRequestDataDeliveryVote,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Panacea_Datadeal_V2alpha2_MsgReRequestDataDeliveryVote, Panacea_Datadeal_V2alpha2_MsgReRequestDataDeliveryVoteResponse> {
    return self.makeAsyncUnaryCall(
      path: Panacea_Datadeal_V2alpha2_MsgClientMetadata.Methods.reRequestDataDeliveryVote.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeReRequestDataDeliveryVoteInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Panacea_Datadeal_V2alpha2_MsgAsyncClientProtocol {
  internal func createDeal(
    _ request: Panacea_Datadeal_V2alpha2_MsgCreateDeal,
    callOptions: CallOptions? = nil
  ) async throws -> Panacea_Datadeal_V2alpha2_MsgCreateDealResponse {
    return try await self.performAsyncUnaryCall(
      path: Panacea_Datadeal_V2alpha2_MsgClientMetadata.Methods.createDeal.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCreateDealInterceptors() ?? []
    )
  }

  internal func sellData(
    _ request: Panacea_Datadeal_V2alpha2_MsgSellData,
    callOptions: CallOptions? = nil
  ) async throws -> Panacea_Datadeal_V2alpha2_MsgSellDataResponse {
    return try await self.performAsyncUnaryCall(
      path: Panacea_Datadeal_V2alpha2_MsgClientMetadata.Methods.sellData.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSellDataInterceptors() ?? []
    )
  }

  internal func voteDataVerification(
    _ request: Panacea_Datadeal_V2alpha2_MsgVoteDataVerification,
    callOptions: CallOptions? = nil
  ) async throws -> Panacea_Datadeal_V2alpha2_MsgVoteDataVerificationResponse {
    return try await self.performAsyncUnaryCall(
      path: Panacea_Datadeal_V2alpha2_MsgClientMetadata.Methods.voteDataVerification.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeVoteDataVerificationInterceptors() ?? []
    )
  }

  internal func voteDataDelivery(
    _ request: Panacea_Datadeal_V2alpha2_MsgVoteDataDelivery,
    callOptions: CallOptions? = nil
  ) async throws -> Panacea_Datadeal_V2alpha2_MsgVoteDataDeliveryResponse {
    return try await self.performAsyncUnaryCall(
      path: Panacea_Datadeal_V2alpha2_MsgClientMetadata.Methods.voteDataDelivery.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeVoteDataDeliveryInterceptors() ?? []
    )
  }

  internal func deactivateDeal(
    _ request: Panacea_Datadeal_V2alpha2_MsgDeactivateDeal,
    callOptions: CallOptions? = nil
  ) async throws -> Panacea_Datadeal_V2alpha2_MsgDeactivateDealResponse {
    return try await self.performAsyncUnaryCall(
      path: Panacea_Datadeal_V2alpha2_MsgClientMetadata.Methods.deactivateDeal.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDeactivateDealInterceptors() ?? []
    )
  }

  internal func reRequestDataDeliveryVote(
    _ request: Panacea_Datadeal_V2alpha2_MsgReRequestDataDeliveryVote,
    callOptions: CallOptions? = nil
  ) async throws -> Panacea_Datadeal_V2alpha2_MsgReRequestDataDeliveryVoteResponse {
    return try await self.performAsyncUnaryCall(
      path: Panacea_Datadeal_V2alpha2_MsgClientMetadata.Methods.reRequestDataDeliveryVote.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeReRequestDataDeliveryVoteInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Panacea_Datadeal_V2alpha2_MsgAsyncClient: Panacea_Datadeal_V2alpha2_MsgAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Panacea_Datadeal_V2alpha2_MsgClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Panacea_Datadeal_V2alpha2_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Panacea_Datadeal_V2alpha2_MsgClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'createDeal'.
  func makeCreateDealInterceptors() -> [ClientInterceptor<Panacea_Datadeal_V2alpha2_MsgCreateDeal, Panacea_Datadeal_V2alpha2_MsgCreateDealResponse>]

  /// - Returns: Interceptors to use when invoking 'sellData'.
  func makeSellDataInterceptors() -> [ClientInterceptor<Panacea_Datadeal_V2alpha2_MsgSellData, Panacea_Datadeal_V2alpha2_MsgSellDataResponse>]

  /// - Returns: Interceptors to use when invoking 'voteDataVerification'.
  func makeVoteDataVerificationInterceptors() -> [ClientInterceptor<Panacea_Datadeal_V2alpha2_MsgVoteDataVerification, Panacea_Datadeal_V2alpha2_MsgVoteDataVerificationResponse>]

  /// - Returns: Interceptors to use when invoking 'voteDataDelivery'.
  func makeVoteDataDeliveryInterceptors() -> [ClientInterceptor<Panacea_Datadeal_V2alpha2_MsgVoteDataDelivery, Panacea_Datadeal_V2alpha2_MsgVoteDataDeliveryResponse>]

  /// - Returns: Interceptors to use when invoking 'deactivateDeal'.
  func makeDeactivateDealInterceptors() -> [ClientInterceptor<Panacea_Datadeal_V2alpha2_MsgDeactivateDeal, Panacea_Datadeal_V2alpha2_MsgDeactivateDealResponse>]

  /// - Returns: Interceptors to use when invoking 'reRequestDataDeliveryVote'.
  func makeReRequestDataDeliveryVoteInterceptors() -> [ClientInterceptor<Panacea_Datadeal_V2alpha2_MsgReRequestDataDeliveryVote, Panacea_Datadeal_V2alpha2_MsgReRequestDataDeliveryVoteResponse>]
}

internal enum Panacea_Datadeal_V2alpha2_MsgClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "panacea.datadeal.v2alpha2.Msg",
    methods: [
      Panacea_Datadeal_V2alpha2_MsgClientMetadata.Methods.createDeal,
      Panacea_Datadeal_V2alpha2_MsgClientMetadata.Methods.sellData,
      Panacea_Datadeal_V2alpha2_MsgClientMetadata.Methods.voteDataVerification,
      Panacea_Datadeal_V2alpha2_MsgClientMetadata.Methods.voteDataDelivery,
      Panacea_Datadeal_V2alpha2_MsgClientMetadata.Methods.deactivateDeal,
      Panacea_Datadeal_V2alpha2_MsgClientMetadata.Methods.reRequestDataDeliveryVote,
    ]
  )

  internal enum Methods {
    internal static let createDeal = GRPCMethodDescriptor(
      name: "CreateDeal",
      path: "/panacea.datadeal.v2alpha2.Msg/CreateDeal",
      type: GRPCCallType.unary
    )

    internal static let sellData = GRPCMethodDescriptor(
      name: "SellData",
      path: "/panacea.datadeal.v2alpha2.Msg/SellData",
      type: GRPCCallType.unary
    )

    internal static let voteDataVerification = GRPCMethodDescriptor(
      name: "VoteDataVerification",
      path: "/panacea.datadeal.v2alpha2.Msg/VoteDataVerification",
      type: GRPCCallType.unary
    )

    internal static let voteDataDelivery = GRPCMethodDescriptor(
      name: "VoteDataDelivery",
      path: "/panacea.datadeal.v2alpha2.Msg/VoteDataDelivery",
      type: GRPCCallType.unary
    )

    internal static let deactivateDeal = GRPCMethodDescriptor(
      name: "DeactivateDeal",
      path: "/panacea.datadeal.v2alpha2.Msg/DeactivateDeal",
      type: GRPCCallType.unary
    )

    internal static let reRequestDataDeliveryVote = GRPCMethodDescriptor(
      name: "ReRequestDataDeliveryVote",
      path: "/panacea.datadeal.v2alpha2.Msg/ReRequestDataDeliveryVote",
      type: GRPCCallType.unary
    )
  }
}

/// Msg defines the Msg service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Panacea_Datadeal_V2alpha2_MsgProvider: CallHandlerProvider {
  var interceptors: Panacea_Datadeal_V2alpha2_MsgServerInterceptorFactoryProtocol? { get }

  /// CreateDeal defines a method for creating a deal.
  func createDeal(request: Panacea_Datadeal_V2alpha2_MsgCreateDeal, context: StatusOnlyCallContext) -> EventLoopFuture<Panacea_Datadeal_V2alpha2_MsgCreateDealResponse>

  /// SellData defines a method for selling a data.
  func sellData(request: Panacea_Datadeal_V2alpha2_MsgSellData, context: StatusOnlyCallContext) -> EventLoopFuture<Panacea_Datadeal_V2alpha2_MsgSellDataResponse>

  /// VoteDataVerification defines a method for voting data verification.
  func voteDataVerification(request: Panacea_Datadeal_V2alpha2_MsgVoteDataVerification, context: StatusOnlyCallContext) -> EventLoopFuture<Panacea_Datadeal_V2alpha2_MsgVoteDataVerificationResponse>

  /// VoteDataDelivery defines a method for voting data delivery.
  func voteDataDelivery(request: Panacea_Datadeal_V2alpha2_MsgVoteDataDelivery, context: StatusOnlyCallContext) -> EventLoopFuture<Panacea_Datadeal_V2alpha2_MsgVoteDataDeliveryResponse>

  /// DeactivateDeal defines a method for deactivating the deal.
  func deactivateDeal(request: Panacea_Datadeal_V2alpha2_MsgDeactivateDeal, context: StatusOnlyCallContext) -> EventLoopFuture<Panacea_Datadeal_V2alpha2_MsgDeactivateDealResponse>

  /// ReRequestDataDeliveryVote defines a method for requesting DataDeliveryVote.
  func reRequestDataDeliveryVote(request: Panacea_Datadeal_V2alpha2_MsgReRequestDataDeliveryVote, context: StatusOnlyCallContext) -> EventLoopFuture<Panacea_Datadeal_V2alpha2_MsgReRequestDataDeliveryVoteResponse>
}

extension Panacea_Datadeal_V2alpha2_MsgProvider {
  internal var serviceName: Substring {
    return Panacea_Datadeal_V2alpha2_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "CreateDeal":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Panacea_Datadeal_V2alpha2_MsgCreateDeal>(),
        responseSerializer: ProtobufSerializer<Panacea_Datadeal_V2alpha2_MsgCreateDealResponse>(),
        interceptors: self.interceptors?.makeCreateDealInterceptors() ?? [],
        userFunction: self.createDeal(request:context:)
      )

    case "SellData":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Panacea_Datadeal_V2alpha2_MsgSellData>(),
        responseSerializer: ProtobufSerializer<Panacea_Datadeal_V2alpha2_MsgSellDataResponse>(),
        interceptors: self.interceptors?.makeSellDataInterceptors() ?? [],
        userFunction: self.sellData(request:context:)
      )

    case "VoteDataVerification":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Panacea_Datadeal_V2alpha2_MsgVoteDataVerification>(),
        responseSerializer: ProtobufSerializer<Panacea_Datadeal_V2alpha2_MsgVoteDataVerificationResponse>(),
        interceptors: self.interceptors?.makeVoteDataVerificationInterceptors() ?? [],
        userFunction: self.voteDataVerification(request:context:)
      )

    case "VoteDataDelivery":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Panacea_Datadeal_V2alpha2_MsgVoteDataDelivery>(),
        responseSerializer: ProtobufSerializer<Panacea_Datadeal_V2alpha2_MsgVoteDataDeliveryResponse>(),
        interceptors: self.interceptors?.makeVoteDataDeliveryInterceptors() ?? [],
        userFunction: self.voteDataDelivery(request:context:)
      )

    case "DeactivateDeal":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Panacea_Datadeal_V2alpha2_MsgDeactivateDeal>(),
        responseSerializer: ProtobufSerializer<Panacea_Datadeal_V2alpha2_MsgDeactivateDealResponse>(),
        interceptors: self.interceptors?.makeDeactivateDealInterceptors() ?? [],
        userFunction: self.deactivateDeal(request:context:)
      )

    case "ReRequestDataDeliveryVote":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Panacea_Datadeal_V2alpha2_MsgReRequestDataDeliveryVote>(),
        responseSerializer: ProtobufSerializer<Panacea_Datadeal_V2alpha2_MsgReRequestDataDeliveryVoteResponse>(),
        interceptors: self.interceptors?.makeReRequestDataDeliveryVoteInterceptors() ?? [],
        userFunction: self.reRequestDataDeliveryVote(request:context:)
      )

    default:
      return nil
    }
  }
}

/// Msg defines the Msg service.
///
/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Panacea_Datadeal_V2alpha2_MsgAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Panacea_Datadeal_V2alpha2_MsgServerInterceptorFactoryProtocol? { get }

  /// CreateDeal defines a method for creating a deal.
  @Sendable func createDeal(
    request: Panacea_Datadeal_V2alpha2_MsgCreateDeal,
    context: GRPCAsyncServerCallContext
  ) async throws -> Panacea_Datadeal_V2alpha2_MsgCreateDealResponse

  /// SellData defines a method for selling a data.
  @Sendable func sellData(
    request: Panacea_Datadeal_V2alpha2_MsgSellData,
    context: GRPCAsyncServerCallContext
  ) async throws -> Panacea_Datadeal_V2alpha2_MsgSellDataResponse

  /// VoteDataVerification defines a method for voting data verification.
  @Sendable func voteDataVerification(
    request: Panacea_Datadeal_V2alpha2_MsgVoteDataVerification,
    context: GRPCAsyncServerCallContext
  ) async throws -> Panacea_Datadeal_V2alpha2_MsgVoteDataVerificationResponse

  /// VoteDataDelivery defines a method for voting data delivery.
  @Sendable func voteDataDelivery(
    request: Panacea_Datadeal_V2alpha2_MsgVoteDataDelivery,
    context: GRPCAsyncServerCallContext
  ) async throws -> Panacea_Datadeal_V2alpha2_MsgVoteDataDeliveryResponse

  /// DeactivateDeal defines a method for deactivating the deal.
  @Sendable func deactivateDeal(
    request: Panacea_Datadeal_V2alpha2_MsgDeactivateDeal,
    context: GRPCAsyncServerCallContext
  ) async throws -> Panacea_Datadeal_V2alpha2_MsgDeactivateDealResponse

  /// ReRequestDataDeliveryVote defines a method for requesting DataDeliveryVote.
  @Sendable func reRequestDataDeliveryVote(
    request: Panacea_Datadeal_V2alpha2_MsgReRequestDataDeliveryVote,
    context: GRPCAsyncServerCallContext
  ) async throws -> Panacea_Datadeal_V2alpha2_MsgReRequestDataDeliveryVoteResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Panacea_Datadeal_V2alpha2_MsgAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Panacea_Datadeal_V2alpha2_MsgServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Panacea_Datadeal_V2alpha2_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Panacea_Datadeal_V2alpha2_MsgServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "CreateDeal":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Panacea_Datadeal_V2alpha2_MsgCreateDeal>(),
        responseSerializer: ProtobufSerializer<Panacea_Datadeal_V2alpha2_MsgCreateDealResponse>(),
        interceptors: self.interceptors?.makeCreateDealInterceptors() ?? [],
        wrapping: self.createDeal(request:context:)
      )

    case "SellData":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Panacea_Datadeal_V2alpha2_MsgSellData>(),
        responseSerializer: ProtobufSerializer<Panacea_Datadeal_V2alpha2_MsgSellDataResponse>(),
        interceptors: self.interceptors?.makeSellDataInterceptors() ?? [],
        wrapping: self.sellData(request:context:)
      )

    case "VoteDataVerification":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Panacea_Datadeal_V2alpha2_MsgVoteDataVerification>(),
        responseSerializer: ProtobufSerializer<Panacea_Datadeal_V2alpha2_MsgVoteDataVerificationResponse>(),
        interceptors: self.interceptors?.makeVoteDataVerificationInterceptors() ?? [],
        wrapping: self.voteDataVerification(request:context:)
      )

    case "VoteDataDelivery":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Panacea_Datadeal_V2alpha2_MsgVoteDataDelivery>(),
        responseSerializer: ProtobufSerializer<Panacea_Datadeal_V2alpha2_MsgVoteDataDeliveryResponse>(),
        interceptors: self.interceptors?.makeVoteDataDeliveryInterceptors() ?? [],
        wrapping: self.voteDataDelivery(request:context:)
      )

    case "DeactivateDeal":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Panacea_Datadeal_V2alpha2_MsgDeactivateDeal>(),
        responseSerializer: ProtobufSerializer<Panacea_Datadeal_V2alpha2_MsgDeactivateDealResponse>(),
        interceptors: self.interceptors?.makeDeactivateDealInterceptors() ?? [],
        wrapping: self.deactivateDeal(request:context:)
      )

    case "ReRequestDataDeliveryVote":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Panacea_Datadeal_V2alpha2_MsgReRequestDataDeliveryVote>(),
        responseSerializer: ProtobufSerializer<Panacea_Datadeal_V2alpha2_MsgReRequestDataDeliveryVoteResponse>(),
        interceptors: self.interceptors?.makeReRequestDataDeliveryVoteInterceptors() ?? [],
        wrapping: self.reRequestDataDeliveryVote(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Panacea_Datadeal_V2alpha2_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'createDeal'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeCreateDealInterceptors() -> [ServerInterceptor<Panacea_Datadeal_V2alpha2_MsgCreateDeal, Panacea_Datadeal_V2alpha2_MsgCreateDealResponse>]

  /// - Returns: Interceptors to use when handling 'sellData'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeSellDataInterceptors() -> [ServerInterceptor<Panacea_Datadeal_V2alpha2_MsgSellData, Panacea_Datadeal_V2alpha2_MsgSellDataResponse>]

  /// - Returns: Interceptors to use when handling 'voteDataVerification'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeVoteDataVerificationInterceptors() -> [ServerInterceptor<Panacea_Datadeal_V2alpha2_MsgVoteDataVerification, Panacea_Datadeal_V2alpha2_MsgVoteDataVerificationResponse>]

  /// - Returns: Interceptors to use when handling 'voteDataDelivery'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeVoteDataDeliveryInterceptors() -> [ServerInterceptor<Panacea_Datadeal_V2alpha2_MsgVoteDataDelivery, Panacea_Datadeal_V2alpha2_MsgVoteDataDeliveryResponse>]

  /// - Returns: Interceptors to use when handling 'deactivateDeal'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeDeactivateDealInterceptors() -> [ServerInterceptor<Panacea_Datadeal_V2alpha2_MsgDeactivateDeal, Panacea_Datadeal_V2alpha2_MsgDeactivateDealResponse>]

  /// - Returns: Interceptors to use when handling 'reRequestDataDeliveryVote'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeReRequestDataDeliveryVoteInterceptors() -> [ServerInterceptor<Panacea_Datadeal_V2alpha2_MsgReRequestDataDeliveryVote, Panacea_Datadeal_V2alpha2_MsgReRequestDataDeliveryVoteResponse>]
}

internal enum Panacea_Datadeal_V2alpha2_MsgServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "panacea.datadeal.v2alpha2.Msg",
    methods: [
      Panacea_Datadeal_V2alpha2_MsgServerMetadata.Methods.createDeal,
      Panacea_Datadeal_V2alpha2_MsgServerMetadata.Methods.sellData,
      Panacea_Datadeal_V2alpha2_MsgServerMetadata.Methods.voteDataVerification,
      Panacea_Datadeal_V2alpha2_MsgServerMetadata.Methods.voteDataDelivery,
      Panacea_Datadeal_V2alpha2_MsgServerMetadata.Methods.deactivateDeal,
      Panacea_Datadeal_V2alpha2_MsgServerMetadata.Methods.reRequestDataDeliveryVote,
    ]
  )

  internal enum Methods {
    internal static let createDeal = GRPCMethodDescriptor(
      name: "CreateDeal",
      path: "/panacea.datadeal.v2alpha2.Msg/CreateDeal",
      type: GRPCCallType.unary
    )

    internal static let sellData = GRPCMethodDescriptor(
      name: "SellData",
      path: "/panacea.datadeal.v2alpha2.Msg/SellData",
      type: GRPCCallType.unary
    )

    internal static let voteDataVerification = GRPCMethodDescriptor(
      name: "VoteDataVerification",
      path: "/panacea.datadeal.v2alpha2.Msg/VoteDataVerification",
      type: GRPCCallType.unary
    )

    internal static let voteDataDelivery = GRPCMethodDescriptor(
      name: "VoteDataDelivery",
      path: "/panacea.datadeal.v2alpha2.Msg/VoteDataDelivery",
      type: GRPCCallType.unary
    )

    internal static let deactivateDeal = GRPCMethodDescriptor(
      name: "DeactivateDeal",
      path: "/panacea.datadeal.v2alpha2.Msg/DeactivateDeal",
      type: GRPCCallType.unary
    )

    internal static let reRequestDataDeliveryVote = GRPCMethodDescriptor(
      name: "ReRequestDataDeliveryVote",
      path: "/panacea.datadeal.v2alpha2.Msg/ReRequestDataDeliveryVote",
      type: GRPCCallType.unary
    )
  }
}