//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: cosmos/autocli/v1/query.proto
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


/// RemoteInfoService provides clients with the information they need
/// to build dynamically CLI clients for remote chains.
///
/// Usage: instantiate `Cosmos_Autocli_V1_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Cosmos_Autocli_V1_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Cosmos_Autocli_V1_QueryClientInterceptorFactoryProtocol? { get }

  func appOptions(
    _ request: Cosmos_Autocli_V1_AppOptionsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Cosmos_Autocli_V1_AppOptionsRequest, Cosmos_Autocli_V1_AppOptionsResponse>
}

extension Cosmos_Autocli_V1_QueryClientProtocol {
  internal var serviceName: String {
    return "cosmos.autocli.v1.Query"
  }

  /// AppOptions returns the autocli options for all of the modules in an app.
  ///
  /// - Parameters:
  ///   - request: Request to send to AppOptions.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func appOptions(
    _ request: Cosmos_Autocli_V1_AppOptionsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Cosmos_Autocli_V1_AppOptionsRequest, Cosmos_Autocli_V1_AppOptionsResponse> {
    return self.makeUnaryCall(
      path: Cosmos_Autocli_V1_QueryClientMetadata.Methods.appOptions.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAppOptionsInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Cosmos_Autocli_V1_QueryClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Cosmos_Autocli_V1_QueryNIOClient")
internal final class Cosmos_Autocli_V1_QueryClient: Cosmos_Autocli_V1_QueryClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Cosmos_Autocli_V1_QueryClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Cosmos_Autocli_V1_QueryClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the cosmos.autocli.v1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Cosmos_Autocli_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Cosmos_Autocli_V1_QueryNIOClient: Cosmos_Autocli_V1_QueryClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Cosmos_Autocli_V1_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the cosmos.autocli.v1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Cosmos_Autocli_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// RemoteInfoService provides clients with the information they need
/// to build dynamically CLI clients for remote chains.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Cosmos_Autocli_V1_QueryAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Cosmos_Autocli_V1_QueryClientInterceptorFactoryProtocol? { get }

  func makeAppOptionsCall(
    _ request: Cosmos_Autocli_V1_AppOptionsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Cosmos_Autocli_V1_AppOptionsRequest, Cosmos_Autocli_V1_AppOptionsResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Cosmos_Autocli_V1_QueryAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Cosmos_Autocli_V1_QueryClientMetadata.serviceDescriptor
  }

  internal var interceptors: Cosmos_Autocli_V1_QueryClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeAppOptionsCall(
    _ request: Cosmos_Autocli_V1_AppOptionsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Cosmos_Autocli_V1_AppOptionsRequest, Cosmos_Autocli_V1_AppOptionsResponse> {
    return self.makeAsyncUnaryCall(
      path: Cosmos_Autocli_V1_QueryClientMetadata.Methods.appOptions.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAppOptionsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Cosmos_Autocli_V1_QueryAsyncClientProtocol {
  internal func appOptions(
    _ request: Cosmos_Autocli_V1_AppOptionsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Cosmos_Autocli_V1_AppOptionsResponse {
    return try await self.performAsyncUnaryCall(
      path: Cosmos_Autocli_V1_QueryClientMetadata.Methods.appOptions.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAppOptionsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Cosmos_Autocli_V1_QueryAsyncClient: Cosmos_Autocli_V1_QueryAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Cosmos_Autocli_V1_QueryClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Cosmos_Autocli_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Cosmos_Autocli_V1_QueryClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'appOptions'.
  func makeAppOptionsInterceptors() -> [ClientInterceptor<Cosmos_Autocli_V1_AppOptionsRequest, Cosmos_Autocli_V1_AppOptionsResponse>]
}

internal enum Cosmos_Autocli_V1_QueryClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "cosmos.autocli.v1.Query",
    methods: [
      Cosmos_Autocli_V1_QueryClientMetadata.Methods.appOptions,
    ]
  )

  internal enum Methods {
    internal static let appOptions = GRPCMethodDescriptor(
      name: "AppOptions",
      path: "/cosmos.autocli.v1.Query/AppOptions",
      type: GRPCCallType.unary
    )
  }
}

/// RemoteInfoService provides clients with the information they need
/// to build dynamically CLI clients for remote chains.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Cosmos_Autocli_V1_QueryProvider: CallHandlerProvider {
  var interceptors: Cosmos_Autocli_V1_QueryServerInterceptorFactoryProtocol? { get }

  /// AppOptions returns the autocli options for all of the modules in an app.
  func appOptions(request: Cosmos_Autocli_V1_AppOptionsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Cosmos_Autocli_V1_AppOptionsResponse>
}

extension Cosmos_Autocli_V1_QueryProvider {
  internal var serviceName: Substring {
    return Cosmos_Autocli_V1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "AppOptions":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Cosmos_Autocli_V1_AppOptionsRequest>(),
        responseSerializer: ProtobufSerializer<Cosmos_Autocli_V1_AppOptionsResponse>(),
        interceptors: self.interceptors?.makeAppOptionsInterceptors() ?? [],
        userFunction: self.appOptions(request:context:)
      )

    default:
      return nil
    }
  }
}

/// RemoteInfoService provides clients with the information they need
/// to build dynamically CLI clients for remote chains.
///
/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Cosmos_Autocli_V1_QueryAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Cosmos_Autocli_V1_QueryServerInterceptorFactoryProtocol? { get }

  /// AppOptions returns the autocli options for all of the modules in an app.
  @Sendable func appOptions(
    request: Cosmos_Autocli_V1_AppOptionsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Cosmos_Autocli_V1_AppOptionsResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Cosmos_Autocli_V1_QueryAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Cosmos_Autocli_V1_QueryServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Cosmos_Autocli_V1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Cosmos_Autocli_V1_QueryServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "AppOptions":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Cosmos_Autocli_V1_AppOptionsRequest>(),
        responseSerializer: ProtobufSerializer<Cosmos_Autocli_V1_AppOptionsResponse>(),
        interceptors: self.interceptors?.makeAppOptionsInterceptors() ?? [],
        wrapping: self.appOptions(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Cosmos_Autocli_V1_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'appOptions'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeAppOptionsInterceptors() -> [ServerInterceptor<Cosmos_Autocli_V1_AppOptionsRequest, Cosmos_Autocli_V1_AppOptionsResponse>]
}

internal enum Cosmos_Autocli_V1_QueryServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "cosmos.autocli.v1.Query",
    methods: [
      Cosmos_Autocli_V1_QueryServerMetadata.Methods.appOptions,
    ]
  )

  internal enum Methods {
    internal static let appOptions = GRPCMethodDescriptor(
      name: "AppOptions",
      path: "/cosmos.autocli.v1.Query/AppOptions",
      type: GRPCCallType.unary
    )
  }
}
