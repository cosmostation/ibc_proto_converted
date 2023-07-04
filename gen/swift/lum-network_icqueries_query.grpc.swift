//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: lum-network/icqueries/query.proto
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


/// Usage: instantiate `Lum_Network_Icqueries_QueryServiceClient`, then call methods of this protocol to make API calls.
internal protocol Lum_Network_Icqueries_QueryServiceClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Lum_Network_Icqueries_QueryServiceClientInterceptorFactoryProtocol? { get }

  func queries(
    _ request: Lum_Network_Icqueries_QueryQueriesRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Lum_Network_Icqueries_QueryQueriesRequest, Lum_Network_Icqueries_QueryQueriesResponse>

  func pendingQueries(
    _ request: Lum_Network_Icqueries_QueryPendingQueriesRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Lum_Network_Icqueries_QueryPendingQueriesRequest, Lum_Network_Icqueries_QueryPendingQueriesResponse>
}

extension Lum_Network_Icqueries_QueryServiceClientProtocol {
  internal var serviceName: String {
    return "lum.network.icqueries.QueryService"
  }

  /// Unary call to Queries
  ///
  /// - Parameters:
  ///   - request: Request to send to Queries.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func queries(
    _ request: Lum_Network_Icqueries_QueryQueriesRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Lum_Network_Icqueries_QueryQueriesRequest, Lum_Network_Icqueries_QueryQueriesResponse> {
    return self.makeUnaryCall(
      path: Lum_Network_Icqueries_QueryServiceClientMetadata.Methods.queries.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeQueriesInterceptors() ?? []
    )
  }

  /// Unary call to PendingQueries
  ///
  /// - Parameters:
  ///   - request: Request to send to PendingQueries.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func pendingQueries(
    _ request: Lum_Network_Icqueries_QueryPendingQueriesRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Lum_Network_Icqueries_QueryPendingQueriesRequest, Lum_Network_Icqueries_QueryPendingQueriesResponse> {
    return self.makeUnaryCall(
      path: Lum_Network_Icqueries_QueryServiceClientMetadata.Methods.pendingQueries.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makePendingQueriesInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Lum_Network_Icqueries_QueryServiceClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Lum_Network_Icqueries_QueryServiceNIOClient")
internal final class Lum_Network_Icqueries_QueryServiceClient: Lum_Network_Icqueries_QueryServiceClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Lum_Network_Icqueries_QueryServiceClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Lum_Network_Icqueries_QueryServiceClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the lum.network.icqueries.QueryService service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Lum_Network_Icqueries_QueryServiceClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Lum_Network_Icqueries_QueryServiceNIOClient: Lum_Network_Icqueries_QueryServiceClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Lum_Network_Icqueries_QueryServiceClientInterceptorFactoryProtocol?

  /// Creates a client for the lum.network.icqueries.QueryService service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Lum_Network_Icqueries_QueryServiceClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Lum_Network_Icqueries_QueryServiceAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Lum_Network_Icqueries_QueryServiceClientInterceptorFactoryProtocol? { get }

  func makeQueriesCall(
    _ request: Lum_Network_Icqueries_QueryQueriesRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Lum_Network_Icqueries_QueryQueriesRequest, Lum_Network_Icqueries_QueryQueriesResponse>

  func makePendingQueriesCall(
    _ request: Lum_Network_Icqueries_QueryPendingQueriesRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Lum_Network_Icqueries_QueryPendingQueriesRequest, Lum_Network_Icqueries_QueryPendingQueriesResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Lum_Network_Icqueries_QueryServiceAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Lum_Network_Icqueries_QueryServiceClientMetadata.serviceDescriptor
  }

  internal var interceptors: Lum_Network_Icqueries_QueryServiceClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeQueriesCall(
    _ request: Lum_Network_Icqueries_QueryQueriesRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Lum_Network_Icqueries_QueryQueriesRequest, Lum_Network_Icqueries_QueryQueriesResponse> {
    return self.makeAsyncUnaryCall(
      path: Lum_Network_Icqueries_QueryServiceClientMetadata.Methods.queries.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeQueriesInterceptors() ?? []
    )
  }

  internal func makePendingQueriesCall(
    _ request: Lum_Network_Icqueries_QueryPendingQueriesRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Lum_Network_Icqueries_QueryPendingQueriesRequest, Lum_Network_Icqueries_QueryPendingQueriesResponse> {
    return self.makeAsyncUnaryCall(
      path: Lum_Network_Icqueries_QueryServiceClientMetadata.Methods.pendingQueries.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makePendingQueriesInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Lum_Network_Icqueries_QueryServiceAsyncClientProtocol {
  internal func queries(
    _ request: Lum_Network_Icqueries_QueryQueriesRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Lum_Network_Icqueries_QueryQueriesResponse {
    return try await self.performAsyncUnaryCall(
      path: Lum_Network_Icqueries_QueryServiceClientMetadata.Methods.queries.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeQueriesInterceptors() ?? []
    )
  }

  internal func pendingQueries(
    _ request: Lum_Network_Icqueries_QueryPendingQueriesRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Lum_Network_Icqueries_QueryPendingQueriesResponse {
    return try await self.performAsyncUnaryCall(
      path: Lum_Network_Icqueries_QueryServiceClientMetadata.Methods.pendingQueries.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makePendingQueriesInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Lum_Network_Icqueries_QueryServiceAsyncClient: Lum_Network_Icqueries_QueryServiceAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Lum_Network_Icqueries_QueryServiceClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Lum_Network_Icqueries_QueryServiceClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Lum_Network_Icqueries_QueryServiceClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'queries'.
  func makeQueriesInterceptors() -> [ClientInterceptor<Lum_Network_Icqueries_QueryQueriesRequest, Lum_Network_Icqueries_QueryQueriesResponse>]

  /// - Returns: Interceptors to use when invoking 'pendingQueries'.
  func makePendingQueriesInterceptors() -> [ClientInterceptor<Lum_Network_Icqueries_QueryPendingQueriesRequest, Lum_Network_Icqueries_QueryPendingQueriesResponse>]
}

internal enum Lum_Network_Icqueries_QueryServiceClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "QueryService",
    fullName: "lum.network.icqueries.QueryService",
    methods: [
      Lum_Network_Icqueries_QueryServiceClientMetadata.Methods.queries,
      Lum_Network_Icqueries_QueryServiceClientMetadata.Methods.pendingQueries,
    ]
  )

  internal enum Methods {
    internal static let queries = GRPCMethodDescriptor(
      name: "Queries",
      path: "/lum.network.icqueries.QueryService/Queries",
      type: GRPCCallType.unary
    )

    internal static let pendingQueries = GRPCMethodDescriptor(
      name: "PendingQueries",
      path: "/lum.network.icqueries.QueryService/PendingQueries",
      type: GRPCCallType.unary
    )
  }
}

/// To build a server, implement a class that conforms to this protocol.
internal protocol Lum_Network_Icqueries_QueryServiceProvider: CallHandlerProvider {
  var interceptors: Lum_Network_Icqueries_QueryServiceServerInterceptorFactoryProtocol? { get }

  func queries(request: Lum_Network_Icqueries_QueryQueriesRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Lum_Network_Icqueries_QueryQueriesResponse>

  func pendingQueries(request: Lum_Network_Icqueries_QueryPendingQueriesRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Lum_Network_Icqueries_QueryPendingQueriesResponse>
}

extension Lum_Network_Icqueries_QueryServiceProvider {
  internal var serviceName: Substring {
    return Lum_Network_Icqueries_QueryServiceServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Queries":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Lum_Network_Icqueries_QueryQueriesRequest>(),
        responseSerializer: ProtobufSerializer<Lum_Network_Icqueries_QueryQueriesResponse>(),
        interceptors: self.interceptors?.makeQueriesInterceptors() ?? [],
        userFunction: self.queries(request:context:)
      )

    case "PendingQueries":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Lum_Network_Icqueries_QueryPendingQueriesRequest>(),
        responseSerializer: ProtobufSerializer<Lum_Network_Icqueries_QueryPendingQueriesResponse>(),
        interceptors: self.interceptors?.makePendingQueriesInterceptors() ?? [],
        userFunction: self.pendingQueries(request:context:)
      )

    default:
      return nil
    }
  }
}

/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Lum_Network_Icqueries_QueryServiceAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Lum_Network_Icqueries_QueryServiceServerInterceptorFactoryProtocol? { get }

  @Sendable func queries(
    request: Lum_Network_Icqueries_QueryQueriesRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Lum_Network_Icqueries_QueryQueriesResponse

  @Sendable func pendingQueries(
    request: Lum_Network_Icqueries_QueryPendingQueriesRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Lum_Network_Icqueries_QueryPendingQueriesResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Lum_Network_Icqueries_QueryServiceAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Lum_Network_Icqueries_QueryServiceServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Lum_Network_Icqueries_QueryServiceServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Lum_Network_Icqueries_QueryServiceServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Queries":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Lum_Network_Icqueries_QueryQueriesRequest>(),
        responseSerializer: ProtobufSerializer<Lum_Network_Icqueries_QueryQueriesResponse>(),
        interceptors: self.interceptors?.makeQueriesInterceptors() ?? [],
        wrapping: self.queries(request:context:)
      )

    case "PendingQueries":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Lum_Network_Icqueries_QueryPendingQueriesRequest>(),
        responseSerializer: ProtobufSerializer<Lum_Network_Icqueries_QueryPendingQueriesResponse>(),
        interceptors: self.interceptors?.makePendingQueriesInterceptors() ?? [],
        wrapping: self.pendingQueries(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Lum_Network_Icqueries_QueryServiceServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'queries'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeQueriesInterceptors() -> [ServerInterceptor<Lum_Network_Icqueries_QueryQueriesRequest, Lum_Network_Icqueries_QueryQueriesResponse>]

  /// - Returns: Interceptors to use when handling 'pendingQueries'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makePendingQueriesInterceptors() -> [ServerInterceptor<Lum_Network_Icqueries_QueryPendingQueriesRequest, Lum_Network_Icqueries_QueryPendingQueriesResponse>]
}

internal enum Lum_Network_Icqueries_QueryServiceServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "QueryService",
    fullName: "lum.network.icqueries.QueryService",
    methods: [
      Lum_Network_Icqueries_QueryServiceServerMetadata.Methods.queries,
      Lum_Network_Icqueries_QueryServiceServerMetadata.Methods.pendingQueries,
    ]
  )

  internal enum Methods {
    internal static let queries = GRPCMethodDescriptor(
      name: "Queries",
      path: "/lum.network.icqueries.QueryService/Queries",
      type: GRPCCallType.unary
    )

    internal static let pendingQueries = GRPCMethodDescriptor(
      name: "PendingQueries",
      path: "/lum.network.icqueries.QueryService/PendingQueries",
      type: GRPCCallType.unary
    )
  }
}