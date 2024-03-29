//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: persistence/oracle/v1beta1/tx.proto
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


/// Msg defines the oracle Msg service.
///
/// Usage: instantiate `Persistence_Oracle_V1beta1_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Persistence_Oracle_V1beta1_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Persistence_Oracle_V1beta1_MsgClientInterceptorFactoryProtocol? { get }

  func aggregateExchangeRatePrevote(
    _ request: Persistence_Oracle_V1beta1_MsgAggregateExchangeRatePrevote,
    callOptions: CallOptions?
  ) -> UnaryCall<Persistence_Oracle_V1beta1_MsgAggregateExchangeRatePrevote, Persistence_Oracle_V1beta1_MsgAggregateExchangeRatePrevoteResponse>

  func aggregateExchangeRateVote(
    _ request: Persistence_Oracle_V1beta1_MsgAggregateExchangeRateVote,
    callOptions: CallOptions?
  ) -> UnaryCall<Persistence_Oracle_V1beta1_MsgAggregateExchangeRateVote, Persistence_Oracle_V1beta1_MsgAggregateExchangeRateVoteResponse>

  func delegateFeedConsent(
    _ request: Persistence_Oracle_V1beta1_MsgDelegateFeedConsent,
    callOptions: CallOptions?
  ) -> UnaryCall<Persistence_Oracle_V1beta1_MsgDelegateFeedConsent, Persistence_Oracle_V1beta1_MsgDelegateFeedConsentResponse>

  func addFundsToRewardPool(
    _ request: Persistence_Oracle_V1beta1_MsgAddFundsToRewardPool,
    callOptions: CallOptions?
  ) -> UnaryCall<Persistence_Oracle_V1beta1_MsgAddFundsToRewardPool, Persistence_Oracle_V1beta1_MsgAddFundsToRewardPoolResponse>
}

extension Persistence_Oracle_V1beta1_MsgClientProtocol {
  internal var serviceName: String {
    return "persistence.oracle.v1beta1.Msg"
  }

  /// AggregateExchangeRatePrevote defines a method for submitting an aggregate
  /// exchange rate prevote.
  ///
  /// - Parameters:
  ///   - request: Request to send to AggregateExchangeRatePrevote.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func aggregateExchangeRatePrevote(
    _ request: Persistence_Oracle_V1beta1_MsgAggregateExchangeRatePrevote,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Persistence_Oracle_V1beta1_MsgAggregateExchangeRatePrevote, Persistence_Oracle_V1beta1_MsgAggregateExchangeRatePrevoteResponse> {
    return self.makeUnaryCall(
      path: Persistence_Oracle_V1beta1_MsgClientMetadata.Methods.aggregateExchangeRatePrevote.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAggregateExchangeRatePrevoteInterceptors() ?? []
    )
  }

  /// AggregateExchangeRateVote defines a method for submitting an aggregate
  /// exchange rate vote.
  ///
  /// - Parameters:
  ///   - request: Request to send to AggregateExchangeRateVote.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func aggregateExchangeRateVote(
    _ request: Persistence_Oracle_V1beta1_MsgAggregateExchangeRateVote,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Persistence_Oracle_V1beta1_MsgAggregateExchangeRateVote, Persistence_Oracle_V1beta1_MsgAggregateExchangeRateVoteResponse> {
    return self.makeUnaryCall(
      path: Persistence_Oracle_V1beta1_MsgClientMetadata.Methods.aggregateExchangeRateVote.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAggregateExchangeRateVoteInterceptors() ?? []
    )
  }

  /// DelegateFeedConsent defines a method for setting the feeder delegation.
  ///
  /// - Parameters:
  ///   - request: Request to send to DelegateFeedConsent.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func delegateFeedConsent(
    _ request: Persistence_Oracle_V1beta1_MsgDelegateFeedConsent,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Persistence_Oracle_V1beta1_MsgDelegateFeedConsent, Persistence_Oracle_V1beta1_MsgDelegateFeedConsentResponse> {
    return self.makeUnaryCall(
      path: Persistence_Oracle_V1beta1_MsgClientMetadata.Methods.delegateFeedConsent.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDelegateFeedConsentInterceptors() ?? []
    )
  }

  /// AddFundsToRewardPool
  ///
  /// - Parameters:
  ///   - request: Request to send to AddFundsToRewardPool.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func addFundsToRewardPool(
    _ request: Persistence_Oracle_V1beta1_MsgAddFundsToRewardPool,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Persistence_Oracle_V1beta1_MsgAddFundsToRewardPool, Persistence_Oracle_V1beta1_MsgAddFundsToRewardPoolResponse> {
    return self.makeUnaryCall(
      path: Persistence_Oracle_V1beta1_MsgClientMetadata.Methods.addFundsToRewardPool.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAddFundsToRewardPoolInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Persistence_Oracle_V1beta1_MsgClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Persistence_Oracle_V1beta1_MsgNIOClient")
internal final class Persistence_Oracle_V1beta1_MsgClient: Persistence_Oracle_V1beta1_MsgClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Persistence_Oracle_V1beta1_MsgClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Persistence_Oracle_V1beta1_MsgClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the persistence.oracle.v1beta1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Persistence_Oracle_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Persistence_Oracle_V1beta1_MsgNIOClient: Persistence_Oracle_V1beta1_MsgClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Persistence_Oracle_V1beta1_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the persistence.oracle.v1beta1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Persistence_Oracle_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Msg defines the oracle Msg service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Persistence_Oracle_V1beta1_MsgAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Persistence_Oracle_V1beta1_MsgClientInterceptorFactoryProtocol? { get }

  func makeAggregateExchangeRatePrevoteCall(
    _ request: Persistence_Oracle_V1beta1_MsgAggregateExchangeRatePrevote,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Persistence_Oracle_V1beta1_MsgAggregateExchangeRatePrevote, Persistence_Oracle_V1beta1_MsgAggregateExchangeRatePrevoteResponse>

  func makeAggregateExchangeRateVoteCall(
    _ request: Persistence_Oracle_V1beta1_MsgAggregateExchangeRateVote,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Persistence_Oracle_V1beta1_MsgAggregateExchangeRateVote, Persistence_Oracle_V1beta1_MsgAggregateExchangeRateVoteResponse>

  func makeDelegateFeedConsentCall(
    _ request: Persistence_Oracle_V1beta1_MsgDelegateFeedConsent,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Persistence_Oracle_V1beta1_MsgDelegateFeedConsent, Persistence_Oracle_V1beta1_MsgDelegateFeedConsentResponse>

  func makeAddFundsToRewardPoolCall(
    _ request: Persistence_Oracle_V1beta1_MsgAddFundsToRewardPool,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Persistence_Oracle_V1beta1_MsgAddFundsToRewardPool, Persistence_Oracle_V1beta1_MsgAddFundsToRewardPoolResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Persistence_Oracle_V1beta1_MsgAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Persistence_Oracle_V1beta1_MsgClientMetadata.serviceDescriptor
  }

  internal var interceptors: Persistence_Oracle_V1beta1_MsgClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeAggregateExchangeRatePrevoteCall(
    _ request: Persistence_Oracle_V1beta1_MsgAggregateExchangeRatePrevote,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Persistence_Oracle_V1beta1_MsgAggregateExchangeRatePrevote, Persistence_Oracle_V1beta1_MsgAggregateExchangeRatePrevoteResponse> {
    return self.makeAsyncUnaryCall(
      path: Persistence_Oracle_V1beta1_MsgClientMetadata.Methods.aggregateExchangeRatePrevote.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAggregateExchangeRatePrevoteInterceptors() ?? []
    )
  }

  internal func makeAggregateExchangeRateVoteCall(
    _ request: Persistence_Oracle_V1beta1_MsgAggregateExchangeRateVote,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Persistence_Oracle_V1beta1_MsgAggregateExchangeRateVote, Persistence_Oracle_V1beta1_MsgAggregateExchangeRateVoteResponse> {
    return self.makeAsyncUnaryCall(
      path: Persistence_Oracle_V1beta1_MsgClientMetadata.Methods.aggregateExchangeRateVote.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAggregateExchangeRateVoteInterceptors() ?? []
    )
  }

  internal func makeDelegateFeedConsentCall(
    _ request: Persistence_Oracle_V1beta1_MsgDelegateFeedConsent,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Persistence_Oracle_V1beta1_MsgDelegateFeedConsent, Persistence_Oracle_V1beta1_MsgDelegateFeedConsentResponse> {
    return self.makeAsyncUnaryCall(
      path: Persistence_Oracle_V1beta1_MsgClientMetadata.Methods.delegateFeedConsent.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDelegateFeedConsentInterceptors() ?? []
    )
  }

  internal func makeAddFundsToRewardPoolCall(
    _ request: Persistence_Oracle_V1beta1_MsgAddFundsToRewardPool,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Persistence_Oracle_V1beta1_MsgAddFundsToRewardPool, Persistence_Oracle_V1beta1_MsgAddFundsToRewardPoolResponse> {
    return self.makeAsyncUnaryCall(
      path: Persistence_Oracle_V1beta1_MsgClientMetadata.Methods.addFundsToRewardPool.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAddFundsToRewardPoolInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Persistence_Oracle_V1beta1_MsgAsyncClientProtocol {
  internal func aggregateExchangeRatePrevote(
    _ request: Persistence_Oracle_V1beta1_MsgAggregateExchangeRatePrevote,
    callOptions: CallOptions? = nil
  ) async throws -> Persistence_Oracle_V1beta1_MsgAggregateExchangeRatePrevoteResponse {
    return try await self.performAsyncUnaryCall(
      path: Persistence_Oracle_V1beta1_MsgClientMetadata.Methods.aggregateExchangeRatePrevote.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAggregateExchangeRatePrevoteInterceptors() ?? []
    )
  }

  internal func aggregateExchangeRateVote(
    _ request: Persistence_Oracle_V1beta1_MsgAggregateExchangeRateVote,
    callOptions: CallOptions? = nil
  ) async throws -> Persistence_Oracle_V1beta1_MsgAggregateExchangeRateVoteResponse {
    return try await self.performAsyncUnaryCall(
      path: Persistence_Oracle_V1beta1_MsgClientMetadata.Methods.aggregateExchangeRateVote.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAggregateExchangeRateVoteInterceptors() ?? []
    )
  }

  internal func delegateFeedConsent(
    _ request: Persistence_Oracle_V1beta1_MsgDelegateFeedConsent,
    callOptions: CallOptions? = nil
  ) async throws -> Persistence_Oracle_V1beta1_MsgDelegateFeedConsentResponse {
    return try await self.performAsyncUnaryCall(
      path: Persistence_Oracle_V1beta1_MsgClientMetadata.Methods.delegateFeedConsent.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDelegateFeedConsentInterceptors() ?? []
    )
  }

  internal func addFundsToRewardPool(
    _ request: Persistence_Oracle_V1beta1_MsgAddFundsToRewardPool,
    callOptions: CallOptions? = nil
  ) async throws -> Persistence_Oracle_V1beta1_MsgAddFundsToRewardPoolResponse {
    return try await self.performAsyncUnaryCall(
      path: Persistence_Oracle_V1beta1_MsgClientMetadata.Methods.addFundsToRewardPool.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAddFundsToRewardPoolInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Persistence_Oracle_V1beta1_MsgAsyncClient: Persistence_Oracle_V1beta1_MsgAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Persistence_Oracle_V1beta1_MsgClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Persistence_Oracle_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Persistence_Oracle_V1beta1_MsgClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'aggregateExchangeRatePrevote'.
  func makeAggregateExchangeRatePrevoteInterceptors() -> [ClientInterceptor<Persistence_Oracle_V1beta1_MsgAggregateExchangeRatePrevote, Persistence_Oracle_V1beta1_MsgAggregateExchangeRatePrevoteResponse>]

  /// - Returns: Interceptors to use when invoking 'aggregateExchangeRateVote'.
  func makeAggregateExchangeRateVoteInterceptors() -> [ClientInterceptor<Persistence_Oracle_V1beta1_MsgAggregateExchangeRateVote, Persistence_Oracle_V1beta1_MsgAggregateExchangeRateVoteResponse>]

  /// - Returns: Interceptors to use when invoking 'delegateFeedConsent'.
  func makeDelegateFeedConsentInterceptors() -> [ClientInterceptor<Persistence_Oracle_V1beta1_MsgDelegateFeedConsent, Persistence_Oracle_V1beta1_MsgDelegateFeedConsentResponse>]

  /// - Returns: Interceptors to use when invoking 'addFundsToRewardPool'.
  func makeAddFundsToRewardPoolInterceptors() -> [ClientInterceptor<Persistence_Oracle_V1beta1_MsgAddFundsToRewardPool, Persistence_Oracle_V1beta1_MsgAddFundsToRewardPoolResponse>]
}

internal enum Persistence_Oracle_V1beta1_MsgClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "persistence.oracle.v1beta1.Msg",
    methods: [
      Persistence_Oracle_V1beta1_MsgClientMetadata.Methods.aggregateExchangeRatePrevote,
      Persistence_Oracle_V1beta1_MsgClientMetadata.Methods.aggregateExchangeRateVote,
      Persistence_Oracle_V1beta1_MsgClientMetadata.Methods.delegateFeedConsent,
      Persistence_Oracle_V1beta1_MsgClientMetadata.Methods.addFundsToRewardPool,
    ]
  )

  internal enum Methods {
    internal static let aggregateExchangeRatePrevote = GRPCMethodDescriptor(
      name: "AggregateExchangeRatePrevote",
      path: "/persistence.oracle.v1beta1.Msg/AggregateExchangeRatePrevote",
      type: GRPCCallType.unary
    )

    internal static let aggregateExchangeRateVote = GRPCMethodDescriptor(
      name: "AggregateExchangeRateVote",
      path: "/persistence.oracle.v1beta1.Msg/AggregateExchangeRateVote",
      type: GRPCCallType.unary
    )

    internal static let delegateFeedConsent = GRPCMethodDescriptor(
      name: "DelegateFeedConsent",
      path: "/persistence.oracle.v1beta1.Msg/DelegateFeedConsent",
      type: GRPCCallType.unary
    )

    internal static let addFundsToRewardPool = GRPCMethodDescriptor(
      name: "AddFundsToRewardPool",
      path: "/persistence.oracle.v1beta1.Msg/AddFundsToRewardPool",
      type: GRPCCallType.unary
    )
  }
}

/// Msg defines the oracle Msg service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Persistence_Oracle_V1beta1_MsgProvider: CallHandlerProvider {
  var interceptors: Persistence_Oracle_V1beta1_MsgServerInterceptorFactoryProtocol? { get }

  /// AggregateExchangeRatePrevote defines a method for submitting an aggregate
  /// exchange rate prevote.
  func aggregateExchangeRatePrevote(request: Persistence_Oracle_V1beta1_MsgAggregateExchangeRatePrevote, context: StatusOnlyCallContext) -> EventLoopFuture<Persistence_Oracle_V1beta1_MsgAggregateExchangeRatePrevoteResponse>

  /// AggregateExchangeRateVote defines a method for submitting an aggregate
  /// exchange rate vote.
  func aggregateExchangeRateVote(request: Persistence_Oracle_V1beta1_MsgAggregateExchangeRateVote, context: StatusOnlyCallContext) -> EventLoopFuture<Persistence_Oracle_V1beta1_MsgAggregateExchangeRateVoteResponse>

  /// DelegateFeedConsent defines a method for setting the feeder delegation.
  func delegateFeedConsent(request: Persistence_Oracle_V1beta1_MsgDelegateFeedConsent, context: StatusOnlyCallContext) -> EventLoopFuture<Persistence_Oracle_V1beta1_MsgDelegateFeedConsentResponse>

  /// AddFundsToRewardPool
  func addFundsToRewardPool(request: Persistence_Oracle_V1beta1_MsgAddFundsToRewardPool, context: StatusOnlyCallContext) -> EventLoopFuture<Persistence_Oracle_V1beta1_MsgAddFundsToRewardPoolResponse>
}

extension Persistence_Oracle_V1beta1_MsgProvider {
  internal var serviceName: Substring {
    return Persistence_Oracle_V1beta1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "AggregateExchangeRatePrevote":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Persistence_Oracle_V1beta1_MsgAggregateExchangeRatePrevote>(),
        responseSerializer: ProtobufSerializer<Persistence_Oracle_V1beta1_MsgAggregateExchangeRatePrevoteResponse>(),
        interceptors: self.interceptors?.makeAggregateExchangeRatePrevoteInterceptors() ?? [],
        userFunction: self.aggregateExchangeRatePrevote(request:context:)
      )

    case "AggregateExchangeRateVote":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Persistence_Oracle_V1beta1_MsgAggregateExchangeRateVote>(),
        responseSerializer: ProtobufSerializer<Persistence_Oracle_V1beta1_MsgAggregateExchangeRateVoteResponse>(),
        interceptors: self.interceptors?.makeAggregateExchangeRateVoteInterceptors() ?? [],
        userFunction: self.aggregateExchangeRateVote(request:context:)
      )

    case "DelegateFeedConsent":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Persistence_Oracle_V1beta1_MsgDelegateFeedConsent>(),
        responseSerializer: ProtobufSerializer<Persistence_Oracle_V1beta1_MsgDelegateFeedConsentResponse>(),
        interceptors: self.interceptors?.makeDelegateFeedConsentInterceptors() ?? [],
        userFunction: self.delegateFeedConsent(request:context:)
      )

    case "AddFundsToRewardPool":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Persistence_Oracle_V1beta1_MsgAddFundsToRewardPool>(),
        responseSerializer: ProtobufSerializer<Persistence_Oracle_V1beta1_MsgAddFundsToRewardPoolResponse>(),
        interceptors: self.interceptors?.makeAddFundsToRewardPoolInterceptors() ?? [],
        userFunction: self.addFundsToRewardPool(request:context:)
      )

    default:
      return nil
    }
  }
}

/// Msg defines the oracle Msg service.
///
/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Persistence_Oracle_V1beta1_MsgAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Persistence_Oracle_V1beta1_MsgServerInterceptorFactoryProtocol? { get }

  /// AggregateExchangeRatePrevote defines a method for submitting an aggregate
  /// exchange rate prevote.
  @Sendable func aggregateExchangeRatePrevote(
    request: Persistence_Oracle_V1beta1_MsgAggregateExchangeRatePrevote,
    context: GRPCAsyncServerCallContext
  ) async throws -> Persistence_Oracle_V1beta1_MsgAggregateExchangeRatePrevoteResponse

  /// AggregateExchangeRateVote defines a method for submitting an aggregate
  /// exchange rate vote.
  @Sendable func aggregateExchangeRateVote(
    request: Persistence_Oracle_V1beta1_MsgAggregateExchangeRateVote,
    context: GRPCAsyncServerCallContext
  ) async throws -> Persistence_Oracle_V1beta1_MsgAggregateExchangeRateVoteResponse

  /// DelegateFeedConsent defines a method for setting the feeder delegation.
  @Sendable func delegateFeedConsent(
    request: Persistence_Oracle_V1beta1_MsgDelegateFeedConsent,
    context: GRPCAsyncServerCallContext
  ) async throws -> Persistence_Oracle_V1beta1_MsgDelegateFeedConsentResponse

  /// AddFundsToRewardPool
  @Sendable func addFundsToRewardPool(
    request: Persistence_Oracle_V1beta1_MsgAddFundsToRewardPool,
    context: GRPCAsyncServerCallContext
  ) async throws -> Persistence_Oracle_V1beta1_MsgAddFundsToRewardPoolResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Persistence_Oracle_V1beta1_MsgAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Persistence_Oracle_V1beta1_MsgServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Persistence_Oracle_V1beta1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Persistence_Oracle_V1beta1_MsgServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "AggregateExchangeRatePrevote":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Persistence_Oracle_V1beta1_MsgAggregateExchangeRatePrevote>(),
        responseSerializer: ProtobufSerializer<Persistence_Oracle_V1beta1_MsgAggregateExchangeRatePrevoteResponse>(),
        interceptors: self.interceptors?.makeAggregateExchangeRatePrevoteInterceptors() ?? [],
        wrapping: self.aggregateExchangeRatePrevote(request:context:)
      )

    case "AggregateExchangeRateVote":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Persistence_Oracle_V1beta1_MsgAggregateExchangeRateVote>(),
        responseSerializer: ProtobufSerializer<Persistence_Oracle_V1beta1_MsgAggregateExchangeRateVoteResponse>(),
        interceptors: self.interceptors?.makeAggregateExchangeRateVoteInterceptors() ?? [],
        wrapping: self.aggregateExchangeRateVote(request:context:)
      )

    case "DelegateFeedConsent":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Persistence_Oracle_V1beta1_MsgDelegateFeedConsent>(),
        responseSerializer: ProtobufSerializer<Persistence_Oracle_V1beta1_MsgDelegateFeedConsentResponse>(),
        interceptors: self.interceptors?.makeDelegateFeedConsentInterceptors() ?? [],
        wrapping: self.delegateFeedConsent(request:context:)
      )

    case "AddFundsToRewardPool":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Persistence_Oracle_V1beta1_MsgAddFundsToRewardPool>(),
        responseSerializer: ProtobufSerializer<Persistence_Oracle_V1beta1_MsgAddFundsToRewardPoolResponse>(),
        interceptors: self.interceptors?.makeAddFundsToRewardPoolInterceptors() ?? [],
        wrapping: self.addFundsToRewardPool(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Persistence_Oracle_V1beta1_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'aggregateExchangeRatePrevote'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeAggregateExchangeRatePrevoteInterceptors() -> [ServerInterceptor<Persistence_Oracle_V1beta1_MsgAggregateExchangeRatePrevote, Persistence_Oracle_V1beta1_MsgAggregateExchangeRatePrevoteResponse>]

  /// - Returns: Interceptors to use when handling 'aggregateExchangeRateVote'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeAggregateExchangeRateVoteInterceptors() -> [ServerInterceptor<Persistence_Oracle_V1beta1_MsgAggregateExchangeRateVote, Persistence_Oracle_V1beta1_MsgAggregateExchangeRateVoteResponse>]

  /// - Returns: Interceptors to use when handling 'delegateFeedConsent'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeDelegateFeedConsentInterceptors() -> [ServerInterceptor<Persistence_Oracle_V1beta1_MsgDelegateFeedConsent, Persistence_Oracle_V1beta1_MsgDelegateFeedConsentResponse>]

  /// - Returns: Interceptors to use when handling 'addFundsToRewardPool'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeAddFundsToRewardPoolInterceptors() -> [ServerInterceptor<Persistence_Oracle_V1beta1_MsgAddFundsToRewardPool, Persistence_Oracle_V1beta1_MsgAddFundsToRewardPoolResponse>]
}

internal enum Persistence_Oracle_V1beta1_MsgServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "persistence.oracle.v1beta1.Msg",
    methods: [
      Persistence_Oracle_V1beta1_MsgServerMetadata.Methods.aggregateExchangeRatePrevote,
      Persistence_Oracle_V1beta1_MsgServerMetadata.Methods.aggregateExchangeRateVote,
      Persistence_Oracle_V1beta1_MsgServerMetadata.Methods.delegateFeedConsent,
      Persistence_Oracle_V1beta1_MsgServerMetadata.Methods.addFundsToRewardPool,
    ]
  )

  internal enum Methods {
    internal static let aggregateExchangeRatePrevote = GRPCMethodDescriptor(
      name: "AggregateExchangeRatePrevote",
      path: "/persistence.oracle.v1beta1.Msg/AggregateExchangeRatePrevote",
      type: GRPCCallType.unary
    )

    internal static let aggregateExchangeRateVote = GRPCMethodDescriptor(
      name: "AggregateExchangeRateVote",
      path: "/persistence.oracle.v1beta1.Msg/AggregateExchangeRateVote",
      type: GRPCCallType.unary
    )

    internal static let delegateFeedConsent = GRPCMethodDescriptor(
      name: "DelegateFeedConsent",
      path: "/persistence.oracle.v1beta1.Msg/DelegateFeedConsent",
      type: GRPCCallType.unary
    )

    internal static let addFundsToRewardPool = GRPCMethodDescriptor(
      name: "AddFundsToRewardPool",
      path: "/persistence.oracle.v1beta1.Msg/AddFundsToRewardPool",
      type: GRPCCallType.unary
    )
  }
}
