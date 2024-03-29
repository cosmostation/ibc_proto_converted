//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: umee/uibc/v1/query.proto
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
/// Usage: instantiate `Umee_Uibc_V1_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Umee_Uibc_V1_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Umee_Uibc_V1_QueryClientInterceptorFactoryProtocol? { get }

  func params(
    _ request: Umee_Uibc_V1_QueryParams,
    callOptions: CallOptions?
  ) -> UnaryCall<Umee_Uibc_V1_QueryParams, Umee_Uibc_V1_QueryParamsResponse>

  func outflows(
    _ request: Umee_Uibc_V1_QueryOutflows,
    callOptions: CallOptions?
  ) -> UnaryCall<Umee_Uibc_V1_QueryOutflows, Umee_Uibc_V1_QueryOutflowsResponse>

  func allOutflows(
    _ request: Umee_Uibc_V1_QueryAllOutflows,
    callOptions: CallOptions?
  ) -> UnaryCall<Umee_Uibc_V1_QueryAllOutflows, Umee_Uibc_V1_QueryAllOutflowsResponse>
}

extension Umee_Uibc_V1_QueryClientProtocol {
  internal var serviceName: String {
    return "umee.uibc.v1.Query"
  }

  /// Params queries the parameters of the x/uibc module.
  ///
  /// - Parameters:
  ///   - request: Request to send to Params.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func params(
    _ request: Umee_Uibc_V1_QueryParams,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Umee_Uibc_V1_QueryParams, Umee_Uibc_V1_QueryParamsResponse> {
    return self.makeUnaryCall(
      path: Umee_Uibc_V1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }

  /// Outflow returns IBC denom outflows in the current quota period.
  /// If denom is not specified, returns sum of all registered outflows.
  ///
  /// - Parameters:
  ///   - request: Request to send to Outflows.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func outflows(
    _ request: Umee_Uibc_V1_QueryOutflows,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Umee_Uibc_V1_QueryOutflows, Umee_Uibc_V1_QueryOutflowsResponse> {
    return self.makeUnaryCall(
      path: Umee_Uibc_V1_QueryClientMetadata.Methods.outflows.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeOutflowsInterceptors() ?? []
    )
  }

  /// AllOutflow returns outflows for each denom in the current quota period.
  ///
  /// - Parameters:
  ///   - request: Request to send to AllOutflows.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func allOutflows(
    _ request: Umee_Uibc_V1_QueryAllOutflows,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Umee_Uibc_V1_QueryAllOutflows, Umee_Uibc_V1_QueryAllOutflowsResponse> {
    return self.makeUnaryCall(
      path: Umee_Uibc_V1_QueryClientMetadata.Methods.allOutflows.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAllOutflowsInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Umee_Uibc_V1_QueryClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Umee_Uibc_V1_QueryNIOClient")
internal final class Umee_Uibc_V1_QueryClient: Umee_Uibc_V1_QueryClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Umee_Uibc_V1_QueryClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Umee_Uibc_V1_QueryClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the umee.uibc.v1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Umee_Uibc_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Umee_Uibc_V1_QueryNIOClient: Umee_Uibc_V1_QueryClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Umee_Uibc_V1_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the umee.uibc.v1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Umee_Uibc_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query defines the gRPC querier service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Umee_Uibc_V1_QueryAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Umee_Uibc_V1_QueryClientInterceptorFactoryProtocol? { get }

  func makeParamsCall(
    _ request: Umee_Uibc_V1_QueryParams,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Umee_Uibc_V1_QueryParams, Umee_Uibc_V1_QueryParamsResponse>

  func makeOutflowsCall(
    _ request: Umee_Uibc_V1_QueryOutflows,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Umee_Uibc_V1_QueryOutflows, Umee_Uibc_V1_QueryOutflowsResponse>

  func makeAllOutflowsCall(
    _ request: Umee_Uibc_V1_QueryAllOutflows,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Umee_Uibc_V1_QueryAllOutflows, Umee_Uibc_V1_QueryAllOutflowsResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Umee_Uibc_V1_QueryAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Umee_Uibc_V1_QueryClientMetadata.serviceDescriptor
  }

  internal var interceptors: Umee_Uibc_V1_QueryClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeParamsCall(
    _ request: Umee_Uibc_V1_QueryParams,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Umee_Uibc_V1_QueryParams, Umee_Uibc_V1_QueryParamsResponse> {
    return self.makeAsyncUnaryCall(
      path: Umee_Uibc_V1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }

  internal func makeOutflowsCall(
    _ request: Umee_Uibc_V1_QueryOutflows,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Umee_Uibc_V1_QueryOutflows, Umee_Uibc_V1_QueryOutflowsResponse> {
    return self.makeAsyncUnaryCall(
      path: Umee_Uibc_V1_QueryClientMetadata.Methods.outflows.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeOutflowsInterceptors() ?? []
    )
  }

  internal func makeAllOutflowsCall(
    _ request: Umee_Uibc_V1_QueryAllOutflows,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Umee_Uibc_V1_QueryAllOutflows, Umee_Uibc_V1_QueryAllOutflowsResponse> {
    return self.makeAsyncUnaryCall(
      path: Umee_Uibc_V1_QueryClientMetadata.Methods.allOutflows.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAllOutflowsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Umee_Uibc_V1_QueryAsyncClientProtocol {
  internal func params(
    _ request: Umee_Uibc_V1_QueryParams,
    callOptions: CallOptions? = nil
  ) async throws -> Umee_Uibc_V1_QueryParamsResponse {
    return try await self.performAsyncUnaryCall(
      path: Umee_Uibc_V1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }

  internal func outflows(
    _ request: Umee_Uibc_V1_QueryOutflows,
    callOptions: CallOptions? = nil
  ) async throws -> Umee_Uibc_V1_QueryOutflowsResponse {
    return try await self.performAsyncUnaryCall(
      path: Umee_Uibc_V1_QueryClientMetadata.Methods.outflows.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeOutflowsInterceptors() ?? []
    )
  }

  internal func allOutflows(
    _ request: Umee_Uibc_V1_QueryAllOutflows,
    callOptions: CallOptions? = nil
  ) async throws -> Umee_Uibc_V1_QueryAllOutflowsResponse {
    return try await self.performAsyncUnaryCall(
      path: Umee_Uibc_V1_QueryClientMetadata.Methods.allOutflows.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAllOutflowsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Umee_Uibc_V1_QueryAsyncClient: Umee_Uibc_V1_QueryAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Umee_Uibc_V1_QueryClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Umee_Uibc_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Umee_Uibc_V1_QueryClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'params'.
  func makeParamsInterceptors() -> [ClientInterceptor<Umee_Uibc_V1_QueryParams, Umee_Uibc_V1_QueryParamsResponse>]

  /// - Returns: Interceptors to use when invoking 'outflows'.
  func makeOutflowsInterceptors() -> [ClientInterceptor<Umee_Uibc_V1_QueryOutflows, Umee_Uibc_V1_QueryOutflowsResponse>]

  /// - Returns: Interceptors to use when invoking 'allOutflows'.
  func makeAllOutflowsInterceptors() -> [ClientInterceptor<Umee_Uibc_V1_QueryAllOutflows, Umee_Uibc_V1_QueryAllOutflowsResponse>]
}

internal enum Umee_Uibc_V1_QueryClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "umee.uibc.v1.Query",
    methods: [
      Umee_Uibc_V1_QueryClientMetadata.Methods.params,
      Umee_Uibc_V1_QueryClientMetadata.Methods.outflows,
      Umee_Uibc_V1_QueryClientMetadata.Methods.allOutflows,
    ]
  )

  internal enum Methods {
    internal static let params = GRPCMethodDescriptor(
      name: "Params",
      path: "/umee.uibc.v1.Query/Params",
      type: GRPCCallType.unary
    )

    internal static let outflows = GRPCMethodDescriptor(
      name: "Outflows",
      path: "/umee.uibc.v1.Query/Outflows",
      type: GRPCCallType.unary
    )

    internal static let allOutflows = GRPCMethodDescriptor(
      name: "AllOutflows",
      path: "/umee.uibc.v1.Query/AllOutflows",
      type: GRPCCallType.unary
    )
  }
}

/// Query defines the gRPC querier service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Umee_Uibc_V1_QueryProvider: CallHandlerProvider {
  var interceptors: Umee_Uibc_V1_QueryServerInterceptorFactoryProtocol? { get }

  /// Params queries the parameters of the x/uibc module.
  func params(request: Umee_Uibc_V1_QueryParams, context: StatusOnlyCallContext) -> EventLoopFuture<Umee_Uibc_V1_QueryParamsResponse>

  /// Outflow returns IBC denom outflows in the current quota period.
  /// If denom is not specified, returns sum of all registered outflows.
  func outflows(request: Umee_Uibc_V1_QueryOutflows, context: StatusOnlyCallContext) -> EventLoopFuture<Umee_Uibc_V1_QueryOutflowsResponse>

  /// AllOutflow returns outflows for each denom in the current quota period.
  func allOutflows(request: Umee_Uibc_V1_QueryAllOutflows, context: StatusOnlyCallContext) -> EventLoopFuture<Umee_Uibc_V1_QueryAllOutflowsResponse>
}

extension Umee_Uibc_V1_QueryProvider {
  internal var serviceName: Substring {
    return Umee_Uibc_V1_QueryServerMetadata.serviceDescriptor.fullName[...]
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
        requestDeserializer: ProtobufDeserializer<Umee_Uibc_V1_QueryParams>(),
        responseSerializer: ProtobufSerializer<Umee_Uibc_V1_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        userFunction: self.params(request:context:)
      )

    case "Outflows":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Umee_Uibc_V1_QueryOutflows>(),
        responseSerializer: ProtobufSerializer<Umee_Uibc_V1_QueryOutflowsResponse>(),
        interceptors: self.interceptors?.makeOutflowsInterceptors() ?? [],
        userFunction: self.outflows(request:context:)
      )

    case "AllOutflows":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Umee_Uibc_V1_QueryAllOutflows>(),
        responseSerializer: ProtobufSerializer<Umee_Uibc_V1_QueryAllOutflowsResponse>(),
        interceptors: self.interceptors?.makeAllOutflowsInterceptors() ?? [],
        userFunction: self.allOutflows(request:context:)
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
internal protocol Umee_Uibc_V1_QueryAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Umee_Uibc_V1_QueryServerInterceptorFactoryProtocol? { get }

  /// Params queries the parameters of the x/uibc module.
  @Sendable func params(
    request: Umee_Uibc_V1_QueryParams,
    context: GRPCAsyncServerCallContext
  ) async throws -> Umee_Uibc_V1_QueryParamsResponse

  /// Outflow returns IBC denom outflows in the current quota period.
  /// If denom is not specified, returns sum of all registered outflows.
  @Sendable func outflows(
    request: Umee_Uibc_V1_QueryOutflows,
    context: GRPCAsyncServerCallContext
  ) async throws -> Umee_Uibc_V1_QueryOutflowsResponse

  /// AllOutflow returns outflows for each denom in the current quota period.
  @Sendable func allOutflows(
    request: Umee_Uibc_V1_QueryAllOutflows,
    context: GRPCAsyncServerCallContext
  ) async throws -> Umee_Uibc_V1_QueryAllOutflowsResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Umee_Uibc_V1_QueryAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Umee_Uibc_V1_QueryServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Umee_Uibc_V1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Umee_Uibc_V1_QueryServerInterceptorFactoryProtocol? {
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
        requestDeserializer: ProtobufDeserializer<Umee_Uibc_V1_QueryParams>(),
        responseSerializer: ProtobufSerializer<Umee_Uibc_V1_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        wrapping: self.params(request:context:)
      )

    case "Outflows":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Umee_Uibc_V1_QueryOutflows>(),
        responseSerializer: ProtobufSerializer<Umee_Uibc_V1_QueryOutflowsResponse>(),
        interceptors: self.interceptors?.makeOutflowsInterceptors() ?? [],
        wrapping: self.outflows(request:context:)
      )

    case "AllOutflows":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Umee_Uibc_V1_QueryAllOutflows>(),
        responseSerializer: ProtobufSerializer<Umee_Uibc_V1_QueryAllOutflowsResponse>(),
        interceptors: self.interceptors?.makeAllOutflowsInterceptors() ?? [],
        wrapping: self.allOutflows(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Umee_Uibc_V1_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'params'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeParamsInterceptors() -> [ServerInterceptor<Umee_Uibc_V1_QueryParams, Umee_Uibc_V1_QueryParamsResponse>]

  /// - Returns: Interceptors to use when handling 'outflows'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeOutflowsInterceptors() -> [ServerInterceptor<Umee_Uibc_V1_QueryOutflows, Umee_Uibc_V1_QueryOutflowsResponse>]

  /// - Returns: Interceptors to use when handling 'allOutflows'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeAllOutflowsInterceptors() -> [ServerInterceptor<Umee_Uibc_V1_QueryAllOutflows, Umee_Uibc_V1_QueryAllOutflowsResponse>]
}

internal enum Umee_Uibc_V1_QueryServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "umee.uibc.v1.Query",
    methods: [
      Umee_Uibc_V1_QueryServerMetadata.Methods.params,
      Umee_Uibc_V1_QueryServerMetadata.Methods.outflows,
      Umee_Uibc_V1_QueryServerMetadata.Methods.allOutflows,
    ]
  )

  internal enum Methods {
    internal static let params = GRPCMethodDescriptor(
      name: "Params",
      path: "/umee.uibc.v1.Query/Params",
      type: GRPCCallType.unary
    )

    internal static let outflows = GRPCMethodDescriptor(
      name: "Outflows",
      path: "/umee.uibc.v1.Query/Outflows",
      type: GRPCCallType.unary
    )

    internal static let allOutflows = GRPCMethodDescriptor(
      name: "AllOutflows",
      path: "/umee.uibc.v1.Query/AllOutflows",
      type: GRPCCallType.unary
    )
  }
}
