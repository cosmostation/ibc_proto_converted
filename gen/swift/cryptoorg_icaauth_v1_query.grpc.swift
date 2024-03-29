//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: cryptoorg/icaauth/v1/query.proto
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
/// Usage: instantiate `Chainmain_Icaauth_V1_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Chainmain_Icaauth_V1_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Chainmain_Icaauth_V1_QueryClientInterceptorFactoryProtocol? { get }

  func params(
    _ request: Chainmain_Icaauth_V1_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Chainmain_Icaauth_V1_QueryParamsRequest, Chainmain_Icaauth_V1_QueryParamsResponse>

  func interchainAccountAddress(
    _ request: Chainmain_Icaauth_V1_QueryInterchainAccountAddressRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Chainmain_Icaauth_V1_QueryInterchainAccountAddressRequest, Chainmain_Icaauth_V1_QueryInterchainAccountAddressResponse>
}

extension Chainmain_Icaauth_V1_QueryClientProtocol {
  internal var serviceName: String {
    return "chainmain.icaauth.v1.Query"
  }

  /// Parameters queries the parameters of the module.
  ///
  /// - Parameters:
  ///   - request: Request to send to Params.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func params(
    _ request: Chainmain_Icaauth_V1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Chainmain_Icaauth_V1_QueryParamsRequest, Chainmain_Icaauth_V1_QueryParamsResponse> {
    return self.makeUnaryCall(
      path: Chainmain_Icaauth_V1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }

  /// InterchainAccountAddress queries the interchain account address for given `connectionId` and `owner`
  ///
  /// - Parameters:
  ///   - request: Request to send to InterchainAccountAddress.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func interchainAccountAddress(
    _ request: Chainmain_Icaauth_V1_QueryInterchainAccountAddressRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Chainmain_Icaauth_V1_QueryInterchainAccountAddressRequest, Chainmain_Icaauth_V1_QueryInterchainAccountAddressResponse> {
    return self.makeUnaryCall(
      path: Chainmain_Icaauth_V1_QueryClientMetadata.Methods.interchainAccountAddress.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeInterchainAccountAddressInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Chainmain_Icaauth_V1_QueryClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Chainmain_Icaauth_V1_QueryNIOClient")
internal final class Chainmain_Icaauth_V1_QueryClient: Chainmain_Icaauth_V1_QueryClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Chainmain_Icaauth_V1_QueryClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Chainmain_Icaauth_V1_QueryClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the chainmain.icaauth.v1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Chainmain_Icaauth_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Chainmain_Icaauth_V1_QueryNIOClient: Chainmain_Icaauth_V1_QueryClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Chainmain_Icaauth_V1_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the chainmain.icaauth.v1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Chainmain_Icaauth_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query defines the gRPC querier service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Chainmain_Icaauth_V1_QueryAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Chainmain_Icaauth_V1_QueryClientInterceptorFactoryProtocol? { get }

  func makeParamsCall(
    _ request: Chainmain_Icaauth_V1_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Chainmain_Icaauth_V1_QueryParamsRequest, Chainmain_Icaauth_V1_QueryParamsResponse>

  func makeInterchainAccountAddressCall(
    _ request: Chainmain_Icaauth_V1_QueryInterchainAccountAddressRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Chainmain_Icaauth_V1_QueryInterchainAccountAddressRequest, Chainmain_Icaauth_V1_QueryInterchainAccountAddressResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Chainmain_Icaauth_V1_QueryAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Chainmain_Icaauth_V1_QueryClientMetadata.serviceDescriptor
  }

  internal var interceptors: Chainmain_Icaauth_V1_QueryClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeParamsCall(
    _ request: Chainmain_Icaauth_V1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Chainmain_Icaauth_V1_QueryParamsRequest, Chainmain_Icaauth_V1_QueryParamsResponse> {
    return self.makeAsyncUnaryCall(
      path: Chainmain_Icaauth_V1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }

  internal func makeInterchainAccountAddressCall(
    _ request: Chainmain_Icaauth_V1_QueryInterchainAccountAddressRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Chainmain_Icaauth_V1_QueryInterchainAccountAddressRequest, Chainmain_Icaauth_V1_QueryInterchainAccountAddressResponse> {
    return self.makeAsyncUnaryCall(
      path: Chainmain_Icaauth_V1_QueryClientMetadata.Methods.interchainAccountAddress.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeInterchainAccountAddressInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Chainmain_Icaauth_V1_QueryAsyncClientProtocol {
  internal func params(
    _ request: Chainmain_Icaauth_V1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Chainmain_Icaauth_V1_QueryParamsResponse {
    return try await self.performAsyncUnaryCall(
      path: Chainmain_Icaauth_V1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }

  internal func interchainAccountAddress(
    _ request: Chainmain_Icaauth_V1_QueryInterchainAccountAddressRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Chainmain_Icaauth_V1_QueryInterchainAccountAddressResponse {
    return try await self.performAsyncUnaryCall(
      path: Chainmain_Icaauth_V1_QueryClientMetadata.Methods.interchainAccountAddress.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeInterchainAccountAddressInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Chainmain_Icaauth_V1_QueryAsyncClient: Chainmain_Icaauth_V1_QueryAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Chainmain_Icaauth_V1_QueryClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Chainmain_Icaauth_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Chainmain_Icaauth_V1_QueryClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'params'.
  func makeParamsInterceptors() -> [ClientInterceptor<Chainmain_Icaauth_V1_QueryParamsRequest, Chainmain_Icaauth_V1_QueryParamsResponse>]

  /// - Returns: Interceptors to use when invoking 'interchainAccountAddress'.
  func makeInterchainAccountAddressInterceptors() -> [ClientInterceptor<Chainmain_Icaauth_V1_QueryInterchainAccountAddressRequest, Chainmain_Icaauth_V1_QueryInterchainAccountAddressResponse>]
}

internal enum Chainmain_Icaauth_V1_QueryClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "chainmain.icaauth.v1.Query",
    methods: [
      Chainmain_Icaauth_V1_QueryClientMetadata.Methods.params,
      Chainmain_Icaauth_V1_QueryClientMetadata.Methods.interchainAccountAddress,
    ]
  )

  internal enum Methods {
    internal static let params = GRPCMethodDescriptor(
      name: "Params",
      path: "/chainmain.icaauth.v1.Query/Params",
      type: GRPCCallType.unary
    )

    internal static let interchainAccountAddress = GRPCMethodDescriptor(
      name: "InterchainAccountAddress",
      path: "/chainmain.icaauth.v1.Query/InterchainAccountAddress",
      type: GRPCCallType.unary
    )
  }
}

/// Query defines the gRPC querier service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Chainmain_Icaauth_V1_QueryProvider: CallHandlerProvider {
  var interceptors: Chainmain_Icaauth_V1_QueryServerInterceptorFactoryProtocol? { get }

  /// Parameters queries the parameters of the module.
  func params(request: Chainmain_Icaauth_V1_QueryParamsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Chainmain_Icaauth_V1_QueryParamsResponse>

  /// InterchainAccountAddress queries the interchain account address for given `connectionId` and `owner`
  func interchainAccountAddress(request: Chainmain_Icaauth_V1_QueryInterchainAccountAddressRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Chainmain_Icaauth_V1_QueryInterchainAccountAddressResponse>
}

extension Chainmain_Icaauth_V1_QueryProvider {
  internal var serviceName: Substring {
    return Chainmain_Icaauth_V1_QueryServerMetadata.serviceDescriptor.fullName[...]
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
        requestDeserializer: ProtobufDeserializer<Chainmain_Icaauth_V1_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Chainmain_Icaauth_V1_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        userFunction: self.params(request:context:)
      )

    case "InterchainAccountAddress":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Chainmain_Icaauth_V1_QueryInterchainAccountAddressRequest>(),
        responseSerializer: ProtobufSerializer<Chainmain_Icaauth_V1_QueryInterchainAccountAddressResponse>(),
        interceptors: self.interceptors?.makeInterchainAccountAddressInterceptors() ?? [],
        userFunction: self.interchainAccountAddress(request:context:)
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
internal protocol Chainmain_Icaauth_V1_QueryAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Chainmain_Icaauth_V1_QueryServerInterceptorFactoryProtocol? { get }

  /// Parameters queries the parameters of the module.
  @Sendable func params(
    request: Chainmain_Icaauth_V1_QueryParamsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Chainmain_Icaauth_V1_QueryParamsResponse

  /// InterchainAccountAddress queries the interchain account address for given `connectionId` and `owner`
  @Sendable func interchainAccountAddress(
    request: Chainmain_Icaauth_V1_QueryInterchainAccountAddressRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Chainmain_Icaauth_V1_QueryInterchainAccountAddressResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Chainmain_Icaauth_V1_QueryAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Chainmain_Icaauth_V1_QueryServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Chainmain_Icaauth_V1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Chainmain_Icaauth_V1_QueryServerInterceptorFactoryProtocol? {
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
        requestDeserializer: ProtobufDeserializer<Chainmain_Icaauth_V1_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Chainmain_Icaauth_V1_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        wrapping: self.params(request:context:)
      )

    case "InterchainAccountAddress":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Chainmain_Icaauth_V1_QueryInterchainAccountAddressRequest>(),
        responseSerializer: ProtobufSerializer<Chainmain_Icaauth_V1_QueryInterchainAccountAddressResponse>(),
        interceptors: self.interceptors?.makeInterchainAccountAddressInterceptors() ?? [],
        wrapping: self.interchainAccountAddress(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Chainmain_Icaauth_V1_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'params'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeParamsInterceptors() -> [ServerInterceptor<Chainmain_Icaauth_V1_QueryParamsRequest, Chainmain_Icaauth_V1_QueryParamsResponse>]

  /// - Returns: Interceptors to use when handling 'interchainAccountAddress'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeInterchainAccountAddressInterceptors() -> [ServerInterceptor<Chainmain_Icaauth_V1_QueryInterchainAccountAddressRequest, Chainmain_Icaauth_V1_QueryInterchainAccountAddressResponse>]
}

internal enum Chainmain_Icaauth_V1_QueryServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "chainmain.icaauth.v1.Query",
    methods: [
      Chainmain_Icaauth_V1_QueryServerMetadata.Methods.params,
      Chainmain_Icaauth_V1_QueryServerMetadata.Methods.interchainAccountAddress,
    ]
  )

  internal enum Methods {
    internal static let params = GRPCMethodDescriptor(
      name: "Params",
      path: "/chainmain.icaauth.v1.Query/Params",
      type: GRPCCallType.unary
    )

    internal static let interchainAccountAddress = GRPCMethodDescriptor(
      name: "InterchainAccountAddress",
      path: "/chainmain.icaauth.v1.Query/InterchainAccountAddress",
      type: GRPCCallType.unary
    )
  }
}
