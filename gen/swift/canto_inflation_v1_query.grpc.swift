//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: canto/inflation/v1/query.proto
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


/// Query provides defines the gRPC querier service.
///
/// Usage: instantiate `Canto_Inflation_V1_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Canto_Inflation_V1_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Canto_Inflation_V1_QueryClientInterceptorFactoryProtocol? { get }

  func period(
    _ request: Canto_Inflation_V1_QueryPeriodRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Canto_Inflation_V1_QueryPeriodRequest, Canto_Inflation_V1_QueryPeriodResponse>

  func epochMintProvision(
    _ request: Canto_Inflation_V1_QueryEpochMintProvisionRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Canto_Inflation_V1_QueryEpochMintProvisionRequest, Canto_Inflation_V1_QueryEpochMintProvisionResponse>

  func skippedEpochs(
    _ request: Canto_Inflation_V1_QuerySkippedEpochsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Canto_Inflation_V1_QuerySkippedEpochsRequest, Canto_Inflation_V1_QuerySkippedEpochsResponse>

  func circulatingSupply(
    _ request: Canto_Inflation_V1_QueryCirculatingSupplyRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Canto_Inflation_V1_QueryCirculatingSupplyRequest, Canto_Inflation_V1_QueryCirculatingSupplyResponse>

  func inflationRate(
    _ request: Canto_Inflation_V1_QueryInflationRateRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Canto_Inflation_V1_QueryInflationRateRequest, Canto_Inflation_V1_QueryInflationRateResponse>

  func params(
    _ request: Canto_Inflation_V1_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Canto_Inflation_V1_QueryParamsRequest, Canto_Inflation_V1_QueryParamsResponse>
}

extension Canto_Inflation_V1_QueryClientProtocol {
  internal var serviceName: String {
    return "canto.inflation.v1.Query"
  }

  /// Period retrieves current period.
  ///
  /// - Parameters:
  ///   - request: Request to send to Period.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func period(
    _ request: Canto_Inflation_V1_QueryPeriodRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Canto_Inflation_V1_QueryPeriodRequest, Canto_Inflation_V1_QueryPeriodResponse> {
    return self.makeUnaryCall(
      path: Canto_Inflation_V1_QueryClientMetadata.Methods.period.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makePeriodInterceptors() ?? []
    )
  }

  /// EpochMintProvision retrieves current minting epoch provision value.
  ///
  /// - Parameters:
  ///   - request: Request to send to EpochMintProvision.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func epochMintProvision(
    _ request: Canto_Inflation_V1_QueryEpochMintProvisionRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Canto_Inflation_V1_QueryEpochMintProvisionRequest, Canto_Inflation_V1_QueryEpochMintProvisionResponse> {
    return self.makeUnaryCall(
      path: Canto_Inflation_V1_QueryClientMetadata.Methods.epochMintProvision.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeEpochMintProvisionInterceptors() ?? []
    )
  }

  /// SkippedEpochs retrieves the total number of skipped epochs.
  ///
  /// - Parameters:
  ///   - request: Request to send to SkippedEpochs.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func skippedEpochs(
    _ request: Canto_Inflation_V1_QuerySkippedEpochsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Canto_Inflation_V1_QuerySkippedEpochsRequest, Canto_Inflation_V1_QuerySkippedEpochsResponse> {
    return self.makeUnaryCall(
      path: Canto_Inflation_V1_QueryClientMetadata.Methods.skippedEpochs.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSkippedEpochsInterceptors() ?? []
    )
  }

  /// CirculatingSupply retrieves the total number of tokens that are in
  /// circulation (i.e. excluding unvested tokens).
  ///
  /// - Parameters:
  ///   - request: Request to send to CirculatingSupply.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func circulatingSupply(
    _ request: Canto_Inflation_V1_QueryCirculatingSupplyRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Canto_Inflation_V1_QueryCirculatingSupplyRequest, Canto_Inflation_V1_QueryCirculatingSupplyResponse> {
    return self.makeUnaryCall(
      path: Canto_Inflation_V1_QueryClientMetadata.Methods.circulatingSupply.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCirculatingSupplyInterceptors() ?? []
    )
  }

  /// InflationRate retrieves the inflation rate of the current period.
  ///
  /// - Parameters:
  ///   - request: Request to send to InflationRate.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func inflationRate(
    _ request: Canto_Inflation_V1_QueryInflationRateRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Canto_Inflation_V1_QueryInflationRateRequest, Canto_Inflation_V1_QueryInflationRateResponse> {
    return self.makeUnaryCall(
      path: Canto_Inflation_V1_QueryClientMetadata.Methods.inflationRate.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeInflationRateInterceptors() ?? []
    )
  }

  /// Params retrieves the total set of minting parameters.
  ///
  /// - Parameters:
  ///   - request: Request to send to Params.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func params(
    _ request: Canto_Inflation_V1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Canto_Inflation_V1_QueryParamsRequest, Canto_Inflation_V1_QueryParamsResponse> {
    return self.makeUnaryCall(
      path: Canto_Inflation_V1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Canto_Inflation_V1_QueryClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Canto_Inflation_V1_QueryNIOClient")
internal final class Canto_Inflation_V1_QueryClient: Canto_Inflation_V1_QueryClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Canto_Inflation_V1_QueryClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Canto_Inflation_V1_QueryClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the canto.inflation.v1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Canto_Inflation_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Canto_Inflation_V1_QueryNIOClient: Canto_Inflation_V1_QueryClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Canto_Inflation_V1_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the canto.inflation.v1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Canto_Inflation_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query provides defines the gRPC querier service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Canto_Inflation_V1_QueryAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Canto_Inflation_V1_QueryClientInterceptorFactoryProtocol? { get }

  func makePeriodCall(
    _ request: Canto_Inflation_V1_QueryPeriodRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Canto_Inflation_V1_QueryPeriodRequest, Canto_Inflation_V1_QueryPeriodResponse>

  func makeEpochMintProvisionCall(
    _ request: Canto_Inflation_V1_QueryEpochMintProvisionRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Canto_Inflation_V1_QueryEpochMintProvisionRequest, Canto_Inflation_V1_QueryEpochMintProvisionResponse>

  func makeSkippedEpochsCall(
    _ request: Canto_Inflation_V1_QuerySkippedEpochsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Canto_Inflation_V1_QuerySkippedEpochsRequest, Canto_Inflation_V1_QuerySkippedEpochsResponse>

  func makeCirculatingSupplyCall(
    _ request: Canto_Inflation_V1_QueryCirculatingSupplyRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Canto_Inflation_V1_QueryCirculatingSupplyRequest, Canto_Inflation_V1_QueryCirculatingSupplyResponse>

  func makeInflationRateCall(
    _ request: Canto_Inflation_V1_QueryInflationRateRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Canto_Inflation_V1_QueryInflationRateRequest, Canto_Inflation_V1_QueryInflationRateResponse>

  func makeParamsCall(
    _ request: Canto_Inflation_V1_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Canto_Inflation_V1_QueryParamsRequest, Canto_Inflation_V1_QueryParamsResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Canto_Inflation_V1_QueryAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Canto_Inflation_V1_QueryClientMetadata.serviceDescriptor
  }

  internal var interceptors: Canto_Inflation_V1_QueryClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makePeriodCall(
    _ request: Canto_Inflation_V1_QueryPeriodRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Canto_Inflation_V1_QueryPeriodRequest, Canto_Inflation_V1_QueryPeriodResponse> {
    return self.makeAsyncUnaryCall(
      path: Canto_Inflation_V1_QueryClientMetadata.Methods.period.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makePeriodInterceptors() ?? []
    )
  }

  internal func makeEpochMintProvisionCall(
    _ request: Canto_Inflation_V1_QueryEpochMintProvisionRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Canto_Inflation_V1_QueryEpochMintProvisionRequest, Canto_Inflation_V1_QueryEpochMintProvisionResponse> {
    return self.makeAsyncUnaryCall(
      path: Canto_Inflation_V1_QueryClientMetadata.Methods.epochMintProvision.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeEpochMintProvisionInterceptors() ?? []
    )
  }

  internal func makeSkippedEpochsCall(
    _ request: Canto_Inflation_V1_QuerySkippedEpochsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Canto_Inflation_V1_QuerySkippedEpochsRequest, Canto_Inflation_V1_QuerySkippedEpochsResponse> {
    return self.makeAsyncUnaryCall(
      path: Canto_Inflation_V1_QueryClientMetadata.Methods.skippedEpochs.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSkippedEpochsInterceptors() ?? []
    )
  }

  internal func makeCirculatingSupplyCall(
    _ request: Canto_Inflation_V1_QueryCirculatingSupplyRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Canto_Inflation_V1_QueryCirculatingSupplyRequest, Canto_Inflation_V1_QueryCirculatingSupplyResponse> {
    return self.makeAsyncUnaryCall(
      path: Canto_Inflation_V1_QueryClientMetadata.Methods.circulatingSupply.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCirculatingSupplyInterceptors() ?? []
    )
  }

  internal func makeInflationRateCall(
    _ request: Canto_Inflation_V1_QueryInflationRateRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Canto_Inflation_V1_QueryInflationRateRequest, Canto_Inflation_V1_QueryInflationRateResponse> {
    return self.makeAsyncUnaryCall(
      path: Canto_Inflation_V1_QueryClientMetadata.Methods.inflationRate.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeInflationRateInterceptors() ?? []
    )
  }

  internal func makeParamsCall(
    _ request: Canto_Inflation_V1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Canto_Inflation_V1_QueryParamsRequest, Canto_Inflation_V1_QueryParamsResponse> {
    return self.makeAsyncUnaryCall(
      path: Canto_Inflation_V1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Canto_Inflation_V1_QueryAsyncClientProtocol {
  internal func period(
    _ request: Canto_Inflation_V1_QueryPeriodRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Canto_Inflation_V1_QueryPeriodResponse {
    return try await self.performAsyncUnaryCall(
      path: Canto_Inflation_V1_QueryClientMetadata.Methods.period.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makePeriodInterceptors() ?? []
    )
  }

  internal func epochMintProvision(
    _ request: Canto_Inflation_V1_QueryEpochMintProvisionRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Canto_Inflation_V1_QueryEpochMintProvisionResponse {
    return try await self.performAsyncUnaryCall(
      path: Canto_Inflation_V1_QueryClientMetadata.Methods.epochMintProvision.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeEpochMintProvisionInterceptors() ?? []
    )
  }

  internal func skippedEpochs(
    _ request: Canto_Inflation_V1_QuerySkippedEpochsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Canto_Inflation_V1_QuerySkippedEpochsResponse {
    return try await self.performAsyncUnaryCall(
      path: Canto_Inflation_V1_QueryClientMetadata.Methods.skippedEpochs.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSkippedEpochsInterceptors() ?? []
    )
  }

  internal func circulatingSupply(
    _ request: Canto_Inflation_V1_QueryCirculatingSupplyRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Canto_Inflation_V1_QueryCirculatingSupplyResponse {
    return try await self.performAsyncUnaryCall(
      path: Canto_Inflation_V1_QueryClientMetadata.Methods.circulatingSupply.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCirculatingSupplyInterceptors() ?? []
    )
  }

  internal func inflationRate(
    _ request: Canto_Inflation_V1_QueryInflationRateRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Canto_Inflation_V1_QueryInflationRateResponse {
    return try await self.performAsyncUnaryCall(
      path: Canto_Inflation_V1_QueryClientMetadata.Methods.inflationRate.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeInflationRateInterceptors() ?? []
    )
  }

  internal func params(
    _ request: Canto_Inflation_V1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Canto_Inflation_V1_QueryParamsResponse {
    return try await self.performAsyncUnaryCall(
      path: Canto_Inflation_V1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Canto_Inflation_V1_QueryAsyncClient: Canto_Inflation_V1_QueryAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Canto_Inflation_V1_QueryClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Canto_Inflation_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Canto_Inflation_V1_QueryClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'period'.
  func makePeriodInterceptors() -> [ClientInterceptor<Canto_Inflation_V1_QueryPeriodRequest, Canto_Inflation_V1_QueryPeriodResponse>]

  /// - Returns: Interceptors to use when invoking 'epochMintProvision'.
  func makeEpochMintProvisionInterceptors() -> [ClientInterceptor<Canto_Inflation_V1_QueryEpochMintProvisionRequest, Canto_Inflation_V1_QueryEpochMintProvisionResponse>]

  /// - Returns: Interceptors to use when invoking 'skippedEpochs'.
  func makeSkippedEpochsInterceptors() -> [ClientInterceptor<Canto_Inflation_V1_QuerySkippedEpochsRequest, Canto_Inflation_V1_QuerySkippedEpochsResponse>]

  /// - Returns: Interceptors to use when invoking 'circulatingSupply'.
  func makeCirculatingSupplyInterceptors() -> [ClientInterceptor<Canto_Inflation_V1_QueryCirculatingSupplyRequest, Canto_Inflation_V1_QueryCirculatingSupplyResponse>]

  /// - Returns: Interceptors to use when invoking 'inflationRate'.
  func makeInflationRateInterceptors() -> [ClientInterceptor<Canto_Inflation_V1_QueryInflationRateRequest, Canto_Inflation_V1_QueryInflationRateResponse>]

  /// - Returns: Interceptors to use when invoking 'params'.
  func makeParamsInterceptors() -> [ClientInterceptor<Canto_Inflation_V1_QueryParamsRequest, Canto_Inflation_V1_QueryParamsResponse>]
}

internal enum Canto_Inflation_V1_QueryClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "canto.inflation.v1.Query",
    methods: [
      Canto_Inflation_V1_QueryClientMetadata.Methods.period,
      Canto_Inflation_V1_QueryClientMetadata.Methods.epochMintProvision,
      Canto_Inflation_V1_QueryClientMetadata.Methods.skippedEpochs,
      Canto_Inflation_V1_QueryClientMetadata.Methods.circulatingSupply,
      Canto_Inflation_V1_QueryClientMetadata.Methods.inflationRate,
      Canto_Inflation_V1_QueryClientMetadata.Methods.params,
    ]
  )

  internal enum Methods {
    internal static let period = GRPCMethodDescriptor(
      name: "Period",
      path: "/canto.inflation.v1.Query/Period",
      type: GRPCCallType.unary
    )

    internal static let epochMintProvision = GRPCMethodDescriptor(
      name: "EpochMintProvision",
      path: "/canto.inflation.v1.Query/EpochMintProvision",
      type: GRPCCallType.unary
    )

    internal static let skippedEpochs = GRPCMethodDescriptor(
      name: "SkippedEpochs",
      path: "/canto.inflation.v1.Query/SkippedEpochs",
      type: GRPCCallType.unary
    )

    internal static let circulatingSupply = GRPCMethodDescriptor(
      name: "CirculatingSupply",
      path: "/canto.inflation.v1.Query/CirculatingSupply",
      type: GRPCCallType.unary
    )

    internal static let inflationRate = GRPCMethodDescriptor(
      name: "InflationRate",
      path: "/canto.inflation.v1.Query/InflationRate",
      type: GRPCCallType.unary
    )

    internal static let params = GRPCMethodDescriptor(
      name: "Params",
      path: "/canto.inflation.v1.Query/Params",
      type: GRPCCallType.unary
    )
  }
}

/// Query provides defines the gRPC querier service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Canto_Inflation_V1_QueryProvider: CallHandlerProvider {
  var interceptors: Canto_Inflation_V1_QueryServerInterceptorFactoryProtocol? { get }

  /// Period retrieves current period.
  func period(request: Canto_Inflation_V1_QueryPeriodRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Canto_Inflation_V1_QueryPeriodResponse>

  /// EpochMintProvision retrieves current minting epoch provision value.
  func epochMintProvision(request: Canto_Inflation_V1_QueryEpochMintProvisionRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Canto_Inflation_V1_QueryEpochMintProvisionResponse>

  /// SkippedEpochs retrieves the total number of skipped epochs.
  func skippedEpochs(request: Canto_Inflation_V1_QuerySkippedEpochsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Canto_Inflation_V1_QuerySkippedEpochsResponse>

  /// CirculatingSupply retrieves the total number of tokens that are in
  /// circulation (i.e. excluding unvested tokens).
  func circulatingSupply(request: Canto_Inflation_V1_QueryCirculatingSupplyRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Canto_Inflation_V1_QueryCirculatingSupplyResponse>

  /// InflationRate retrieves the inflation rate of the current period.
  func inflationRate(request: Canto_Inflation_V1_QueryInflationRateRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Canto_Inflation_V1_QueryInflationRateResponse>

  /// Params retrieves the total set of minting parameters.
  func params(request: Canto_Inflation_V1_QueryParamsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Canto_Inflation_V1_QueryParamsResponse>
}

extension Canto_Inflation_V1_QueryProvider {
  internal var serviceName: Substring {
    return Canto_Inflation_V1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Period":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Canto_Inflation_V1_QueryPeriodRequest>(),
        responseSerializer: ProtobufSerializer<Canto_Inflation_V1_QueryPeriodResponse>(),
        interceptors: self.interceptors?.makePeriodInterceptors() ?? [],
        userFunction: self.period(request:context:)
      )

    case "EpochMintProvision":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Canto_Inflation_V1_QueryEpochMintProvisionRequest>(),
        responseSerializer: ProtobufSerializer<Canto_Inflation_V1_QueryEpochMintProvisionResponse>(),
        interceptors: self.interceptors?.makeEpochMintProvisionInterceptors() ?? [],
        userFunction: self.epochMintProvision(request:context:)
      )

    case "SkippedEpochs":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Canto_Inflation_V1_QuerySkippedEpochsRequest>(),
        responseSerializer: ProtobufSerializer<Canto_Inflation_V1_QuerySkippedEpochsResponse>(),
        interceptors: self.interceptors?.makeSkippedEpochsInterceptors() ?? [],
        userFunction: self.skippedEpochs(request:context:)
      )

    case "CirculatingSupply":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Canto_Inflation_V1_QueryCirculatingSupplyRequest>(),
        responseSerializer: ProtobufSerializer<Canto_Inflation_V1_QueryCirculatingSupplyResponse>(),
        interceptors: self.interceptors?.makeCirculatingSupplyInterceptors() ?? [],
        userFunction: self.circulatingSupply(request:context:)
      )

    case "InflationRate":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Canto_Inflation_V1_QueryInflationRateRequest>(),
        responseSerializer: ProtobufSerializer<Canto_Inflation_V1_QueryInflationRateResponse>(),
        interceptors: self.interceptors?.makeInflationRateInterceptors() ?? [],
        userFunction: self.inflationRate(request:context:)
      )

    case "Params":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Canto_Inflation_V1_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Canto_Inflation_V1_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        userFunction: self.params(request:context:)
      )

    default:
      return nil
    }
  }
}

/// Query provides defines the gRPC querier service.
///
/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Canto_Inflation_V1_QueryAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Canto_Inflation_V1_QueryServerInterceptorFactoryProtocol? { get }

  /// Period retrieves current period.
  @Sendable func period(
    request: Canto_Inflation_V1_QueryPeriodRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Canto_Inflation_V1_QueryPeriodResponse

  /// EpochMintProvision retrieves current minting epoch provision value.
  @Sendable func epochMintProvision(
    request: Canto_Inflation_V1_QueryEpochMintProvisionRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Canto_Inflation_V1_QueryEpochMintProvisionResponse

  /// SkippedEpochs retrieves the total number of skipped epochs.
  @Sendable func skippedEpochs(
    request: Canto_Inflation_V1_QuerySkippedEpochsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Canto_Inflation_V1_QuerySkippedEpochsResponse

  /// CirculatingSupply retrieves the total number of tokens that are in
  /// circulation (i.e. excluding unvested tokens).
  @Sendable func circulatingSupply(
    request: Canto_Inflation_V1_QueryCirculatingSupplyRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Canto_Inflation_V1_QueryCirculatingSupplyResponse

  /// InflationRate retrieves the inflation rate of the current period.
  @Sendable func inflationRate(
    request: Canto_Inflation_V1_QueryInflationRateRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Canto_Inflation_V1_QueryInflationRateResponse

  /// Params retrieves the total set of minting parameters.
  @Sendable func params(
    request: Canto_Inflation_V1_QueryParamsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Canto_Inflation_V1_QueryParamsResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Canto_Inflation_V1_QueryAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Canto_Inflation_V1_QueryServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Canto_Inflation_V1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Canto_Inflation_V1_QueryServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Period":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Canto_Inflation_V1_QueryPeriodRequest>(),
        responseSerializer: ProtobufSerializer<Canto_Inflation_V1_QueryPeriodResponse>(),
        interceptors: self.interceptors?.makePeriodInterceptors() ?? [],
        wrapping: self.period(request:context:)
      )

    case "EpochMintProvision":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Canto_Inflation_V1_QueryEpochMintProvisionRequest>(),
        responseSerializer: ProtobufSerializer<Canto_Inflation_V1_QueryEpochMintProvisionResponse>(),
        interceptors: self.interceptors?.makeEpochMintProvisionInterceptors() ?? [],
        wrapping: self.epochMintProvision(request:context:)
      )

    case "SkippedEpochs":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Canto_Inflation_V1_QuerySkippedEpochsRequest>(),
        responseSerializer: ProtobufSerializer<Canto_Inflation_V1_QuerySkippedEpochsResponse>(),
        interceptors: self.interceptors?.makeSkippedEpochsInterceptors() ?? [],
        wrapping: self.skippedEpochs(request:context:)
      )

    case "CirculatingSupply":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Canto_Inflation_V1_QueryCirculatingSupplyRequest>(),
        responseSerializer: ProtobufSerializer<Canto_Inflation_V1_QueryCirculatingSupplyResponse>(),
        interceptors: self.interceptors?.makeCirculatingSupplyInterceptors() ?? [],
        wrapping: self.circulatingSupply(request:context:)
      )

    case "InflationRate":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Canto_Inflation_V1_QueryInflationRateRequest>(),
        responseSerializer: ProtobufSerializer<Canto_Inflation_V1_QueryInflationRateResponse>(),
        interceptors: self.interceptors?.makeInflationRateInterceptors() ?? [],
        wrapping: self.inflationRate(request:context:)
      )

    case "Params":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Canto_Inflation_V1_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Canto_Inflation_V1_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        wrapping: self.params(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Canto_Inflation_V1_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'period'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makePeriodInterceptors() -> [ServerInterceptor<Canto_Inflation_V1_QueryPeriodRequest, Canto_Inflation_V1_QueryPeriodResponse>]

  /// - Returns: Interceptors to use when handling 'epochMintProvision'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeEpochMintProvisionInterceptors() -> [ServerInterceptor<Canto_Inflation_V1_QueryEpochMintProvisionRequest, Canto_Inflation_V1_QueryEpochMintProvisionResponse>]

  /// - Returns: Interceptors to use when handling 'skippedEpochs'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeSkippedEpochsInterceptors() -> [ServerInterceptor<Canto_Inflation_V1_QuerySkippedEpochsRequest, Canto_Inflation_V1_QuerySkippedEpochsResponse>]

  /// - Returns: Interceptors to use when handling 'circulatingSupply'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeCirculatingSupplyInterceptors() -> [ServerInterceptor<Canto_Inflation_V1_QueryCirculatingSupplyRequest, Canto_Inflation_V1_QueryCirculatingSupplyResponse>]

  /// - Returns: Interceptors to use when handling 'inflationRate'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeInflationRateInterceptors() -> [ServerInterceptor<Canto_Inflation_V1_QueryInflationRateRequest, Canto_Inflation_V1_QueryInflationRateResponse>]

  /// - Returns: Interceptors to use when handling 'params'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeParamsInterceptors() -> [ServerInterceptor<Canto_Inflation_V1_QueryParamsRequest, Canto_Inflation_V1_QueryParamsResponse>]
}

internal enum Canto_Inflation_V1_QueryServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "canto.inflation.v1.Query",
    methods: [
      Canto_Inflation_V1_QueryServerMetadata.Methods.period,
      Canto_Inflation_V1_QueryServerMetadata.Methods.epochMintProvision,
      Canto_Inflation_V1_QueryServerMetadata.Methods.skippedEpochs,
      Canto_Inflation_V1_QueryServerMetadata.Methods.circulatingSupply,
      Canto_Inflation_V1_QueryServerMetadata.Methods.inflationRate,
      Canto_Inflation_V1_QueryServerMetadata.Methods.params,
    ]
  )

  internal enum Methods {
    internal static let period = GRPCMethodDescriptor(
      name: "Period",
      path: "/canto.inflation.v1.Query/Period",
      type: GRPCCallType.unary
    )

    internal static let epochMintProvision = GRPCMethodDescriptor(
      name: "EpochMintProvision",
      path: "/canto.inflation.v1.Query/EpochMintProvision",
      type: GRPCCallType.unary
    )

    internal static let skippedEpochs = GRPCMethodDescriptor(
      name: "SkippedEpochs",
      path: "/canto.inflation.v1.Query/SkippedEpochs",
      type: GRPCCallType.unary
    )

    internal static let circulatingSupply = GRPCMethodDescriptor(
      name: "CirculatingSupply",
      path: "/canto.inflation.v1.Query/CirculatingSupply",
      type: GRPCCallType.unary
    )

    internal static let inflationRate = GRPCMethodDescriptor(
      name: "InflationRate",
      path: "/canto.inflation.v1.Query/InflationRate",
      type: GRPCCallType.unary
    )

    internal static let params = GRPCMethodDescriptor(
      name: "Params",
      path: "/canto.inflation.v1.Query/Params",
      type: GRPCCallType.unary
    )
  }
}