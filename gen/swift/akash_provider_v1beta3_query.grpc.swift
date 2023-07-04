//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: akash/provider/v1beta3/query.proto
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


/// Query defines the gRPC querier service
///
/// Usage: instantiate `Akash_Provider_V1beta3_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Akash_Provider_V1beta3_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Akash_Provider_V1beta3_QueryClientInterceptorFactoryProtocol? { get }

  func providers(
    _ request: Akash_Provider_V1beta3_QueryProvidersRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Akash_Provider_V1beta3_QueryProvidersRequest, Akash_Provider_V1beta3_QueryProvidersResponse>

  func provider(
    _ request: Akash_Provider_V1beta3_QueryProviderRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Akash_Provider_V1beta3_QueryProviderRequest, Akash_Provider_V1beta3_QueryProviderResponse>
}

extension Akash_Provider_V1beta3_QueryClientProtocol {
  internal var serviceName: String {
    return "akash.provider.v1beta3.Query"
  }

  /// Providers queries providers
  ///
  /// - Parameters:
  ///   - request: Request to send to Providers.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func providers(
    _ request: Akash_Provider_V1beta3_QueryProvidersRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Akash_Provider_V1beta3_QueryProvidersRequest, Akash_Provider_V1beta3_QueryProvidersResponse> {
    return self.makeUnaryCall(
      path: Akash_Provider_V1beta3_QueryClientMetadata.Methods.providers.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeProvidersInterceptors() ?? []
    )
  }

  /// Provider queries provider details
  ///
  /// - Parameters:
  ///   - request: Request to send to Provider.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func provider(
    _ request: Akash_Provider_V1beta3_QueryProviderRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Akash_Provider_V1beta3_QueryProviderRequest, Akash_Provider_V1beta3_QueryProviderResponse> {
    return self.makeUnaryCall(
      path: Akash_Provider_V1beta3_QueryClientMetadata.Methods.provider.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeProviderInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Akash_Provider_V1beta3_QueryClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Akash_Provider_V1beta3_QueryNIOClient")
internal final class Akash_Provider_V1beta3_QueryClient: Akash_Provider_V1beta3_QueryClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Akash_Provider_V1beta3_QueryClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Akash_Provider_V1beta3_QueryClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the akash.provider.v1beta3.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Akash_Provider_V1beta3_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Akash_Provider_V1beta3_QueryNIOClient: Akash_Provider_V1beta3_QueryClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Akash_Provider_V1beta3_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the akash.provider.v1beta3.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Akash_Provider_V1beta3_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query defines the gRPC querier service
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Akash_Provider_V1beta3_QueryAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Akash_Provider_V1beta3_QueryClientInterceptorFactoryProtocol? { get }

  func makeProvidersCall(
    _ request: Akash_Provider_V1beta3_QueryProvidersRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Akash_Provider_V1beta3_QueryProvidersRequest, Akash_Provider_V1beta3_QueryProvidersResponse>

  func makeProviderCall(
    _ request: Akash_Provider_V1beta3_QueryProviderRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Akash_Provider_V1beta3_QueryProviderRequest, Akash_Provider_V1beta3_QueryProviderResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Akash_Provider_V1beta3_QueryAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Akash_Provider_V1beta3_QueryClientMetadata.serviceDescriptor
  }

  internal var interceptors: Akash_Provider_V1beta3_QueryClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeProvidersCall(
    _ request: Akash_Provider_V1beta3_QueryProvidersRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Akash_Provider_V1beta3_QueryProvidersRequest, Akash_Provider_V1beta3_QueryProvidersResponse> {
    return self.makeAsyncUnaryCall(
      path: Akash_Provider_V1beta3_QueryClientMetadata.Methods.providers.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeProvidersInterceptors() ?? []
    )
  }

  internal func makeProviderCall(
    _ request: Akash_Provider_V1beta3_QueryProviderRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Akash_Provider_V1beta3_QueryProviderRequest, Akash_Provider_V1beta3_QueryProviderResponse> {
    return self.makeAsyncUnaryCall(
      path: Akash_Provider_V1beta3_QueryClientMetadata.Methods.provider.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeProviderInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Akash_Provider_V1beta3_QueryAsyncClientProtocol {
  internal func providers(
    _ request: Akash_Provider_V1beta3_QueryProvidersRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Akash_Provider_V1beta3_QueryProvidersResponse {
    return try await self.performAsyncUnaryCall(
      path: Akash_Provider_V1beta3_QueryClientMetadata.Methods.providers.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeProvidersInterceptors() ?? []
    )
  }

  internal func provider(
    _ request: Akash_Provider_V1beta3_QueryProviderRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Akash_Provider_V1beta3_QueryProviderResponse {
    return try await self.performAsyncUnaryCall(
      path: Akash_Provider_V1beta3_QueryClientMetadata.Methods.provider.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeProviderInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Akash_Provider_V1beta3_QueryAsyncClient: Akash_Provider_V1beta3_QueryAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Akash_Provider_V1beta3_QueryClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Akash_Provider_V1beta3_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Akash_Provider_V1beta3_QueryClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'providers'.
  func makeProvidersInterceptors() -> [ClientInterceptor<Akash_Provider_V1beta3_QueryProvidersRequest, Akash_Provider_V1beta3_QueryProvidersResponse>]

  /// - Returns: Interceptors to use when invoking 'provider'.
  func makeProviderInterceptors() -> [ClientInterceptor<Akash_Provider_V1beta3_QueryProviderRequest, Akash_Provider_V1beta3_QueryProviderResponse>]
}

internal enum Akash_Provider_V1beta3_QueryClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "akash.provider.v1beta3.Query",
    methods: [
      Akash_Provider_V1beta3_QueryClientMetadata.Methods.providers,
      Akash_Provider_V1beta3_QueryClientMetadata.Methods.provider,
    ]
  )

  internal enum Methods {
    internal static let providers = GRPCMethodDescriptor(
      name: "Providers",
      path: "/akash.provider.v1beta3.Query/Providers",
      type: GRPCCallType.unary
    )

    internal static let provider = GRPCMethodDescriptor(
      name: "Provider",
      path: "/akash.provider.v1beta3.Query/Provider",
      type: GRPCCallType.unary
    )
  }
}

/// Query defines the gRPC querier service
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Akash_Provider_V1beta3_QueryProvider: CallHandlerProvider {
  var interceptors: Akash_Provider_V1beta3_QueryServerInterceptorFactoryProtocol? { get }

  /// Providers queries providers
  func providers(request: Akash_Provider_V1beta3_QueryProvidersRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Akash_Provider_V1beta3_QueryProvidersResponse>

  /// Provider queries provider details
  func provider(request: Akash_Provider_V1beta3_QueryProviderRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Akash_Provider_V1beta3_QueryProviderResponse>
}

extension Akash_Provider_V1beta3_QueryProvider {
  internal var serviceName: Substring {
    return Akash_Provider_V1beta3_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Providers":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Akash_Provider_V1beta3_QueryProvidersRequest>(),
        responseSerializer: ProtobufSerializer<Akash_Provider_V1beta3_QueryProvidersResponse>(),
        interceptors: self.interceptors?.makeProvidersInterceptors() ?? [],
        userFunction: self.providers(request:context:)
      )

    case "Provider":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Akash_Provider_V1beta3_QueryProviderRequest>(),
        responseSerializer: ProtobufSerializer<Akash_Provider_V1beta3_QueryProviderResponse>(),
        interceptors: self.interceptors?.makeProviderInterceptors() ?? [],
        userFunction: self.provider(request:context:)
      )

    default:
      return nil
    }
  }
}

/// Query defines the gRPC querier service
///
/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Akash_Provider_V1beta3_QueryAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Akash_Provider_V1beta3_QueryServerInterceptorFactoryProtocol? { get }

  /// Providers queries providers
  @Sendable func providers(
    request: Akash_Provider_V1beta3_QueryProvidersRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Akash_Provider_V1beta3_QueryProvidersResponse

  /// Provider queries provider details
  @Sendable func provider(
    request: Akash_Provider_V1beta3_QueryProviderRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Akash_Provider_V1beta3_QueryProviderResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Akash_Provider_V1beta3_QueryAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Akash_Provider_V1beta3_QueryServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Akash_Provider_V1beta3_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Akash_Provider_V1beta3_QueryServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Providers":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Akash_Provider_V1beta3_QueryProvidersRequest>(),
        responseSerializer: ProtobufSerializer<Akash_Provider_V1beta3_QueryProvidersResponse>(),
        interceptors: self.interceptors?.makeProvidersInterceptors() ?? [],
        wrapping: self.providers(request:context:)
      )

    case "Provider":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Akash_Provider_V1beta3_QueryProviderRequest>(),
        responseSerializer: ProtobufSerializer<Akash_Provider_V1beta3_QueryProviderResponse>(),
        interceptors: self.interceptors?.makeProviderInterceptors() ?? [],
        wrapping: self.provider(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Akash_Provider_V1beta3_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'providers'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeProvidersInterceptors() -> [ServerInterceptor<Akash_Provider_V1beta3_QueryProvidersRequest, Akash_Provider_V1beta3_QueryProvidersResponse>]

  /// - Returns: Interceptors to use when handling 'provider'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeProviderInterceptors() -> [ServerInterceptor<Akash_Provider_V1beta3_QueryProviderRequest, Akash_Provider_V1beta3_QueryProviderResponse>]
}

internal enum Akash_Provider_V1beta3_QueryServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "akash.provider.v1beta3.Query",
    methods: [
      Akash_Provider_V1beta3_QueryServerMetadata.Methods.providers,
      Akash_Provider_V1beta3_QueryServerMetadata.Methods.provider,
    ]
  )

  internal enum Methods {
    internal static let providers = GRPCMethodDescriptor(
      name: "Providers",
      path: "/akash.provider.v1beta3.Query/Providers",
      type: GRPCCallType.unary
    )

    internal static let provider = GRPCMethodDescriptor(
      name: "Provider",
      path: "/akash.provider.v1beta3.Query/Provider",
      type: GRPCCallType.unary
    )
  }
}