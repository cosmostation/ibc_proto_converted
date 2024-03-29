//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: injective/insurance/v1beta1/query.proto
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
/// Usage: instantiate `Injective_Insurance_V1beta1_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Injective_Insurance_V1beta1_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Injective_Insurance_V1beta1_QueryClientInterceptorFactoryProtocol? { get }

  func insuranceParams(
    _ request: Injective_Insurance_V1beta1_QueryInsuranceParamsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Injective_Insurance_V1beta1_QueryInsuranceParamsRequest, Injective_Insurance_V1beta1_QueryInsuranceParamsResponse>

  func insuranceFund(
    _ request: Injective_Insurance_V1beta1_QueryInsuranceFundRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Injective_Insurance_V1beta1_QueryInsuranceFundRequest, Injective_Insurance_V1beta1_QueryInsuranceFundResponse>

  func insuranceFunds(
    _ request: Injective_Insurance_V1beta1_QueryInsuranceFundsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Injective_Insurance_V1beta1_QueryInsuranceFundsRequest, Injective_Insurance_V1beta1_QueryInsuranceFundsResponse>

  func estimatedRedemptions(
    _ request: Injective_Insurance_V1beta1_QueryEstimatedRedemptionsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Injective_Insurance_V1beta1_QueryEstimatedRedemptionsRequest, Injective_Insurance_V1beta1_QueryEstimatedRedemptionsResponse>

  func pendingRedemptions(
    _ request: Injective_Insurance_V1beta1_QueryPendingRedemptionsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Injective_Insurance_V1beta1_QueryPendingRedemptionsRequest, Injective_Insurance_V1beta1_QueryPendingRedemptionsResponse>

  func insuranceModuleState(
    _ request: Injective_Insurance_V1beta1_QueryModuleStateRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Injective_Insurance_V1beta1_QueryModuleStateRequest, Injective_Insurance_V1beta1_QueryModuleStateResponse>
}

extension Injective_Insurance_V1beta1_QueryClientProtocol {
  internal var serviceName: String {
    return "injective.insurance.v1beta1.Query"
  }

  /// Retrieves insurance params
  ///
  /// - Parameters:
  ///   - request: Request to send to InsuranceParams.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func insuranceParams(
    _ request: Injective_Insurance_V1beta1_QueryInsuranceParamsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Injective_Insurance_V1beta1_QueryInsuranceParamsRequest, Injective_Insurance_V1beta1_QueryInsuranceParamsResponse> {
    return self.makeUnaryCall(
      path: Injective_Insurance_V1beta1_QueryClientMetadata.Methods.insuranceParams.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeInsuranceParamsInterceptors() ?? []
    )
  }

  /// Retrieves individual insurance fund information from market id
  ///
  /// - Parameters:
  ///   - request: Request to send to InsuranceFund.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func insuranceFund(
    _ request: Injective_Insurance_V1beta1_QueryInsuranceFundRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Injective_Insurance_V1beta1_QueryInsuranceFundRequest, Injective_Insurance_V1beta1_QueryInsuranceFundResponse> {
    return self.makeUnaryCall(
      path: Injective_Insurance_V1beta1_QueryClientMetadata.Methods.insuranceFund.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeInsuranceFundInterceptors() ?? []
    )
  }

  /// Retrieves all insurance funds
  ///
  /// - Parameters:
  ///   - request: Request to send to InsuranceFunds.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func insuranceFunds(
    _ request: Injective_Insurance_V1beta1_QueryInsuranceFundsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Injective_Insurance_V1beta1_QueryInsuranceFundsRequest, Injective_Insurance_V1beta1_QueryInsuranceFundsResponse> {
    return self.makeUnaryCall(
      path: Injective_Insurance_V1beta1_QueryClientMetadata.Methods.insuranceFunds.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeInsuranceFundsInterceptors() ?? []
    )
  }

  /// Retrives the value of insurance fund share token at current price (not
  /// pending redemption)
  ///
  /// - Parameters:
  ///   - request: Request to send to EstimatedRedemptions.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func estimatedRedemptions(
    _ request: Injective_Insurance_V1beta1_QueryEstimatedRedemptionsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Injective_Insurance_V1beta1_QueryEstimatedRedemptionsRequest, Injective_Insurance_V1beta1_QueryEstimatedRedemptionsResponse> {
    return self.makeUnaryCall(
      path: Injective_Insurance_V1beta1_QueryClientMetadata.Methods.estimatedRedemptions.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeEstimatedRedemptionsInterceptors() ?? []
    )
  }

  /// Retrieves pending redemptions' share token at current price
  ///
  /// - Parameters:
  ///   - request: Request to send to PendingRedemptions.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func pendingRedemptions(
    _ request: Injective_Insurance_V1beta1_QueryPendingRedemptionsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Injective_Insurance_V1beta1_QueryPendingRedemptionsRequest, Injective_Insurance_V1beta1_QueryPendingRedemptionsResponse> {
    return self.makeUnaryCall(
      path: Injective_Insurance_V1beta1_QueryClientMetadata.Methods.pendingRedemptions.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makePendingRedemptionsInterceptors() ?? []
    )
  }

  /// Retrieves the entire insurance module's state
  ///
  /// - Parameters:
  ///   - request: Request to send to InsuranceModuleState.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func insuranceModuleState(
    _ request: Injective_Insurance_V1beta1_QueryModuleStateRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Injective_Insurance_V1beta1_QueryModuleStateRequest, Injective_Insurance_V1beta1_QueryModuleStateResponse> {
    return self.makeUnaryCall(
      path: Injective_Insurance_V1beta1_QueryClientMetadata.Methods.insuranceModuleState.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeInsuranceModuleStateInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Injective_Insurance_V1beta1_QueryClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Injective_Insurance_V1beta1_QueryNIOClient")
internal final class Injective_Insurance_V1beta1_QueryClient: Injective_Insurance_V1beta1_QueryClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Injective_Insurance_V1beta1_QueryClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Injective_Insurance_V1beta1_QueryClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the injective.insurance.v1beta1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Injective_Insurance_V1beta1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Injective_Insurance_V1beta1_QueryNIOClient: Injective_Insurance_V1beta1_QueryClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Injective_Insurance_V1beta1_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the injective.insurance.v1beta1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Injective_Insurance_V1beta1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query defines the gRPC querier service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Injective_Insurance_V1beta1_QueryAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Injective_Insurance_V1beta1_QueryClientInterceptorFactoryProtocol? { get }

  func makeInsuranceParamsCall(
    _ request: Injective_Insurance_V1beta1_QueryInsuranceParamsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Injective_Insurance_V1beta1_QueryInsuranceParamsRequest, Injective_Insurance_V1beta1_QueryInsuranceParamsResponse>

  func makeInsuranceFundCall(
    _ request: Injective_Insurance_V1beta1_QueryInsuranceFundRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Injective_Insurance_V1beta1_QueryInsuranceFundRequest, Injective_Insurance_V1beta1_QueryInsuranceFundResponse>

  func makeInsuranceFundsCall(
    _ request: Injective_Insurance_V1beta1_QueryInsuranceFundsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Injective_Insurance_V1beta1_QueryInsuranceFundsRequest, Injective_Insurance_V1beta1_QueryInsuranceFundsResponse>

  func makeEstimatedRedemptionsCall(
    _ request: Injective_Insurance_V1beta1_QueryEstimatedRedemptionsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Injective_Insurance_V1beta1_QueryEstimatedRedemptionsRequest, Injective_Insurance_V1beta1_QueryEstimatedRedemptionsResponse>

  func makePendingRedemptionsCall(
    _ request: Injective_Insurance_V1beta1_QueryPendingRedemptionsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Injective_Insurance_V1beta1_QueryPendingRedemptionsRequest, Injective_Insurance_V1beta1_QueryPendingRedemptionsResponse>

  func makeInsuranceModuleStateCall(
    _ request: Injective_Insurance_V1beta1_QueryModuleStateRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Injective_Insurance_V1beta1_QueryModuleStateRequest, Injective_Insurance_V1beta1_QueryModuleStateResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Injective_Insurance_V1beta1_QueryAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Injective_Insurance_V1beta1_QueryClientMetadata.serviceDescriptor
  }

  internal var interceptors: Injective_Insurance_V1beta1_QueryClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeInsuranceParamsCall(
    _ request: Injective_Insurance_V1beta1_QueryInsuranceParamsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Injective_Insurance_V1beta1_QueryInsuranceParamsRequest, Injective_Insurance_V1beta1_QueryInsuranceParamsResponse> {
    return self.makeAsyncUnaryCall(
      path: Injective_Insurance_V1beta1_QueryClientMetadata.Methods.insuranceParams.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeInsuranceParamsInterceptors() ?? []
    )
  }

  internal func makeInsuranceFundCall(
    _ request: Injective_Insurance_V1beta1_QueryInsuranceFundRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Injective_Insurance_V1beta1_QueryInsuranceFundRequest, Injective_Insurance_V1beta1_QueryInsuranceFundResponse> {
    return self.makeAsyncUnaryCall(
      path: Injective_Insurance_V1beta1_QueryClientMetadata.Methods.insuranceFund.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeInsuranceFundInterceptors() ?? []
    )
  }

  internal func makeInsuranceFundsCall(
    _ request: Injective_Insurance_V1beta1_QueryInsuranceFundsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Injective_Insurance_V1beta1_QueryInsuranceFundsRequest, Injective_Insurance_V1beta1_QueryInsuranceFundsResponse> {
    return self.makeAsyncUnaryCall(
      path: Injective_Insurance_V1beta1_QueryClientMetadata.Methods.insuranceFunds.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeInsuranceFundsInterceptors() ?? []
    )
  }

  internal func makeEstimatedRedemptionsCall(
    _ request: Injective_Insurance_V1beta1_QueryEstimatedRedemptionsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Injective_Insurance_V1beta1_QueryEstimatedRedemptionsRequest, Injective_Insurance_V1beta1_QueryEstimatedRedemptionsResponse> {
    return self.makeAsyncUnaryCall(
      path: Injective_Insurance_V1beta1_QueryClientMetadata.Methods.estimatedRedemptions.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeEstimatedRedemptionsInterceptors() ?? []
    )
  }

  internal func makePendingRedemptionsCall(
    _ request: Injective_Insurance_V1beta1_QueryPendingRedemptionsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Injective_Insurance_V1beta1_QueryPendingRedemptionsRequest, Injective_Insurance_V1beta1_QueryPendingRedemptionsResponse> {
    return self.makeAsyncUnaryCall(
      path: Injective_Insurance_V1beta1_QueryClientMetadata.Methods.pendingRedemptions.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makePendingRedemptionsInterceptors() ?? []
    )
  }

  internal func makeInsuranceModuleStateCall(
    _ request: Injective_Insurance_V1beta1_QueryModuleStateRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Injective_Insurance_V1beta1_QueryModuleStateRequest, Injective_Insurance_V1beta1_QueryModuleStateResponse> {
    return self.makeAsyncUnaryCall(
      path: Injective_Insurance_V1beta1_QueryClientMetadata.Methods.insuranceModuleState.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeInsuranceModuleStateInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Injective_Insurance_V1beta1_QueryAsyncClientProtocol {
  internal func insuranceParams(
    _ request: Injective_Insurance_V1beta1_QueryInsuranceParamsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Injective_Insurance_V1beta1_QueryInsuranceParamsResponse {
    return try await self.performAsyncUnaryCall(
      path: Injective_Insurance_V1beta1_QueryClientMetadata.Methods.insuranceParams.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeInsuranceParamsInterceptors() ?? []
    )
  }

  internal func insuranceFund(
    _ request: Injective_Insurance_V1beta1_QueryInsuranceFundRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Injective_Insurance_V1beta1_QueryInsuranceFundResponse {
    return try await self.performAsyncUnaryCall(
      path: Injective_Insurance_V1beta1_QueryClientMetadata.Methods.insuranceFund.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeInsuranceFundInterceptors() ?? []
    )
  }

  internal func insuranceFunds(
    _ request: Injective_Insurance_V1beta1_QueryInsuranceFundsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Injective_Insurance_V1beta1_QueryInsuranceFundsResponse {
    return try await self.performAsyncUnaryCall(
      path: Injective_Insurance_V1beta1_QueryClientMetadata.Methods.insuranceFunds.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeInsuranceFundsInterceptors() ?? []
    )
  }

  internal func estimatedRedemptions(
    _ request: Injective_Insurance_V1beta1_QueryEstimatedRedemptionsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Injective_Insurance_V1beta1_QueryEstimatedRedemptionsResponse {
    return try await self.performAsyncUnaryCall(
      path: Injective_Insurance_V1beta1_QueryClientMetadata.Methods.estimatedRedemptions.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeEstimatedRedemptionsInterceptors() ?? []
    )
  }

  internal func pendingRedemptions(
    _ request: Injective_Insurance_V1beta1_QueryPendingRedemptionsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Injective_Insurance_V1beta1_QueryPendingRedemptionsResponse {
    return try await self.performAsyncUnaryCall(
      path: Injective_Insurance_V1beta1_QueryClientMetadata.Methods.pendingRedemptions.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makePendingRedemptionsInterceptors() ?? []
    )
  }

  internal func insuranceModuleState(
    _ request: Injective_Insurance_V1beta1_QueryModuleStateRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Injective_Insurance_V1beta1_QueryModuleStateResponse {
    return try await self.performAsyncUnaryCall(
      path: Injective_Insurance_V1beta1_QueryClientMetadata.Methods.insuranceModuleState.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeInsuranceModuleStateInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Injective_Insurance_V1beta1_QueryAsyncClient: Injective_Insurance_V1beta1_QueryAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Injective_Insurance_V1beta1_QueryClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Injective_Insurance_V1beta1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Injective_Insurance_V1beta1_QueryClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'insuranceParams'.
  func makeInsuranceParamsInterceptors() -> [ClientInterceptor<Injective_Insurance_V1beta1_QueryInsuranceParamsRequest, Injective_Insurance_V1beta1_QueryInsuranceParamsResponse>]

  /// - Returns: Interceptors to use when invoking 'insuranceFund'.
  func makeInsuranceFundInterceptors() -> [ClientInterceptor<Injective_Insurance_V1beta1_QueryInsuranceFundRequest, Injective_Insurance_V1beta1_QueryInsuranceFundResponse>]

  /// - Returns: Interceptors to use when invoking 'insuranceFunds'.
  func makeInsuranceFundsInterceptors() -> [ClientInterceptor<Injective_Insurance_V1beta1_QueryInsuranceFundsRequest, Injective_Insurance_V1beta1_QueryInsuranceFundsResponse>]

  /// - Returns: Interceptors to use when invoking 'estimatedRedemptions'.
  func makeEstimatedRedemptionsInterceptors() -> [ClientInterceptor<Injective_Insurance_V1beta1_QueryEstimatedRedemptionsRequest, Injective_Insurance_V1beta1_QueryEstimatedRedemptionsResponse>]

  /// - Returns: Interceptors to use when invoking 'pendingRedemptions'.
  func makePendingRedemptionsInterceptors() -> [ClientInterceptor<Injective_Insurance_V1beta1_QueryPendingRedemptionsRequest, Injective_Insurance_V1beta1_QueryPendingRedemptionsResponse>]

  /// - Returns: Interceptors to use when invoking 'insuranceModuleState'.
  func makeInsuranceModuleStateInterceptors() -> [ClientInterceptor<Injective_Insurance_V1beta1_QueryModuleStateRequest, Injective_Insurance_V1beta1_QueryModuleStateResponse>]
}

internal enum Injective_Insurance_V1beta1_QueryClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "injective.insurance.v1beta1.Query",
    methods: [
      Injective_Insurance_V1beta1_QueryClientMetadata.Methods.insuranceParams,
      Injective_Insurance_V1beta1_QueryClientMetadata.Methods.insuranceFund,
      Injective_Insurance_V1beta1_QueryClientMetadata.Methods.insuranceFunds,
      Injective_Insurance_V1beta1_QueryClientMetadata.Methods.estimatedRedemptions,
      Injective_Insurance_V1beta1_QueryClientMetadata.Methods.pendingRedemptions,
      Injective_Insurance_V1beta1_QueryClientMetadata.Methods.insuranceModuleState,
    ]
  )

  internal enum Methods {
    internal static let insuranceParams = GRPCMethodDescriptor(
      name: "InsuranceParams",
      path: "/injective.insurance.v1beta1.Query/InsuranceParams",
      type: GRPCCallType.unary
    )

    internal static let insuranceFund = GRPCMethodDescriptor(
      name: "InsuranceFund",
      path: "/injective.insurance.v1beta1.Query/InsuranceFund",
      type: GRPCCallType.unary
    )

    internal static let insuranceFunds = GRPCMethodDescriptor(
      name: "InsuranceFunds",
      path: "/injective.insurance.v1beta1.Query/InsuranceFunds",
      type: GRPCCallType.unary
    )

    internal static let estimatedRedemptions = GRPCMethodDescriptor(
      name: "EstimatedRedemptions",
      path: "/injective.insurance.v1beta1.Query/EstimatedRedemptions",
      type: GRPCCallType.unary
    )

    internal static let pendingRedemptions = GRPCMethodDescriptor(
      name: "PendingRedemptions",
      path: "/injective.insurance.v1beta1.Query/PendingRedemptions",
      type: GRPCCallType.unary
    )

    internal static let insuranceModuleState = GRPCMethodDescriptor(
      name: "InsuranceModuleState",
      path: "/injective.insurance.v1beta1.Query/InsuranceModuleState",
      type: GRPCCallType.unary
    )
  }
}

/// Query defines the gRPC querier service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Injective_Insurance_V1beta1_QueryProvider: CallHandlerProvider {
  var interceptors: Injective_Insurance_V1beta1_QueryServerInterceptorFactoryProtocol? { get }

  /// Retrieves insurance params
  func insuranceParams(request: Injective_Insurance_V1beta1_QueryInsuranceParamsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Injective_Insurance_V1beta1_QueryInsuranceParamsResponse>

  /// Retrieves individual insurance fund information from market id
  func insuranceFund(request: Injective_Insurance_V1beta1_QueryInsuranceFundRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Injective_Insurance_V1beta1_QueryInsuranceFundResponse>

  /// Retrieves all insurance funds
  func insuranceFunds(request: Injective_Insurance_V1beta1_QueryInsuranceFundsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Injective_Insurance_V1beta1_QueryInsuranceFundsResponse>

  /// Retrives the value of insurance fund share token at current price (not
  /// pending redemption)
  func estimatedRedemptions(request: Injective_Insurance_V1beta1_QueryEstimatedRedemptionsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Injective_Insurance_V1beta1_QueryEstimatedRedemptionsResponse>

  /// Retrieves pending redemptions' share token at current price
  func pendingRedemptions(request: Injective_Insurance_V1beta1_QueryPendingRedemptionsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Injective_Insurance_V1beta1_QueryPendingRedemptionsResponse>

  /// Retrieves the entire insurance module's state
  func insuranceModuleState(request: Injective_Insurance_V1beta1_QueryModuleStateRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Injective_Insurance_V1beta1_QueryModuleStateResponse>
}

extension Injective_Insurance_V1beta1_QueryProvider {
  internal var serviceName: Substring {
    return Injective_Insurance_V1beta1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "InsuranceParams":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Injective_Insurance_V1beta1_QueryInsuranceParamsRequest>(),
        responseSerializer: ProtobufSerializer<Injective_Insurance_V1beta1_QueryInsuranceParamsResponse>(),
        interceptors: self.interceptors?.makeInsuranceParamsInterceptors() ?? [],
        userFunction: self.insuranceParams(request:context:)
      )

    case "InsuranceFund":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Injective_Insurance_V1beta1_QueryInsuranceFundRequest>(),
        responseSerializer: ProtobufSerializer<Injective_Insurance_V1beta1_QueryInsuranceFundResponse>(),
        interceptors: self.interceptors?.makeInsuranceFundInterceptors() ?? [],
        userFunction: self.insuranceFund(request:context:)
      )

    case "InsuranceFunds":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Injective_Insurance_V1beta1_QueryInsuranceFundsRequest>(),
        responseSerializer: ProtobufSerializer<Injective_Insurance_V1beta1_QueryInsuranceFundsResponse>(),
        interceptors: self.interceptors?.makeInsuranceFundsInterceptors() ?? [],
        userFunction: self.insuranceFunds(request:context:)
      )

    case "EstimatedRedemptions":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Injective_Insurance_V1beta1_QueryEstimatedRedemptionsRequest>(),
        responseSerializer: ProtobufSerializer<Injective_Insurance_V1beta1_QueryEstimatedRedemptionsResponse>(),
        interceptors: self.interceptors?.makeEstimatedRedemptionsInterceptors() ?? [],
        userFunction: self.estimatedRedemptions(request:context:)
      )

    case "PendingRedemptions":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Injective_Insurance_V1beta1_QueryPendingRedemptionsRequest>(),
        responseSerializer: ProtobufSerializer<Injective_Insurance_V1beta1_QueryPendingRedemptionsResponse>(),
        interceptors: self.interceptors?.makePendingRedemptionsInterceptors() ?? [],
        userFunction: self.pendingRedemptions(request:context:)
      )

    case "InsuranceModuleState":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Injective_Insurance_V1beta1_QueryModuleStateRequest>(),
        responseSerializer: ProtobufSerializer<Injective_Insurance_V1beta1_QueryModuleStateResponse>(),
        interceptors: self.interceptors?.makeInsuranceModuleStateInterceptors() ?? [],
        userFunction: self.insuranceModuleState(request:context:)
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
internal protocol Injective_Insurance_V1beta1_QueryAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Injective_Insurance_V1beta1_QueryServerInterceptorFactoryProtocol? { get }

  /// Retrieves insurance params
  @Sendable func insuranceParams(
    request: Injective_Insurance_V1beta1_QueryInsuranceParamsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Injective_Insurance_V1beta1_QueryInsuranceParamsResponse

  /// Retrieves individual insurance fund information from market id
  @Sendable func insuranceFund(
    request: Injective_Insurance_V1beta1_QueryInsuranceFundRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Injective_Insurance_V1beta1_QueryInsuranceFundResponse

  /// Retrieves all insurance funds
  @Sendable func insuranceFunds(
    request: Injective_Insurance_V1beta1_QueryInsuranceFundsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Injective_Insurance_V1beta1_QueryInsuranceFundsResponse

  /// Retrives the value of insurance fund share token at current price (not
  /// pending redemption)
  @Sendable func estimatedRedemptions(
    request: Injective_Insurance_V1beta1_QueryEstimatedRedemptionsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Injective_Insurance_V1beta1_QueryEstimatedRedemptionsResponse

  /// Retrieves pending redemptions' share token at current price
  @Sendable func pendingRedemptions(
    request: Injective_Insurance_V1beta1_QueryPendingRedemptionsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Injective_Insurance_V1beta1_QueryPendingRedemptionsResponse

  /// Retrieves the entire insurance module's state
  @Sendable func insuranceModuleState(
    request: Injective_Insurance_V1beta1_QueryModuleStateRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Injective_Insurance_V1beta1_QueryModuleStateResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Injective_Insurance_V1beta1_QueryAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Injective_Insurance_V1beta1_QueryServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Injective_Insurance_V1beta1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Injective_Insurance_V1beta1_QueryServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "InsuranceParams":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Injective_Insurance_V1beta1_QueryInsuranceParamsRequest>(),
        responseSerializer: ProtobufSerializer<Injective_Insurance_V1beta1_QueryInsuranceParamsResponse>(),
        interceptors: self.interceptors?.makeInsuranceParamsInterceptors() ?? [],
        wrapping: self.insuranceParams(request:context:)
      )

    case "InsuranceFund":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Injective_Insurance_V1beta1_QueryInsuranceFundRequest>(),
        responseSerializer: ProtobufSerializer<Injective_Insurance_V1beta1_QueryInsuranceFundResponse>(),
        interceptors: self.interceptors?.makeInsuranceFundInterceptors() ?? [],
        wrapping: self.insuranceFund(request:context:)
      )

    case "InsuranceFunds":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Injective_Insurance_V1beta1_QueryInsuranceFundsRequest>(),
        responseSerializer: ProtobufSerializer<Injective_Insurance_V1beta1_QueryInsuranceFundsResponse>(),
        interceptors: self.interceptors?.makeInsuranceFundsInterceptors() ?? [],
        wrapping: self.insuranceFunds(request:context:)
      )

    case "EstimatedRedemptions":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Injective_Insurance_V1beta1_QueryEstimatedRedemptionsRequest>(),
        responseSerializer: ProtobufSerializer<Injective_Insurance_V1beta1_QueryEstimatedRedemptionsResponse>(),
        interceptors: self.interceptors?.makeEstimatedRedemptionsInterceptors() ?? [],
        wrapping: self.estimatedRedemptions(request:context:)
      )

    case "PendingRedemptions":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Injective_Insurance_V1beta1_QueryPendingRedemptionsRequest>(),
        responseSerializer: ProtobufSerializer<Injective_Insurance_V1beta1_QueryPendingRedemptionsResponse>(),
        interceptors: self.interceptors?.makePendingRedemptionsInterceptors() ?? [],
        wrapping: self.pendingRedemptions(request:context:)
      )

    case "InsuranceModuleState":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Injective_Insurance_V1beta1_QueryModuleStateRequest>(),
        responseSerializer: ProtobufSerializer<Injective_Insurance_V1beta1_QueryModuleStateResponse>(),
        interceptors: self.interceptors?.makeInsuranceModuleStateInterceptors() ?? [],
        wrapping: self.insuranceModuleState(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Injective_Insurance_V1beta1_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'insuranceParams'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeInsuranceParamsInterceptors() -> [ServerInterceptor<Injective_Insurance_V1beta1_QueryInsuranceParamsRequest, Injective_Insurance_V1beta1_QueryInsuranceParamsResponse>]

  /// - Returns: Interceptors to use when handling 'insuranceFund'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeInsuranceFundInterceptors() -> [ServerInterceptor<Injective_Insurance_V1beta1_QueryInsuranceFundRequest, Injective_Insurance_V1beta1_QueryInsuranceFundResponse>]

  /// - Returns: Interceptors to use when handling 'insuranceFunds'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeInsuranceFundsInterceptors() -> [ServerInterceptor<Injective_Insurance_V1beta1_QueryInsuranceFundsRequest, Injective_Insurance_V1beta1_QueryInsuranceFundsResponse>]

  /// - Returns: Interceptors to use when handling 'estimatedRedemptions'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeEstimatedRedemptionsInterceptors() -> [ServerInterceptor<Injective_Insurance_V1beta1_QueryEstimatedRedemptionsRequest, Injective_Insurance_V1beta1_QueryEstimatedRedemptionsResponse>]

  /// - Returns: Interceptors to use when handling 'pendingRedemptions'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makePendingRedemptionsInterceptors() -> [ServerInterceptor<Injective_Insurance_V1beta1_QueryPendingRedemptionsRequest, Injective_Insurance_V1beta1_QueryPendingRedemptionsResponse>]

  /// - Returns: Interceptors to use when handling 'insuranceModuleState'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeInsuranceModuleStateInterceptors() -> [ServerInterceptor<Injective_Insurance_V1beta1_QueryModuleStateRequest, Injective_Insurance_V1beta1_QueryModuleStateResponse>]
}

internal enum Injective_Insurance_V1beta1_QueryServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "injective.insurance.v1beta1.Query",
    methods: [
      Injective_Insurance_V1beta1_QueryServerMetadata.Methods.insuranceParams,
      Injective_Insurance_V1beta1_QueryServerMetadata.Methods.insuranceFund,
      Injective_Insurance_V1beta1_QueryServerMetadata.Methods.insuranceFunds,
      Injective_Insurance_V1beta1_QueryServerMetadata.Methods.estimatedRedemptions,
      Injective_Insurance_V1beta1_QueryServerMetadata.Methods.pendingRedemptions,
      Injective_Insurance_V1beta1_QueryServerMetadata.Methods.insuranceModuleState,
    ]
  )

  internal enum Methods {
    internal static let insuranceParams = GRPCMethodDescriptor(
      name: "InsuranceParams",
      path: "/injective.insurance.v1beta1.Query/InsuranceParams",
      type: GRPCCallType.unary
    )

    internal static let insuranceFund = GRPCMethodDescriptor(
      name: "InsuranceFund",
      path: "/injective.insurance.v1beta1.Query/InsuranceFund",
      type: GRPCCallType.unary
    )

    internal static let insuranceFunds = GRPCMethodDescriptor(
      name: "InsuranceFunds",
      path: "/injective.insurance.v1beta1.Query/InsuranceFunds",
      type: GRPCCallType.unary
    )

    internal static let estimatedRedemptions = GRPCMethodDescriptor(
      name: "EstimatedRedemptions",
      path: "/injective.insurance.v1beta1.Query/EstimatedRedemptions",
      type: GRPCCallType.unary
    )

    internal static let pendingRedemptions = GRPCMethodDescriptor(
      name: "PendingRedemptions",
      path: "/injective.insurance.v1beta1.Query/PendingRedemptions",
      type: GRPCCallType.unary
    )

    internal static let insuranceModuleState = GRPCMethodDescriptor(
      name: "InsuranceModuleState",
      path: "/injective.insurance.v1beta1.Query/InsuranceModuleState",
      type: GRPCCallType.unary
    )
  }
}
