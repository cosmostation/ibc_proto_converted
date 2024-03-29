//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: irismod/htlc/query.proto
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


/// Query provides defines the gRPC querier service
///
/// Usage: instantiate `Irismod_Htlc_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Irismod_Htlc_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Irismod_Htlc_QueryClientInterceptorFactoryProtocol? { get }

  func hTLC(
    _ request: Irismod_Htlc_QueryHTLCRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Irismod_Htlc_QueryHTLCRequest, Irismod_Htlc_QueryHTLCResponse>

  func assetSupply(
    _ request: Irismod_Htlc_QueryAssetSupplyRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Irismod_Htlc_QueryAssetSupplyRequest, Irismod_Htlc_QueryAssetSupplyResponse>

  func assetSupplies(
    _ request: Irismod_Htlc_QueryAssetSuppliesRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Irismod_Htlc_QueryAssetSuppliesRequest, Irismod_Htlc_QueryAssetSuppliesResponse>

  func params(
    _ request: Irismod_Htlc_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Irismod_Htlc_QueryParamsRequest, Irismod_Htlc_QueryParamsResponse>
}

extension Irismod_Htlc_QueryClientProtocol {
  internal var serviceName: String {
    return "irismod.htlc.Query"
  }

  /// HTLC queries the HTLC by the specified hash lock
  ///
  /// - Parameters:
  ///   - request: Request to send to HTLC.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func hTLC(
    _ request: Irismod_Htlc_QueryHTLCRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Irismod_Htlc_QueryHTLCRequest, Irismod_Htlc_QueryHTLCResponse> {
    return self.makeUnaryCall(
      path: Irismod_Htlc_QueryClientMetadata.Methods.hTLC.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeHTLCInterceptors() ?? []
    )
  }

  /// AssetSupply queries the supply of an asset
  ///
  /// - Parameters:
  ///   - request: Request to send to AssetSupply.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func assetSupply(
    _ request: Irismod_Htlc_QueryAssetSupplyRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Irismod_Htlc_QueryAssetSupplyRequest, Irismod_Htlc_QueryAssetSupplyResponse> {
    return self.makeUnaryCall(
      path: Irismod_Htlc_QueryClientMetadata.Methods.assetSupply.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAssetSupplyInterceptors() ?? []
    )
  }

  /// AssetSupplies queries the supplies of all assets
  ///
  /// - Parameters:
  ///   - request: Request to send to AssetSupplies.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func assetSupplies(
    _ request: Irismod_Htlc_QueryAssetSuppliesRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Irismod_Htlc_QueryAssetSuppliesRequest, Irismod_Htlc_QueryAssetSuppliesResponse> {
    return self.makeUnaryCall(
      path: Irismod_Htlc_QueryClientMetadata.Methods.assetSupplies.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAssetSuppliesInterceptors() ?? []
    )
  }

  /// Params queries the htlc parameters
  ///
  /// - Parameters:
  ///   - request: Request to send to Params.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func params(
    _ request: Irismod_Htlc_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Irismod_Htlc_QueryParamsRequest, Irismod_Htlc_QueryParamsResponse> {
    return self.makeUnaryCall(
      path: Irismod_Htlc_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Irismod_Htlc_QueryClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Irismod_Htlc_QueryNIOClient")
internal final class Irismod_Htlc_QueryClient: Irismod_Htlc_QueryClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Irismod_Htlc_QueryClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Irismod_Htlc_QueryClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the irismod.htlc.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Irismod_Htlc_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Irismod_Htlc_QueryNIOClient: Irismod_Htlc_QueryClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Irismod_Htlc_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the irismod.htlc.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Irismod_Htlc_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query provides defines the gRPC querier service
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Irismod_Htlc_QueryAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Irismod_Htlc_QueryClientInterceptorFactoryProtocol? { get }

  func makeHtlcCall(
    _ request: Irismod_Htlc_QueryHTLCRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Irismod_Htlc_QueryHTLCRequest, Irismod_Htlc_QueryHTLCResponse>

  func makeAssetSupplyCall(
    _ request: Irismod_Htlc_QueryAssetSupplyRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Irismod_Htlc_QueryAssetSupplyRequest, Irismod_Htlc_QueryAssetSupplyResponse>

  func makeAssetSuppliesCall(
    _ request: Irismod_Htlc_QueryAssetSuppliesRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Irismod_Htlc_QueryAssetSuppliesRequest, Irismod_Htlc_QueryAssetSuppliesResponse>

  func makeParamsCall(
    _ request: Irismod_Htlc_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Irismod_Htlc_QueryParamsRequest, Irismod_Htlc_QueryParamsResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Irismod_Htlc_QueryAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Irismod_Htlc_QueryClientMetadata.serviceDescriptor
  }

  internal var interceptors: Irismod_Htlc_QueryClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeHtlcCall(
    _ request: Irismod_Htlc_QueryHTLCRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Irismod_Htlc_QueryHTLCRequest, Irismod_Htlc_QueryHTLCResponse> {
    return self.makeAsyncUnaryCall(
      path: Irismod_Htlc_QueryClientMetadata.Methods.hTLC.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeHTLCInterceptors() ?? []
    )
  }

  internal func makeAssetSupplyCall(
    _ request: Irismod_Htlc_QueryAssetSupplyRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Irismod_Htlc_QueryAssetSupplyRequest, Irismod_Htlc_QueryAssetSupplyResponse> {
    return self.makeAsyncUnaryCall(
      path: Irismod_Htlc_QueryClientMetadata.Methods.assetSupply.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAssetSupplyInterceptors() ?? []
    )
  }

  internal func makeAssetSuppliesCall(
    _ request: Irismod_Htlc_QueryAssetSuppliesRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Irismod_Htlc_QueryAssetSuppliesRequest, Irismod_Htlc_QueryAssetSuppliesResponse> {
    return self.makeAsyncUnaryCall(
      path: Irismod_Htlc_QueryClientMetadata.Methods.assetSupplies.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAssetSuppliesInterceptors() ?? []
    )
  }

  internal func makeParamsCall(
    _ request: Irismod_Htlc_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Irismod_Htlc_QueryParamsRequest, Irismod_Htlc_QueryParamsResponse> {
    return self.makeAsyncUnaryCall(
      path: Irismod_Htlc_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Irismod_Htlc_QueryAsyncClientProtocol {
  internal func hTLC(
    _ request: Irismod_Htlc_QueryHTLCRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Irismod_Htlc_QueryHTLCResponse {
    return try await self.performAsyncUnaryCall(
      path: Irismod_Htlc_QueryClientMetadata.Methods.hTLC.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeHTLCInterceptors() ?? []
    )
  }

  internal func assetSupply(
    _ request: Irismod_Htlc_QueryAssetSupplyRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Irismod_Htlc_QueryAssetSupplyResponse {
    return try await self.performAsyncUnaryCall(
      path: Irismod_Htlc_QueryClientMetadata.Methods.assetSupply.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAssetSupplyInterceptors() ?? []
    )
  }

  internal func assetSupplies(
    _ request: Irismod_Htlc_QueryAssetSuppliesRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Irismod_Htlc_QueryAssetSuppliesResponse {
    return try await self.performAsyncUnaryCall(
      path: Irismod_Htlc_QueryClientMetadata.Methods.assetSupplies.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAssetSuppliesInterceptors() ?? []
    )
  }

  internal func params(
    _ request: Irismod_Htlc_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Irismod_Htlc_QueryParamsResponse {
    return try await self.performAsyncUnaryCall(
      path: Irismod_Htlc_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Irismod_Htlc_QueryAsyncClient: Irismod_Htlc_QueryAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Irismod_Htlc_QueryClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Irismod_Htlc_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Irismod_Htlc_QueryClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'hTLC'.
  func makeHTLCInterceptors() -> [ClientInterceptor<Irismod_Htlc_QueryHTLCRequest, Irismod_Htlc_QueryHTLCResponse>]

  /// - Returns: Interceptors to use when invoking 'assetSupply'.
  func makeAssetSupplyInterceptors() -> [ClientInterceptor<Irismod_Htlc_QueryAssetSupplyRequest, Irismod_Htlc_QueryAssetSupplyResponse>]

  /// - Returns: Interceptors to use when invoking 'assetSupplies'.
  func makeAssetSuppliesInterceptors() -> [ClientInterceptor<Irismod_Htlc_QueryAssetSuppliesRequest, Irismod_Htlc_QueryAssetSuppliesResponse>]

  /// - Returns: Interceptors to use when invoking 'params'.
  func makeParamsInterceptors() -> [ClientInterceptor<Irismod_Htlc_QueryParamsRequest, Irismod_Htlc_QueryParamsResponse>]
}

internal enum Irismod_Htlc_QueryClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "irismod.htlc.Query",
    methods: [
      Irismod_Htlc_QueryClientMetadata.Methods.hTLC,
      Irismod_Htlc_QueryClientMetadata.Methods.assetSupply,
      Irismod_Htlc_QueryClientMetadata.Methods.assetSupplies,
      Irismod_Htlc_QueryClientMetadata.Methods.params,
    ]
  )

  internal enum Methods {
    internal static let hTLC = GRPCMethodDescriptor(
      name: "HTLC",
      path: "/irismod.htlc.Query/HTLC",
      type: GRPCCallType.unary
    )

    internal static let assetSupply = GRPCMethodDescriptor(
      name: "AssetSupply",
      path: "/irismod.htlc.Query/AssetSupply",
      type: GRPCCallType.unary
    )

    internal static let assetSupplies = GRPCMethodDescriptor(
      name: "AssetSupplies",
      path: "/irismod.htlc.Query/AssetSupplies",
      type: GRPCCallType.unary
    )

    internal static let params = GRPCMethodDescriptor(
      name: "Params",
      path: "/irismod.htlc.Query/Params",
      type: GRPCCallType.unary
    )
  }
}

/// Query provides defines the gRPC querier service
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Irismod_Htlc_QueryProvider: CallHandlerProvider {
  var interceptors: Irismod_Htlc_QueryServerInterceptorFactoryProtocol? { get }

  /// HTLC queries the HTLC by the specified hash lock
  func hTLC(request: Irismod_Htlc_QueryHTLCRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Irismod_Htlc_QueryHTLCResponse>

  /// AssetSupply queries the supply of an asset
  func assetSupply(request: Irismod_Htlc_QueryAssetSupplyRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Irismod_Htlc_QueryAssetSupplyResponse>

  /// AssetSupplies queries the supplies of all assets
  func assetSupplies(request: Irismod_Htlc_QueryAssetSuppliesRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Irismod_Htlc_QueryAssetSuppliesResponse>

  /// Params queries the htlc parameters
  func params(request: Irismod_Htlc_QueryParamsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Irismod_Htlc_QueryParamsResponse>
}

extension Irismod_Htlc_QueryProvider {
  internal var serviceName: Substring {
    return Irismod_Htlc_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "HTLC":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Irismod_Htlc_QueryHTLCRequest>(),
        responseSerializer: ProtobufSerializer<Irismod_Htlc_QueryHTLCResponse>(),
        interceptors: self.interceptors?.makeHTLCInterceptors() ?? [],
        userFunction: self.hTLC(request:context:)
      )

    case "AssetSupply":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Irismod_Htlc_QueryAssetSupplyRequest>(),
        responseSerializer: ProtobufSerializer<Irismod_Htlc_QueryAssetSupplyResponse>(),
        interceptors: self.interceptors?.makeAssetSupplyInterceptors() ?? [],
        userFunction: self.assetSupply(request:context:)
      )

    case "AssetSupplies":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Irismod_Htlc_QueryAssetSuppliesRequest>(),
        responseSerializer: ProtobufSerializer<Irismod_Htlc_QueryAssetSuppliesResponse>(),
        interceptors: self.interceptors?.makeAssetSuppliesInterceptors() ?? [],
        userFunction: self.assetSupplies(request:context:)
      )

    case "Params":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Irismod_Htlc_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Irismod_Htlc_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        userFunction: self.params(request:context:)
      )

    default:
      return nil
    }
  }
}

/// Query provides defines the gRPC querier service
///
/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Irismod_Htlc_QueryAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Irismod_Htlc_QueryServerInterceptorFactoryProtocol? { get }

  /// HTLC queries the HTLC by the specified hash lock
  @Sendable func hTLC(
    request: Irismod_Htlc_QueryHTLCRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Irismod_Htlc_QueryHTLCResponse

  /// AssetSupply queries the supply of an asset
  @Sendable func assetSupply(
    request: Irismod_Htlc_QueryAssetSupplyRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Irismod_Htlc_QueryAssetSupplyResponse

  /// AssetSupplies queries the supplies of all assets
  @Sendable func assetSupplies(
    request: Irismod_Htlc_QueryAssetSuppliesRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Irismod_Htlc_QueryAssetSuppliesResponse

  /// Params queries the htlc parameters
  @Sendable func params(
    request: Irismod_Htlc_QueryParamsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Irismod_Htlc_QueryParamsResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Irismod_Htlc_QueryAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Irismod_Htlc_QueryServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Irismod_Htlc_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Irismod_Htlc_QueryServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "HTLC":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Irismod_Htlc_QueryHTLCRequest>(),
        responseSerializer: ProtobufSerializer<Irismod_Htlc_QueryHTLCResponse>(),
        interceptors: self.interceptors?.makeHTLCInterceptors() ?? [],
        wrapping: self.hTLC(request:context:)
      )

    case "AssetSupply":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Irismod_Htlc_QueryAssetSupplyRequest>(),
        responseSerializer: ProtobufSerializer<Irismod_Htlc_QueryAssetSupplyResponse>(),
        interceptors: self.interceptors?.makeAssetSupplyInterceptors() ?? [],
        wrapping: self.assetSupply(request:context:)
      )

    case "AssetSupplies":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Irismod_Htlc_QueryAssetSuppliesRequest>(),
        responseSerializer: ProtobufSerializer<Irismod_Htlc_QueryAssetSuppliesResponse>(),
        interceptors: self.interceptors?.makeAssetSuppliesInterceptors() ?? [],
        wrapping: self.assetSupplies(request:context:)
      )

    case "Params":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Irismod_Htlc_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Irismod_Htlc_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        wrapping: self.params(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Irismod_Htlc_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'hTLC'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeHTLCInterceptors() -> [ServerInterceptor<Irismod_Htlc_QueryHTLCRequest, Irismod_Htlc_QueryHTLCResponse>]

  /// - Returns: Interceptors to use when handling 'assetSupply'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeAssetSupplyInterceptors() -> [ServerInterceptor<Irismod_Htlc_QueryAssetSupplyRequest, Irismod_Htlc_QueryAssetSupplyResponse>]

  /// - Returns: Interceptors to use when handling 'assetSupplies'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeAssetSuppliesInterceptors() -> [ServerInterceptor<Irismod_Htlc_QueryAssetSuppliesRequest, Irismod_Htlc_QueryAssetSuppliesResponse>]

  /// - Returns: Interceptors to use when handling 'params'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeParamsInterceptors() -> [ServerInterceptor<Irismod_Htlc_QueryParamsRequest, Irismod_Htlc_QueryParamsResponse>]
}

internal enum Irismod_Htlc_QueryServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "irismod.htlc.Query",
    methods: [
      Irismod_Htlc_QueryServerMetadata.Methods.hTLC,
      Irismod_Htlc_QueryServerMetadata.Methods.assetSupply,
      Irismod_Htlc_QueryServerMetadata.Methods.assetSupplies,
      Irismod_Htlc_QueryServerMetadata.Methods.params,
    ]
  )

  internal enum Methods {
    internal static let hTLC = GRPCMethodDescriptor(
      name: "HTLC",
      path: "/irismod.htlc.Query/HTLC",
      type: GRPCCallType.unary
    )

    internal static let assetSupply = GRPCMethodDescriptor(
      name: "AssetSupply",
      path: "/irismod.htlc.Query/AssetSupply",
      type: GRPCCallType.unary
    )

    internal static let assetSupplies = GRPCMethodDescriptor(
      name: "AssetSupplies",
      path: "/irismod.htlc.Query/AssetSupplies",
      type: GRPCCallType.unary
    )

    internal static let params = GRPCMethodDescriptor(
      name: "Params",
      path: "/irismod.htlc.Query/Params",
      type: GRPCCallType.unary
    )
  }
}
