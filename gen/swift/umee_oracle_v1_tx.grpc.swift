//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: umee/oracle/v1/tx.proto
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
/// Usage: instantiate `Umee_Oracle_V1_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Umee_Oracle_V1_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Umee_Oracle_V1_MsgClientInterceptorFactoryProtocol? { get }

  func aggregateExchangeRatePrevote(
    _ request: Umee_Oracle_V1_MsgAggregateExchangeRatePrevote,
    callOptions: CallOptions?
  ) -> UnaryCall<Umee_Oracle_V1_MsgAggregateExchangeRatePrevote, Umee_Oracle_V1_MsgAggregateExchangeRatePrevoteResponse>

  func aggregateExchangeRateVote(
    _ request: Umee_Oracle_V1_MsgAggregateExchangeRateVote,
    callOptions: CallOptions?
  ) -> UnaryCall<Umee_Oracle_V1_MsgAggregateExchangeRateVote, Umee_Oracle_V1_MsgAggregateExchangeRateVoteResponse>

  func delegateFeedConsent(
    _ request: Umee_Oracle_V1_MsgDelegateFeedConsent,
    callOptions: CallOptions?
  ) -> UnaryCall<Umee_Oracle_V1_MsgDelegateFeedConsent, Umee_Oracle_V1_MsgDelegateFeedConsentResponse>
}

extension Umee_Oracle_V1_MsgClientProtocol {
  internal var serviceName: String {
    return "umee.oracle.v1.Msg"
  }

  /// AggregateExchangeRatePrevote defines a method for submitting an aggregate
  /// exchange rate prevote.
  ///
  /// - Parameters:
  ///   - request: Request to send to AggregateExchangeRatePrevote.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func aggregateExchangeRatePrevote(
    _ request: Umee_Oracle_V1_MsgAggregateExchangeRatePrevote,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Umee_Oracle_V1_MsgAggregateExchangeRatePrevote, Umee_Oracle_V1_MsgAggregateExchangeRatePrevoteResponse> {
    return self.makeUnaryCall(
      path: Umee_Oracle_V1_MsgClientMetadata.Methods.aggregateExchangeRatePrevote.path,
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
    _ request: Umee_Oracle_V1_MsgAggregateExchangeRateVote,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Umee_Oracle_V1_MsgAggregateExchangeRateVote, Umee_Oracle_V1_MsgAggregateExchangeRateVoteResponse> {
    return self.makeUnaryCall(
      path: Umee_Oracle_V1_MsgClientMetadata.Methods.aggregateExchangeRateVote.path,
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
    _ request: Umee_Oracle_V1_MsgDelegateFeedConsent,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Umee_Oracle_V1_MsgDelegateFeedConsent, Umee_Oracle_V1_MsgDelegateFeedConsentResponse> {
    return self.makeUnaryCall(
      path: Umee_Oracle_V1_MsgClientMetadata.Methods.delegateFeedConsent.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDelegateFeedConsentInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Umee_Oracle_V1_MsgClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Umee_Oracle_V1_MsgNIOClient")
internal final class Umee_Oracle_V1_MsgClient: Umee_Oracle_V1_MsgClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Umee_Oracle_V1_MsgClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Umee_Oracle_V1_MsgClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the umee.oracle.v1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Umee_Oracle_V1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Umee_Oracle_V1_MsgNIOClient: Umee_Oracle_V1_MsgClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Umee_Oracle_V1_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the umee.oracle.v1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Umee_Oracle_V1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Msg defines the oracle Msg service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Umee_Oracle_V1_MsgAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Umee_Oracle_V1_MsgClientInterceptorFactoryProtocol? { get }

  func makeAggregateExchangeRatePrevoteCall(
    _ request: Umee_Oracle_V1_MsgAggregateExchangeRatePrevote,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Umee_Oracle_V1_MsgAggregateExchangeRatePrevote, Umee_Oracle_V1_MsgAggregateExchangeRatePrevoteResponse>

  func makeAggregateExchangeRateVoteCall(
    _ request: Umee_Oracle_V1_MsgAggregateExchangeRateVote,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Umee_Oracle_V1_MsgAggregateExchangeRateVote, Umee_Oracle_V1_MsgAggregateExchangeRateVoteResponse>

  func makeDelegateFeedConsentCall(
    _ request: Umee_Oracle_V1_MsgDelegateFeedConsent,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Umee_Oracle_V1_MsgDelegateFeedConsent, Umee_Oracle_V1_MsgDelegateFeedConsentResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Umee_Oracle_V1_MsgAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Umee_Oracle_V1_MsgClientMetadata.serviceDescriptor
  }

  internal var interceptors: Umee_Oracle_V1_MsgClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeAggregateExchangeRatePrevoteCall(
    _ request: Umee_Oracle_V1_MsgAggregateExchangeRatePrevote,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Umee_Oracle_V1_MsgAggregateExchangeRatePrevote, Umee_Oracle_V1_MsgAggregateExchangeRatePrevoteResponse> {
    return self.makeAsyncUnaryCall(
      path: Umee_Oracle_V1_MsgClientMetadata.Methods.aggregateExchangeRatePrevote.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAggregateExchangeRatePrevoteInterceptors() ?? []
    )
  }

  internal func makeAggregateExchangeRateVoteCall(
    _ request: Umee_Oracle_V1_MsgAggregateExchangeRateVote,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Umee_Oracle_V1_MsgAggregateExchangeRateVote, Umee_Oracle_V1_MsgAggregateExchangeRateVoteResponse> {
    return self.makeAsyncUnaryCall(
      path: Umee_Oracle_V1_MsgClientMetadata.Methods.aggregateExchangeRateVote.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAggregateExchangeRateVoteInterceptors() ?? []
    )
  }

  internal func makeDelegateFeedConsentCall(
    _ request: Umee_Oracle_V1_MsgDelegateFeedConsent,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Umee_Oracle_V1_MsgDelegateFeedConsent, Umee_Oracle_V1_MsgDelegateFeedConsentResponse> {
    return self.makeAsyncUnaryCall(
      path: Umee_Oracle_V1_MsgClientMetadata.Methods.delegateFeedConsent.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDelegateFeedConsentInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Umee_Oracle_V1_MsgAsyncClientProtocol {
  internal func aggregateExchangeRatePrevote(
    _ request: Umee_Oracle_V1_MsgAggregateExchangeRatePrevote,
    callOptions: CallOptions? = nil
  ) async throws -> Umee_Oracle_V1_MsgAggregateExchangeRatePrevoteResponse {
    return try await self.performAsyncUnaryCall(
      path: Umee_Oracle_V1_MsgClientMetadata.Methods.aggregateExchangeRatePrevote.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAggregateExchangeRatePrevoteInterceptors() ?? []
    )
  }

  internal func aggregateExchangeRateVote(
    _ request: Umee_Oracle_V1_MsgAggregateExchangeRateVote,
    callOptions: CallOptions? = nil
  ) async throws -> Umee_Oracle_V1_MsgAggregateExchangeRateVoteResponse {
    return try await self.performAsyncUnaryCall(
      path: Umee_Oracle_V1_MsgClientMetadata.Methods.aggregateExchangeRateVote.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAggregateExchangeRateVoteInterceptors() ?? []
    )
  }

  internal func delegateFeedConsent(
    _ request: Umee_Oracle_V1_MsgDelegateFeedConsent,
    callOptions: CallOptions? = nil
  ) async throws -> Umee_Oracle_V1_MsgDelegateFeedConsentResponse {
    return try await self.performAsyncUnaryCall(
      path: Umee_Oracle_V1_MsgClientMetadata.Methods.delegateFeedConsent.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDelegateFeedConsentInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Umee_Oracle_V1_MsgAsyncClient: Umee_Oracle_V1_MsgAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Umee_Oracle_V1_MsgClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Umee_Oracle_V1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Umee_Oracle_V1_MsgClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'aggregateExchangeRatePrevote'.
  func makeAggregateExchangeRatePrevoteInterceptors() -> [ClientInterceptor<Umee_Oracle_V1_MsgAggregateExchangeRatePrevote, Umee_Oracle_V1_MsgAggregateExchangeRatePrevoteResponse>]

  /// - Returns: Interceptors to use when invoking 'aggregateExchangeRateVote'.
  func makeAggregateExchangeRateVoteInterceptors() -> [ClientInterceptor<Umee_Oracle_V1_MsgAggregateExchangeRateVote, Umee_Oracle_V1_MsgAggregateExchangeRateVoteResponse>]

  /// - Returns: Interceptors to use when invoking 'delegateFeedConsent'.
  func makeDelegateFeedConsentInterceptors() -> [ClientInterceptor<Umee_Oracle_V1_MsgDelegateFeedConsent, Umee_Oracle_V1_MsgDelegateFeedConsentResponse>]
}

internal enum Umee_Oracle_V1_MsgClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "umee.oracle.v1.Msg",
    methods: [
      Umee_Oracle_V1_MsgClientMetadata.Methods.aggregateExchangeRatePrevote,
      Umee_Oracle_V1_MsgClientMetadata.Methods.aggregateExchangeRateVote,
      Umee_Oracle_V1_MsgClientMetadata.Methods.delegateFeedConsent,
    ]
  )

  internal enum Methods {
    internal static let aggregateExchangeRatePrevote = GRPCMethodDescriptor(
      name: "AggregateExchangeRatePrevote",
      path: "/umee.oracle.v1.Msg/AggregateExchangeRatePrevote",
      type: GRPCCallType.unary
    )

    internal static let aggregateExchangeRateVote = GRPCMethodDescriptor(
      name: "AggregateExchangeRateVote",
      path: "/umee.oracle.v1.Msg/AggregateExchangeRateVote",
      type: GRPCCallType.unary
    )

    internal static let delegateFeedConsent = GRPCMethodDescriptor(
      name: "DelegateFeedConsent",
      path: "/umee.oracle.v1.Msg/DelegateFeedConsent",
      type: GRPCCallType.unary
    )
  }
}

/// Msg defines the oracle Msg service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Umee_Oracle_V1_MsgProvider: CallHandlerProvider {
  var interceptors: Umee_Oracle_V1_MsgServerInterceptorFactoryProtocol? { get }

  /// AggregateExchangeRatePrevote defines a method for submitting an aggregate
  /// exchange rate prevote.
  func aggregateExchangeRatePrevote(request: Umee_Oracle_V1_MsgAggregateExchangeRatePrevote, context: StatusOnlyCallContext) -> EventLoopFuture<Umee_Oracle_V1_MsgAggregateExchangeRatePrevoteResponse>

  /// AggregateExchangeRateVote defines a method for submitting an aggregate
  /// exchange rate vote.
  func aggregateExchangeRateVote(request: Umee_Oracle_V1_MsgAggregateExchangeRateVote, context: StatusOnlyCallContext) -> EventLoopFuture<Umee_Oracle_V1_MsgAggregateExchangeRateVoteResponse>

  /// DelegateFeedConsent defines a method for setting the feeder delegation.
  func delegateFeedConsent(request: Umee_Oracle_V1_MsgDelegateFeedConsent, context: StatusOnlyCallContext) -> EventLoopFuture<Umee_Oracle_V1_MsgDelegateFeedConsentResponse>
}

extension Umee_Oracle_V1_MsgProvider {
  internal var serviceName: Substring {
    return Umee_Oracle_V1_MsgServerMetadata.serviceDescriptor.fullName[...]
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
        requestDeserializer: ProtobufDeserializer<Umee_Oracle_V1_MsgAggregateExchangeRatePrevote>(),
        responseSerializer: ProtobufSerializer<Umee_Oracle_V1_MsgAggregateExchangeRatePrevoteResponse>(),
        interceptors: self.interceptors?.makeAggregateExchangeRatePrevoteInterceptors() ?? [],
        userFunction: self.aggregateExchangeRatePrevote(request:context:)
      )

    case "AggregateExchangeRateVote":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Umee_Oracle_V1_MsgAggregateExchangeRateVote>(),
        responseSerializer: ProtobufSerializer<Umee_Oracle_V1_MsgAggregateExchangeRateVoteResponse>(),
        interceptors: self.interceptors?.makeAggregateExchangeRateVoteInterceptors() ?? [],
        userFunction: self.aggregateExchangeRateVote(request:context:)
      )

    case "DelegateFeedConsent":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Umee_Oracle_V1_MsgDelegateFeedConsent>(),
        responseSerializer: ProtobufSerializer<Umee_Oracle_V1_MsgDelegateFeedConsentResponse>(),
        interceptors: self.interceptors?.makeDelegateFeedConsentInterceptors() ?? [],
        userFunction: self.delegateFeedConsent(request:context:)
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
internal protocol Umee_Oracle_V1_MsgAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Umee_Oracle_V1_MsgServerInterceptorFactoryProtocol? { get }

  /// AggregateExchangeRatePrevote defines a method for submitting an aggregate
  /// exchange rate prevote.
  @Sendable func aggregateExchangeRatePrevote(
    request: Umee_Oracle_V1_MsgAggregateExchangeRatePrevote,
    context: GRPCAsyncServerCallContext
  ) async throws -> Umee_Oracle_V1_MsgAggregateExchangeRatePrevoteResponse

  /// AggregateExchangeRateVote defines a method for submitting an aggregate
  /// exchange rate vote.
  @Sendable func aggregateExchangeRateVote(
    request: Umee_Oracle_V1_MsgAggregateExchangeRateVote,
    context: GRPCAsyncServerCallContext
  ) async throws -> Umee_Oracle_V1_MsgAggregateExchangeRateVoteResponse

  /// DelegateFeedConsent defines a method for setting the feeder delegation.
  @Sendable func delegateFeedConsent(
    request: Umee_Oracle_V1_MsgDelegateFeedConsent,
    context: GRPCAsyncServerCallContext
  ) async throws -> Umee_Oracle_V1_MsgDelegateFeedConsentResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Umee_Oracle_V1_MsgAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Umee_Oracle_V1_MsgServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Umee_Oracle_V1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Umee_Oracle_V1_MsgServerInterceptorFactoryProtocol? {
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
        requestDeserializer: ProtobufDeserializer<Umee_Oracle_V1_MsgAggregateExchangeRatePrevote>(),
        responseSerializer: ProtobufSerializer<Umee_Oracle_V1_MsgAggregateExchangeRatePrevoteResponse>(),
        interceptors: self.interceptors?.makeAggregateExchangeRatePrevoteInterceptors() ?? [],
        wrapping: self.aggregateExchangeRatePrevote(request:context:)
      )

    case "AggregateExchangeRateVote":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Umee_Oracle_V1_MsgAggregateExchangeRateVote>(),
        responseSerializer: ProtobufSerializer<Umee_Oracle_V1_MsgAggregateExchangeRateVoteResponse>(),
        interceptors: self.interceptors?.makeAggregateExchangeRateVoteInterceptors() ?? [],
        wrapping: self.aggregateExchangeRateVote(request:context:)
      )

    case "DelegateFeedConsent":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Umee_Oracle_V1_MsgDelegateFeedConsent>(),
        responseSerializer: ProtobufSerializer<Umee_Oracle_V1_MsgDelegateFeedConsentResponse>(),
        interceptors: self.interceptors?.makeDelegateFeedConsentInterceptors() ?? [],
        wrapping: self.delegateFeedConsent(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Umee_Oracle_V1_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'aggregateExchangeRatePrevote'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeAggregateExchangeRatePrevoteInterceptors() -> [ServerInterceptor<Umee_Oracle_V1_MsgAggregateExchangeRatePrevote, Umee_Oracle_V1_MsgAggregateExchangeRatePrevoteResponse>]

  /// - Returns: Interceptors to use when handling 'aggregateExchangeRateVote'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeAggregateExchangeRateVoteInterceptors() -> [ServerInterceptor<Umee_Oracle_V1_MsgAggregateExchangeRateVote, Umee_Oracle_V1_MsgAggregateExchangeRateVoteResponse>]

  /// - Returns: Interceptors to use when handling 'delegateFeedConsent'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeDelegateFeedConsentInterceptors() -> [ServerInterceptor<Umee_Oracle_V1_MsgDelegateFeedConsent, Umee_Oracle_V1_MsgDelegateFeedConsentResponse>]
}

internal enum Umee_Oracle_V1_MsgServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "umee.oracle.v1.Msg",
    methods: [
      Umee_Oracle_V1_MsgServerMetadata.Methods.aggregateExchangeRatePrevote,
      Umee_Oracle_V1_MsgServerMetadata.Methods.aggregateExchangeRateVote,
      Umee_Oracle_V1_MsgServerMetadata.Methods.delegateFeedConsent,
    ]
  )

  internal enum Methods {
    internal static let aggregateExchangeRatePrevote = GRPCMethodDescriptor(
      name: "AggregateExchangeRatePrevote",
      path: "/umee.oracle.v1.Msg/AggregateExchangeRatePrevote",
      type: GRPCCallType.unary
    )

    internal static let aggregateExchangeRateVote = GRPCMethodDescriptor(
      name: "AggregateExchangeRateVote",
      path: "/umee.oracle.v1.Msg/AggregateExchangeRateVote",
      type: GRPCCallType.unary
    )

    internal static let delegateFeedConsent = GRPCMethodDescriptor(
      name: "DelegateFeedConsent",
      path: "/umee.oracle.v1.Msg/DelegateFeedConsent",
      type: GRPCCallType.unary
    )
  }
}
