//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: comdex/bandoracle/v1beta1/query.proto
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


/// Usage: instantiate `Comdex_Bandoracle_V1beta1_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Comdex_Bandoracle_V1beta1_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Comdex_Bandoracle_V1beta1_QueryClientInterceptorFactoryProtocol? { get }

  func params(
    _ request: Comdex_Bandoracle_V1beta1_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Comdex_Bandoracle_V1beta1_QueryParamsRequest, Comdex_Bandoracle_V1beta1_QueryParamsResponse>

  func fetchPriceResult(
    _ request: Comdex_Bandoracle_V1beta1_QueryFetchPriceRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Comdex_Bandoracle_V1beta1_QueryFetchPriceRequest, Comdex_Bandoracle_V1beta1_QueryFetchPriceResponse>

  func lastFetchPriceID(
    _ request: Comdex_Bandoracle_V1beta1_QueryLastFetchPriceIdRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Comdex_Bandoracle_V1beta1_QueryLastFetchPriceIdRequest, Comdex_Bandoracle_V1beta1_QueryLastFetchPriceIdResponse>

  func fetchPriceData(
    _ request: Comdex_Bandoracle_V1beta1_QueryFetchPriceDataRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Comdex_Bandoracle_V1beta1_QueryFetchPriceDataRequest, Comdex_Bandoracle_V1beta1_QueryFetchPriceDataResponse>

  func discardData(
    _ request: Comdex_Bandoracle_V1beta1_QueryDiscardDataRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Comdex_Bandoracle_V1beta1_QueryDiscardDataRequest, Comdex_Bandoracle_V1beta1_QueryDiscardDataResponse>
}

extension Comdex_Bandoracle_V1beta1_QueryClientProtocol {
  internal var serviceName: String {
    return "comdex.bandoracle.v1beta1.Query"
  }

  /// Unary call to Params
  ///
  /// - Parameters:
  ///   - request: Request to send to Params.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func params(
    _ request: Comdex_Bandoracle_V1beta1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Comdex_Bandoracle_V1beta1_QueryParamsRequest, Comdex_Bandoracle_V1beta1_QueryParamsResponse> {
    return self.makeUnaryCall(
      path: Comdex_Bandoracle_V1beta1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }

  /// Unary call to FetchPriceResult
  ///
  /// - Parameters:
  ///   - request: Request to send to FetchPriceResult.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func fetchPriceResult(
    _ request: Comdex_Bandoracle_V1beta1_QueryFetchPriceRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Comdex_Bandoracle_V1beta1_QueryFetchPriceRequest, Comdex_Bandoracle_V1beta1_QueryFetchPriceResponse> {
    return self.makeUnaryCall(
      path: Comdex_Bandoracle_V1beta1_QueryClientMetadata.Methods.fetchPriceResult.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeFetchPriceResultInterceptors() ?? []
    )
  }

  /// Unary call to LastFetchPriceID
  ///
  /// - Parameters:
  ///   - request: Request to send to LastFetchPriceID.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func lastFetchPriceID(
    _ request: Comdex_Bandoracle_V1beta1_QueryLastFetchPriceIdRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Comdex_Bandoracle_V1beta1_QueryLastFetchPriceIdRequest, Comdex_Bandoracle_V1beta1_QueryLastFetchPriceIdResponse> {
    return self.makeUnaryCall(
      path: Comdex_Bandoracle_V1beta1_QueryClientMetadata.Methods.lastFetchPriceID.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeLastFetchPriceIDInterceptors() ?? []
    )
  }

  /// Unary call to FetchPriceData
  ///
  /// - Parameters:
  ///   - request: Request to send to FetchPriceData.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func fetchPriceData(
    _ request: Comdex_Bandoracle_V1beta1_QueryFetchPriceDataRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Comdex_Bandoracle_V1beta1_QueryFetchPriceDataRequest, Comdex_Bandoracle_V1beta1_QueryFetchPriceDataResponse> {
    return self.makeUnaryCall(
      path: Comdex_Bandoracle_V1beta1_QueryClientMetadata.Methods.fetchPriceData.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeFetchPriceDataInterceptors() ?? []
    )
  }

  /// Unary call to DiscardData
  ///
  /// - Parameters:
  ///   - request: Request to send to DiscardData.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func discardData(
    _ request: Comdex_Bandoracle_V1beta1_QueryDiscardDataRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Comdex_Bandoracle_V1beta1_QueryDiscardDataRequest, Comdex_Bandoracle_V1beta1_QueryDiscardDataResponse> {
    return self.makeUnaryCall(
      path: Comdex_Bandoracle_V1beta1_QueryClientMetadata.Methods.discardData.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDiscardDataInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Comdex_Bandoracle_V1beta1_QueryClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Comdex_Bandoracle_V1beta1_QueryNIOClient")
internal final class Comdex_Bandoracle_V1beta1_QueryClient: Comdex_Bandoracle_V1beta1_QueryClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Comdex_Bandoracle_V1beta1_QueryClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Comdex_Bandoracle_V1beta1_QueryClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the comdex.bandoracle.v1beta1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Comdex_Bandoracle_V1beta1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Comdex_Bandoracle_V1beta1_QueryNIOClient: Comdex_Bandoracle_V1beta1_QueryClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Comdex_Bandoracle_V1beta1_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the comdex.bandoracle.v1beta1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Comdex_Bandoracle_V1beta1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Comdex_Bandoracle_V1beta1_QueryAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Comdex_Bandoracle_V1beta1_QueryClientInterceptorFactoryProtocol? { get }

  func makeParamsCall(
    _ request: Comdex_Bandoracle_V1beta1_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Comdex_Bandoracle_V1beta1_QueryParamsRequest, Comdex_Bandoracle_V1beta1_QueryParamsResponse>

  func makeFetchPriceResultCall(
    _ request: Comdex_Bandoracle_V1beta1_QueryFetchPriceRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Comdex_Bandoracle_V1beta1_QueryFetchPriceRequest, Comdex_Bandoracle_V1beta1_QueryFetchPriceResponse>

  func makeLastFetchPriceIDCall(
    _ request: Comdex_Bandoracle_V1beta1_QueryLastFetchPriceIdRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Comdex_Bandoracle_V1beta1_QueryLastFetchPriceIdRequest, Comdex_Bandoracle_V1beta1_QueryLastFetchPriceIdResponse>

  func makeFetchPriceDataCall(
    _ request: Comdex_Bandoracle_V1beta1_QueryFetchPriceDataRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Comdex_Bandoracle_V1beta1_QueryFetchPriceDataRequest, Comdex_Bandoracle_V1beta1_QueryFetchPriceDataResponse>

  func makeDiscardDataCall(
    _ request: Comdex_Bandoracle_V1beta1_QueryDiscardDataRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Comdex_Bandoracle_V1beta1_QueryDiscardDataRequest, Comdex_Bandoracle_V1beta1_QueryDiscardDataResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Comdex_Bandoracle_V1beta1_QueryAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Comdex_Bandoracle_V1beta1_QueryClientMetadata.serviceDescriptor
  }

  internal var interceptors: Comdex_Bandoracle_V1beta1_QueryClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeParamsCall(
    _ request: Comdex_Bandoracle_V1beta1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Comdex_Bandoracle_V1beta1_QueryParamsRequest, Comdex_Bandoracle_V1beta1_QueryParamsResponse> {
    return self.makeAsyncUnaryCall(
      path: Comdex_Bandoracle_V1beta1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }

  internal func makeFetchPriceResultCall(
    _ request: Comdex_Bandoracle_V1beta1_QueryFetchPriceRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Comdex_Bandoracle_V1beta1_QueryFetchPriceRequest, Comdex_Bandoracle_V1beta1_QueryFetchPriceResponse> {
    return self.makeAsyncUnaryCall(
      path: Comdex_Bandoracle_V1beta1_QueryClientMetadata.Methods.fetchPriceResult.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeFetchPriceResultInterceptors() ?? []
    )
  }

  internal func makeLastFetchPriceIDCall(
    _ request: Comdex_Bandoracle_V1beta1_QueryLastFetchPriceIdRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Comdex_Bandoracle_V1beta1_QueryLastFetchPriceIdRequest, Comdex_Bandoracle_V1beta1_QueryLastFetchPriceIdResponse> {
    return self.makeAsyncUnaryCall(
      path: Comdex_Bandoracle_V1beta1_QueryClientMetadata.Methods.lastFetchPriceID.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeLastFetchPriceIDInterceptors() ?? []
    )
  }

  internal func makeFetchPriceDataCall(
    _ request: Comdex_Bandoracle_V1beta1_QueryFetchPriceDataRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Comdex_Bandoracle_V1beta1_QueryFetchPriceDataRequest, Comdex_Bandoracle_V1beta1_QueryFetchPriceDataResponse> {
    return self.makeAsyncUnaryCall(
      path: Comdex_Bandoracle_V1beta1_QueryClientMetadata.Methods.fetchPriceData.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeFetchPriceDataInterceptors() ?? []
    )
  }

  internal func makeDiscardDataCall(
    _ request: Comdex_Bandoracle_V1beta1_QueryDiscardDataRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Comdex_Bandoracle_V1beta1_QueryDiscardDataRequest, Comdex_Bandoracle_V1beta1_QueryDiscardDataResponse> {
    return self.makeAsyncUnaryCall(
      path: Comdex_Bandoracle_V1beta1_QueryClientMetadata.Methods.discardData.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDiscardDataInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Comdex_Bandoracle_V1beta1_QueryAsyncClientProtocol {
  internal func params(
    _ request: Comdex_Bandoracle_V1beta1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Comdex_Bandoracle_V1beta1_QueryParamsResponse {
    return try await self.performAsyncUnaryCall(
      path: Comdex_Bandoracle_V1beta1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }

  internal func fetchPriceResult(
    _ request: Comdex_Bandoracle_V1beta1_QueryFetchPriceRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Comdex_Bandoracle_V1beta1_QueryFetchPriceResponse {
    return try await self.performAsyncUnaryCall(
      path: Comdex_Bandoracle_V1beta1_QueryClientMetadata.Methods.fetchPriceResult.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeFetchPriceResultInterceptors() ?? []
    )
  }

  internal func lastFetchPriceID(
    _ request: Comdex_Bandoracle_V1beta1_QueryLastFetchPriceIdRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Comdex_Bandoracle_V1beta1_QueryLastFetchPriceIdResponse {
    return try await self.performAsyncUnaryCall(
      path: Comdex_Bandoracle_V1beta1_QueryClientMetadata.Methods.lastFetchPriceID.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeLastFetchPriceIDInterceptors() ?? []
    )
  }

  internal func fetchPriceData(
    _ request: Comdex_Bandoracle_V1beta1_QueryFetchPriceDataRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Comdex_Bandoracle_V1beta1_QueryFetchPriceDataResponse {
    return try await self.performAsyncUnaryCall(
      path: Comdex_Bandoracle_V1beta1_QueryClientMetadata.Methods.fetchPriceData.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeFetchPriceDataInterceptors() ?? []
    )
  }

  internal func discardData(
    _ request: Comdex_Bandoracle_V1beta1_QueryDiscardDataRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Comdex_Bandoracle_V1beta1_QueryDiscardDataResponse {
    return try await self.performAsyncUnaryCall(
      path: Comdex_Bandoracle_V1beta1_QueryClientMetadata.Methods.discardData.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDiscardDataInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Comdex_Bandoracle_V1beta1_QueryAsyncClient: Comdex_Bandoracle_V1beta1_QueryAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Comdex_Bandoracle_V1beta1_QueryClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Comdex_Bandoracle_V1beta1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Comdex_Bandoracle_V1beta1_QueryClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'params'.
  func makeParamsInterceptors() -> [ClientInterceptor<Comdex_Bandoracle_V1beta1_QueryParamsRequest, Comdex_Bandoracle_V1beta1_QueryParamsResponse>]

  /// - Returns: Interceptors to use when invoking 'fetchPriceResult'.
  func makeFetchPriceResultInterceptors() -> [ClientInterceptor<Comdex_Bandoracle_V1beta1_QueryFetchPriceRequest, Comdex_Bandoracle_V1beta1_QueryFetchPriceResponse>]

  /// - Returns: Interceptors to use when invoking 'lastFetchPriceID'.
  func makeLastFetchPriceIDInterceptors() -> [ClientInterceptor<Comdex_Bandoracle_V1beta1_QueryLastFetchPriceIdRequest, Comdex_Bandoracle_V1beta1_QueryLastFetchPriceIdResponse>]

  /// - Returns: Interceptors to use when invoking 'fetchPriceData'.
  func makeFetchPriceDataInterceptors() -> [ClientInterceptor<Comdex_Bandoracle_V1beta1_QueryFetchPriceDataRequest, Comdex_Bandoracle_V1beta1_QueryFetchPriceDataResponse>]

  /// - Returns: Interceptors to use when invoking 'discardData'.
  func makeDiscardDataInterceptors() -> [ClientInterceptor<Comdex_Bandoracle_V1beta1_QueryDiscardDataRequest, Comdex_Bandoracle_V1beta1_QueryDiscardDataResponse>]
}

internal enum Comdex_Bandoracle_V1beta1_QueryClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "comdex.bandoracle.v1beta1.Query",
    methods: [
      Comdex_Bandoracle_V1beta1_QueryClientMetadata.Methods.params,
      Comdex_Bandoracle_V1beta1_QueryClientMetadata.Methods.fetchPriceResult,
      Comdex_Bandoracle_V1beta1_QueryClientMetadata.Methods.lastFetchPriceID,
      Comdex_Bandoracle_V1beta1_QueryClientMetadata.Methods.fetchPriceData,
      Comdex_Bandoracle_V1beta1_QueryClientMetadata.Methods.discardData,
    ]
  )

  internal enum Methods {
    internal static let params = GRPCMethodDescriptor(
      name: "Params",
      path: "/comdex.bandoracle.v1beta1.Query/Params",
      type: GRPCCallType.unary
    )

    internal static let fetchPriceResult = GRPCMethodDescriptor(
      name: "FetchPriceResult",
      path: "/comdex.bandoracle.v1beta1.Query/FetchPriceResult",
      type: GRPCCallType.unary
    )

    internal static let lastFetchPriceID = GRPCMethodDescriptor(
      name: "LastFetchPriceID",
      path: "/comdex.bandoracle.v1beta1.Query/LastFetchPriceID",
      type: GRPCCallType.unary
    )

    internal static let fetchPriceData = GRPCMethodDescriptor(
      name: "FetchPriceData",
      path: "/comdex.bandoracle.v1beta1.Query/FetchPriceData",
      type: GRPCCallType.unary
    )

    internal static let discardData = GRPCMethodDescriptor(
      name: "DiscardData",
      path: "/comdex.bandoracle.v1beta1.Query/DiscardData",
      type: GRPCCallType.unary
    )
  }
}

/// To build a server, implement a class that conforms to this protocol.
internal protocol Comdex_Bandoracle_V1beta1_QueryProvider: CallHandlerProvider {
  var interceptors: Comdex_Bandoracle_V1beta1_QueryServerInterceptorFactoryProtocol? { get }

  func params(request: Comdex_Bandoracle_V1beta1_QueryParamsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Comdex_Bandoracle_V1beta1_QueryParamsResponse>

  func fetchPriceResult(request: Comdex_Bandoracle_V1beta1_QueryFetchPriceRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Comdex_Bandoracle_V1beta1_QueryFetchPriceResponse>

  func lastFetchPriceID(request: Comdex_Bandoracle_V1beta1_QueryLastFetchPriceIdRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Comdex_Bandoracle_V1beta1_QueryLastFetchPriceIdResponse>

  func fetchPriceData(request: Comdex_Bandoracle_V1beta1_QueryFetchPriceDataRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Comdex_Bandoracle_V1beta1_QueryFetchPriceDataResponse>

  func discardData(request: Comdex_Bandoracle_V1beta1_QueryDiscardDataRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Comdex_Bandoracle_V1beta1_QueryDiscardDataResponse>
}

extension Comdex_Bandoracle_V1beta1_QueryProvider {
  internal var serviceName: Substring {
    return Comdex_Bandoracle_V1beta1_QueryServerMetadata.serviceDescriptor.fullName[...]
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
        requestDeserializer: ProtobufDeserializer<Comdex_Bandoracle_V1beta1_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Comdex_Bandoracle_V1beta1_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        userFunction: self.params(request:context:)
      )

    case "FetchPriceResult":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Comdex_Bandoracle_V1beta1_QueryFetchPriceRequest>(),
        responseSerializer: ProtobufSerializer<Comdex_Bandoracle_V1beta1_QueryFetchPriceResponse>(),
        interceptors: self.interceptors?.makeFetchPriceResultInterceptors() ?? [],
        userFunction: self.fetchPriceResult(request:context:)
      )

    case "LastFetchPriceID":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Comdex_Bandoracle_V1beta1_QueryLastFetchPriceIdRequest>(),
        responseSerializer: ProtobufSerializer<Comdex_Bandoracle_V1beta1_QueryLastFetchPriceIdResponse>(),
        interceptors: self.interceptors?.makeLastFetchPriceIDInterceptors() ?? [],
        userFunction: self.lastFetchPriceID(request:context:)
      )

    case "FetchPriceData":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Comdex_Bandoracle_V1beta1_QueryFetchPriceDataRequest>(),
        responseSerializer: ProtobufSerializer<Comdex_Bandoracle_V1beta1_QueryFetchPriceDataResponse>(),
        interceptors: self.interceptors?.makeFetchPriceDataInterceptors() ?? [],
        userFunction: self.fetchPriceData(request:context:)
      )

    case "DiscardData":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Comdex_Bandoracle_V1beta1_QueryDiscardDataRequest>(),
        responseSerializer: ProtobufSerializer<Comdex_Bandoracle_V1beta1_QueryDiscardDataResponse>(),
        interceptors: self.interceptors?.makeDiscardDataInterceptors() ?? [],
        userFunction: self.discardData(request:context:)
      )

    default:
      return nil
    }
  }
}

/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Comdex_Bandoracle_V1beta1_QueryAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Comdex_Bandoracle_V1beta1_QueryServerInterceptorFactoryProtocol? { get }

  @Sendable func params(
    request: Comdex_Bandoracle_V1beta1_QueryParamsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Comdex_Bandoracle_V1beta1_QueryParamsResponse

  @Sendable func fetchPriceResult(
    request: Comdex_Bandoracle_V1beta1_QueryFetchPriceRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Comdex_Bandoracle_V1beta1_QueryFetchPriceResponse

  @Sendable func lastFetchPriceID(
    request: Comdex_Bandoracle_V1beta1_QueryLastFetchPriceIdRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Comdex_Bandoracle_V1beta1_QueryLastFetchPriceIdResponse

  @Sendable func fetchPriceData(
    request: Comdex_Bandoracle_V1beta1_QueryFetchPriceDataRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Comdex_Bandoracle_V1beta1_QueryFetchPriceDataResponse

  @Sendable func discardData(
    request: Comdex_Bandoracle_V1beta1_QueryDiscardDataRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Comdex_Bandoracle_V1beta1_QueryDiscardDataResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Comdex_Bandoracle_V1beta1_QueryAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Comdex_Bandoracle_V1beta1_QueryServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Comdex_Bandoracle_V1beta1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Comdex_Bandoracle_V1beta1_QueryServerInterceptorFactoryProtocol? {
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
        requestDeserializer: ProtobufDeserializer<Comdex_Bandoracle_V1beta1_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Comdex_Bandoracle_V1beta1_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        wrapping: self.params(request:context:)
      )

    case "FetchPriceResult":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Comdex_Bandoracle_V1beta1_QueryFetchPriceRequest>(),
        responseSerializer: ProtobufSerializer<Comdex_Bandoracle_V1beta1_QueryFetchPriceResponse>(),
        interceptors: self.interceptors?.makeFetchPriceResultInterceptors() ?? [],
        wrapping: self.fetchPriceResult(request:context:)
      )

    case "LastFetchPriceID":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Comdex_Bandoracle_V1beta1_QueryLastFetchPriceIdRequest>(),
        responseSerializer: ProtobufSerializer<Comdex_Bandoracle_V1beta1_QueryLastFetchPriceIdResponse>(),
        interceptors: self.interceptors?.makeLastFetchPriceIDInterceptors() ?? [],
        wrapping: self.lastFetchPriceID(request:context:)
      )

    case "FetchPriceData":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Comdex_Bandoracle_V1beta1_QueryFetchPriceDataRequest>(),
        responseSerializer: ProtobufSerializer<Comdex_Bandoracle_V1beta1_QueryFetchPriceDataResponse>(),
        interceptors: self.interceptors?.makeFetchPriceDataInterceptors() ?? [],
        wrapping: self.fetchPriceData(request:context:)
      )

    case "DiscardData":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Comdex_Bandoracle_V1beta1_QueryDiscardDataRequest>(),
        responseSerializer: ProtobufSerializer<Comdex_Bandoracle_V1beta1_QueryDiscardDataResponse>(),
        interceptors: self.interceptors?.makeDiscardDataInterceptors() ?? [],
        wrapping: self.discardData(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Comdex_Bandoracle_V1beta1_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'params'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeParamsInterceptors() -> [ServerInterceptor<Comdex_Bandoracle_V1beta1_QueryParamsRequest, Comdex_Bandoracle_V1beta1_QueryParamsResponse>]

  /// - Returns: Interceptors to use when handling 'fetchPriceResult'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeFetchPriceResultInterceptors() -> [ServerInterceptor<Comdex_Bandoracle_V1beta1_QueryFetchPriceRequest, Comdex_Bandoracle_V1beta1_QueryFetchPriceResponse>]

  /// - Returns: Interceptors to use when handling 'lastFetchPriceID'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeLastFetchPriceIDInterceptors() -> [ServerInterceptor<Comdex_Bandoracle_V1beta1_QueryLastFetchPriceIdRequest, Comdex_Bandoracle_V1beta1_QueryLastFetchPriceIdResponse>]

  /// - Returns: Interceptors to use when handling 'fetchPriceData'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeFetchPriceDataInterceptors() -> [ServerInterceptor<Comdex_Bandoracle_V1beta1_QueryFetchPriceDataRequest, Comdex_Bandoracle_V1beta1_QueryFetchPriceDataResponse>]

  /// - Returns: Interceptors to use when handling 'discardData'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeDiscardDataInterceptors() -> [ServerInterceptor<Comdex_Bandoracle_V1beta1_QueryDiscardDataRequest, Comdex_Bandoracle_V1beta1_QueryDiscardDataResponse>]
}

internal enum Comdex_Bandoracle_V1beta1_QueryServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "comdex.bandoracle.v1beta1.Query",
    methods: [
      Comdex_Bandoracle_V1beta1_QueryServerMetadata.Methods.params,
      Comdex_Bandoracle_V1beta1_QueryServerMetadata.Methods.fetchPriceResult,
      Comdex_Bandoracle_V1beta1_QueryServerMetadata.Methods.lastFetchPriceID,
      Comdex_Bandoracle_V1beta1_QueryServerMetadata.Methods.fetchPriceData,
      Comdex_Bandoracle_V1beta1_QueryServerMetadata.Methods.discardData,
    ]
  )

  internal enum Methods {
    internal static let params = GRPCMethodDescriptor(
      name: "Params",
      path: "/comdex.bandoracle.v1beta1.Query/Params",
      type: GRPCCallType.unary
    )

    internal static let fetchPriceResult = GRPCMethodDescriptor(
      name: "FetchPriceResult",
      path: "/comdex.bandoracle.v1beta1.Query/FetchPriceResult",
      type: GRPCCallType.unary
    )

    internal static let lastFetchPriceID = GRPCMethodDescriptor(
      name: "LastFetchPriceID",
      path: "/comdex.bandoracle.v1beta1.Query/LastFetchPriceID",
      type: GRPCCallType.unary
    )

    internal static let fetchPriceData = GRPCMethodDescriptor(
      name: "FetchPriceData",
      path: "/comdex.bandoracle.v1beta1.Query/FetchPriceData",
      type: GRPCCallType.unary
    )

    internal static let discardData = GRPCMethodDescriptor(
      name: "DiscardData",
      path: "/comdex.bandoracle.v1beta1.Query/DiscardData",
      type: GRPCCallType.unary
    )
  }
}
