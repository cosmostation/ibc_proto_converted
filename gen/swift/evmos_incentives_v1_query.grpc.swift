//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: evmos/incentives/v1/query.proto
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
/// Usage: instantiate `Evmos_Incentives_V1_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Evmos_Incentives_V1_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Evmos_Incentives_V1_QueryClientInterceptorFactoryProtocol? { get }

  func incentives(
    _ request: Evmos_Incentives_V1_QueryIncentivesRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Evmos_Incentives_V1_QueryIncentivesRequest, Evmos_Incentives_V1_QueryIncentivesResponse>

  func incentive(
    _ request: Evmos_Incentives_V1_QueryIncentiveRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Evmos_Incentives_V1_QueryIncentiveRequest, Evmos_Incentives_V1_QueryIncentiveResponse>

  func gasMeters(
    _ request: Evmos_Incentives_V1_QueryGasMetersRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Evmos_Incentives_V1_QueryGasMetersRequest, Evmos_Incentives_V1_QueryGasMetersResponse>

  func gasMeter(
    _ request: Evmos_Incentives_V1_QueryGasMeterRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Evmos_Incentives_V1_QueryGasMeterRequest, Evmos_Incentives_V1_QueryGasMeterResponse>

  func allocationMeters(
    _ request: Evmos_Incentives_V1_QueryAllocationMetersRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Evmos_Incentives_V1_QueryAllocationMetersRequest, Evmos_Incentives_V1_QueryAllocationMetersResponse>

  func allocationMeter(
    _ request: Evmos_Incentives_V1_QueryAllocationMeterRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Evmos_Incentives_V1_QueryAllocationMeterRequest, Evmos_Incentives_V1_QueryAllocationMeterResponse>

  func params(
    _ request: Evmos_Incentives_V1_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Evmos_Incentives_V1_QueryParamsRequest, Evmos_Incentives_V1_QueryParamsResponse>
}

extension Evmos_Incentives_V1_QueryClientProtocol {
  internal var serviceName: String {
    return "evmos.incentives.v1.Query"
  }

  /// Incentives retrieves registered incentives
  ///
  /// - Parameters:
  ///   - request: Request to send to Incentives.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func incentives(
    _ request: Evmos_Incentives_V1_QueryIncentivesRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Evmos_Incentives_V1_QueryIncentivesRequest, Evmos_Incentives_V1_QueryIncentivesResponse> {
    return self.makeUnaryCall(
      path: Evmos_Incentives_V1_QueryClientMetadata.Methods.incentives.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeIncentivesInterceptors() ?? []
    )
  }

  /// Incentive retrieves a registered incentive
  ///
  /// - Parameters:
  ///   - request: Request to send to Incentive.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func incentive(
    _ request: Evmos_Incentives_V1_QueryIncentiveRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Evmos_Incentives_V1_QueryIncentiveRequest, Evmos_Incentives_V1_QueryIncentiveResponse> {
    return self.makeUnaryCall(
      path: Evmos_Incentives_V1_QueryClientMetadata.Methods.incentive.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeIncentiveInterceptors() ?? []
    )
  }

  /// GasMeters retrieves active gas meters for a given contract
  ///
  /// - Parameters:
  ///   - request: Request to send to GasMeters.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func gasMeters(
    _ request: Evmos_Incentives_V1_QueryGasMetersRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Evmos_Incentives_V1_QueryGasMetersRequest, Evmos_Incentives_V1_QueryGasMetersResponse> {
    return self.makeUnaryCall(
      path: Evmos_Incentives_V1_QueryClientMetadata.Methods.gasMeters.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeGasMetersInterceptors() ?? []
    )
  }

  /// GasMeter retrieves a active gas meter
  ///
  /// - Parameters:
  ///   - request: Request to send to GasMeter.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func gasMeter(
    _ request: Evmos_Incentives_V1_QueryGasMeterRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Evmos_Incentives_V1_QueryGasMeterRequest, Evmos_Incentives_V1_QueryGasMeterResponse> {
    return self.makeUnaryCall(
      path: Evmos_Incentives_V1_QueryClientMetadata.Methods.gasMeter.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeGasMeterInterceptors() ?? []
    )
  }

  /// AllocationMeters retrieves active allocation meters for a given
  /// denomination
  ///
  /// - Parameters:
  ///   - request: Request to send to AllocationMeters.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func allocationMeters(
    _ request: Evmos_Incentives_V1_QueryAllocationMetersRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Evmos_Incentives_V1_QueryAllocationMetersRequest, Evmos_Incentives_V1_QueryAllocationMetersResponse> {
    return self.makeUnaryCall(
      path: Evmos_Incentives_V1_QueryClientMetadata.Methods.allocationMeters.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAllocationMetersInterceptors() ?? []
    )
  }

  /// AllocationMeter retrieves a active gas meter
  ///
  /// - Parameters:
  ///   - request: Request to send to AllocationMeter.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func allocationMeter(
    _ request: Evmos_Incentives_V1_QueryAllocationMeterRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Evmos_Incentives_V1_QueryAllocationMeterRequest, Evmos_Incentives_V1_QueryAllocationMeterResponse> {
    return self.makeUnaryCall(
      path: Evmos_Incentives_V1_QueryClientMetadata.Methods.allocationMeter.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAllocationMeterInterceptors() ?? []
    )
  }

  /// Params retrieves the incentives module params
  ///
  /// - Parameters:
  ///   - request: Request to send to Params.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func params(
    _ request: Evmos_Incentives_V1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Evmos_Incentives_V1_QueryParamsRequest, Evmos_Incentives_V1_QueryParamsResponse> {
    return self.makeUnaryCall(
      path: Evmos_Incentives_V1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Evmos_Incentives_V1_QueryClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Evmos_Incentives_V1_QueryNIOClient")
internal final class Evmos_Incentives_V1_QueryClient: Evmos_Incentives_V1_QueryClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Evmos_Incentives_V1_QueryClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Evmos_Incentives_V1_QueryClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the evmos.incentives.v1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Evmos_Incentives_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Evmos_Incentives_V1_QueryNIOClient: Evmos_Incentives_V1_QueryClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Evmos_Incentives_V1_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the evmos.incentives.v1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Evmos_Incentives_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query defines the gRPC querier service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Evmos_Incentives_V1_QueryAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Evmos_Incentives_V1_QueryClientInterceptorFactoryProtocol? { get }

  func makeIncentivesCall(
    _ request: Evmos_Incentives_V1_QueryIncentivesRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Evmos_Incentives_V1_QueryIncentivesRequest, Evmos_Incentives_V1_QueryIncentivesResponse>

  func makeIncentiveCall(
    _ request: Evmos_Incentives_V1_QueryIncentiveRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Evmos_Incentives_V1_QueryIncentiveRequest, Evmos_Incentives_V1_QueryIncentiveResponse>

  func makeGasMetersCall(
    _ request: Evmos_Incentives_V1_QueryGasMetersRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Evmos_Incentives_V1_QueryGasMetersRequest, Evmos_Incentives_V1_QueryGasMetersResponse>

  func makeGasMeterCall(
    _ request: Evmos_Incentives_V1_QueryGasMeterRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Evmos_Incentives_V1_QueryGasMeterRequest, Evmos_Incentives_V1_QueryGasMeterResponse>

  func makeAllocationMetersCall(
    _ request: Evmos_Incentives_V1_QueryAllocationMetersRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Evmos_Incentives_V1_QueryAllocationMetersRequest, Evmos_Incentives_V1_QueryAllocationMetersResponse>

  func makeAllocationMeterCall(
    _ request: Evmos_Incentives_V1_QueryAllocationMeterRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Evmos_Incentives_V1_QueryAllocationMeterRequest, Evmos_Incentives_V1_QueryAllocationMeterResponse>

  func makeParamsCall(
    _ request: Evmos_Incentives_V1_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Evmos_Incentives_V1_QueryParamsRequest, Evmos_Incentives_V1_QueryParamsResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Evmos_Incentives_V1_QueryAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Evmos_Incentives_V1_QueryClientMetadata.serviceDescriptor
  }

  internal var interceptors: Evmos_Incentives_V1_QueryClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeIncentivesCall(
    _ request: Evmos_Incentives_V1_QueryIncentivesRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Evmos_Incentives_V1_QueryIncentivesRequest, Evmos_Incentives_V1_QueryIncentivesResponse> {
    return self.makeAsyncUnaryCall(
      path: Evmos_Incentives_V1_QueryClientMetadata.Methods.incentives.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeIncentivesInterceptors() ?? []
    )
  }

  internal func makeIncentiveCall(
    _ request: Evmos_Incentives_V1_QueryIncentiveRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Evmos_Incentives_V1_QueryIncentiveRequest, Evmos_Incentives_V1_QueryIncentiveResponse> {
    return self.makeAsyncUnaryCall(
      path: Evmos_Incentives_V1_QueryClientMetadata.Methods.incentive.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeIncentiveInterceptors() ?? []
    )
  }

  internal func makeGasMetersCall(
    _ request: Evmos_Incentives_V1_QueryGasMetersRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Evmos_Incentives_V1_QueryGasMetersRequest, Evmos_Incentives_V1_QueryGasMetersResponse> {
    return self.makeAsyncUnaryCall(
      path: Evmos_Incentives_V1_QueryClientMetadata.Methods.gasMeters.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeGasMetersInterceptors() ?? []
    )
  }

  internal func makeGasMeterCall(
    _ request: Evmos_Incentives_V1_QueryGasMeterRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Evmos_Incentives_V1_QueryGasMeterRequest, Evmos_Incentives_V1_QueryGasMeterResponse> {
    return self.makeAsyncUnaryCall(
      path: Evmos_Incentives_V1_QueryClientMetadata.Methods.gasMeter.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeGasMeterInterceptors() ?? []
    )
  }

  internal func makeAllocationMetersCall(
    _ request: Evmos_Incentives_V1_QueryAllocationMetersRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Evmos_Incentives_V1_QueryAllocationMetersRequest, Evmos_Incentives_V1_QueryAllocationMetersResponse> {
    return self.makeAsyncUnaryCall(
      path: Evmos_Incentives_V1_QueryClientMetadata.Methods.allocationMeters.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAllocationMetersInterceptors() ?? []
    )
  }

  internal func makeAllocationMeterCall(
    _ request: Evmos_Incentives_V1_QueryAllocationMeterRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Evmos_Incentives_V1_QueryAllocationMeterRequest, Evmos_Incentives_V1_QueryAllocationMeterResponse> {
    return self.makeAsyncUnaryCall(
      path: Evmos_Incentives_V1_QueryClientMetadata.Methods.allocationMeter.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAllocationMeterInterceptors() ?? []
    )
  }

  internal func makeParamsCall(
    _ request: Evmos_Incentives_V1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Evmos_Incentives_V1_QueryParamsRequest, Evmos_Incentives_V1_QueryParamsResponse> {
    return self.makeAsyncUnaryCall(
      path: Evmos_Incentives_V1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Evmos_Incentives_V1_QueryAsyncClientProtocol {
  internal func incentives(
    _ request: Evmos_Incentives_V1_QueryIncentivesRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Evmos_Incentives_V1_QueryIncentivesResponse {
    return try await self.performAsyncUnaryCall(
      path: Evmos_Incentives_V1_QueryClientMetadata.Methods.incentives.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeIncentivesInterceptors() ?? []
    )
  }

  internal func incentive(
    _ request: Evmos_Incentives_V1_QueryIncentiveRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Evmos_Incentives_V1_QueryIncentiveResponse {
    return try await self.performAsyncUnaryCall(
      path: Evmos_Incentives_V1_QueryClientMetadata.Methods.incentive.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeIncentiveInterceptors() ?? []
    )
  }

  internal func gasMeters(
    _ request: Evmos_Incentives_V1_QueryGasMetersRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Evmos_Incentives_V1_QueryGasMetersResponse {
    return try await self.performAsyncUnaryCall(
      path: Evmos_Incentives_V1_QueryClientMetadata.Methods.gasMeters.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeGasMetersInterceptors() ?? []
    )
  }

  internal func gasMeter(
    _ request: Evmos_Incentives_V1_QueryGasMeterRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Evmos_Incentives_V1_QueryGasMeterResponse {
    return try await self.performAsyncUnaryCall(
      path: Evmos_Incentives_V1_QueryClientMetadata.Methods.gasMeter.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeGasMeterInterceptors() ?? []
    )
  }

  internal func allocationMeters(
    _ request: Evmos_Incentives_V1_QueryAllocationMetersRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Evmos_Incentives_V1_QueryAllocationMetersResponse {
    return try await self.performAsyncUnaryCall(
      path: Evmos_Incentives_V1_QueryClientMetadata.Methods.allocationMeters.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAllocationMetersInterceptors() ?? []
    )
  }

  internal func allocationMeter(
    _ request: Evmos_Incentives_V1_QueryAllocationMeterRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Evmos_Incentives_V1_QueryAllocationMeterResponse {
    return try await self.performAsyncUnaryCall(
      path: Evmos_Incentives_V1_QueryClientMetadata.Methods.allocationMeter.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAllocationMeterInterceptors() ?? []
    )
  }

  internal func params(
    _ request: Evmos_Incentives_V1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Evmos_Incentives_V1_QueryParamsResponse {
    return try await self.performAsyncUnaryCall(
      path: Evmos_Incentives_V1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Evmos_Incentives_V1_QueryAsyncClient: Evmos_Incentives_V1_QueryAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Evmos_Incentives_V1_QueryClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Evmos_Incentives_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Evmos_Incentives_V1_QueryClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'incentives'.
  func makeIncentivesInterceptors() -> [ClientInterceptor<Evmos_Incentives_V1_QueryIncentivesRequest, Evmos_Incentives_V1_QueryIncentivesResponse>]

  /// - Returns: Interceptors to use when invoking 'incentive'.
  func makeIncentiveInterceptors() -> [ClientInterceptor<Evmos_Incentives_V1_QueryIncentiveRequest, Evmos_Incentives_V1_QueryIncentiveResponse>]

  /// - Returns: Interceptors to use when invoking 'gasMeters'.
  func makeGasMetersInterceptors() -> [ClientInterceptor<Evmos_Incentives_V1_QueryGasMetersRequest, Evmos_Incentives_V1_QueryGasMetersResponse>]

  /// - Returns: Interceptors to use when invoking 'gasMeter'.
  func makeGasMeterInterceptors() -> [ClientInterceptor<Evmos_Incentives_V1_QueryGasMeterRequest, Evmos_Incentives_V1_QueryGasMeterResponse>]

  /// - Returns: Interceptors to use when invoking 'allocationMeters'.
  func makeAllocationMetersInterceptors() -> [ClientInterceptor<Evmos_Incentives_V1_QueryAllocationMetersRequest, Evmos_Incentives_V1_QueryAllocationMetersResponse>]

  /// - Returns: Interceptors to use when invoking 'allocationMeter'.
  func makeAllocationMeterInterceptors() -> [ClientInterceptor<Evmos_Incentives_V1_QueryAllocationMeterRequest, Evmos_Incentives_V1_QueryAllocationMeterResponse>]

  /// - Returns: Interceptors to use when invoking 'params'.
  func makeParamsInterceptors() -> [ClientInterceptor<Evmos_Incentives_V1_QueryParamsRequest, Evmos_Incentives_V1_QueryParamsResponse>]
}

internal enum Evmos_Incentives_V1_QueryClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "evmos.incentives.v1.Query",
    methods: [
      Evmos_Incentives_V1_QueryClientMetadata.Methods.incentives,
      Evmos_Incentives_V1_QueryClientMetadata.Methods.incentive,
      Evmos_Incentives_V1_QueryClientMetadata.Methods.gasMeters,
      Evmos_Incentives_V1_QueryClientMetadata.Methods.gasMeter,
      Evmos_Incentives_V1_QueryClientMetadata.Methods.allocationMeters,
      Evmos_Incentives_V1_QueryClientMetadata.Methods.allocationMeter,
      Evmos_Incentives_V1_QueryClientMetadata.Methods.params,
    ]
  )

  internal enum Methods {
    internal static let incentives = GRPCMethodDescriptor(
      name: "Incentives",
      path: "/evmos.incentives.v1.Query/Incentives",
      type: GRPCCallType.unary
    )

    internal static let incentive = GRPCMethodDescriptor(
      name: "Incentive",
      path: "/evmos.incentives.v1.Query/Incentive",
      type: GRPCCallType.unary
    )

    internal static let gasMeters = GRPCMethodDescriptor(
      name: "GasMeters",
      path: "/evmos.incentives.v1.Query/GasMeters",
      type: GRPCCallType.unary
    )

    internal static let gasMeter = GRPCMethodDescriptor(
      name: "GasMeter",
      path: "/evmos.incentives.v1.Query/GasMeter",
      type: GRPCCallType.unary
    )

    internal static let allocationMeters = GRPCMethodDescriptor(
      name: "AllocationMeters",
      path: "/evmos.incentives.v1.Query/AllocationMeters",
      type: GRPCCallType.unary
    )

    internal static let allocationMeter = GRPCMethodDescriptor(
      name: "AllocationMeter",
      path: "/evmos.incentives.v1.Query/AllocationMeter",
      type: GRPCCallType.unary
    )

    internal static let params = GRPCMethodDescriptor(
      name: "Params",
      path: "/evmos.incentives.v1.Query/Params",
      type: GRPCCallType.unary
    )
  }
}

/// Query defines the gRPC querier service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Evmos_Incentives_V1_QueryProvider: CallHandlerProvider {
  var interceptors: Evmos_Incentives_V1_QueryServerInterceptorFactoryProtocol? { get }

  /// Incentives retrieves registered incentives
  func incentives(request: Evmos_Incentives_V1_QueryIncentivesRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Evmos_Incentives_V1_QueryIncentivesResponse>

  /// Incentive retrieves a registered incentive
  func incentive(request: Evmos_Incentives_V1_QueryIncentiveRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Evmos_Incentives_V1_QueryIncentiveResponse>

  /// GasMeters retrieves active gas meters for a given contract
  func gasMeters(request: Evmos_Incentives_V1_QueryGasMetersRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Evmos_Incentives_V1_QueryGasMetersResponse>

  /// GasMeter retrieves a active gas meter
  func gasMeter(request: Evmos_Incentives_V1_QueryGasMeterRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Evmos_Incentives_V1_QueryGasMeterResponse>

  /// AllocationMeters retrieves active allocation meters for a given
  /// denomination
  func allocationMeters(request: Evmos_Incentives_V1_QueryAllocationMetersRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Evmos_Incentives_V1_QueryAllocationMetersResponse>

  /// AllocationMeter retrieves a active gas meter
  func allocationMeter(request: Evmos_Incentives_V1_QueryAllocationMeterRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Evmos_Incentives_V1_QueryAllocationMeterResponse>

  /// Params retrieves the incentives module params
  func params(request: Evmos_Incentives_V1_QueryParamsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Evmos_Incentives_V1_QueryParamsResponse>
}

extension Evmos_Incentives_V1_QueryProvider {
  internal var serviceName: Substring {
    return Evmos_Incentives_V1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Incentives":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Evmos_Incentives_V1_QueryIncentivesRequest>(),
        responseSerializer: ProtobufSerializer<Evmos_Incentives_V1_QueryIncentivesResponse>(),
        interceptors: self.interceptors?.makeIncentivesInterceptors() ?? [],
        userFunction: self.incentives(request:context:)
      )

    case "Incentive":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Evmos_Incentives_V1_QueryIncentiveRequest>(),
        responseSerializer: ProtobufSerializer<Evmos_Incentives_V1_QueryIncentiveResponse>(),
        interceptors: self.interceptors?.makeIncentiveInterceptors() ?? [],
        userFunction: self.incentive(request:context:)
      )

    case "GasMeters":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Evmos_Incentives_V1_QueryGasMetersRequest>(),
        responseSerializer: ProtobufSerializer<Evmos_Incentives_V1_QueryGasMetersResponse>(),
        interceptors: self.interceptors?.makeGasMetersInterceptors() ?? [],
        userFunction: self.gasMeters(request:context:)
      )

    case "GasMeter":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Evmos_Incentives_V1_QueryGasMeterRequest>(),
        responseSerializer: ProtobufSerializer<Evmos_Incentives_V1_QueryGasMeterResponse>(),
        interceptors: self.interceptors?.makeGasMeterInterceptors() ?? [],
        userFunction: self.gasMeter(request:context:)
      )

    case "AllocationMeters":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Evmos_Incentives_V1_QueryAllocationMetersRequest>(),
        responseSerializer: ProtobufSerializer<Evmos_Incentives_V1_QueryAllocationMetersResponse>(),
        interceptors: self.interceptors?.makeAllocationMetersInterceptors() ?? [],
        userFunction: self.allocationMeters(request:context:)
      )

    case "AllocationMeter":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Evmos_Incentives_V1_QueryAllocationMeterRequest>(),
        responseSerializer: ProtobufSerializer<Evmos_Incentives_V1_QueryAllocationMeterResponse>(),
        interceptors: self.interceptors?.makeAllocationMeterInterceptors() ?? [],
        userFunction: self.allocationMeter(request:context:)
      )

    case "Params":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Evmos_Incentives_V1_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Evmos_Incentives_V1_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        userFunction: self.params(request:context:)
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
internal protocol Evmos_Incentives_V1_QueryAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Evmos_Incentives_V1_QueryServerInterceptorFactoryProtocol? { get }

  /// Incentives retrieves registered incentives
  @Sendable func incentives(
    request: Evmos_Incentives_V1_QueryIncentivesRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Evmos_Incentives_V1_QueryIncentivesResponse

  /// Incentive retrieves a registered incentive
  @Sendable func incentive(
    request: Evmos_Incentives_V1_QueryIncentiveRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Evmos_Incentives_V1_QueryIncentiveResponse

  /// GasMeters retrieves active gas meters for a given contract
  @Sendable func gasMeters(
    request: Evmos_Incentives_V1_QueryGasMetersRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Evmos_Incentives_V1_QueryGasMetersResponse

  /// GasMeter retrieves a active gas meter
  @Sendable func gasMeter(
    request: Evmos_Incentives_V1_QueryGasMeterRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Evmos_Incentives_V1_QueryGasMeterResponse

  /// AllocationMeters retrieves active allocation meters for a given
  /// denomination
  @Sendable func allocationMeters(
    request: Evmos_Incentives_V1_QueryAllocationMetersRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Evmos_Incentives_V1_QueryAllocationMetersResponse

  /// AllocationMeter retrieves a active gas meter
  @Sendable func allocationMeter(
    request: Evmos_Incentives_V1_QueryAllocationMeterRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Evmos_Incentives_V1_QueryAllocationMeterResponse

  /// Params retrieves the incentives module params
  @Sendable func params(
    request: Evmos_Incentives_V1_QueryParamsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Evmos_Incentives_V1_QueryParamsResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Evmos_Incentives_V1_QueryAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Evmos_Incentives_V1_QueryServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Evmos_Incentives_V1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Evmos_Incentives_V1_QueryServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Incentives":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Evmos_Incentives_V1_QueryIncentivesRequest>(),
        responseSerializer: ProtobufSerializer<Evmos_Incentives_V1_QueryIncentivesResponse>(),
        interceptors: self.interceptors?.makeIncentivesInterceptors() ?? [],
        wrapping: self.incentives(request:context:)
      )

    case "Incentive":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Evmos_Incentives_V1_QueryIncentiveRequest>(),
        responseSerializer: ProtobufSerializer<Evmos_Incentives_V1_QueryIncentiveResponse>(),
        interceptors: self.interceptors?.makeIncentiveInterceptors() ?? [],
        wrapping: self.incentive(request:context:)
      )

    case "GasMeters":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Evmos_Incentives_V1_QueryGasMetersRequest>(),
        responseSerializer: ProtobufSerializer<Evmos_Incentives_V1_QueryGasMetersResponse>(),
        interceptors: self.interceptors?.makeGasMetersInterceptors() ?? [],
        wrapping: self.gasMeters(request:context:)
      )

    case "GasMeter":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Evmos_Incentives_V1_QueryGasMeterRequest>(),
        responseSerializer: ProtobufSerializer<Evmos_Incentives_V1_QueryGasMeterResponse>(),
        interceptors: self.interceptors?.makeGasMeterInterceptors() ?? [],
        wrapping: self.gasMeter(request:context:)
      )

    case "AllocationMeters":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Evmos_Incentives_V1_QueryAllocationMetersRequest>(),
        responseSerializer: ProtobufSerializer<Evmos_Incentives_V1_QueryAllocationMetersResponse>(),
        interceptors: self.interceptors?.makeAllocationMetersInterceptors() ?? [],
        wrapping: self.allocationMeters(request:context:)
      )

    case "AllocationMeter":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Evmos_Incentives_V1_QueryAllocationMeterRequest>(),
        responseSerializer: ProtobufSerializer<Evmos_Incentives_V1_QueryAllocationMeterResponse>(),
        interceptors: self.interceptors?.makeAllocationMeterInterceptors() ?? [],
        wrapping: self.allocationMeter(request:context:)
      )

    case "Params":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Evmos_Incentives_V1_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Evmos_Incentives_V1_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        wrapping: self.params(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Evmos_Incentives_V1_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'incentives'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeIncentivesInterceptors() -> [ServerInterceptor<Evmos_Incentives_V1_QueryIncentivesRequest, Evmos_Incentives_V1_QueryIncentivesResponse>]

  /// - Returns: Interceptors to use when handling 'incentive'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeIncentiveInterceptors() -> [ServerInterceptor<Evmos_Incentives_V1_QueryIncentiveRequest, Evmos_Incentives_V1_QueryIncentiveResponse>]

  /// - Returns: Interceptors to use when handling 'gasMeters'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeGasMetersInterceptors() -> [ServerInterceptor<Evmos_Incentives_V1_QueryGasMetersRequest, Evmos_Incentives_V1_QueryGasMetersResponse>]

  /// - Returns: Interceptors to use when handling 'gasMeter'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeGasMeterInterceptors() -> [ServerInterceptor<Evmos_Incentives_V1_QueryGasMeterRequest, Evmos_Incentives_V1_QueryGasMeterResponse>]

  /// - Returns: Interceptors to use when handling 'allocationMeters'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeAllocationMetersInterceptors() -> [ServerInterceptor<Evmos_Incentives_V1_QueryAllocationMetersRequest, Evmos_Incentives_V1_QueryAllocationMetersResponse>]

  /// - Returns: Interceptors to use when handling 'allocationMeter'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeAllocationMeterInterceptors() -> [ServerInterceptor<Evmos_Incentives_V1_QueryAllocationMeterRequest, Evmos_Incentives_V1_QueryAllocationMeterResponse>]

  /// - Returns: Interceptors to use when handling 'params'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeParamsInterceptors() -> [ServerInterceptor<Evmos_Incentives_V1_QueryParamsRequest, Evmos_Incentives_V1_QueryParamsResponse>]
}

internal enum Evmos_Incentives_V1_QueryServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "evmos.incentives.v1.Query",
    methods: [
      Evmos_Incentives_V1_QueryServerMetadata.Methods.incentives,
      Evmos_Incentives_V1_QueryServerMetadata.Methods.incentive,
      Evmos_Incentives_V1_QueryServerMetadata.Methods.gasMeters,
      Evmos_Incentives_V1_QueryServerMetadata.Methods.gasMeter,
      Evmos_Incentives_V1_QueryServerMetadata.Methods.allocationMeters,
      Evmos_Incentives_V1_QueryServerMetadata.Methods.allocationMeter,
      Evmos_Incentives_V1_QueryServerMetadata.Methods.params,
    ]
  )

  internal enum Methods {
    internal static let incentives = GRPCMethodDescriptor(
      name: "Incentives",
      path: "/evmos.incentives.v1.Query/Incentives",
      type: GRPCCallType.unary
    )

    internal static let incentive = GRPCMethodDescriptor(
      name: "Incentive",
      path: "/evmos.incentives.v1.Query/Incentive",
      type: GRPCCallType.unary
    )

    internal static let gasMeters = GRPCMethodDescriptor(
      name: "GasMeters",
      path: "/evmos.incentives.v1.Query/GasMeters",
      type: GRPCCallType.unary
    )

    internal static let gasMeter = GRPCMethodDescriptor(
      name: "GasMeter",
      path: "/evmos.incentives.v1.Query/GasMeter",
      type: GRPCCallType.unary
    )

    internal static let allocationMeters = GRPCMethodDescriptor(
      name: "AllocationMeters",
      path: "/evmos.incentives.v1.Query/AllocationMeters",
      type: GRPCCallType.unary
    )

    internal static let allocationMeter = GRPCMethodDescriptor(
      name: "AllocationMeter",
      path: "/evmos.incentives.v1.Query/AllocationMeter",
      type: GRPCCallType.unary
    )

    internal static let params = GRPCMethodDescriptor(
      name: "Params",
      path: "/evmos.incentives.v1.Query/Params",
      type: GRPCCallType.unary
    )
  }
}