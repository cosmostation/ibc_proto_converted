//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: kava/kavadist/v1beta1/query.proto
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
/// Usage: instantiate `Kava_Kavadist_V1beta1_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Kava_Kavadist_V1beta1_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Kava_Kavadist_V1beta1_QueryClientInterceptorFactoryProtocol? { get }

  func params(
    _ request: Kava_Kavadist_V1beta1_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Kava_Kavadist_V1beta1_QueryParamsRequest, Kava_Kavadist_V1beta1_QueryParamsResponse>

  func balance(
    _ request: Kava_Kavadist_V1beta1_QueryBalanceRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Kava_Kavadist_V1beta1_QueryBalanceRequest, Kava_Kavadist_V1beta1_QueryBalanceResponse>
}

extension Kava_Kavadist_V1beta1_QueryClientProtocol {
  internal var serviceName: String {
    return "kava.kavadist.v1beta1.Query"
  }

  /// Params queries the parameters of x/kavadist module.
  ///
  /// - Parameters:
  ///   - request: Request to send to Params.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func params(
    _ request: Kava_Kavadist_V1beta1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Kava_Kavadist_V1beta1_QueryParamsRequest, Kava_Kavadist_V1beta1_QueryParamsResponse> {
    return self.makeUnaryCall(
      path: Kava_Kavadist_V1beta1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }

  /// Balance queries the balance of all coins of x/kavadist module.
  ///
  /// - Parameters:
  ///   - request: Request to send to Balance.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func balance(
    _ request: Kava_Kavadist_V1beta1_QueryBalanceRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Kava_Kavadist_V1beta1_QueryBalanceRequest, Kava_Kavadist_V1beta1_QueryBalanceResponse> {
    return self.makeUnaryCall(
      path: Kava_Kavadist_V1beta1_QueryClientMetadata.Methods.balance.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeBalanceInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Kava_Kavadist_V1beta1_QueryClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Kava_Kavadist_V1beta1_QueryNIOClient")
internal final class Kava_Kavadist_V1beta1_QueryClient: Kava_Kavadist_V1beta1_QueryClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Kava_Kavadist_V1beta1_QueryClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Kava_Kavadist_V1beta1_QueryClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the kava.kavadist.v1beta1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Kava_Kavadist_V1beta1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Kava_Kavadist_V1beta1_QueryNIOClient: Kava_Kavadist_V1beta1_QueryClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Kava_Kavadist_V1beta1_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the kava.kavadist.v1beta1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Kava_Kavadist_V1beta1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query defines the gRPC querier service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Kava_Kavadist_V1beta1_QueryAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Kava_Kavadist_V1beta1_QueryClientInterceptorFactoryProtocol? { get }

  func makeParamsCall(
    _ request: Kava_Kavadist_V1beta1_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Kava_Kavadist_V1beta1_QueryParamsRequest, Kava_Kavadist_V1beta1_QueryParamsResponse>

  func makeBalanceCall(
    _ request: Kava_Kavadist_V1beta1_QueryBalanceRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Kava_Kavadist_V1beta1_QueryBalanceRequest, Kava_Kavadist_V1beta1_QueryBalanceResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Kava_Kavadist_V1beta1_QueryAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Kava_Kavadist_V1beta1_QueryClientMetadata.serviceDescriptor
  }

  internal var interceptors: Kava_Kavadist_V1beta1_QueryClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeParamsCall(
    _ request: Kava_Kavadist_V1beta1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Kava_Kavadist_V1beta1_QueryParamsRequest, Kava_Kavadist_V1beta1_QueryParamsResponse> {
    return self.makeAsyncUnaryCall(
      path: Kava_Kavadist_V1beta1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }

  internal func makeBalanceCall(
    _ request: Kava_Kavadist_V1beta1_QueryBalanceRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Kava_Kavadist_V1beta1_QueryBalanceRequest, Kava_Kavadist_V1beta1_QueryBalanceResponse> {
    return self.makeAsyncUnaryCall(
      path: Kava_Kavadist_V1beta1_QueryClientMetadata.Methods.balance.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeBalanceInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Kava_Kavadist_V1beta1_QueryAsyncClientProtocol {
  internal func params(
    _ request: Kava_Kavadist_V1beta1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Kava_Kavadist_V1beta1_QueryParamsResponse {
    return try await self.performAsyncUnaryCall(
      path: Kava_Kavadist_V1beta1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }

  internal func balance(
    _ request: Kava_Kavadist_V1beta1_QueryBalanceRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Kava_Kavadist_V1beta1_QueryBalanceResponse {
    return try await self.performAsyncUnaryCall(
      path: Kava_Kavadist_V1beta1_QueryClientMetadata.Methods.balance.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeBalanceInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Kava_Kavadist_V1beta1_QueryAsyncClient: Kava_Kavadist_V1beta1_QueryAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Kava_Kavadist_V1beta1_QueryClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Kava_Kavadist_V1beta1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Kava_Kavadist_V1beta1_QueryClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'params'.
  func makeParamsInterceptors() -> [ClientInterceptor<Kava_Kavadist_V1beta1_QueryParamsRequest, Kava_Kavadist_V1beta1_QueryParamsResponse>]

  /// - Returns: Interceptors to use when invoking 'balance'.
  func makeBalanceInterceptors() -> [ClientInterceptor<Kava_Kavadist_V1beta1_QueryBalanceRequest, Kava_Kavadist_V1beta1_QueryBalanceResponse>]
}

internal enum Kava_Kavadist_V1beta1_QueryClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "kava.kavadist.v1beta1.Query",
    methods: [
      Kava_Kavadist_V1beta1_QueryClientMetadata.Methods.params,
      Kava_Kavadist_V1beta1_QueryClientMetadata.Methods.balance,
    ]
  )

  internal enum Methods {
    internal static let params = GRPCMethodDescriptor(
      name: "Params",
      path: "/kava.kavadist.v1beta1.Query/Params",
      type: GRPCCallType.unary
    )

    internal static let balance = GRPCMethodDescriptor(
      name: "Balance",
      path: "/kava.kavadist.v1beta1.Query/Balance",
      type: GRPCCallType.unary
    )
  }
}

/// Query defines the gRPC querier service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Kava_Kavadist_V1beta1_QueryProvider: CallHandlerProvider {
  var interceptors: Kava_Kavadist_V1beta1_QueryServerInterceptorFactoryProtocol? { get }

  /// Params queries the parameters of x/kavadist module.
  func params(request: Kava_Kavadist_V1beta1_QueryParamsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Kava_Kavadist_V1beta1_QueryParamsResponse>

  /// Balance queries the balance of all coins of x/kavadist module.
  func balance(request: Kava_Kavadist_V1beta1_QueryBalanceRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Kava_Kavadist_V1beta1_QueryBalanceResponse>
}

extension Kava_Kavadist_V1beta1_QueryProvider {
  internal var serviceName: Substring {
    return Kava_Kavadist_V1beta1_QueryServerMetadata.serviceDescriptor.fullName[...]
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
        requestDeserializer: ProtobufDeserializer<Kava_Kavadist_V1beta1_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Kava_Kavadist_V1beta1_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        userFunction: self.params(request:context:)
      )

    case "Balance":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kava_Kavadist_V1beta1_QueryBalanceRequest>(),
        responseSerializer: ProtobufSerializer<Kava_Kavadist_V1beta1_QueryBalanceResponse>(),
        interceptors: self.interceptors?.makeBalanceInterceptors() ?? [],
        userFunction: self.balance(request:context:)
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
internal protocol Kava_Kavadist_V1beta1_QueryAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Kava_Kavadist_V1beta1_QueryServerInterceptorFactoryProtocol? { get }

  /// Params queries the parameters of x/kavadist module.
  @Sendable func params(
    request: Kava_Kavadist_V1beta1_QueryParamsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Kava_Kavadist_V1beta1_QueryParamsResponse

  /// Balance queries the balance of all coins of x/kavadist module.
  @Sendable func balance(
    request: Kava_Kavadist_V1beta1_QueryBalanceRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Kava_Kavadist_V1beta1_QueryBalanceResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Kava_Kavadist_V1beta1_QueryAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Kava_Kavadist_V1beta1_QueryServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Kava_Kavadist_V1beta1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Kava_Kavadist_V1beta1_QueryServerInterceptorFactoryProtocol? {
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
        requestDeserializer: ProtobufDeserializer<Kava_Kavadist_V1beta1_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Kava_Kavadist_V1beta1_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        wrapping: self.params(request:context:)
      )

    case "Balance":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kava_Kavadist_V1beta1_QueryBalanceRequest>(),
        responseSerializer: ProtobufSerializer<Kava_Kavadist_V1beta1_QueryBalanceResponse>(),
        interceptors: self.interceptors?.makeBalanceInterceptors() ?? [],
        wrapping: self.balance(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Kava_Kavadist_V1beta1_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'params'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeParamsInterceptors() -> [ServerInterceptor<Kava_Kavadist_V1beta1_QueryParamsRequest, Kava_Kavadist_V1beta1_QueryParamsResponse>]

  /// - Returns: Interceptors to use when handling 'balance'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeBalanceInterceptors() -> [ServerInterceptor<Kava_Kavadist_V1beta1_QueryBalanceRequest, Kava_Kavadist_V1beta1_QueryBalanceResponse>]
}

internal enum Kava_Kavadist_V1beta1_QueryServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "kava.kavadist.v1beta1.Query",
    methods: [
      Kava_Kavadist_V1beta1_QueryServerMetadata.Methods.params,
      Kava_Kavadist_V1beta1_QueryServerMetadata.Methods.balance,
    ]
  )

  internal enum Methods {
    internal static let params = GRPCMethodDescriptor(
      name: "Params",
      path: "/kava.kavadist.v1beta1.Query/Params",
      type: GRPCCallType.unary
    )

    internal static let balance = GRPCMethodDescriptor(
      name: "Balance",
      path: "/kava.kavadist.v1beta1.Query/Balance",
      type: GRPCCallType.unary
    )
  }
}
