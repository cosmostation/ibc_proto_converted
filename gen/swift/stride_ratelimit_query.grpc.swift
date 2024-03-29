//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: stride/ratelimit/query.proto
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
/// Usage: instantiate `Stride_Ratelimit_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Stride_Ratelimit_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Stride_Ratelimit_QueryClientInterceptorFactoryProtocol? { get }

  func allRateLimits(
    _ request: Stride_Ratelimit_QueryAllRateLimitsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Stride_Ratelimit_QueryAllRateLimitsRequest, Stride_Ratelimit_QueryAllRateLimitsResponse>

  func rateLimit(
    _ request: Stride_Ratelimit_QueryRateLimitRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Stride_Ratelimit_QueryRateLimitRequest, Stride_Ratelimit_QueryRateLimitResponse>

  func rateLimitsByChainId(
    _ request: Stride_Ratelimit_QueryRateLimitsByChainIdRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Stride_Ratelimit_QueryRateLimitsByChainIdRequest, Stride_Ratelimit_QueryRateLimitsByChainIdResponse>

  func rateLimitsByChannelId(
    _ request: Stride_Ratelimit_QueryRateLimitsByChannelIdRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Stride_Ratelimit_QueryRateLimitsByChannelIdRequest, Stride_Ratelimit_QueryRateLimitsByChannelIdResponse>
}

extension Stride_Ratelimit_QueryClientProtocol {
  internal var serviceName: String {
    return "stride.ratelimit.Query"
  }

  /// Unary call to AllRateLimits
  ///
  /// - Parameters:
  ///   - request: Request to send to AllRateLimits.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func allRateLimits(
    _ request: Stride_Ratelimit_QueryAllRateLimitsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Stride_Ratelimit_QueryAllRateLimitsRequest, Stride_Ratelimit_QueryAllRateLimitsResponse> {
    return self.makeUnaryCall(
      path: Stride_Ratelimit_QueryClientMetadata.Methods.allRateLimits.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAllRateLimitsInterceptors() ?? []
    )
  }

  /// Unary call to RateLimit
  ///
  /// - Parameters:
  ///   - request: Request to send to RateLimit.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func rateLimit(
    _ request: Stride_Ratelimit_QueryRateLimitRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Stride_Ratelimit_QueryRateLimitRequest, Stride_Ratelimit_QueryRateLimitResponse> {
    return self.makeUnaryCall(
      path: Stride_Ratelimit_QueryClientMetadata.Methods.rateLimit.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRateLimitInterceptors() ?? []
    )
  }

  /// Unary call to RateLimitsByChainId
  ///
  /// - Parameters:
  ///   - request: Request to send to RateLimitsByChainId.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func rateLimitsByChainId(
    _ request: Stride_Ratelimit_QueryRateLimitsByChainIdRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Stride_Ratelimit_QueryRateLimitsByChainIdRequest, Stride_Ratelimit_QueryRateLimitsByChainIdResponse> {
    return self.makeUnaryCall(
      path: Stride_Ratelimit_QueryClientMetadata.Methods.rateLimitsByChainId.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRateLimitsByChainIdInterceptors() ?? []
    )
  }

  /// Unary call to RateLimitsByChannelId
  ///
  /// - Parameters:
  ///   - request: Request to send to RateLimitsByChannelId.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func rateLimitsByChannelId(
    _ request: Stride_Ratelimit_QueryRateLimitsByChannelIdRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Stride_Ratelimit_QueryRateLimitsByChannelIdRequest, Stride_Ratelimit_QueryRateLimitsByChannelIdResponse> {
    return self.makeUnaryCall(
      path: Stride_Ratelimit_QueryClientMetadata.Methods.rateLimitsByChannelId.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRateLimitsByChannelIdInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Stride_Ratelimit_QueryClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Stride_Ratelimit_QueryNIOClient")
internal final class Stride_Ratelimit_QueryClient: Stride_Ratelimit_QueryClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Stride_Ratelimit_QueryClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Stride_Ratelimit_QueryClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the stride.ratelimit.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Stride_Ratelimit_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Stride_Ratelimit_QueryNIOClient: Stride_Ratelimit_QueryClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Stride_Ratelimit_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the stride.ratelimit.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Stride_Ratelimit_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query defines the gRPC querier service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Stride_Ratelimit_QueryAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Stride_Ratelimit_QueryClientInterceptorFactoryProtocol? { get }

  func makeAllRateLimitsCall(
    _ request: Stride_Ratelimit_QueryAllRateLimitsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Stride_Ratelimit_QueryAllRateLimitsRequest, Stride_Ratelimit_QueryAllRateLimitsResponse>

  func makeRateLimitCall(
    _ request: Stride_Ratelimit_QueryRateLimitRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Stride_Ratelimit_QueryRateLimitRequest, Stride_Ratelimit_QueryRateLimitResponse>

  func makeRateLimitsByChainIDCall(
    _ request: Stride_Ratelimit_QueryRateLimitsByChainIdRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Stride_Ratelimit_QueryRateLimitsByChainIdRequest, Stride_Ratelimit_QueryRateLimitsByChainIdResponse>

  func makeRateLimitsByChannelIDCall(
    _ request: Stride_Ratelimit_QueryRateLimitsByChannelIdRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Stride_Ratelimit_QueryRateLimitsByChannelIdRequest, Stride_Ratelimit_QueryRateLimitsByChannelIdResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Stride_Ratelimit_QueryAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Stride_Ratelimit_QueryClientMetadata.serviceDescriptor
  }

  internal var interceptors: Stride_Ratelimit_QueryClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeAllRateLimitsCall(
    _ request: Stride_Ratelimit_QueryAllRateLimitsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Stride_Ratelimit_QueryAllRateLimitsRequest, Stride_Ratelimit_QueryAllRateLimitsResponse> {
    return self.makeAsyncUnaryCall(
      path: Stride_Ratelimit_QueryClientMetadata.Methods.allRateLimits.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAllRateLimitsInterceptors() ?? []
    )
  }

  internal func makeRateLimitCall(
    _ request: Stride_Ratelimit_QueryRateLimitRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Stride_Ratelimit_QueryRateLimitRequest, Stride_Ratelimit_QueryRateLimitResponse> {
    return self.makeAsyncUnaryCall(
      path: Stride_Ratelimit_QueryClientMetadata.Methods.rateLimit.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRateLimitInterceptors() ?? []
    )
  }

  internal func makeRateLimitsByChainIDCall(
    _ request: Stride_Ratelimit_QueryRateLimitsByChainIdRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Stride_Ratelimit_QueryRateLimitsByChainIdRequest, Stride_Ratelimit_QueryRateLimitsByChainIdResponse> {
    return self.makeAsyncUnaryCall(
      path: Stride_Ratelimit_QueryClientMetadata.Methods.rateLimitsByChainId.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRateLimitsByChainIdInterceptors() ?? []
    )
  }

  internal func makeRateLimitsByChannelIDCall(
    _ request: Stride_Ratelimit_QueryRateLimitsByChannelIdRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Stride_Ratelimit_QueryRateLimitsByChannelIdRequest, Stride_Ratelimit_QueryRateLimitsByChannelIdResponse> {
    return self.makeAsyncUnaryCall(
      path: Stride_Ratelimit_QueryClientMetadata.Methods.rateLimitsByChannelId.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRateLimitsByChannelIdInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Stride_Ratelimit_QueryAsyncClientProtocol {
  internal func allRateLimits(
    _ request: Stride_Ratelimit_QueryAllRateLimitsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Stride_Ratelimit_QueryAllRateLimitsResponse {
    return try await self.performAsyncUnaryCall(
      path: Stride_Ratelimit_QueryClientMetadata.Methods.allRateLimits.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAllRateLimitsInterceptors() ?? []
    )
  }

  internal func rateLimit(
    _ request: Stride_Ratelimit_QueryRateLimitRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Stride_Ratelimit_QueryRateLimitResponse {
    return try await self.performAsyncUnaryCall(
      path: Stride_Ratelimit_QueryClientMetadata.Methods.rateLimit.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRateLimitInterceptors() ?? []
    )
  }

  internal func rateLimitsByChainId(
    _ request: Stride_Ratelimit_QueryRateLimitsByChainIdRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Stride_Ratelimit_QueryRateLimitsByChainIdResponse {
    return try await self.performAsyncUnaryCall(
      path: Stride_Ratelimit_QueryClientMetadata.Methods.rateLimitsByChainId.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRateLimitsByChainIdInterceptors() ?? []
    )
  }

  internal func rateLimitsByChannelId(
    _ request: Stride_Ratelimit_QueryRateLimitsByChannelIdRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Stride_Ratelimit_QueryRateLimitsByChannelIdResponse {
    return try await self.performAsyncUnaryCall(
      path: Stride_Ratelimit_QueryClientMetadata.Methods.rateLimitsByChannelId.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRateLimitsByChannelIdInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Stride_Ratelimit_QueryAsyncClient: Stride_Ratelimit_QueryAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Stride_Ratelimit_QueryClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Stride_Ratelimit_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Stride_Ratelimit_QueryClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'allRateLimits'.
  func makeAllRateLimitsInterceptors() -> [ClientInterceptor<Stride_Ratelimit_QueryAllRateLimitsRequest, Stride_Ratelimit_QueryAllRateLimitsResponse>]

  /// - Returns: Interceptors to use when invoking 'rateLimit'.
  func makeRateLimitInterceptors() -> [ClientInterceptor<Stride_Ratelimit_QueryRateLimitRequest, Stride_Ratelimit_QueryRateLimitResponse>]

  /// - Returns: Interceptors to use when invoking 'rateLimitsByChainId'.
  func makeRateLimitsByChainIdInterceptors() -> [ClientInterceptor<Stride_Ratelimit_QueryRateLimitsByChainIdRequest, Stride_Ratelimit_QueryRateLimitsByChainIdResponse>]

  /// - Returns: Interceptors to use when invoking 'rateLimitsByChannelId'.
  func makeRateLimitsByChannelIdInterceptors() -> [ClientInterceptor<Stride_Ratelimit_QueryRateLimitsByChannelIdRequest, Stride_Ratelimit_QueryRateLimitsByChannelIdResponse>]
}

internal enum Stride_Ratelimit_QueryClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "stride.ratelimit.Query",
    methods: [
      Stride_Ratelimit_QueryClientMetadata.Methods.allRateLimits,
      Stride_Ratelimit_QueryClientMetadata.Methods.rateLimit,
      Stride_Ratelimit_QueryClientMetadata.Methods.rateLimitsByChainId,
      Stride_Ratelimit_QueryClientMetadata.Methods.rateLimitsByChannelId,
    ]
  )

  internal enum Methods {
    internal static let allRateLimits = GRPCMethodDescriptor(
      name: "AllRateLimits",
      path: "/stride.ratelimit.Query/AllRateLimits",
      type: GRPCCallType.unary
    )

    internal static let rateLimit = GRPCMethodDescriptor(
      name: "RateLimit",
      path: "/stride.ratelimit.Query/RateLimit",
      type: GRPCCallType.unary
    )

    internal static let rateLimitsByChainId = GRPCMethodDescriptor(
      name: "RateLimitsByChainId",
      path: "/stride.ratelimit.Query/RateLimitsByChainId",
      type: GRPCCallType.unary
    )

    internal static let rateLimitsByChannelId = GRPCMethodDescriptor(
      name: "RateLimitsByChannelId",
      path: "/stride.ratelimit.Query/RateLimitsByChannelId",
      type: GRPCCallType.unary
    )
  }
}

/// Query defines the gRPC querier service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Stride_Ratelimit_QueryProvider: CallHandlerProvider {
  var interceptors: Stride_Ratelimit_QueryServerInterceptorFactoryProtocol? { get }

  func allRateLimits(request: Stride_Ratelimit_QueryAllRateLimitsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Stride_Ratelimit_QueryAllRateLimitsResponse>

  func rateLimit(request: Stride_Ratelimit_QueryRateLimitRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Stride_Ratelimit_QueryRateLimitResponse>

  func rateLimitsByChainId(request: Stride_Ratelimit_QueryRateLimitsByChainIdRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Stride_Ratelimit_QueryRateLimitsByChainIdResponse>

  func rateLimitsByChannelId(request: Stride_Ratelimit_QueryRateLimitsByChannelIdRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Stride_Ratelimit_QueryRateLimitsByChannelIdResponse>
}

extension Stride_Ratelimit_QueryProvider {
  internal var serviceName: Substring {
    return Stride_Ratelimit_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "AllRateLimits":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stride_Ratelimit_QueryAllRateLimitsRequest>(),
        responseSerializer: ProtobufSerializer<Stride_Ratelimit_QueryAllRateLimitsResponse>(),
        interceptors: self.interceptors?.makeAllRateLimitsInterceptors() ?? [],
        userFunction: self.allRateLimits(request:context:)
      )

    case "RateLimit":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stride_Ratelimit_QueryRateLimitRequest>(),
        responseSerializer: ProtobufSerializer<Stride_Ratelimit_QueryRateLimitResponse>(),
        interceptors: self.interceptors?.makeRateLimitInterceptors() ?? [],
        userFunction: self.rateLimit(request:context:)
      )

    case "RateLimitsByChainId":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stride_Ratelimit_QueryRateLimitsByChainIdRequest>(),
        responseSerializer: ProtobufSerializer<Stride_Ratelimit_QueryRateLimitsByChainIdResponse>(),
        interceptors: self.interceptors?.makeRateLimitsByChainIdInterceptors() ?? [],
        userFunction: self.rateLimitsByChainId(request:context:)
      )

    case "RateLimitsByChannelId":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stride_Ratelimit_QueryRateLimitsByChannelIdRequest>(),
        responseSerializer: ProtobufSerializer<Stride_Ratelimit_QueryRateLimitsByChannelIdResponse>(),
        interceptors: self.interceptors?.makeRateLimitsByChannelIdInterceptors() ?? [],
        userFunction: self.rateLimitsByChannelId(request:context:)
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
internal protocol Stride_Ratelimit_QueryAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Stride_Ratelimit_QueryServerInterceptorFactoryProtocol? { get }

  @Sendable func allRateLimits(
    request: Stride_Ratelimit_QueryAllRateLimitsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Stride_Ratelimit_QueryAllRateLimitsResponse

  @Sendable func rateLimit(
    request: Stride_Ratelimit_QueryRateLimitRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Stride_Ratelimit_QueryRateLimitResponse

  @Sendable func rateLimitsByChainId(
    request: Stride_Ratelimit_QueryRateLimitsByChainIdRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Stride_Ratelimit_QueryRateLimitsByChainIdResponse

  @Sendable func rateLimitsByChannelId(
    request: Stride_Ratelimit_QueryRateLimitsByChannelIdRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Stride_Ratelimit_QueryRateLimitsByChannelIdResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Stride_Ratelimit_QueryAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Stride_Ratelimit_QueryServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Stride_Ratelimit_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Stride_Ratelimit_QueryServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "AllRateLimits":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stride_Ratelimit_QueryAllRateLimitsRequest>(),
        responseSerializer: ProtobufSerializer<Stride_Ratelimit_QueryAllRateLimitsResponse>(),
        interceptors: self.interceptors?.makeAllRateLimitsInterceptors() ?? [],
        wrapping: self.allRateLimits(request:context:)
      )

    case "RateLimit":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stride_Ratelimit_QueryRateLimitRequest>(),
        responseSerializer: ProtobufSerializer<Stride_Ratelimit_QueryRateLimitResponse>(),
        interceptors: self.interceptors?.makeRateLimitInterceptors() ?? [],
        wrapping: self.rateLimit(request:context:)
      )

    case "RateLimitsByChainId":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stride_Ratelimit_QueryRateLimitsByChainIdRequest>(),
        responseSerializer: ProtobufSerializer<Stride_Ratelimit_QueryRateLimitsByChainIdResponse>(),
        interceptors: self.interceptors?.makeRateLimitsByChainIdInterceptors() ?? [],
        wrapping: self.rateLimitsByChainId(request:context:)
      )

    case "RateLimitsByChannelId":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stride_Ratelimit_QueryRateLimitsByChannelIdRequest>(),
        responseSerializer: ProtobufSerializer<Stride_Ratelimit_QueryRateLimitsByChannelIdResponse>(),
        interceptors: self.interceptors?.makeRateLimitsByChannelIdInterceptors() ?? [],
        wrapping: self.rateLimitsByChannelId(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Stride_Ratelimit_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'allRateLimits'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeAllRateLimitsInterceptors() -> [ServerInterceptor<Stride_Ratelimit_QueryAllRateLimitsRequest, Stride_Ratelimit_QueryAllRateLimitsResponse>]

  /// - Returns: Interceptors to use when handling 'rateLimit'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeRateLimitInterceptors() -> [ServerInterceptor<Stride_Ratelimit_QueryRateLimitRequest, Stride_Ratelimit_QueryRateLimitResponse>]

  /// - Returns: Interceptors to use when handling 'rateLimitsByChainId'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeRateLimitsByChainIdInterceptors() -> [ServerInterceptor<Stride_Ratelimit_QueryRateLimitsByChainIdRequest, Stride_Ratelimit_QueryRateLimitsByChainIdResponse>]

  /// - Returns: Interceptors to use when handling 'rateLimitsByChannelId'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeRateLimitsByChannelIdInterceptors() -> [ServerInterceptor<Stride_Ratelimit_QueryRateLimitsByChannelIdRequest, Stride_Ratelimit_QueryRateLimitsByChannelIdResponse>]
}

internal enum Stride_Ratelimit_QueryServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "stride.ratelimit.Query",
    methods: [
      Stride_Ratelimit_QueryServerMetadata.Methods.allRateLimits,
      Stride_Ratelimit_QueryServerMetadata.Methods.rateLimit,
      Stride_Ratelimit_QueryServerMetadata.Methods.rateLimitsByChainId,
      Stride_Ratelimit_QueryServerMetadata.Methods.rateLimitsByChannelId,
    ]
  )

  internal enum Methods {
    internal static let allRateLimits = GRPCMethodDescriptor(
      name: "AllRateLimits",
      path: "/stride.ratelimit.Query/AllRateLimits",
      type: GRPCCallType.unary
    )

    internal static let rateLimit = GRPCMethodDescriptor(
      name: "RateLimit",
      path: "/stride.ratelimit.Query/RateLimit",
      type: GRPCCallType.unary
    )

    internal static let rateLimitsByChainId = GRPCMethodDescriptor(
      name: "RateLimitsByChainId",
      path: "/stride.ratelimit.Query/RateLimitsByChainId",
      type: GRPCCallType.unary
    )

    internal static let rateLimitsByChannelId = GRPCMethodDescriptor(
      name: "RateLimitsByChannelId",
      path: "/stride.ratelimit.Query/RateLimitsByChannelId",
      type: GRPCCallType.unary
    )
  }
}
