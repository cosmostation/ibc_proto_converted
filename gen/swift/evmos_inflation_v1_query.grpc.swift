//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: evmos/inflation/v1/query.proto
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
/// Usage: instantiate `Evmos_Inflation_V1_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Evmos_Inflation_V1_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Evmos_Inflation_V1_QueryClientInterceptorFactoryProtocol? { get }

  func period(
    _ request: Evmos_Inflation_V1_QueryPeriodRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Evmos_Inflation_V1_QueryPeriodRequest, Evmos_Inflation_V1_QueryPeriodResponse>

  func epochMintProvision(
    _ request: Evmos_Inflation_V1_QueryEpochMintProvisionRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Evmos_Inflation_V1_QueryEpochMintProvisionRequest, Evmos_Inflation_V1_QueryEpochMintProvisionResponse>

  func skippedEpochs(
    _ request: Evmos_Inflation_V1_QuerySkippedEpochsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Evmos_Inflation_V1_QuerySkippedEpochsRequest, Evmos_Inflation_V1_QuerySkippedEpochsResponse>

  func circulatingSupply(
    _ request: Evmos_Inflation_V1_QueryCirculatingSupplyRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Evmos_Inflation_V1_QueryCirculatingSupplyRequest, Evmos_Inflation_V1_QueryCirculatingSupplyResponse>

  func inflationRate(
    _ request: Evmos_Inflation_V1_QueryInflationRateRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Evmos_Inflation_V1_QueryInflationRateRequest, Evmos_Inflation_V1_QueryInflationRateResponse>

  func params(
    _ request: Evmos_Inflation_V1_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Evmos_Inflation_V1_QueryParamsRequest, Evmos_Inflation_V1_QueryParamsResponse>
}

extension Evmos_Inflation_V1_QueryClientProtocol {
  internal var serviceName: String {
    return "evmos.inflation.v1.Query"
  }

  /// Period retrieves current period.
  ///
  /// - Parameters:
  ///   - request: Request to send to Period.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func period(
    _ request: Evmos_Inflation_V1_QueryPeriodRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Evmos_Inflation_V1_QueryPeriodRequest, Evmos_Inflation_V1_QueryPeriodResponse> {
    return self.makeUnaryCall(
      path: Evmos_Inflation_V1_QueryClientMetadata.Methods.period.path,
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
    _ request: Evmos_Inflation_V1_QueryEpochMintProvisionRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Evmos_Inflation_V1_QueryEpochMintProvisionRequest, Evmos_Inflation_V1_QueryEpochMintProvisionResponse> {
    return self.makeUnaryCall(
      path: Evmos_Inflation_V1_QueryClientMetadata.Methods.epochMintProvision.path,
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
    _ request: Evmos_Inflation_V1_QuerySkippedEpochsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Evmos_Inflation_V1_QuerySkippedEpochsRequest, Evmos_Inflation_V1_QuerySkippedEpochsResponse> {
    return self.makeUnaryCall(
      path: Evmos_Inflation_V1_QueryClientMetadata.Methods.skippedEpochs.path,
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
    _ request: Evmos_Inflation_V1_QueryCirculatingSupplyRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Evmos_Inflation_V1_QueryCirculatingSupplyRequest, Evmos_Inflation_V1_QueryCirculatingSupplyResponse> {
    return self.makeUnaryCall(
      path: Evmos_Inflation_V1_QueryClientMetadata.Methods.circulatingSupply.path,
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
    _ request: Evmos_Inflation_V1_QueryInflationRateRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Evmos_Inflation_V1_QueryInflationRateRequest, Evmos_Inflation_V1_QueryInflationRateResponse> {
    return self.makeUnaryCall(
      path: Evmos_Inflation_V1_QueryClientMetadata.Methods.inflationRate.path,
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
    _ request: Evmos_Inflation_V1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Evmos_Inflation_V1_QueryParamsRequest, Evmos_Inflation_V1_QueryParamsResponse> {
    return self.makeUnaryCall(
      path: Evmos_Inflation_V1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Evmos_Inflation_V1_QueryClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Evmos_Inflation_V1_QueryNIOClient")
internal final class Evmos_Inflation_V1_QueryClient: Evmos_Inflation_V1_QueryClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Evmos_Inflation_V1_QueryClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Evmos_Inflation_V1_QueryClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the evmos.inflation.v1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Evmos_Inflation_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Evmos_Inflation_V1_QueryNIOClient: Evmos_Inflation_V1_QueryClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Evmos_Inflation_V1_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the evmos.inflation.v1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Evmos_Inflation_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query provides defines the gRPC querier service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Evmos_Inflation_V1_QueryAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Evmos_Inflation_V1_QueryClientInterceptorFactoryProtocol? { get }

  func makePeriodCall(
    _ request: Evmos_Inflation_V1_QueryPeriodRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Evmos_Inflation_V1_QueryPeriodRequest, Evmos_Inflation_V1_QueryPeriodResponse>

  func makeEpochMintProvisionCall(
    _ request: Evmos_Inflation_V1_QueryEpochMintProvisionRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Evmos_Inflation_V1_QueryEpochMintProvisionRequest, Evmos_Inflation_V1_QueryEpochMintProvisionResponse>

  func makeSkippedEpochsCall(
    _ request: Evmos_Inflation_V1_QuerySkippedEpochsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Evmos_Inflation_V1_QuerySkippedEpochsRequest, Evmos_Inflation_V1_QuerySkippedEpochsResponse>

  func makeCirculatingSupplyCall(
    _ request: Evmos_Inflation_V1_QueryCirculatingSupplyRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Evmos_Inflation_V1_QueryCirculatingSupplyRequest, Evmos_Inflation_V1_QueryCirculatingSupplyResponse>

  func makeInflationRateCall(
    _ request: Evmos_Inflation_V1_QueryInflationRateRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Evmos_Inflation_V1_QueryInflationRateRequest, Evmos_Inflation_V1_QueryInflationRateResponse>

  func makeParamsCall(
    _ request: Evmos_Inflation_V1_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Evmos_Inflation_V1_QueryParamsRequest, Evmos_Inflation_V1_QueryParamsResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Evmos_Inflation_V1_QueryAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Evmos_Inflation_V1_QueryClientMetadata.serviceDescriptor
  }

  internal var interceptors: Evmos_Inflation_V1_QueryClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makePeriodCall(
    _ request: Evmos_Inflation_V1_QueryPeriodRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Evmos_Inflation_V1_QueryPeriodRequest, Evmos_Inflation_V1_QueryPeriodResponse> {
    return self.makeAsyncUnaryCall(
      path: Evmos_Inflation_V1_QueryClientMetadata.Methods.period.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makePeriodInterceptors() ?? []
    )
  }

  internal func makeEpochMintProvisionCall(
    _ request: Evmos_Inflation_V1_QueryEpochMintProvisionRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Evmos_Inflation_V1_QueryEpochMintProvisionRequest, Evmos_Inflation_V1_QueryEpochMintProvisionResponse> {
    return self.makeAsyncUnaryCall(
      path: Evmos_Inflation_V1_QueryClientMetadata.Methods.epochMintProvision.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeEpochMintProvisionInterceptors() ?? []
    )
  }

  internal func makeSkippedEpochsCall(
    _ request: Evmos_Inflation_V1_QuerySkippedEpochsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Evmos_Inflation_V1_QuerySkippedEpochsRequest, Evmos_Inflation_V1_QuerySkippedEpochsResponse> {
    return self.makeAsyncUnaryCall(
      path: Evmos_Inflation_V1_QueryClientMetadata.Methods.skippedEpochs.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSkippedEpochsInterceptors() ?? []
    )
  }

  internal func makeCirculatingSupplyCall(
    _ request: Evmos_Inflation_V1_QueryCirculatingSupplyRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Evmos_Inflation_V1_QueryCirculatingSupplyRequest, Evmos_Inflation_V1_QueryCirculatingSupplyResponse> {
    return self.makeAsyncUnaryCall(
      path: Evmos_Inflation_V1_QueryClientMetadata.Methods.circulatingSupply.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCirculatingSupplyInterceptors() ?? []
    )
  }

  internal func makeInflationRateCall(
    _ request: Evmos_Inflation_V1_QueryInflationRateRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Evmos_Inflation_V1_QueryInflationRateRequest, Evmos_Inflation_V1_QueryInflationRateResponse> {
    return self.makeAsyncUnaryCall(
      path: Evmos_Inflation_V1_QueryClientMetadata.Methods.inflationRate.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeInflationRateInterceptors() ?? []
    )
  }

  internal func makeParamsCall(
    _ request: Evmos_Inflation_V1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Evmos_Inflation_V1_QueryParamsRequest, Evmos_Inflation_V1_QueryParamsResponse> {
    return self.makeAsyncUnaryCall(
      path: Evmos_Inflation_V1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Evmos_Inflation_V1_QueryAsyncClientProtocol {
  internal func period(
    _ request: Evmos_Inflation_V1_QueryPeriodRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Evmos_Inflation_V1_QueryPeriodResponse {
    return try await self.performAsyncUnaryCall(
      path: Evmos_Inflation_V1_QueryClientMetadata.Methods.period.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makePeriodInterceptors() ?? []
    )
  }

  internal func epochMintProvision(
    _ request: Evmos_Inflation_V1_QueryEpochMintProvisionRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Evmos_Inflation_V1_QueryEpochMintProvisionResponse {
    return try await self.performAsyncUnaryCall(
      path: Evmos_Inflation_V1_QueryClientMetadata.Methods.epochMintProvision.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeEpochMintProvisionInterceptors() ?? []
    )
  }

  internal func skippedEpochs(
    _ request: Evmos_Inflation_V1_QuerySkippedEpochsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Evmos_Inflation_V1_QuerySkippedEpochsResponse {
    return try await self.performAsyncUnaryCall(
      path: Evmos_Inflation_V1_QueryClientMetadata.Methods.skippedEpochs.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSkippedEpochsInterceptors() ?? []
    )
  }

  internal func circulatingSupply(
    _ request: Evmos_Inflation_V1_QueryCirculatingSupplyRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Evmos_Inflation_V1_QueryCirculatingSupplyResponse {
    return try await self.performAsyncUnaryCall(
      path: Evmos_Inflation_V1_QueryClientMetadata.Methods.circulatingSupply.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCirculatingSupplyInterceptors() ?? []
    )
  }

  internal func inflationRate(
    _ request: Evmos_Inflation_V1_QueryInflationRateRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Evmos_Inflation_V1_QueryInflationRateResponse {
    return try await self.performAsyncUnaryCall(
      path: Evmos_Inflation_V1_QueryClientMetadata.Methods.inflationRate.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeInflationRateInterceptors() ?? []
    )
  }

  internal func params(
    _ request: Evmos_Inflation_V1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Evmos_Inflation_V1_QueryParamsResponse {
    return try await self.performAsyncUnaryCall(
      path: Evmos_Inflation_V1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Evmos_Inflation_V1_QueryAsyncClient: Evmos_Inflation_V1_QueryAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Evmos_Inflation_V1_QueryClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Evmos_Inflation_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Evmos_Inflation_V1_QueryClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'period'.
  func makePeriodInterceptors() -> [ClientInterceptor<Evmos_Inflation_V1_QueryPeriodRequest, Evmos_Inflation_V1_QueryPeriodResponse>]

  /// - Returns: Interceptors to use when invoking 'epochMintProvision'.
  func makeEpochMintProvisionInterceptors() -> [ClientInterceptor<Evmos_Inflation_V1_QueryEpochMintProvisionRequest, Evmos_Inflation_V1_QueryEpochMintProvisionResponse>]

  /// - Returns: Interceptors to use when invoking 'skippedEpochs'.
  func makeSkippedEpochsInterceptors() -> [ClientInterceptor<Evmos_Inflation_V1_QuerySkippedEpochsRequest, Evmos_Inflation_V1_QuerySkippedEpochsResponse>]

  /// - Returns: Interceptors to use when invoking 'circulatingSupply'.
  func makeCirculatingSupplyInterceptors() -> [ClientInterceptor<Evmos_Inflation_V1_QueryCirculatingSupplyRequest, Evmos_Inflation_V1_QueryCirculatingSupplyResponse>]

  /// - Returns: Interceptors to use when invoking 'inflationRate'.
  func makeInflationRateInterceptors() -> [ClientInterceptor<Evmos_Inflation_V1_QueryInflationRateRequest, Evmos_Inflation_V1_QueryInflationRateResponse>]

  /// - Returns: Interceptors to use when invoking 'params'.
  func makeParamsInterceptors() -> [ClientInterceptor<Evmos_Inflation_V1_QueryParamsRequest, Evmos_Inflation_V1_QueryParamsResponse>]
}

internal enum Evmos_Inflation_V1_QueryClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "evmos.inflation.v1.Query",
    methods: [
      Evmos_Inflation_V1_QueryClientMetadata.Methods.period,
      Evmos_Inflation_V1_QueryClientMetadata.Methods.epochMintProvision,
      Evmos_Inflation_V1_QueryClientMetadata.Methods.skippedEpochs,
      Evmos_Inflation_V1_QueryClientMetadata.Methods.circulatingSupply,
      Evmos_Inflation_V1_QueryClientMetadata.Methods.inflationRate,
      Evmos_Inflation_V1_QueryClientMetadata.Methods.params,
    ]
  )

  internal enum Methods {
    internal static let period = GRPCMethodDescriptor(
      name: "Period",
      path: "/evmos.inflation.v1.Query/Period",
      type: GRPCCallType.unary
    )

    internal static let epochMintProvision = GRPCMethodDescriptor(
      name: "EpochMintProvision",
      path: "/evmos.inflation.v1.Query/EpochMintProvision",
      type: GRPCCallType.unary
    )

    internal static let skippedEpochs = GRPCMethodDescriptor(
      name: "SkippedEpochs",
      path: "/evmos.inflation.v1.Query/SkippedEpochs",
      type: GRPCCallType.unary
    )

    internal static let circulatingSupply = GRPCMethodDescriptor(
      name: "CirculatingSupply",
      path: "/evmos.inflation.v1.Query/CirculatingSupply",
      type: GRPCCallType.unary
    )

    internal static let inflationRate = GRPCMethodDescriptor(
      name: "InflationRate",
      path: "/evmos.inflation.v1.Query/InflationRate",
      type: GRPCCallType.unary
    )

    internal static let params = GRPCMethodDescriptor(
      name: "Params",
      path: "/evmos.inflation.v1.Query/Params",
      type: GRPCCallType.unary
    )
  }
}

/// Query provides defines the gRPC querier service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Evmos_Inflation_V1_QueryProvider: CallHandlerProvider {
  var interceptors: Evmos_Inflation_V1_QueryServerInterceptorFactoryProtocol? { get }

  /// Period retrieves current period.
  func period(request: Evmos_Inflation_V1_QueryPeriodRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Evmos_Inflation_V1_QueryPeriodResponse>

  /// EpochMintProvision retrieves current minting epoch provision value.
  func epochMintProvision(request: Evmos_Inflation_V1_QueryEpochMintProvisionRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Evmos_Inflation_V1_QueryEpochMintProvisionResponse>

  /// SkippedEpochs retrieves the total number of skipped epochs.
  func skippedEpochs(request: Evmos_Inflation_V1_QuerySkippedEpochsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Evmos_Inflation_V1_QuerySkippedEpochsResponse>

  /// CirculatingSupply retrieves the total number of tokens that are in
  /// circulation (i.e. excluding unvested tokens).
  func circulatingSupply(request: Evmos_Inflation_V1_QueryCirculatingSupplyRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Evmos_Inflation_V1_QueryCirculatingSupplyResponse>

  /// InflationRate retrieves the inflation rate of the current period.
  func inflationRate(request: Evmos_Inflation_V1_QueryInflationRateRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Evmos_Inflation_V1_QueryInflationRateResponse>

  /// Params retrieves the total set of minting parameters.
  func params(request: Evmos_Inflation_V1_QueryParamsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Evmos_Inflation_V1_QueryParamsResponse>
}

extension Evmos_Inflation_V1_QueryProvider {
  internal var serviceName: Substring {
    return Evmos_Inflation_V1_QueryServerMetadata.serviceDescriptor.fullName[...]
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
        requestDeserializer: ProtobufDeserializer<Evmos_Inflation_V1_QueryPeriodRequest>(),
        responseSerializer: ProtobufSerializer<Evmos_Inflation_V1_QueryPeriodResponse>(),
        interceptors: self.interceptors?.makePeriodInterceptors() ?? [],
        userFunction: self.period(request:context:)
      )

    case "EpochMintProvision":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Evmos_Inflation_V1_QueryEpochMintProvisionRequest>(),
        responseSerializer: ProtobufSerializer<Evmos_Inflation_V1_QueryEpochMintProvisionResponse>(),
        interceptors: self.interceptors?.makeEpochMintProvisionInterceptors() ?? [],
        userFunction: self.epochMintProvision(request:context:)
      )

    case "SkippedEpochs":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Evmos_Inflation_V1_QuerySkippedEpochsRequest>(),
        responseSerializer: ProtobufSerializer<Evmos_Inflation_V1_QuerySkippedEpochsResponse>(),
        interceptors: self.interceptors?.makeSkippedEpochsInterceptors() ?? [],
        userFunction: self.skippedEpochs(request:context:)
      )

    case "CirculatingSupply":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Evmos_Inflation_V1_QueryCirculatingSupplyRequest>(),
        responseSerializer: ProtobufSerializer<Evmos_Inflation_V1_QueryCirculatingSupplyResponse>(),
        interceptors: self.interceptors?.makeCirculatingSupplyInterceptors() ?? [],
        userFunction: self.circulatingSupply(request:context:)
      )

    case "InflationRate":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Evmos_Inflation_V1_QueryInflationRateRequest>(),
        responseSerializer: ProtobufSerializer<Evmos_Inflation_V1_QueryInflationRateResponse>(),
        interceptors: self.interceptors?.makeInflationRateInterceptors() ?? [],
        userFunction: self.inflationRate(request:context:)
      )

    case "Params":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Evmos_Inflation_V1_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Evmos_Inflation_V1_QueryParamsResponse>(),
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
internal protocol Evmos_Inflation_V1_QueryAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Evmos_Inflation_V1_QueryServerInterceptorFactoryProtocol? { get }

  /// Period retrieves current period.
  @Sendable func period(
    request: Evmos_Inflation_V1_QueryPeriodRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Evmos_Inflation_V1_QueryPeriodResponse

  /// EpochMintProvision retrieves current minting epoch provision value.
  @Sendable func epochMintProvision(
    request: Evmos_Inflation_V1_QueryEpochMintProvisionRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Evmos_Inflation_V1_QueryEpochMintProvisionResponse

  /// SkippedEpochs retrieves the total number of skipped epochs.
  @Sendable func skippedEpochs(
    request: Evmos_Inflation_V1_QuerySkippedEpochsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Evmos_Inflation_V1_QuerySkippedEpochsResponse

  /// CirculatingSupply retrieves the total number of tokens that are in
  /// circulation (i.e. excluding unvested tokens).
  @Sendable func circulatingSupply(
    request: Evmos_Inflation_V1_QueryCirculatingSupplyRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Evmos_Inflation_V1_QueryCirculatingSupplyResponse

  /// InflationRate retrieves the inflation rate of the current period.
  @Sendable func inflationRate(
    request: Evmos_Inflation_V1_QueryInflationRateRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Evmos_Inflation_V1_QueryInflationRateResponse

  /// Params retrieves the total set of minting parameters.
  @Sendable func params(
    request: Evmos_Inflation_V1_QueryParamsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Evmos_Inflation_V1_QueryParamsResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Evmos_Inflation_V1_QueryAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Evmos_Inflation_V1_QueryServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Evmos_Inflation_V1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Evmos_Inflation_V1_QueryServerInterceptorFactoryProtocol? {
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
        requestDeserializer: ProtobufDeserializer<Evmos_Inflation_V1_QueryPeriodRequest>(),
        responseSerializer: ProtobufSerializer<Evmos_Inflation_V1_QueryPeriodResponse>(),
        interceptors: self.interceptors?.makePeriodInterceptors() ?? [],
        wrapping: self.period(request:context:)
      )

    case "EpochMintProvision":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Evmos_Inflation_V1_QueryEpochMintProvisionRequest>(),
        responseSerializer: ProtobufSerializer<Evmos_Inflation_V1_QueryEpochMintProvisionResponse>(),
        interceptors: self.interceptors?.makeEpochMintProvisionInterceptors() ?? [],
        wrapping: self.epochMintProvision(request:context:)
      )

    case "SkippedEpochs":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Evmos_Inflation_V1_QuerySkippedEpochsRequest>(),
        responseSerializer: ProtobufSerializer<Evmos_Inflation_V1_QuerySkippedEpochsResponse>(),
        interceptors: self.interceptors?.makeSkippedEpochsInterceptors() ?? [],
        wrapping: self.skippedEpochs(request:context:)
      )

    case "CirculatingSupply":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Evmos_Inflation_V1_QueryCirculatingSupplyRequest>(),
        responseSerializer: ProtobufSerializer<Evmos_Inflation_V1_QueryCirculatingSupplyResponse>(),
        interceptors: self.interceptors?.makeCirculatingSupplyInterceptors() ?? [],
        wrapping: self.circulatingSupply(request:context:)
      )

    case "InflationRate":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Evmos_Inflation_V1_QueryInflationRateRequest>(),
        responseSerializer: ProtobufSerializer<Evmos_Inflation_V1_QueryInflationRateResponse>(),
        interceptors: self.interceptors?.makeInflationRateInterceptors() ?? [],
        wrapping: self.inflationRate(request:context:)
      )

    case "Params":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Evmos_Inflation_V1_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Evmos_Inflation_V1_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        wrapping: self.params(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Evmos_Inflation_V1_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'period'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makePeriodInterceptors() -> [ServerInterceptor<Evmos_Inflation_V1_QueryPeriodRequest, Evmos_Inflation_V1_QueryPeriodResponse>]

  /// - Returns: Interceptors to use when handling 'epochMintProvision'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeEpochMintProvisionInterceptors() -> [ServerInterceptor<Evmos_Inflation_V1_QueryEpochMintProvisionRequest, Evmos_Inflation_V1_QueryEpochMintProvisionResponse>]

  /// - Returns: Interceptors to use when handling 'skippedEpochs'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeSkippedEpochsInterceptors() -> [ServerInterceptor<Evmos_Inflation_V1_QuerySkippedEpochsRequest, Evmos_Inflation_V1_QuerySkippedEpochsResponse>]

  /// - Returns: Interceptors to use when handling 'circulatingSupply'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeCirculatingSupplyInterceptors() -> [ServerInterceptor<Evmos_Inflation_V1_QueryCirculatingSupplyRequest, Evmos_Inflation_V1_QueryCirculatingSupplyResponse>]

  /// - Returns: Interceptors to use when handling 'inflationRate'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeInflationRateInterceptors() -> [ServerInterceptor<Evmos_Inflation_V1_QueryInflationRateRequest, Evmos_Inflation_V1_QueryInflationRateResponse>]

  /// - Returns: Interceptors to use when handling 'params'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeParamsInterceptors() -> [ServerInterceptor<Evmos_Inflation_V1_QueryParamsRequest, Evmos_Inflation_V1_QueryParamsResponse>]
}

internal enum Evmos_Inflation_V1_QueryServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "evmos.inflation.v1.Query",
    methods: [
      Evmos_Inflation_V1_QueryServerMetadata.Methods.period,
      Evmos_Inflation_V1_QueryServerMetadata.Methods.epochMintProvision,
      Evmos_Inflation_V1_QueryServerMetadata.Methods.skippedEpochs,
      Evmos_Inflation_V1_QueryServerMetadata.Methods.circulatingSupply,
      Evmos_Inflation_V1_QueryServerMetadata.Methods.inflationRate,
      Evmos_Inflation_V1_QueryServerMetadata.Methods.params,
    ]
  )

  internal enum Methods {
    internal static let period = GRPCMethodDescriptor(
      name: "Period",
      path: "/evmos.inflation.v1.Query/Period",
      type: GRPCCallType.unary
    )

    internal static let epochMintProvision = GRPCMethodDescriptor(
      name: "EpochMintProvision",
      path: "/evmos.inflation.v1.Query/EpochMintProvision",
      type: GRPCCallType.unary
    )

    internal static let skippedEpochs = GRPCMethodDescriptor(
      name: "SkippedEpochs",
      path: "/evmos.inflation.v1.Query/SkippedEpochs",
      type: GRPCCallType.unary
    )

    internal static let circulatingSupply = GRPCMethodDescriptor(
      name: "CirculatingSupply",
      path: "/evmos.inflation.v1.Query/CirculatingSupply",
      type: GRPCCallType.unary
    )

    internal static let inflationRate = GRPCMethodDescriptor(
      name: "InflationRate",
      path: "/evmos.inflation.v1.Query/InflationRate",
      type: GRPCCallType.unary
    )

    internal static let params = GRPCMethodDescriptor(
      name: "Params",
      path: "/evmos.inflation.v1.Query/Params",
      type: GRPCCallType.unary
    )
  }
}