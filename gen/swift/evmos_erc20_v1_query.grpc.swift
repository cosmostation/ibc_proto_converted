//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: evmos/erc20/v1/query.proto
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
/// Usage: instantiate `Evmos_Erc20_V1_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Evmos_Erc20_V1_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Evmos_Erc20_V1_QueryClientInterceptorFactoryProtocol? { get }

  func tokenPairs(
    _ request: Evmos_Erc20_V1_QueryTokenPairsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Evmos_Erc20_V1_QueryTokenPairsRequest, Evmos_Erc20_V1_QueryTokenPairsResponse>

  func tokenPair(
    _ request: Evmos_Erc20_V1_QueryTokenPairRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Evmos_Erc20_V1_QueryTokenPairRequest, Evmos_Erc20_V1_QueryTokenPairResponse>

  func params(
    _ request: Evmos_Erc20_V1_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Evmos_Erc20_V1_QueryParamsRequest, Evmos_Erc20_V1_QueryParamsResponse>
}

extension Evmos_Erc20_V1_QueryClientProtocol {
  internal var serviceName: String {
    return "evmos.erc20.v1.Query"
  }

  /// TokenPairs retrieves registered token pairs
  ///
  /// - Parameters:
  ///   - request: Request to send to TokenPairs.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func tokenPairs(
    _ request: Evmos_Erc20_V1_QueryTokenPairsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Evmos_Erc20_V1_QueryTokenPairsRequest, Evmos_Erc20_V1_QueryTokenPairsResponse> {
    return self.makeUnaryCall(
      path: Evmos_Erc20_V1_QueryClientMetadata.Methods.tokenPairs.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeTokenPairsInterceptors() ?? []
    )
  }

  /// TokenPair retrieves a registered token pair
  ///
  /// - Parameters:
  ///   - request: Request to send to TokenPair.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func tokenPair(
    _ request: Evmos_Erc20_V1_QueryTokenPairRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Evmos_Erc20_V1_QueryTokenPairRequest, Evmos_Erc20_V1_QueryTokenPairResponse> {
    return self.makeUnaryCall(
      path: Evmos_Erc20_V1_QueryClientMetadata.Methods.tokenPair.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeTokenPairInterceptors() ?? []
    )
  }

  /// Params retrieves the erc20 module params
  ///
  /// - Parameters:
  ///   - request: Request to send to Params.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func params(
    _ request: Evmos_Erc20_V1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Evmos_Erc20_V1_QueryParamsRequest, Evmos_Erc20_V1_QueryParamsResponse> {
    return self.makeUnaryCall(
      path: Evmos_Erc20_V1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Evmos_Erc20_V1_QueryClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Evmos_Erc20_V1_QueryNIOClient")
internal final class Evmos_Erc20_V1_QueryClient: Evmos_Erc20_V1_QueryClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Evmos_Erc20_V1_QueryClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Evmos_Erc20_V1_QueryClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the evmos.erc20.v1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Evmos_Erc20_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Evmos_Erc20_V1_QueryNIOClient: Evmos_Erc20_V1_QueryClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Evmos_Erc20_V1_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the evmos.erc20.v1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Evmos_Erc20_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query defines the gRPC querier service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Evmos_Erc20_V1_QueryAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Evmos_Erc20_V1_QueryClientInterceptorFactoryProtocol? { get }

  func makeTokenPairsCall(
    _ request: Evmos_Erc20_V1_QueryTokenPairsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Evmos_Erc20_V1_QueryTokenPairsRequest, Evmos_Erc20_V1_QueryTokenPairsResponse>

  func makeTokenPairCall(
    _ request: Evmos_Erc20_V1_QueryTokenPairRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Evmos_Erc20_V1_QueryTokenPairRequest, Evmos_Erc20_V1_QueryTokenPairResponse>

  func makeParamsCall(
    _ request: Evmos_Erc20_V1_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Evmos_Erc20_V1_QueryParamsRequest, Evmos_Erc20_V1_QueryParamsResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Evmos_Erc20_V1_QueryAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Evmos_Erc20_V1_QueryClientMetadata.serviceDescriptor
  }

  internal var interceptors: Evmos_Erc20_V1_QueryClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeTokenPairsCall(
    _ request: Evmos_Erc20_V1_QueryTokenPairsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Evmos_Erc20_V1_QueryTokenPairsRequest, Evmos_Erc20_V1_QueryTokenPairsResponse> {
    return self.makeAsyncUnaryCall(
      path: Evmos_Erc20_V1_QueryClientMetadata.Methods.tokenPairs.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeTokenPairsInterceptors() ?? []
    )
  }

  internal func makeTokenPairCall(
    _ request: Evmos_Erc20_V1_QueryTokenPairRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Evmos_Erc20_V1_QueryTokenPairRequest, Evmos_Erc20_V1_QueryTokenPairResponse> {
    return self.makeAsyncUnaryCall(
      path: Evmos_Erc20_V1_QueryClientMetadata.Methods.tokenPair.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeTokenPairInterceptors() ?? []
    )
  }

  internal func makeParamsCall(
    _ request: Evmos_Erc20_V1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Evmos_Erc20_V1_QueryParamsRequest, Evmos_Erc20_V1_QueryParamsResponse> {
    return self.makeAsyncUnaryCall(
      path: Evmos_Erc20_V1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Evmos_Erc20_V1_QueryAsyncClientProtocol {
  internal func tokenPairs(
    _ request: Evmos_Erc20_V1_QueryTokenPairsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Evmos_Erc20_V1_QueryTokenPairsResponse {
    return try await self.performAsyncUnaryCall(
      path: Evmos_Erc20_V1_QueryClientMetadata.Methods.tokenPairs.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeTokenPairsInterceptors() ?? []
    )
  }

  internal func tokenPair(
    _ request: Evmos_Erc20_V1_QueryTokenPairRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Evmos_Erc20_V1_QueryTokenPairResponse {
    return try await self.performAsyncUnaryCall(
      path: Evmos_Erc20_V1_QueryClientMetadata.Methods.tokenPair.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeTokenPairInterceptors() ?? []
    )
  }

  internal func params(
    _ request: Evmos_Erc20_V1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Evmos_Erc20_V1_QueryParamsResponse {
    return try await self.performAsyncUnaryCall(
      path: Evmos_Erc20_V1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Evmos_Erc20_V1_QueryAsyncClient: Evmos_Erc20_V1_QueryAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Evmos_Erc20_V1_QueryClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Evmos_Erc20_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Evmos_Erc20_V1_QueryClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'tokenPairs'.
  func makeTokenPairsInterceptors() -> [ClientInterceptor<Evmos_Erc20_V1_QueryTokenPairsRequest, Evmos_Erc20_V1_QueryTokenPairsResponse>]

  /// - Returns: Interceptors to use when invoking 'tokenPair'.
  func makeTokenPairInterceptors() -> [ClientInterceptor<Evmos_Erc20_V1_QueryTokenPairRequest, Evmos_Erc20_V1_QueryTokenPairResponse>]

  /// - Returns: Interceptors to use when invoking 'params'.
  func makeParamsInterceptors() -> [ClientInterceptor<Evmos_Erc20_V1_QueryParamsRequest, Evmos_Erc20_V1_QueryParamsResponse>]
}

internal enum Evmos_Erc20_V1_QueryClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "evmos.erc20.v1.Query",
    methods: [
      Evmos_Erc20_V1_QueryClientMetadata.Methods.tokenPairs,
      Evmos_Erc20_V1_QueryClientMetadata.Methods.tokenPair,
      Evmos_Erc20_V1_QueryClientMetadata.Methods.params,
    ]
  )

  internal enum Methods {
    internal static let tokenPairs = GRPCMethodDescriptor(
      name: "TokenPairs",
      path: "/evmos.erc20.v1.Query/TokenPairs",
      type: GRPCCallType.unary
    )

    internal static let tokenPair = GRPCMethodDescriptor(
      name: "TokenPair",
      path: "/evmos.erc20.v1.Query/TokenPair",
      type: GRPCCallType.unary
    )

    internal static let params = GRPCMethodDescriptor(
      name: "Params",
      path: "/evmos.erc20.v1.Query/Params",
      type: GRPCCallType.unary
    )
  }
}

/// Query defines the gRPC querier service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Evmos_Erc20_V1_QueryProvider: CallHandlerProvider {
  var interceptors: Evmos_Erc20_V1_QueryServerInterceptorFactoryProtocol? { get }

  /// TokenPairs retrieves registered token pairs
  func tokenPairs(request: Evmos_Erc20_V1_QueryTokenPairsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Evmos_Erc20_V1_QueryTokenPairsResponse>

  /// TokenPair retrieves a registered token pair
  func tokenPair(request: Evmos_Erc20_V1_QueryTokenPairRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Evmos_Erc20_V1_QueryTokenPairResponse>

  /// Params retrieves the erc20 module params
  func params(request: Evmos_Erc20_V1_QueryParamsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Evmos_Erc20_V1_QueryParamsResponse>
}

extension Evmos_Erc20_V1_QueryProvider {
  internal var serviceName: Substring {
    return Evmos_Erc20_V1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "TokenPairs":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Evmos_Erc20_V1_QueryTokenPairsRequest>(),
        responseSerializer: ProtobufSerializer<Evmos_Erc20_V1_QueryTokenPairsResponse>(),
        interceptors: self.interceptors?.makeTokenPairsInterceptors() ?? [],
        userFunction: self.tokenPairs(request:context:)
      )

    case "TokenPair":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Evmos_Erc20_V1_QueryTokenPairRequest>(),
        responseSerializer: ProtobufSerializer<Evmos_Erc20_V1_QueryTokenPairResponse>(),
        interceptors: self.interceptors?.makeTokenPairInterceptors() ?? [],
        userFunction: self.tokenPair(request:context:)
      )

    case "Params":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Evmos_Erc20_V1_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Evmos_Erc20_V1_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        userFunction: self.params(request:context:)
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
internal protocol Evmos_Erc20_V1_QueryAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Evmos_Erc20_V1_QueryServerInterceptorFactoryProtocol? { get }

  /// TokenPairs retrieves registered token pairs
  @Sendable func tokenPairs(
    request: Evmos_Erc20_V1_QueryTokenPairsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Evmos_Erc20_V1_QueryTokenPairsResponse

  /// TokenPair retrieves a registered token pair
  @Sendable func tokenPair(
    request: Evmos_Erc20_V1_QueryTokenPairRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Evmos_Erc20_V1_QueryTokenPairResponse

  /// Params retrieves the erc20 module params
  @Sendable func params(
    request: Evmos_Erc20_V1_QueryParamsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Evmos_Erc20_V1_QueryParamsResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Evmos_Erc20_V1_QueryAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Evmos_Erc20_V1_QueryServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Evmos_Erc20_V1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Evmos_Erc20_V1_QueryServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "TokenPairs":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Evmos_Erc20_V1_QueryTokenPairsRequest>(),
        responseSerializer: ProtobufSerializer<Evmos_Erc20_V1_QueryTokenPairsResponse>(),
        interceptors: self.interceptors?.makeTokenPairsInterceptors() ?? [],
        wrapping: self.tokenPairs(request:context:)
      )

    case "TokenPair":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Evmos_Erc20_V1_QueryTokenPairRequest>(),
        responseSerializer: ProtobufSerializer<Evmos_Erc20_V1_QueryTokenPairResponse>(),
        interceptors: self.interceptors?.makeTokenPairInterceptors() ?? [],
        wrapping: self.tokenPair(request:context:)
      )

    case "Params":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Evmos_Erc20_V1_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Evmos_Erc20_V1_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        wrapping: self.params(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Evmos_Erc20_V1_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'tokenPairs'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeTokenPairsInterceptors() -> [ServerInterceptor<Evmos_Erc20_V1_QueryTokenPairsRequest, Evmos_Erc20_V1_QueryTokenPairsResponse>]

  /// - Returns: Interceptors to use when handling 'tokenPair'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeTokenPairInterceptors() -> [ServerInterceptor<Evmos_Erc20_V1_QueryTokenPairRequest, Evmos_Erc20_V1_QueryTokenPairResponse>]

  /// - Returns: Interceptors to use when handling 'params'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeParamsInterceptors() -> [ServerInterceptor<Evmos_Erc20_V1_QueryParamsRequest, Evmos_Erc20_V1_QueryParamsResponse>]
}

internal enum Evmos_Erc20_V1_QueryServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "evmos.erc20.v1.Query",
    methods: [
      Evmos_Erc20_V1_QueryServerMetadata.Methods.tokenPairs,
      Evmos_Erc20_V1_QueryServerMetadata.Methods.tokenPair,
      Evmos_Erc20_V1_QueryServerMetadata.Methods.params,
    ]
  )

  internal enum Methods {
    internal static let tokenPairs = GRPCMethodDescriptor(
      name: "TokenPairs",
      path: "/evmos.erc20.v1.Query/TokenPairs",
      type: GRPCCallType.unary
    )

    internal static let tokenPair = GRPCMethodDescriptor(
      name: "TokenPair",
      path: "/evmos.erc20.v1.Query/TokenPair",
      type: GRPCCallType.unary
    )

    internal static let params = GRPCMethodDescriptor(
      name: "Params",
      path: "/evmos.erc20.v1.Query/Params",
      type: GRPCCallType.unary
    )
  }
}