//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: injective/tokenfactory/v1beta1/query.proto
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
/// Usage: instantiate `Injective_Tokenfactory_V1beta1_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Injective_Tokenfactory_V1beta1_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Injective_Tokenfactory_V1beta1_QueryClientInterceptorFactoryProtocol? { get }

  func params(
    _ request: Injective_Tokenfactory_V1beta1_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Injective_Tokenfactory_V1beta1_QueryParamsRequest, Injective_Tokenfactory_V1beta1_QueryParamsResponse>

  func denomAuthorityMetadata(
    _ request: Injective_Tokenfactory_V1beta1_QueryDenomAuthorityMetadataRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Injective_Tokenfactory_V1beta1_QueryDenomAuthorityMetadataRequest, Injective_Tokenfactory_V1beta1_QueryDenomAuthorityMetadataResponse>

  func denomsFromCreator(
    _ request: Injective_Tokenfactory_V1beta1_QueryDenomsFromCreatorRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Injective_Tokenfactory_V1beta1_QueryDenomsFromCreatorRequest, Injective_Tokenfactory_V1beta1_QueryDenomsFromCreatorResponse>

  func tokenfactoryModuleState(
    _ request: Injective_Tokenfactory_V1beta1_QueryModuleStateRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Injective_Tokenfactory_V1beta1_QueryModuleStateRequest, Injective_Tokenfactory_V1beta1_QueryModuleStateResponse>
}

extension Injective_Tokenfactory_V1beta1_QueryClientProtocol {
  internal var serviceName: String {
    return "injective.tokenfactory.v1beta1.Query"
  }

  /// Params defines a gRPC query method that returns the tokenfactory module's
  /// parameters.
  ///
  /// - Parameters:
  ///   - request: Request to send to Params.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func params(
    _ request: Injective_Tokenfactory_V1beta1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Injective_Tokenfactory_V1beta1_QueryParamsRequest, Injective_Tokenfactory_V1beta1_QueryParamsResponse> {
    return self.makeUnaryCall(
      path: Injective_Tokenfactory_V1beta1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }

  /// DenomAuthorityMetadata defines a gRPC query method for fetching
  /// DenomAuthorityMetadata for a particular denom.
  ///
  /// - Parameters:
  ///   - request: Request to send to DenomAuthorityMetadata.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func denomAuthorityMetadata(
    _ request: Injective_Tokenfactory_V1beta1_QueryDenomAuthorityMetadataRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Injective_Tokenfactory_V1beta1_QueryDenomAuthorityMetadataRequest, Injective_Tokenfactory_V1beta1_QueryDenomAuthorityMetadataResponse> {
    return self.makeUnaryCall(
      path: Injective_Tokenfactory_V1beta1_QueryClientMetadata.Methods.denomAuthorityMetadata.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDenomAuthorityMetadataInterceptors() ?? []
    )
  }

  /// DenomsFromCreator defines a gRPC query method for fetching all
  /// denominations created by a specific admin/creator.
  ///
  /// - Parameters:
  ///   - request: Request to send to DenomsFromCreator.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func denomsFromCreator(
    _ request: Injective_Tokenfactory_V1beta1_QueryDenomsFromCreatorRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Injective_Tokenfactory_V1beta1_QueryDenomsFromCreatorRequest, Injective_Tokenfactory_V1beta1_QueryDenomsFromCreatorResponse> {
    return self.makeUnaryCall(
      path: Injective_Tokenfactory_V1beta1_QueryClientMetadata.Methods.denomsFromCreator.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDenomsFromCreatorInterceptors() ?? []
    )
  }

  /// Retrieves the entire auction module's state
  ///
  /// - Parameters:
  ///   - request: Request to send to TokenfactoryModuleState.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func tokenfactoryModuleState(
    _ request: Injective_Tokenfactory_V1beta1_QueryModuleStateRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Injective_Tokenfactory_V1beta1_QueryModuleStateRequest, Injective_Tokenfactory_V1beta1_QueryModuleStateResponse> {
    return self.makeUnaryCall(
      path: Injective_Tokenfactory_V1beta1_QueryClientMetadata.Methods.tokenfactoryModuleState.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeTokenfactoryModuleStateInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Injective_Tokenfactory_V1beta1_QueryClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Injective_Tokenfactory_V1beta1_QueryNIOClient")
internal final class Injective_Tokenfactory_V1beta1_QueryClient: Injective_Tokenfactory_V1beta1_QueryClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Injective_Tokenfactory_V1beta1_QueryClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Injective_Tokenfactory_V1beta1_QueryClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the injective.tokenfactory.v1beta1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Injective_Tokenfactory_V1beta1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Injective_Tokenfactory_V1beta1_QueryNIOClient: Injective_Tokenfactory_V1beta1_QueryClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Injective_Tokenfactory_V1beta1_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the injective.tokenfactory.v1beta1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Injective_Tokenfactory_V1beta1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query defines the gRPC querier service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Injective_Tokenfactory_V1beta1_QueryAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Injective_Tokenfactory_V1beta1_QueryClientInterceptorFactoryProtocol? { get }

  func makeParamsCall(
    _ request: Injective_Tokenfactory_V1beta1_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Injective_Tokenfactory_V1beta1_QueryParamsRequest, Injective_Tokenfactory_V1beta1_QueryParamsResponse>

  func makeDenomAuthorityMetadataCall(
    _ request: Injective_Tokenfactory_V1beta1_QueryDenomAuthorityMetadataRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Injective_Tokenfactory_V1beta1_QueryDenomAuthorityMetadataRequest, Injective_Tokenfactory_V1beta1_QueryDenomAuthorityMetadataResponse>

  func makeDenomsFromCreatorCall(
    _ request: Injective_Tokenfactory_V1beta1_QueryDenomsFromCreatorRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Injective_Tokenfactory_V1beta1_QueryDenomsFromCreatorRequest, Injective_Tokenfactory_V1beta1_QueryDenomsFromCreatorResponse>

  func makeTokenfactoryModuleStateCall(
    _ request: Injective_Tokenfactory_V1beta1_QueryModuleStateRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Injective_Tokenfactory_V1beta1_QueryModuleStateRequest, Injective_Tokenfactory_V1beta1_QueryModuleStateResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Injective_Tokenfactory_V1beta1_QueryAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Injective_Tokenfactory_V1beta1_QueryClientMetadata.serviceDescriptor
  }

  internal var interceptors: Injective_Tokenfactory_V1beta1_QueryClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeParamsCall(
    _ request: Injective_Tokenfactory_V1beta1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Injective_Tokenfactory_V1beta1_QueryParamsRequest, Injective_Tokenfactory_V1beta1_QueryParamsResponse> {
    return self.makeAsyncUnaryCall(
      path: Injective_Tokenfactory_V1beta1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }

  internal func makeDenomAuthorityMetadataCall(
    _ request: Injective_Tokenfactory_V1beta1_QueryDenomAuthorityMetadataRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Injective_Tokenfactory_V1beta1_QueryDenomAuthorityMetadataRequest, Injective_Tokenfactory_V1beta1_QueryDenomAuthorityMetadataResponse> {
    return self.makeAsyncUnaryCall(
      path: Injective_Tokenfactory_V1beta1_QueryClientMetadata.Methods.denomAuthorityMetadata.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDenomAuthorityMetadataInterceptors() ?? []
    )
  }

  internal func makeDenomsFromCreatorCall(
    _ request: Injective_Tokenfactory_V1beta1_QueryDenomsFromCreatorRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Injective_Tokenfactory_V1beta1_QueryDenomsFromCreatorRequest, Injective_Tokenfactory_V1beta1_QueryDenomsFromCreatorResponse> {
    return self.makeAsyncUnaryCall(
      path: Injective_Tokenfactory_V1beta1_QueryClientMetadata.Methods.denomsFromCreator.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDenomsFromCreatorInterceptors() ?? []
    )
  }

  internal func makeTokenfactoryModuleStateCall(
    _ request: Injective_Tokenfactory_V1beta1_QueryModuleStateRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Injective_Tokenfactory_V1beta1_QueryModuleStateRequest, Injective_Tokenfactory_V1beta1_QueryModuleStateResponse> {
    return self.makeAsyncUnaryCall(
      path: Injective_Tokenfactory_V1beta1_QueryClientMetadata.Methods.tokenfactoryModuleState.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeTokenfactoryModuleStateInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Injective_Tokenfactory_V1beta1_QueryAsyncClientProtocol {
  internal func params(
    _ request: Injective_Tokenfactory_V1beta1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Injective_Tokenfactory_V1beta1_QueryParamsResponse {
    return try await self.performAsyncUnaryCall(
      path: Injective_Tokenfactory_V1beta1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }

  internal func denomAuthorityMetadata(
    _ request: Injective_Tokenfactory_V1beta1_QueryDenomAuthorityMetadataRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Injective_Tokenfactory_V1beta1_QueryDenomAuthorityMetadataResponse {
    return try await self.performAsyncUnaryCall(
      path: Injective_Tokenfactory_V1beta1_QueryClientMetadata.Methods.denomAuthorityMetadata.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDenomAuthorityMetadataInterceptors() ?? []
    )
  }

  internal func denomsFromCreator(
    _ request: Injective_Tokenfactory_V1beta1_QueryDenomsFromCreatorRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Injective_Tokenfactory_V1beta1_QueryDenomsFromCreatorResponse {
    return try await self.performAsyncUnaryCall(
      path: Injective_Tokenfactory_V1beta1_QueryClientMetadata.Methods.denomsFromCreator.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDenomsFromCreatorInterceptors() ?? []
    )
  }

  internal func tokenfactoryModuleState(
    _ request: Injective_Tokenfactory_V1beta1_QueryModuleStateRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Injective_Tokenfactory_V1beta1_QueryModuleStateResponse {
    return try await self.performAsyncUnaryCall(
      path: Injective_Tokenfactory_V1beta1_QueryClientMetadata.Methods.tokenfactoryModuleState.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeTokenfactoryModuleStateInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Injective_Tokenfactory_V1beta1_QueryAsyncClient: Injective_Tokenfactory_V1beta1_QueryAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Injective_Tokenfactory_V1beta1_QueryClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Injective_Tokenfactory_V1beta1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Injective_Tokenfactory_V1beta1_QueryClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'params'.
  func makeParamsInterceptors() -> [ClientInterceptor<Injective_Tokenfactory_V1beta1_QueryParamsRequest, Injective_Tokenfactory_V1beta1_QueryParamsResponse>]

  /// - Returns: Interceptors to use when invoking 'denomAuthorityMetadata'.
  func makeDenomAuthorityMetadataInterceptors() -> [ClientInterceptor<Injective_Tokenfactory_V1beta1_QueryDenomAuthorityMetadataRequest, Injective_Tokenfactory_V1beta1_QueryDenomAuthorityMetadataResponse>]

  /// - Returns: Interceptors to use when invoking 'denomsFromCreator'.
  func makeDenomsFromCreatorInterceptors() -> [ClientInterceptor<Injective_Tokenfactory_V1beta1_QueryDenomsFromCreatorRequest, Injective_Tokenfactory_V1beta1_QueryDenomsFromCreatorResponse>]

  /// - Returns: Interceptors to use when invoking 'tokenfactoryModuleState'.
  func makeTokenfactoryModuleStateInterceptors() -> [ClientInterceptor<Injective_Tokenfactory_V1beta1_QueryModuleStateRequest, Injective_Tokenfactory_V1beta1_QueryModuleStateResponse>]
}

internal enum Injective_Tokenfactory_V1beta1_QueryClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "injective.tokenfactory.v1beta1.Query",
    methods: [
      Injective_Tokenfactory_V1beta1_QueryClientMetadata.Methods.params,
      Injective_Tokenfactory_V1beta1_QueryClientMetadata.Methods.denomAuthorityMetadata,
      Injective_Tokenfactory_V1beta1_QueryClientMetadata.Methods.denomsFromCreator,
      Injective_Tokenfactory_V1beta1_QueryClientMetadata.Methods.tokenfactoryModuleState,
    ]
  )

  internal enum Methods {
    internal static let params = GRPCMethodDescriptor(
      name: "Params",
      path: "/injective.tokenfactory.v1beta1.Query/Params",
      type: GRPCCallType.unary
    )

    internal static let denomAuthorityMetadata = GRPCMethodDescriptor(
      name: "DenomAuthorityMetadata",
      path: "/injective.tokenfactory.v1beta1.Query/DenomAuthorityMetadata",
      type: GRPCCallType.unary
    )

    internal static let denomsFromCreator = GRPCMethodDescriptor(
      name: "DenomsFromCreator",
      path: "/injective.tokenfactory.v1beta1.Query/DenomsFromCreator",
      type: GRPCCallType.unary
    )

    internal static let tokenfactoryModuleState = GRPCMethodDescriptor(
      name: "TokenfactoryModuleState",
      path: "/injective.tokenfactory.v1beta1.Query/TokenfactoryModuleState",
      type: GRPCCallType.unary
    )
  }
}

/// Query defines the gRPC querier service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Injective_Tokenfactory_V1beta1_QueryProvider: CallHandlerProvider {
  var interceptors: Injective_Tokenfactory_V1beta1_QueryServerInterceptorFactoryProtocol? { get }

  /// Params defines a gRPC query method that returns the tokenfactory module's
  /// parameters.
  func params(request: Injective_Tokenfactory_V1beta1_QueryParamsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Injective_Tokenfactory_V1beta1_QueryParamsResponse>

  /// DenomAuthorityMetadata defines a gRPC query method for fetching
  /// DenomAuthorityMetadata for a particular denom.
  func denomAuthorityMetadata(request: Injective_Tokenfactory_V1beta1_QueryDenomAuthorityMetadataRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Injective_Tokenfactory_V1beta1_QueryDenomAuthorityMetadataResponse>

  /// DenomsFromCreator defines a gRPC query method for fetching all
  /// denominations created by a specific admin/creator.
  func denomsFromCreator(request: Injective_Tokenfactory_V1beta1_QueryDenomsFromCreatorRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Injective_Tokenfactory_V1beta1_QueryDenomsFromCreatorResponse>

  /// Retrieves the entire auction module's state
  func tokenfactoryModuleState(request: Injective_Tokenfactory_V1beta1_QueryModuleStateRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Injective_Tokenfactory_V1beta1_QueryModuleStateResponse>
}

extension Injective_Tokenfactory_V1beta1_QueryProvider {
  internal var serviceName: Substring {
    return Injective_Tokenfactory_V1beta1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Params":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Injective_Tokenfactory_V1beta1_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Injective_Tokenfactory_V1beta1_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        userFunction: self.params(request:context:)
      )

    case "DenomAuthorityMetadata":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Injective_Tokenfactory_V1beta1_QueryDenomAuthorityMetadataRequest>(),
        responseSerializer: ProtobufSerializer<Injective_Tokenfactory_V1beta1_QueryDenomAuthorityMetadataResponse>(),
        interceptors: self.interceptors?.makeDenomAuthorityMetadataInterceptors() ?? [],
        userFunction: self.denomAuthorityMetadata(request:context:)
      )

    case "DenomsFromCreator":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Injective_Tokenfactory_V1beta1_QueryDenomsFromCreatorRequest>(),
        responseSerializer: ProtobufSerializer<Injective_Tokenfactory_V1beta1_QueryDenomsFromCreatorResponse>(),
        interceptors: self.interceptors?.makeDenomsFromCreatorInterceptors() ?? [],
        userFunction: self.denomsFromCreator(request:context:)
      )

    case "TokenfactoryModuleState":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Injective_Tokenfactory_V1beta1_QueryModuleStateRequest>(),
        responseSerializer: ProtobufSerializer<Injective_Tokenfactory_V1beta1_QueryModuleStateResponse>(),
        interceptors: self.interceptors?.makeTokenfactoryModuleStateInterceptors() ?? [],
        userFunction: self.tokenfactoryModuleState(request:context:)
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
internal protocol Injective_Tokenfactory_V1beta1_QueryAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Injective_Tokenfactory_V1beta1_QueryServerInterceptorFactoryProtocol? { get }

  /// Params defines a gRPC query method that returns the tokenfactory module's
  /// parameters.
  @Sendable func params(
    request: Injective_Tokenfactory_V1beta1_QueryParamsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Injective_Tokenfactory_V1beta1_QueryParamsResponse

  /// DenomAuthorityMetadata defines a gRPC query method for fetching
  /// DenomAuthorityMetadata for a particular denom.
  @Sendable func denomAuthorityMetadata(
    request: Injective_Tokenfactory_V1beta1_QueryDenomAuthorityMetadataRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Injective_Tokenfactory_V1beta1_QueryDenomAuthorityMetadataResponse

  /// DenomsFromCreator defines a gRPC query method for fetching all
  /// denominations created by a specific admin/creator.
  @Sendable func denomsFromCreator(
    request: Injective_Tokenfactory_V1beta1_QueryDenomsFromCreatorRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Injective_Tokenfactory_V1beta1_QueryDenomsFromCreatorResponse

  /// Retrieves the entire auction module's state
  @Sendable func tokenfactoryModuleState(
    request: Injective_Tokenfactory_V1beta1_QueryModuleStateRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Injective_Tokenfactory_V1beta1_QueryModuleStateResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Injective_Tokenfactory_V1beta1_QueryAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Injective_Tokenfactory_V1beta1_QueryServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Injective_Tokenfactory_V1beta1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Injective_Tokenfactory_V1beta1_QueryServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Params":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Injective_Tokenfactory_V1beta1_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Injective_Tokenfactory_V1beta1_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        wrapping: self.params(request:context:)
      )

    case "DenomAuthorityMetadata":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Injective_Tokenfactory_V1beta1_QueryDenomAuthorityMetadataRequest>(),
        responseSerializer: ProtobufSerializer<Injective_Tokenfactory_V1beta1_QueryDenomAuthorityMetadataResponse>(),
        interceptors: self.interceptors?.makeDenomAuthorityMetadataInterceptors() ?? [],
        wrapping: self.denomAuthorityMetadata(request:context:)
      )

    case "DenomsFromCreator":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Injective_Tokenfactory_V1beta1_QueryDenomsFromCreatorRequest>(),
        responseSerializer: ProtobufSerializer<Injective_Tokenfactory_V1beta1_QueryDenomsFromCreatorResponse>(),
        interceptors: self.interceptors?.makeDenomsFromCreatorInterceptors() ?? [],
        wrapping: self.denomsFromCreator(request:context:)
      )

    case "TokenfactoryModuleState":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Injective_Tokenfactory_V1beta1_QueryModuleStateRequest>(),
        responseSerializer: ProtobufSerializer<Injective_Tokenfactory_V1beta1_QueryModuleStateResponse>(),
        interceptors: self.interceptors?.makeTokenfactoryModuleStateInterceptors() ?? [],
        wrapping: self.tokenfactoryModuleState(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Injective_Tokenfactory_V1beta1_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'params'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeParamsInterceptors() -> [ServerInterceptor<Injective_Tokenfactory_V1beta1_QueryParamsRequest, Injective_Tokenfactory_V1beta1_QueryParamsResponse>]

  /// - Returns: Interceptors to use when handling 'denomAuthorityMetadata'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeDenomAuthorityMetadataInterceptors() -> [ServerInterceptor<Injective_Tokenfactory_V1beta1_QueryDenomAuthorityMetadataRequest, Injective_Tokenfactory_V1beta1_QueryDenomAuthorityMetadataResponse>]

  /// - Returns: Interceptors to use when handling 'denomsFromCreator'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeDenomsFromCreatorInterceptors() -> [ServerInterceptor<Injective_Tokenfactory_V1beta1_QueryDenomsFromCreatorRequest, Injective_Tokenfactory_V1beta1_QueryDenomsFromCreatorResponse>]

  /// - Returns: Interceptors to use when handling 'tokenfactoryModuleState'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeTokenfactoryModuleStateInterceptors() -> [ServerInterceptor<Injective_Tokenfactory_V1beta1_QueryModuleStateRequest, Injective_Tokenfactory_V1beta1_QueryModuleStateResponse>]
}

internal enum Injective_Tokenfactory_V1beta1_QueryServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "injective.tokenfactory.v1beta1.Query",
    methods: [
      Injective_Tokenfactory_V1beta1_QueryServerMetadata.Methods.params,
      Injective_Tokenfactory_V1beta1_QueryServerMetadata.Methods.denomAuthorityMetadata,
      Injective_Tokenfactory_V1beta1_QueryServerMetadata.Methods.denomsFromCreator,
      Injective_Tokenfactory_V1beta1_QueryServerMetadata.Methods.tokenfactoryModuleState,
    ]
  )

  internal enum Methods {
    internal static let params = GRPCMethodDescriptor(
      name: "Params",
      path: "/injective.tokenfactory.v1beta1.Query/Params",
      type: GRPCCallType.unary
    )

    internal static let denomAuthorityMetadata = GRPCMethodDescriptor(
      name: "DenomAuthorityMetadata",
      path: "/injective.tokenfactory.v1beta1.Query/DenomAuthorityMetadata",
      type: GRPCCallType.unary
    )

    internal static let denomsFromCreator = GRPCMethodDescriptor(
      name: "DenomsFromCreator",
      path: "/injective.tokenfactory.v1beta1.Query/DenomsFromCreator",
      type: GRPCCallType.unary
    )

    internal static let tokenfactoryModuleState = GRPCMethodDescriptor(
      name: "TokenfactoryModuleState",
      path: "/injective.tokenfactory.v1beta1.Query/TokenfactoryModuleState",
      type: GRPCCallType.unary
    )
  }
}
