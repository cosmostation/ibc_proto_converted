//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: desmos/reactions/v1/query.proto
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


/// Query defines the gRPC querier service.
///
/// Usage: instantiate `Desmos_Reactions_V1_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Desmos_Reactions_V1_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Desmos_Reactions_V1_QueryClientInterceptorFactoryProtocol? { get }

  func reactions(
    _ request: Desmos_Reactions_V1_QueryReactionsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Desmos_Reactions_V1_QueryReactionsRequest, Desmos_Reactions_V1_QueryReactionsResponse>

  func reaction(
    _ request: Desmos_Reactions_V1_QueryReactionRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Desmos_Reactions_V1_QueryReactionRequest, Desmos_Reactions_V1_QueryReactionResponse>

  func registeredReactions(
    _ request: Desmos_Reactions_V1_QueryRegisteredReactionsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Desmos_Reactions_V1_QueryRegisteredReactionsRequest, Desmos_Reactions_V1_QueryRegisteredReactionsResponse>

  func registeredReaction(
    _ request: Desmos_Reactions_V1_QueryRegisteredReactionRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Desmos_Reactions_V1_QueryRegisteredReactionRequest, Desmos_Reactions_V1_QueryRegisteredReactionResponse>

  func reactionsParams(
    _ request: Desmos_Reactions_V1_QueryReactionsParamsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Desmos_Reactions_V1_QueryReactionsParamsRequest, Desmos_Reactions_V1_QueryReactionsParamsResponse>
}

extension Desmos_Reactions_V1_QueryClientProtocol {
  internal var serviceName: String {
    return "desmos.reactions.v1.Query"
  }

  /// Reactions allows to query the reactions for a given post
  ///
  /// - Parameters:
  ///   - request: Request to send to Reactions.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func reactions(
    _ request: Desmos_Reactions_V1_QueryReactionsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Desmos_Reactions_V1_QueryReactionsRequest, Desmos_Reactions_V1_QueryReactionsResponse> {
    return self.makeUnaryCall(
      path: Desmos_Reactions_V1_QueryClientMetadata.Methods.reactions.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeReactionsInterceptors() ?? []
    )
  }

  /// Reaction allows to query the reaction with the given id
  ///
  /// - Parameters:
  ///   - request: Request to send to Reaction.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func reaction(
    _ request: Desmos_Reactions_V1_QueryReactionRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Desmos_Reactions_V1_QueryReactionRequest, Desmos_Reactions_V1_QueryReactionResponse> {
    return self.makeUnaryCall(
      path: Desmos_Reactions_V1_QueryClientMetadata.Methods.reaction.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeReactionInterceptors() ?? []
    )
  }

  /// RegisteredReactions allows to query the registered reaction of a subspace
  ///
  /// - Parameters:
  ///   - request: Request to send to RegisteredReactions.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func registeredReactions(
    _ request: Desmos_Reactions_V1_QueryRegisteredReactionsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Desmos_Reactions_V1_QueryRegisteredReactionsRequest, Desmos_Reactions_V1_QueryRegisteredReactionsResponse> {
    return self.makeUnaryCall(
      path: Desmos_Reactions_V1_QueryClientMetadata.Methods.registeredReactions.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRegisteredReactionsInterceptors() ?? []
    )
  }

  /// RegisteredReaction allows to query the registered reaction of a subspace
  ///
  /// - Parameters:
  ///   - request: Request to send to RegisteredReaction.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func registeredReaction(
    _ request: Desmos_Reactions_V1_QueryRegisteredReactionRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Desmos_Reactions_V1_QueryRegisteredReactionRequest, Desmos_Reactions_V1_QueryRegisteredReactionResponse> {
    return self.makeUnaryCall(
      path: Desmos_Reactions_V1_QueryClientMetadata.Methods.registeredReaction.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRegisteredReactionInterceptors() ?? []
    )
  }

  /// ReactionsParams allows to query the reaction params of a subspace
  ///
  /// - Parameters:
  ///   - request: Request to send to ReactionsParams.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func reactionsParams(
    _ request: Desmos_Reactions_V1_QueryReactionsParamsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Desmos_Reactions_V1_QueryReactionsParamsRequest, Desmos_Reactions_V1_QueryReactionsParamsResponse> {
    return self.makeUnaryCall(
      path: Desmos_Reactions_V1_QueryClientMetadata.Methods.reactionsParams.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeReactionsParamsInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Desmos_Reactions_V1_QueryClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Desmos_Reactions_V1_QueryNIOClient")
internal final class Desmos_Reactions_V1_QueryClient: Desmos_Reactions_V1_QueryClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Desmos_Reactions_V1_QueryClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Desmos_Reactions_V1_QueryClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the desmos.reactions.v1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Desmos_Reactions_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Desmos_Reactions_V1_QueryNIOClient: Desmos_Reactions_V1_QueryClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Desmos_Reactions_V1_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the desmos.reactions.v1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Desmos_Reactions_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query defines the gRPC querier service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Desmos_Reactions_V1_QueryAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Desmos_Reactions_V1_QueryClientInterceptorFactoryProtocol? { get }

  func makeReactionsCall(
    _ request: Desmos_Reactions_V1_QueryReactionsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Desmos_Reactions_V1_QueryReactionsRequest, Desmos_Reactions_V1_QueryReactionsResponse>

  func makeReactionCall(
    _ request: Desmos_Reactions_V1_QueryReactionRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Desmos_Reactions_V1_QueryReactionRequest, Desmos_Reactions_V1_QueryReactionResponse>

  func makeRegisteredReactionsCall(
    _ request: Desmos_Reactions_V1_QueryRegisteredReactionsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Desmos_Reactions_V1_QueryRegisteredReactionsRequest, Desmos_Reactions_V1_QueryRegisteredReactionsResponse>

  func makeRegisteredReactionCall(
    _ request: Desmos_Reactions_V1_QueryRegisteredReactionRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Desmos_Reactions_V1_QueryRegisteredReactionRequest, Desmos_Reactions_V1_QueryRegisteredReactionResponse>

  func makeReactionsParamsCall(
    _ request: Desmos_Reactions_V1_QueryReactionsParamsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Desmos_Reactions_V1_QueryReactionsParamsRequest, Desmos_Reactions_V1_QueryReactionsParamsResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Desmos_Reactions_V1_QueryAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Desmos_Reactions_V1_QueryClientMetadata.serviceDescriptor
  }

  internal var interceptors: Desmos_Reactions_V1_QueryClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeReactionsCall(
    _ request: Desmos_Reactions_V1_QueryReactionsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Desmos_Reactions_V1_QueryReactionsRequest, Desmos_Reactions_V1_QueryReactionsResponse> {
    return self.makeAsyncUnaryCall(
      path: Desmos_Reactions_V1_QueryClientMetadata.Methods.reactions.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeReactionsInterceptors() ?? []
    )
  }

  internal func makeReactionCall(
    _ request: Desmos_Reactions_V1_QueryReactionRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Desmos_Reactions_V1_QueryReactionRequest, Desmos_Reactions_V1_QueryReactionResponse> {
    return self.makeAsyncUnaryCall(
      path: Desmos_Reactions_V1_QueryClientMetadata.Methods.reaction.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeReactionInterceptors() ?? []
    )
  }

  internal func makeRegisteredReactionsCall(
    _ request: Desmos_Reactions_V1_QueryRegisteredReactionsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Desmos_Reactions_V1_QueryRegisteredReactionsRequest, Desmos_Reactions_V1_QueryRegisteredReactionsResponse> {
    return self.makeAsyncUnaryCall(
      path: Desmos_Reactions_V1_QueryClientMetadata.Methods.registeredReactions.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRegisteredReactionsInterceptors() ?? []
    )
  }

  internal func makeRegisteredReactionCall(
    _ request: Desmos_Reactions_V1_QueryRegisteredReactionRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Desmos_Reactions_V1_QueryRegisteredReactionRequest, Desmos_Reactions_V1_QueryRegisteredReactionResponse> {
    return self.makeAsyncUnaryCall(
      path: Desmos_Reactions_V1_QueryClientMetadata.Methods.registeredReaction.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRegisteredReactionInterceptors() ?? []
    )
  }

  internal func makeReactionsParamsCall(
    _ request: Desmos_Reactions_V1_QueryReactionsParamsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Desmos_Reactions_V1_QueryReactionsParamsRequest, Desmos_Reactions_V1_QueryReactionsParamsResponse> {
    return self.makeAsyncUnaryCall(
      path: Desmos_Reactions_V1_QueryClientMetadata.Methods.reactionsParams.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeReactionsParamsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Desmos_Reactions_V1_QueryAsyncClientProtocol {
  internal func reactions(
    _ request: Desmos_Reactions_V1_QueryReactionsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Desmos_Reactions_V1_QueryReactionsResponse {
    return try await self.performAsyncUnaryCall(
      path: Desmos_Reactions_V1_QueryClientMetadata.Methods.reactions.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeReactionsInterceptors() ?? []
    )
  }

  internal func reaction(
    _ request: Desmos_Reactions_V1_QueryReactionRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Desmos_Reactions_V1_QueryReactionResponse {
    return try await self.performAsyncUnaryCall(
      path: Desmos_Reactions_V1_QueryClientMetadata.Methods.reaction.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeReactionInterceptors() ?? []
    )
  }

  internal func registeredReactions(
    _ request: Desmos_Reactions_V1_QueryRegisteredReactionsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Desmos_Reactions_V1_QueryRegisteredReactionsResponse {
    return try await self.performAsyncUnaryCall(
      path: Desmos_Reactions_V1_QueryClientMetadata.Methods.registeredReactions.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRegisteredReactionsInterceptors() ?? []
    )
  }

  internal func registeredReaction(
    _ request: Desmos_Reactions_V1_QueryRegisteredReactionRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Desmos_Reactions_V1_QueryRegisteredReactionResponse {
    return try await self.performAsyncUnaryCall(
      path: Desmos_Reactions_V1_QueryClientMetadata.Methods.registeredReaction.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRegisteredReactionInterceptors() ?? []
    )
  }

  internal func reactionsParams(
    _ request: Desmos_Reactions_V1_QueryReactionsParamsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Desmos_Reactions_V1_QueryReactionsParamsResponse {
    return try await self.performAsyncUnaryCall(
      path: Desmos_Reactions_V1_QueryClientMetadata.Methods.reactionsParams.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeReactionsParamsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Desmos_Reactions_V1_QueryAsyncClient: Desmos_Reactions_V1_QueryAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Desmos_Reactions_V1_QueryClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Desmos_Reactions_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Desmos_Reactions_V1_QueryClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'reactions'.
  func makeReactionsInterceptors() -> [ClientInterceptor<Desmos_Reactions_V1_QueryReactionsRequest, Desmos_Reactions_V1_QueryReactionsResponse>]

  /// - Returns: Interceptors to use when invoking 'reaction'.
  func makeReactionInterceptors() -> [ClientInterceptor<Desmos_Reactions_V1_QueryReactionRequest, Desmos_Reactions_V1_QueryReactionResponse>]

  /// - Returns: Interceptors to use when invoking 'registeredReactions'.
  func makeRegisteredReactionsInterceptors() -> [ClientInterceptor<Desmos_Reactions_V1_QueryRegisteredReactionsRequest, Desmos_Reactions_V1_QueryRegisteredReactionsResponse>]

  /// - Returns: Interceptors to use when invoking 'registeredReaction'.
  func makeRegisteredReactionInterceptors() -> [ClientInterceptor<Desmos_Reactions_V1_QueryRegisteredReactionRequest, Desmos_Reactions_V1_QueryRegisteredReactionResponse>]

  /// - Returns: Interceptors to use when invoking 'reactionsParams'.
  func makeReactionsParamsInterceptors() -> [ClientInterceptor<Desmos_Reactions_V1_QueryReactionsParamsRequest, Desmos_Reactions_V1_QueryReactionsParamsResponse>]
}

internal enum Desmos_Reactions_V1_QueryClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "desmos.reactions.v1.Query",
    methods: [
      Desmos_Reactions_V1_QueryClientMetadata.Methods.reactions,
      Desmos_Reactions_V1_QueryClientMetadata.Methods.reaction,
      Desmos_Reactions_V1_QueryClientMetadata.Methods.registeredReactions,
      Desmos_Reactions_V1_QueryClientMetadata.Methods.registeredReaction,
      Desmos_Reactions_V1_QueryClientMetadata.Methods.reactionsParams,
    ]
  )

  internal enum Methods {
    internal static let reactions = GRPCMethodDescriptor(
      name: "Reactions",
      path: "/desmos.reactions.v1.Query/Reactions",
      type: GRPCCallType.unary
    )

    internal static let reaction = GRPCMethodDescriptor(
      name: "Reaction",
      path: "/desmos.reactions.v1.Query/Reaction",
      type: GRPCCallType.unary
    )

    internal static let registeredReactions = GRPCMethodDescriptor(
      name: "RegisteredReactions",
      path: "/desmos.reactions.v1.Query/RegisteredReactions",
      type: GRPCCallType.unary
    )

    internal static let registeredReaction = GRPCMethodDescriptor(
      name: "RegisteredReaction",
      path: "/desmos.reactions.v1.Query/RegisteredReaction",
      type: GRPCCallType.unary
    )

    internal static let reactionsParams = GRPCMethodDescriptor(
      name: "ReactionsParams",
      path: "/desmos.reactions.v1.Query/ReactionsParams",
      type: GRPCCallType.unary
    )
  }
}

/// Query defines the gRPC querier service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Desmos_Reactions_V1_QueryProvider: CallHandlerProvider {
  var interceptors: Desmos_Reactions_V1_QueryServerInterceptorFactoryProtocol? { get }

  /// Reactions allows to query the reactions for a given post
  func reactions(request: Desmos_Reactions_V1_QueryReactionsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Desmos_Reactions_V1_QueryReactionsResponse>

  /// Reaction allows to query the reaction with the given id
  func reaction(request: Desmos_Reactions_V1_QueryReactionRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Desmos_Reactions_V1_QueryReactionResponse>

  /// RegisteredReactions allows to query the registered reaction of a subspace
  func registeredReactions(request: Desmos_Reactions_V1_QueryRegisteredReactionsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Desmos_Reactions_V1_QueryRegisteredReactionsResponse>

  /// RegisteredReaction allows to query the registered reaction of a subspace
  func registeredReaction(request: Desmos_Reactions_V1_QueryRegisteredReactionRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Desmos_Reactions_V1_QueryRegisteredReactionResponse>

  /// ReactionsParams allows to query the reaction params of a subspace
  func reactionsParams(request: Desmos_Reactions_V1_QueryReactionsParamsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Desmos_Reactions_V1_QueryReactionsParamsResponse>
}

extension Desmos_Reactions_V1_QueryProvider {
  internal var serviceName: Substring {
    return Desmos_Reactions_V1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Reactions":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Reactions_V1_QueryReactionsRequest>(),
        responseSerializer: ProtobufSerializer<Desmos_Reactions_V1_QueryReactionsResponse>(),
        interceptors: self.interceptors?.makeReactionsInterceptors() ?? [],
        userFunction: self.reactions(request:context:)
      )

    case "Reaction":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Reactions_V1_QueryReactionRequest>(),
        responseSerializer: ProtobufSerializer<Desmos_Reactions_V1_QueryReactionResponse>(),
        interceptors: self.interceptors?.makeReactionInterceptors() ?? [],
        userFunction: self.reaction(request:context:)
      )

    case "RegisteredReactions":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Reactions_V1_QueryRegisteredReactionsRequest>(),
        responseSerializer: ProtobufSerializer<Desmos_Reactions_V1_QueryRegisteredReactionsResponse>(),
        interceptors: self.interceptors?.makeRegisteredReactionsInterceptors() ?? [],
        userFunction: self.registeredReactions(request:context:)
      )

    case "RegisteredReaction":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Reactions_V1_QueryRegisteredReactionRequest>(),
        responseSerializer: ProtobufSerializer<Desmos_Reactions_V1_QueryRegisteredReactionResponse>(),
        interceptors: self.interceptors?.makeRegisteredReactionInterceptors() ?? [],
        userFunction: self.registeredReaction(request:context:)
      )

    case "ReactionsParams":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Reactions_V1_QueryReactionsParamsRequest>(),
        responseSerializer: ProtobufSerializer<Desmos_Reactions_V1_QueryReactionsParamsResponse>(),
        interceptors: self.interceptors?.makeReactionsParamsInterceptors() ?? [],
        userFunction: self.reactionsParams(request:context:)
      )

    default:
      return nil
    }
  }
}

/// Query defines the gRPC querier service.
///
/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Desmos_Reactions_V1_QueryAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Desmos_Reactions_V1_QueryServerInterceptorFactoryProtocol? { get }

  /// Reactions allows to query the reactions for a given post
  @Sendable func reactions(
    request: Desmos_Reactions_V1_QueryReactionsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Desmos_Reactions_V1_QueryReactionsResponse

  /// Reaction allows to query the reaction with the given id
  @Sendable func reaction(
    request: Desmos_Reactions_V1_QueryReactionRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Desmos_Reactions_V1_QueryReactionResponse

  /// RegisteredReactions allows to query the registered reaction of a subspace
  @Sendable func registeredReactions(
    request: Desmos_Reactions_V1_QueryRegisteredReactionsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Desmos_Reactions_V1_QueryRegisteredReactionsResponse

  /// RegisteredReaction allows to query the registered reaction of a subspace
  @Sendable func registeredReaction(
    request: Desmos_Reactions_V1_QueryRegisteredReactionRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Desmos_Reactions_V1_QueryRegisteredReactionResponse

  /// ReactionsParams allows to query the reaction params of a subspace
  @Sendable func reactionsParams(
    request: Desmos_Reactions_V1_QueryReactionsParamsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Desmos_Reactions_V1_QueryReactionsParamsResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Desmos_Reactions_V1_QueryAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Desmos_Reactions_V1_QueryServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Desmos_Reactions_V1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Desmos_Reactions_V1_QueryServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Reactions":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Reactions_V1_QueryReactionsRequest>(),
        responseSerializer: ProtobufSerializer<Desmos_Reactions_V1_QueryReactionsResponse>(),
        interceptors: self.interceptors?.makeReactionsInterceptors() ?? [],
        wrapping: self.reactions(request:context:)
      )

    case "Reaction":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Reactions_V1_QueryReactionRequest>(),
        responseSerializer: ProtobufSerializer<Desmos_Reactions_V1_QueryReactionResponse>(),
        interceptors: self.interceptors?.makeReactionInterceptors() ?? [],
        wrapping: self.reaction(request:context:)
      )

    case "RegisteredReactions":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Reactions_V1_QueryRegisteredReactionsRequest>(),
        responseSerializer: ProtobufSerializer<Desmos_Reactions_V1_QueryRegisteredReactionsResponse>(),
        interceptors: self.interceptors?.makeRegisteredReactionsInterceptors() ?? [],
        wrapping: self.registeredReactions(request:context:)
      )

    case "RegisteredReaction":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Reactions_V1_QueryRegisteredReactionRequest>(),
        responseSerializer: ProtobufSerializer<Desmos_Reactions_V1_QueryRegisteredReactionResponse>(),
        interceptors: self.interceptors?.makeRegisteredReactionInterceptors() ?? [],
        wrapping: self.registeredReaction(request:context:)
      )

    case "ReactionsParams":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Reactions_V1_QueryReactionsParamsRequest>(),
        responseSerializer: ProtobufSerializer<Desmos_Reactions_V1_QueryReactionsParamsResponse>(),
        interceptors: self.interceptors?.makeReactionsParamsInterceptors() ?? [],
        wrapping: self.reactionsParams(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Desmos_Reactions_V1_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'reactions'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeReactionsInterceptors() -> [ServerInterceptor<Desmos_Reactions_V1_QueryReactionsRequest, Desmos_Reactions_V1_QueryReactionsResponse>]

  /// - Returns: Interceptors to use when handling 'reaction'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeReactionInterceptors() -> [ServerInterceptor<Desmos_Reactions_V1_QueryReactionRequest, Desmos_Reactions_V1_QueryReactionResponse>]

  /// - Returns: Interceptors to use when handling 'registeredReactions'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeRegisteredReactionsInterceptors() -> [ServerInterceptor<Desmos_Reactions_V1_QueryRegisteredReactionsRequest, Desmos_Reactions_V1_QueryRegisteredReactionsResponse>]

  /// - Returns: Interceptors to use when handling 'registeredReaction'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeRegisteredReactionInterceptors() -> [ServerInterceptor<Desmos_Reactions_V1_QueryRegisteredReactionRequest, Desmos_Reactions_V1_QueryRegisteredReactionResponse>]

  /// - Returns: Interceptors to use when handling 'reactionsParams'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeReactionsParamsInterceptors() -> [ServerInterceptor<Desmos_Reactions_V1_QueryReactionsParamsRequest, Desmos_Reactions_V1_QueryReactionsParamsResponse>]
}

internal enum Desmos_Reactions_V1_QueryServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "desmos.reactions.v1.Query",
    methods: [
      Desmos_Reactions_V1_QueryServerMetadata.Methods.reactions,
      Desmos_Reactions_V1_QueryServerMetadata.Methods.reaction,
      Desmos_Reactions_V1_QueryServerMetadata.Methods.registeredReactions,
      Desmos_Reactions_V1_QueryServerMetadata.Methods.registeredReaction,
      Desmos_Reactions_V1_QueryServerMetadata.Methods.reactionsParams,
    ]
  )

  internal enum Methods {
    internal static let reactions = GRPCMethodDescriptor(
      name: "Reactions",
      path: "/desmos.reactions.v1.Query/Reactions",
      type: GRPCCallType.unary
    )

    internal static let reaction = GRPCMethodDescriptor(
      name: "Reaction",
      path: "/desmos.reactions.v1.Query/Reaction",
      type: GRPCCallType.unary
    )

    internal static let registeredReactions = GRPCMethodDescriptor(
      name: "RegisteredReactions",
      path: "/desmos.reactions.v1.Query/RegisteredReactions",
      type: GRPCCallType.unary
    )

    internal static let registeredReaction = GRPCMethodDescriptor(
      name: "RegisteredReaction",
      path: "/desmos.reactions.v1.Query/RegisteredReaction",
      type: GRPCCallType.unary
    )

    internal static let reactionsParams = GRPCMethodDescriptor(
      name: "ReactionsParams",
      path: "/desmos.reactions.v1.Query/ReactionsParams",
      type: GRPCCallType.unary
    )
  }
}
