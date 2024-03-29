//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: kava/auction/v1beta1/query.proto
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


/// Query defines the gRPC querier service for auction module
///
/// Usage: instantiate `Kava_Auction_V1beta1_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Kava_Auction_V1beta1_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Kava_Auction_V1beta1_QueryClientInterceptorFactoryProtocol? { get }

  func params(
    _ request: Kava_Auction_V1beta1_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Kava_Auction_V1beta1_QueryParamsRequest, Kava_Auction_V1beta1_QueryParamsResponse>

  func auction(
    _ request: Kava_Auction_V1beta1_QueryAuctionRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Kava_Auction_V1beta1_QueryAuctionRequest, Kava_Auction_V1beta1_QueryAuctionResponse>

  func auctions(
    _ request: Kava_Auction_V1beta1_QueryAuctionsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Kava_Auction_V1beta1_QueryAuctionsRequest, Kava_Auction_V1beta1_QueryAuctionsResponse>

  func nextAuctionID(
    _ request: Kava_Auction_V1beta1_QueryNextAuctionIDRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Kava_Auction_V1beta1_QueryNextAuctionIDRequest, Kava_Auction_V1beta1_QueryNextAuctionIDResponse>
}

extension Kava_Auction_V1beta1_QueryClientProtocol {
  internal var serviceName: String {
    return "kava.auction.v1beta1.Query"
  }

  /// Params queries all parameters of the auction module.
  ///
  /// - Parameters:
  ///   - request: Request to send to Params.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func params(
    _ request: Kava_Auction_V1beta1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Kava_Auction_V1beta1_QueryParamsRequest, Kava_Auction_V1beta1_QueryParamsResponse> {
    return self.makeUnaryCall(
      path: Kava_Auction_V1beta1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }

  /// Auction queries an individual Auction by auction ID
  ///
  /// - Parameters:
  ///   - request: Request to send to Auction.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func auction(
    _ request: Kava_Auction_V1beta1_QueryAuctionRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Kava_Auction_V1beta1_QueryAuctionRequest, Kava_Auction_V1beta1_QueryAuctionResponse> {
    return self.makeUnaryCall(
      path: Kava_Auction_V1beta1_QueryClientMetadata.Methods.auction.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAuctionInterceptors() ?? []
    )
  }

  /// Auctions queries auctions filtered by asset denom, owner address, phase, and auction type
  ///
  /// - Parameters:
  ///   - request: Request to send to Auctions.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func auctions(
    _ request: Kava_Auction_V1beta1_QueryAuctionsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Kava_Auction_V1beta1_QueryAuctionsRequest, Kava_Auction_V1beta1_QueryAuctionsResponse> {
    return self.makeUnaryCall(
      path: Kava_Auction_V1beta1_QueryClientMetadata.Methods.auctions.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAuctionsInterceptors() ?? []
    )
  }

  /// NextAuctionID queries the next auction ID
  ///
  /// - Parameters:
  ///   - request: Request to send to NextAuctionID.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func nextAuctionID(
    _ request: Kava_Auction_V1beta1_QueryNextAuctionIDRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Kava_Auction_V1beta1_QueryNextAuctionIDRequest, Kava_Auction_V1beta1_QueryNextAuctionIDResponse> {
    return self.makeUnaryCall(
      path: Kava_Auction_V1beta1_QueryClientMetadata.Methods.nextAuctionID.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeNextAuctionIDInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Kava_Auction_V1beta1_QueryClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Kava_Auction_V1beta1_QueryNIOClient")
internal final class Kava_Auction_V1beta1_QueryClient: Kava_Auction_V1beta1_QueryClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Kava_Auction_V1beta1_QueryClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Kava_Auction_V1beta1_QueryClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the kava.auction.v1beta1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Kava_Auction_V1beta1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Kava_Auction_V1beta1_QueryNIOClient: Kava_Auction_V1beta1_QueryClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Kava_Auction_V1beta1_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the kava.auction.v1beta1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Kava_Auction_V1beta1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query defines the gRPC querier service for auction module
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Kava_Auction_V1beta1_QueryAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Kava_Auction_V1beta1_QueryClientInterceptorFactoryProtocol? { get }

  func makeParamsCall(
    _ request: Kava_Auction_V1beta1_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Kava_Auction_V1beta1_QueryParamsRequest, Kava_Auction_V1beta1_QueryParamsResponse>

  func makeAuctionCall(
    _ request: Kava_Auction_V1beta1_QueryAuctionRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Kava_Auction_V1beta1_QueryAuctionRequest, Kava_Auction_V1beta1_QueryAuctionResponse>

  func makeAuctionsCall(
    _ request: Kava_Auction_V1beta1_QueryAuctionsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Kava_Auction_V1beta1_QueryAuctionsRequest, Kava_Auction_V1beta1_QueryAuctionsResponse>

  func makeNextAuctionIDCall(
    _ request: Kava_Auction_V1beta1_QueryNextAuctionIDRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Kava_Auction_V1beta1_QueryNextAuctionIDRequest, Kava_Auction_V1beta1_QueryNextAuctionIDResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Kava_Auction_V1beta1_QueryAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Kava_Auction_V1beta1_QueryClientMetadata.serviceDescriptor
  }

  internal var interceptors: Kava_Auction_V1beta1_QueryClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeParamsCall(
    _ request: Kava_Auction_V1beta1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Kava_Auction_V1beta1_QueryParamsRequest, Kava_Auction_V1beta1_QueryParamsResponse> {
    return self.makeAsyncUnaryCall(
      path: Kava_Auction_V1beta1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }

  internal func makeAuctionCall(
    _ request: Kava_Auction_V1beta1_QueryAuctionRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Kava_Auction_V1beta1_QueryAuctionRequest, Kava_Auction_V1beta1_QueryAuctionResponse> {
    return self.makeAsyncUnaryCall(
      path: Kava_Auction_V1beta1_QueryClientMetadata.Methods.auction.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAuctionInterceptors() ?? []
    )
  }

  internal func makeAuctionsCall(
    _ request: Kava_Auction_V1beta1_QueryAuctionsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Kava_Auction_V1beta1_QueryAuctionsRequest, Kava_Auction_V1beta1_QueryAuctionsResponse> {
    return self.makeAsyncUnaryCall(
      path: Kava_Auction_V1beta1_QueryClientMetadata.Methods.auctions.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAuctionsInterceptors() ?? []
    )
  }

  internal func makeNextAuctionIDCall(
    _ request: Kava_Auction_V1beta1_QueryNextAuctionIDRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Kava_Auction_V1beta1_QueryNextAuctionIDRequest, Kava_Auction_V1beta1_QueryNextAuctionIDResponse> {
    return self.makeAsyncUnaryCall(
      path: Kava_Auction_V1beta1_QueryClientMetadata.Methods.nextAuctionID.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeNextAuctionIDInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Kava_Auction_V1beta1_QueryAsyncClientProtocol {
  internal func params(
    _ request: Kava_Auction_V1beta1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Kava_Auction_V1beta1_QueryParamsResponse {
    return try await self.performAsyncUnaryCall(
      path: Kava_Auction_V1beta1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }

  internal func auction(
    _ request: Kava_Auction_V1beta1_QueryAuctionRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Kava_Auction_V1beta1_QueryAuctionResponse {
    return try await self.performAsyncUnaryCall(
      path: Kava_Auction_V1beta1_QueryClientMetadata.Methods.auction.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAuctionInterceptors() ?? []
    )
  }

  internal func auctions(
    _ request: Kava_Auction_V1beta1_QueryAuctionsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Kava_Auction_V1beta1_QueryAuctionsResponse {
    return try await self.performAsyncUnaryCall(
      path: Kava_Auction_V1beta1_QueryClientMetadata.Methods.auctions.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAuctionsInterceptors() ?? []
    )
  }

  internal func nextAuctionID(
    _ request: Kava_Auction_V1beta1_QueryNextAuctionIDRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Kava_Auction_V1beta1_QueryNextAuctionIDResponse {
    return try await self.performAsyncUnaryCall(
      path: Kava_Auction_V1beta1_QueryClientMetadata.Methods.nextAuctionID.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeNextAuctionIDInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Kava_Auction_V1beta1_QueryAsyncClient: Kava_Auction_V1beta1_QueryAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Kava_Auction_V1beta1_QueryClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Kava_Auction_V1beta1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Kava_Auction_V1beta1_QueryClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'params'.
  func makeParamsInterceptors() -> [ClientInterceptor<Kava_Auction_V1beta1_QueryParamsRequest, Kava_Auction_V1beta1_QueryParamsResponse>]

  /// - Returns: Interceptors to use when invoking 'auction'.
  func makeAuctionInterceptors() -> [ClientInterceptor<Kava_Auction_V1beta1_QueryAuctionRequest, Kava_Auction_V1beta1_QueryAuctionResponse>]

  /// - Returns: Interceptors to use when invoking 'auctions'.
  func makeAuctionsInterceptors() -> [ClientInterceptor<Kava_Auction_V1beta1_QueryAuctionsRequest, Kava_Auction_V1beta1_QueryAuctionsResponse>]

  /// - Returns: Interceptors to use when invoking 'nextAuctionID'.
  func makeNextAuctionIDInterceptors() -> [ClientInterceptor<Kava_Auction_V1beta1_QueryNextAuctionIDRequest, Kava_Auction_V1beta1_QueryNextAuctionIDResponse>]
}

internal enum Kava_Auction_V1beta1_QueryClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "kava.auction.v1beta1.Query",
    methods: [
      Kava_Auction_V1beta1_QueryClientMetadata.Methods.params,
      Kava_Auction_V1beta1_QueryClientMetadata.Methods.auction,
      Kava_Auction_V1beta1_QueryClientMetadata.Methods.auctions,
      Kava_Auction_V1beta1_QueryClientMetadata.Methods.nextAuctionID,
    ]
  )

  internal enum Methods {
    internal static let params = GRPCMethodDescriptor(
      name: "Params",
      path: "/kava.auction.v1beta1.Query/Params",
      type: GRPCCallType.unary
    )

    internal static let auction = GRPCMethodDescriptor(
      name: "Auction",
      path: "/kava.auction.v1beta1.Query/Auction",
      type: GRPCCallType.unary
    )

    internal static let auctions = GRPCMethodDescriptor(
      name: "Auctions",
      path: "/kava.auction.v1beta1.Query/Auctions",
      type: GRPCCallType.unary
    )

    internal static let nextAuctionID = GRPCMethodDescriptor(
      name: "NextAuctionID",
      path: "/kava.auction.v1beta1.Query/NextAuctionID",
      type: GRPCCallType.unary
    )
  }
}

/// Query defines the gRPC querier service for auction module
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Kava_Auction_V1beta1_QueryProvider: CallHandlerProvider {
  var interceptors: Kava_Auction_V1beta1_QueryServerInterceptorFactoryProtocol? { get }

  /// Params queries all parameters of the auction module.
  func params(request: Kava_Auction_V1beta1_QueryParamsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Kava_Auction_V1beta1_QueryParamsResponse>

  /// Auction queries an individual Auction by auction ID
  func auction(request: Kava_Auction_V1beta1_QueryAuctionRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Kava_Auction_V1beta1_QueryAuctionResponse>

  /// Auctions queries auctions filtered by asset denom, owner address, phase, and auction type
  func auctions(request: Kava_Auction_V1beta1_QueryAuctionsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Kava_Auction_V1beta1_QueryAuctionsResponse>

  /// NextAuctionID queries the next auction ID
  func nextAuctionID(request: Kava_Auction_V1beta1_QueryNextAuctionIDRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Kava_Auction_V1beta1_QueryNextAuctionIDResponse>
}

extension Kava_Auction_V1beta1_QueryProvider {
  internal var serviceName: Substring {
    return Kava_Auction_V1beta1_QueryServerMetadata.serviceDescriptor.fullName[...]
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
        requestDeserializer: ProtobufDeserializer<Kava_Auction_V1beta1_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Kava_Auction_V1beta1_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        userFunction: self.params(request:context:)
      )

    case "Auction":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kava_Auction_V1beta1_QueryAuctionRequest>(),
        responseSerializer: ProtobufSerializer<Kava_Auction_V1beta1_QueryAuctionResponse>(),
        interceptors: self.interceptors?.makeAuctionInterceptors() ?? [],
        userFunction: self.auction(request:context:)
      )

    case "Auctions":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kava_Auction_V1beta1_QueryAuctionsRequest>(),
        responseSerializer: ProtobufSerializer<Kava_Auction_V1beta1_QueryAuctionsResponse>(),
        interceptors: self.interceptors?.makeAuctionsInterceptors() ?? [],
        userFunction: self.auctions(request:context:)
      )

    case "NextAuctionID":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kava_Auction_V1beta1_QueryNextAuctionIDRequest>(),
        responseSerializer: ProtobufSerializer<Kava_Auction_V1beta1_QueryNextAuctionIDResponse>(),
        interceptors: self.interceptors?.makeNextAuctionIDInterceptors() ?? [],
        userFunction: self.nextAuctionID(request:context:)
      )

    default:
      return nil
    }
  }
}

/// Query defines the gRPC querier service for auction module
///
/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Kava_Auction_V1beta1_QueryAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Kava_Auction_V1beta1_QueryServerInterceptorFactoryProtocol? { get }

  /// Params queries all parameters of the auction module.
  @Sendable func params(
    request: Kava_Auction_V1beta1_QueryParamsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Kava_Auction_V1beta1_QueryParamsResponse

  /// Auction queries an individual Auction by auction ID
  @Sendable func auction(
    request: Kava_Auction_V1beta1_QueryAuctionRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Kava_Auction_V1beta1_QueryAuctionResponse

  /// Auctions queries auctions filtered by asset denom, owner address, phase, and auction type
  @Sendable func auctions(
    request: Kava_Auction_V1beta1_QueryAuctionsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Kava_Auction_V1beta1_QueryAuctionsResponse

  /// NextAuctionID queries the next auction ID
  @Sendable func nextAuctionID(
    request: Kava_Auction_V1beta1_QueryNextAuctionIDRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Kava_Auction_V1beta1_QueryNextAuctionIDResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Kava_Auction_V1beta1_QueryAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Kava_Auction_V1beta1_QueryServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Kava_Auction_V1beta1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Kava_Auction_V1beta1_QueryServerInterceptorFactoryProtocol? {
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
        requestDeserializer: ProtobufDeserializer<Kava_Auction_V1beta1_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Kava_Auction_V1beta1_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        wrapping: self.params(request:context:)
      )

    case "Auction":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kava_Auction_V1beta1_QueryAuctionRequest>(),
        responseSerializer: ProtobufSerializer<Kava_Auction_V1beta1_QueryAuctionResponse>(),
        interceptors: self.interceptors?.makeAuctionInterceptors() ?? [],
        wrapping: self.auction(request:context:)
      )

    case "Auctions":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kava_Auction_V1beta1_QueryAuctionsRequest>(),
        responseSerializer: ProtobufSerializer<Kava_Auction_V1beta1_QueryAuctionsResponse>(),
        interceptors: self.interceptors?.makeAuctionsInterceptors() ?? [],
        wrapping: self.auctions(request:context:)
      )

    case "NextAuctionID":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kava_Auction_V1beta1_QueryNextAuctionIDRequest>(),
        responseSerializer: ProtobufSerializer<Kava_Auction_V1beta1_QueryNextAuctionIDResponse>(),
        interceptors: self.interceptors?.makeNextAuctionIDInterceptors() ?? [],
        wrapping: self.nextAuctionID(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Kava_Auction_V1beta1_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'params'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeParamsInterceptors() -> [ServerInterceptor<Kava_Auction_V1beta1_QueryParamsRequest, Kava_Auction_V1beta1_QueryParamsResponse>]

  /// - Returns: Interceptors to use when handling 'auction'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeAuctionInterceptors() -> [ServerInterceptor<Kava_Auction_V1beta1_QueryAuctionRequest, Kava_Auction_V1beta1_QueryAuctionResponse>]

  /// - Returns: Interceptors to use when handling 'auctions'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeAuctionsInterceptors() -> [ServerInterceptor<Kava_Auction_V1beta1_QueryAuctionsRequest, Kava_Auction_V1beta1_QueryAuctionsResponse>]

  /// - Returns: Interceptors to use when handling 'nextAuctionID'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeNextAuctionIDInterceptors() -> [ServerInterceptor<Kava_Auction_V1beta1_QueryNextAuctionIDRequest, Kava_Auction_V1beta1_QueryNextAuctionIDResponse>]
}

internal enum Kava_Auction_V1beta1_QueryServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "kava.auction.v1beta1.Query",
    methods: [
      Kava_Auction_V1beta1_QueryServerMetadata.Methods.params,
      Kava_Auction_V1beta1_QueryServerMetadata.Methods.auction,
      Kava_Auction_V1beta1_QueryServerMetadata.Methods.auctions,
      Kava_Auction_V1beta1_QueryServerMetadata.Methods.nextAuctionID,
    ]
  )

  internal enum Methods {
    internal static let params = GRPCMethodDescriptor(
      name: "Params",
      path: "/kava.auction.v1beta1.Query/Params",
      type: GRPCCallType.unary
    )

    internal static let auction = GRPCMethodDescriptor(
      name: "Auction",
      path: "/kava.auction.v1beta1.Query/Auction",
      type: GRPCCallType.unary
    )

    internal static let auctions = GRPCMethodDescriptor(
      name: "Auctions",
      path: "/kava.auction.v1beta1.Query/Auctions",
      type: GRPCCallType.unary
    )

    internal static let nextAuctionID = GRPCMethodDescriptor(
      name: "NextAuctionID",
      path: "/kava.auction.v1beta1.Query/NextAuctionID",
      type: GRPCCallType.unary
    )
  }
}
