//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: mars/safety/v1beta1/query.proto
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


/// Query defines the gRPC querier service for the safety fund module
///
/// Usage: instantiate `Mars_Safety_V1beta1_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Mars_Safety_V1beta1_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Mars_Safety_V1beta1_QueryClientInterceptorFactoryProtocol? { get }

  func balances(
    _ request: Mars_Safety_V1beta1_QueryBalancesRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Mars_Safety_V1beta1_QueryBalancesRequest, Mars_Safety_V1beta1_QueryBalancesResponse>
}

extension Mars_Safety_V1beta1_QueryClientProtocol {
  internal var serviceName: String {
    return "mars.safety.v1beta1.Query"
  }

  /// Balances queries coins available in the safety fund
  ///
  /// - Parameters:
  ///   - request: Request to send to Balances.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func balances(
    _ request: Mars_Safety_V1beta1_QueryBalancesRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Mars_Safety_V1beta1_QueryBalancesRequest, Mars_Safety_V1beta1_QueryBalancesResponse> {
    return self.makeUnaryCall(
      path: Mars_Safety_V1beta1_QueryClientMetadata.Methods.balances.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeBalancesInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Mars_Safety_V1beta1_QueryClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Mars_Safety_V1beta1_QueryNIOClient")
internal final class Mars_Safety_V1beta1_QueryClient: Mars_Safety_V1beta1_QueryClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Mars_Safety_V1beta1_QueryClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Mars_Safety_V1beta1_QueryClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the mars.safety.v1beta1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Mars_Safety_V1beta1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Mars_Safety_V1beta1_QueryNIOClient: Mars_Safety_V1beta1_QueryClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Mars_Safety_V1beta1_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the mars.safety.v1beta1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Mars_Safety_V1beta1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query defines the gRPC querier service for the safety fund module
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Mars_Safety_V1beta1_QueryAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Mars_Safety_V1beta1_QueryClientInterceptorFactoryProtocol? { get }

  func makeBalancesCall(
    _ request: Mars_Safety_V1beta1_QueryBalancesRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Mars_Safety_V1beta1_QueryBalancesRequest, Mars_Safety_V1beta1_QueryBalancesResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Mars_Safety_V1beta1_QueryAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Mars_Safety_V1beta1_QueryClientMetadata.serviceDescriptor
  }

  internal var interceptors: Mars_Safety_V1beta1_QueryClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeBalancesCall(
    _ request: Mars_Safety_V1beta1_QueryBalancesRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Mars_Safety_V1beta1_QueryBalancesRequest, Mars_Safety_V1beta1_QueryBalancesResponse> {
    return self.makeAsyncUnaryCall(
      path: Mars_Safety_V1beta1_QueryClientMetadata.Methods.balances.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeBalancesInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Mars_Safety_V1beta1_QueryAsyncClientProtocol {
  internal func balances(
    _ request: Mars_Safety_V1beta1_QueryBalancesRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Mars_Safety_V1beta1_QueryBalancesResponse {
    return try await self.performAsyncUnaryCall(
      path: Mars_Safety_V1beta1_QueryClientMetadata.Methods.balances.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeBalancesInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Mars_Safety_V1beta1_QueryAsyncClient: Mars_Safety_V1beta1_QueryAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Mars_Safety_V1beta1_QueryClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Mars_Safety_V1beta1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Mars_Safety_V1beta1_QueryClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'balances'.
  func makeBalancesInterceptors() -> [ClientInterceptor<Mars_Safety_V1beta1_QueryBalancesRequest, Mars_Safety_V1beta1_QueryBalancesResponse>]
}

internal enum Mars_Safety_V1beta1_QueryClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "mars.safety.v1beta1.Query",
    methods: [
      Mars_Safety_V1beta1_QueryClientMetadata.Methods.balances,
    ]
  )

  internal enum Methods {
    internal static let balances = GRPCMethodDescriptor(
      name: "Balances",
      path: "/mars.safety.v1beta1.Query/Balances",
      type: GRPCCallType.unary
    )
  }
}

/// Query defines the gRPC querier service for the safety fund module
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Mars_Safety_V1beta1_QueryProvider: CallHandlerProvider {
  var interceptors: Mars_Safety_V1beta1_QueryServerInterceptorFactoryProtocol? { get }

  /// Balances queries coins available in the safety fund
  func balances(request: Mars_Safety_V1beta1_QueryBalancesRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Mars_Safety_V1beta1_QueryBalancesResponse>
}

extension Mars_Safety_V1beta1_QueryProvider {
  internal var serviceName: Substring {
    return Mars_Safety_V1beta1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Balances":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Mars_Safety_V1beta1_QueryBalancesRequest>(),
        responseSerializer: ProtobufSerializer<Mars_Safety_V1beta1_QueryBalancesResponse>(),
        interceptors: self.interceptors?.makeBalancesInterceptors() ?? [],
        userFunction: self.balances(request:context:)
      )

    default:
      return nil
    }
  }
}

/// Query defines the gRPC querier service for the safety fund module
///
/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Mars_Safety_V1beta1_QueryAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Mars_Safety_V1beta1_QueryServerInterceptorFactoryProtocol? { get }

  /// Balances queries coins available in the safety fund
  @Sendable func balances(
    request: Mars_Safety_V1beta1_QueryBalancesRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Mars_Safety_V1beta1_QueryBalancesResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Mars_Safety_V1beta1_QueryAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Mars_Safety_V1beta1_QueryServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Mars_Safety_V1beta1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Mars_Safety_V1beta1_QueryServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Balances":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Mars_Safety_V1beta1_QueryBalancesRequest>(),
        responseSerializer: ProtobufSerializer<Mars_Safety_V1beta1_QueryBalancesResponse>(),
        interceptors: self.interceptors?.makeBalancesInterceptors() ?? [],
        wrapping: self.balances(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Mars_Safety_V1beta1_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'balances'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeBalancesInterceptors() -> [ServerInterceptor<Mars_Safety_V1beta1_QueryBalancesRequest, Mars_Safety_V1beta1_QueryBalancesResponse>]
}

internal enum Mars_Safety_V1beta1_QueryServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "mars.safety.v1beta1.Query",
    methods: [
      Mars_Safety_V1beta1_QueryServerMetadata.Methods.balances,
    ]
  )

  internal enum Methods {
    internal static let balances = GRPCMethodDescriptor(
      name: "Balances",
      path: "/mars.safety.v1beta1.Query/Balances",
      type: GRPCCallType.unary
    )
  }
}
