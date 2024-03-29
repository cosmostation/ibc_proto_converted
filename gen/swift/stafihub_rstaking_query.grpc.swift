//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: stafihub/rstaking/query.proto
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
/// Usage: instantiate `Stafihub_Stafihub_Rstaking_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Stafihub_Stafihub_Rstaking_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Stafihub_Stafihub_Rstaking_QueryClientInterceptorFactoryProtocol? { get }

  func params(
    _ request: Stafihub_Stafihub_Rstaking_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Stafihub_Stafihub_Rstaking_QueryParamsRequest, Stafihub_Stafihub_Rstaking_QueryParamsResponse>

  func inflationBase(
    _ request: Stafihub_Stafihub_Rstaking_QueryInflationBaseRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Stafihub_Stafihub_Rstaking_QueryInflationBaseRequest, Stafihub_Stafihub_Rstaking_QueryInflationBaseResponse>

  func validatorWhitelist(
    _ request: Stafihub_Stafihub_Rstaking_QueryValidatorWhitelistRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Stafihub_Stafihub_Rstaking_QueryValidatorWhitelistRequest, Stafihub_Stafihub_Rstaking_QueryValidatorWhitelistResponse>

  func validatorWhitelistSwitch(
    _ request: Stafihub_Stafihub_Rstaking_QueryValidatorWhitelistSwitchRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Stafihub_Stafihub_Rstaking_QueryValidatorWhitelistSwitchRequest, Stafihub_Stafihub_Rstaking_QueryValidatorWhitelistSwitchResponse>

  func delegatorWhitelist(
    _ request: Stafihub_Stafihub_Rstaking_QueryDelegatorWhitelistRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Stafihub_Stafihub_Rstaking_QueryDelegatorWhitelistRequest, Stafihub_Stafihub_Rstaking_QueryDelegatorWhitelistResponse>

  func delegatorWhitelistSwitch(
    _ request: Stafihub_Stafihub_Rstaking_QueryDelegatorWhitelistSwitchRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Stafihub_Stafihub_Rstaking_QueryDelegatorWhitelistSwitchRequest, Stafihub_Stafihub_Rstaking_QueryDelegatorWhitelistSwitchResponse>
}

extension Stafihub_Stafihub_Rstaking_QueryClientProtocol {
  internal var serviceName: String {
    return "stafihub.stafihub.rstaking.Query"
  }

  /// Parameters queries the parameters of the module.
  ///
  /// - Parameters:
  ///   - request: Request to send to Params.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func params(
    _ request: Stafihub_Stafihub_Rstaking_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Stafihub_Stafihub_Rstaking_QueryParamsRequest, Stafihub_Stafihub_Rstaking_QueryParamsResponse> {
    return self.makeUnaryCall(
      path: Stafihub_Stafihub_Rstaking_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }

  /// Queries a list of InflationBase items.
  ///
  /// - Parameters:
  ///   - request: Request to send to InflationBase.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func inflationBase(
    _ request: Stafihub_Stafihub_Rstaking_QueryInflationBaseRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Stafihub_Stafihub_Rstaking_QueryInflationBaseRequest, Stafihub_Stafihub_Rstaking_QueryInflationBaseResponse> {
    return self.makeUnaryCall(
      path: Stafihub_Stafihub_Rstaking_QueryClientMetadata.Methods.inflationBase.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeInflationBaseInterceptors() ?? []
    )
  }

  /// Queries a list of ValidatorWhitelist items.
  ///
  /// - Parameters:
  ///   - request: Request to send to ValidatorWhitelist.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func validatorWhitelist(
    _ request: Stafihub_Stafihub_Rstaking_QueryValidatorWhitelistRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Stafihub_Stafihub_Rstaking_QueryValidatorWhitelistRequest, Stafihub_Stafihub_Rstaking_QueryValidatorWhitelistResponse> {
    return self.makeUnaryCall(
      path: Stafihub_Stafihub_Rstaking_QueryClientMetadata.Methods.validatorWhitelist.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeValidatorWhitelistInterceptors() ?? []
    )
  }

  /// Queries a list of WhitelistSwitch items.
  ///
  /// - Parameters:
  ///   - request: Request to send to ValidatorWhitelistSwitch.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func validatorWhitelistSwitch(
    _ request: Stafihub_Stafihub_Rstaking_QueryValidatorWhitelistSwitchRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Stafihub_Stafihub_Rstaking_QueryValidatorWhitelistSwitchRequest, Stafihub_Stafihub_Rstaking_QueryValidatorWhitelistSwitchResponse> {
    return self.makeUnaryCall(
      path: Stafihub_Stafihub_Rstaking_QueryClientMetadata.Methods.validatorWhitelistSwitch.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeValidatorWhitelistSwitchInterceptors() ?? []
    )
  }

  /// Queries a list of DelegatorWhitelist items.
  ///
  /// - Parameters:
  ///   - request: Request to send to DelegatorWhitelist.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func delegatorWhitelist(
    _ request: Stafihub_Stafihub_Rstaking_QueryDelegatorWhitelistRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Stafihub_Stafihub_Rstaking_QueryDelegatorWhitelistRequest, Stafihub_Stafihub_Rstaking_QueryDelegatorWhitelistResponse> {
    return self.makeUnaryCall(
      path: Stafihub_Stafihub_Rstaking_QueryClientMetadata.Methods.delegatorWhitelist.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDelegatorWhitelistInterceptors() ?? []
    )
  }

  /// Queries a list of DelegatorWhitelistSwitch items.
  ///
  /// - Parameters:
  ///   - request: Request to send to DelegatorWhitelistSwitch.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func delegatorWhitelistSwitch(
    _ request: Stafihub_Stafihub_Rstaking_QueryDelegatorWhitelistSwitchRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Stafihub_Stafihub_Rstaking_QueryDelegatorWhitelistSwitchRequest, Stafihub_Stafihub_Rstaking_QueryDelegatorWhitelistSwitchResponse> {
    return self.makeUnaryCall(
      path: Stafihub_Stafihub_Rstaking_QueryClientMetadata.Methods.delegatorWhitelistSwitch.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDelegatorWhitelistSwitchInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Stafihub_Stafihub_Rstaking_QueryClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Stafihub_Stafihub_Rstaking_QueryNIOClient")
internal final class Stafihub_Stafihub_Rstaking_QueryClient: Stafihub_Stafihub_Rstaking_QueryClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Stafihub_Stafihub_Rstaking_QueryClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Stafihub_Stafihub_Rstaking_QueryClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the stafihub.stafihub.rstaking.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Stafihub_Stafihub_Rstaking_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Stafihub_Stafihub_Rstaking_QueryNIOClient: Stafihub_Stafihub_Rstaking_QueryClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Stafihub_Stafihub_Rstaking_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the stafihub.stafihub.rstaking.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Stafihub_Stafihub_Rstaking_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query defines the gRPC querier service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Stafihub_Stafihub_Rstaking_QueryAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Stafihub_Stafihub_Rstaking_QueryClientInterceptorFactoryProtocol? { get }

  func makeParamsCall(
    _ request: Stafihub_Stafihub_Rstaking_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Stafihub_Stafihub_Rstaking_QueryParamsRequest, Stafihub_Stafihub_Rstaking_QueryParamsResponse>

  func makeInflationBaseCall(
    _ request: Stafihub_Stafihub_Rstaking_QueryInflationBaseRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Stafihub_Stafihub_Rstaking_QueryInflationBaseRequest, Stafihub_Stafihub_Rstaking_QueryInflationBaseResponse>

  func makeValidatorWhitelistCall(
    _ request: Stafihub_Stafihub_Rstaking_QueryValidatorWhitelistRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Stafihub_Stafihub_Rstaking_QueryValidatorWhitelistRequest, Stafihub_Stafihub_Rstaking_QueryValidatorWhitelistResponse>

  func makeValidatorWhitelistSwitchCall(
    _ request: Stafihub_Stafihub_Rstaking_QueryValidatorWhitelistSwitchRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Stafihub_Stafihub_Rstaking_QueryValidatorWhitelistSwitchRequest, Stafihub_Stafihub_Rstaking_QueryValidatorWhitelistSwitchResponse>

  func makeDelegatorWhitelistCall(
    _ request: Stafihub_Stafihub_Rstaking_QueryDelegatorWhitelistRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Stafihub_Stafihub_Rstaking_QueryDelegatorWhitelistRequest, Stafihub_Stafihub_Rstaking_QueryDelegatorWhitelistResponse>

  func makeDelegatorWhitelistSwitchCall(
    _ request: Stafihub_Stafihub_Rstaking_QueryDelegatorWhitelistSwitchRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Stafihub_Stafihub_Rstaking_QueryDelegatorWhitelistSwitchRequest, Stafihub_Stafihub_Rstaking_QueryDelegatorWhitelistSwitchResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Stafihub_Stafihub_Rstaking_QueryAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Stafihub_Stafihub_Rstaking_QueryClientMetadata.serviceDescriptor
  }

  internal var interceptors: Stafihub_Stafihub_Rstaking_QueryClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeParamsCall(
    _ request: Stafihub_Stafihub_Rstaking_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Stafihub_Stafihub_Rstaking_QueryParamsRequest, Stafihub_Stafihub_Rstaking_QueryParamsResponse> {
    return self.makeAsyncUnaryCall(
      path: Stafihub_Stafihub_Rstaking_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }

  internal func makeInflationBaseCall(
    _ request: Stafihub_Stafihub_Rstaking_QueryInflationBaseRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Stafihub_Stafihub_Rstaking_QueryInflationBaseRequest, Stafihub_Stafihub_Rstaking_QueryInflationBaseResponse> {
    return self.makeAsyncUnaryCall(
      path: Stafihub_Stafihub_Rstaking_QueryClientMetadata.Methods.inflationBase.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeInflationBaseInterceptors() ?? []
    )
  }

  internal func makeValidatorWhitelistCall(
    _ request: Stafihub_Stafihub_Rstaking_QueryValidatorWhitelistRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Stafihub_Stafihub_Rstaking_QueryValidatorWhitelistRequest, Stafihub_Stafihub_Rstaking_QueryValidatorWhitelistResponse> {
    return self.makeAsyncUnaryCall(
      path: Stafihub_Stafihub_Rstaking_QueryClientMetadata.Methods.validatorWhitelist.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeValidatorWhitelistInterceptors() ?? []
    )
  }

  internal func makeValidatorWhitelistSwitchCall(
    _ request: Stafihub_Stafihub_Rstaking_QueryValidatorWhitelistSwitchRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Stafihub_Stafihub_Rstaking_QueryValidatorWhitelistSwitchRequest, Stafihub_Stafihub_Rstaking_QueryValidatorWhitelistSwitchResponse> {
    return self.makeAsyncUnaryCall(
      path: Stafihub_Stafihub_Rstaking_QueryClientMetadata.Methods.validatorWhitelistSwitch.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeValidatorWhitelistSwitchInterceptors() ?? []
    )
  }

  internal func makeDelegatorWhitelistCall(
    _ request: Stafihub_Stafihub_Rstaking_QueryDelegatorWhitelistRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Stafihub_Stafihub_Rstaking_QueryDelegatorWhitelistRequest, Stafihub_Stafihub_Rstaking_QueryDelegatorWhitelistResponse> {
    return self.makeAsyncUnaryCall(
      path: Stafihub_Stafihub_Rstaking_QueryClientMetadata.Methods.delegatorWhitelist.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDelegatorWhitelistInterceptors() ?? []
    )
  }

  internal func makeDelegatorWhitelistSwitchCall(
    _ request: Stafihub_Stafihub_Rstaking_QueryDelegatorWhitelistSwitchRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Stafihub_Stafihub_Rstaking_QueryDelegatorWhitelistSwitchRequest, Stafihub_Stafihub_Rstaking_QueryDelegatorWhitelistSwitchResponse> {
    return self.makeAsyncUnaryCall(
      path: Stafihub_Stafihub_Rstaking_QueryClientMetadata.Methods.delegatorWhitelistSwitch.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDelegatorWhitelistSwitchInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Stafihub_Stafihub_Rstaking_QueryAsyncClientProtocol {
  internal func params(
    _ request: Stafihub_Stafihub_Rstaking_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Stafihub_Stafihub_Rstaking_QueryParamsResponse {
    return try await self.performAsyncUnaryCall(
      path: Stafihub_Stafihub_Rstaking_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }

  internal func inflationBase(
    _ request: Stafihub_Stafihub_Rstaking_QueryInflationBaseRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Stafihub_Stafihub_Rstaking_QueryInflationBaseResponse {
    return try await self.performAsyncUnaryCall(
      path: Stafihub_Stafihub_Rstaking_QueryClientMetadata.Methods.inflationBase.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeInflationBaseInterceptors() ?? []
    )
  }

  internal func validatorWhitelist(
    _ request: Stafihub_Stafihub_Rstaking_QueryValidatorWhitelistRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Stafihub_Stafihub_Rstaking_QueryValidatorWhitelistResponse {
    return try await self.performAsyncUnaryCall(
      path: Stafihub_Stafihub_Rstaking_QueryClientMetadata.Methods.validatorWhitelist.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeValidatorWhitelistInterceptors() ?? []
    )
  }

  internal func validatorWhitelistSwitch(
    _ request: Stafihub_Stafihub_Rstaking_QueryValidatorWhitelistSwitchRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Stafihub_Stafihub_Rstaking_QueryValidatorWhitelistSwitchResponse {
    return try await self.performAsyncUnaryCall(
      path: Stafihub_Stafihub_Rstaking_QueryClientMetadata.Methods.validatorWhitelistSwitch.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeValidatorWhitelistSwitchInterceptors() ?? []
    )
  }

  internal func delegatorWhitelist(
    _ request: Stafihub_Stafihub_Rstaking_QueryDelegatorWhitelistRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Stafihub_Stafihub_Rstaking_QueryDelegatorWhitelistResponse {
    return try await self.performAsyncUnaryCall(
      path: Stafihub_Stafihub_Rstaking_QueryClientMetadata.Methods.delegatorWhitelist.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDelegatorWhitelistInterceptors() ?? []
    )
  }

  internal func delegatorWhitelistSwitch(
    _ request: Stafihub_Stafihub_Rstaking_QueryDelegatorWhitelistSwitchRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Stafihub_Stafihub_Rstaking_QueryDelegatorWhitelistSwitchResponse {
    return try await self.performAsyncUnaryCall(
      path: Stafihub_Stafihub_Rstaking_QueryClientMetadata.Methods.delegatorWhitelistSwitch.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDelegatorWhitelistSwitchInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Stafihub_Stafihub_Rstaking_QueryAsyncClient: Stafihub_Stafihub_Rstaking_QueryAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Stafihub_Stafihub_Rstaking_QueryClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Stafihub_Stafihub_Rstaking_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Stafihub_Stafihub_Rstaking_QueryClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'params'.
  func makeParamsInterceptors() -> [ClientInterceptor<Stafihub_Stafihub_Rstaking_QueryParamsRequest, Stafihub_Stafihub_Rstaking_QueryParamsResponse>]

  /// - Returns: Interceptors to use when invoking 'inflationBase'.
  func makeInflationBaseInterceptors() -> [ClientInterceptor<Stafihub_Stafihub_Rstaking_QueryInflationBaseRequest, Stafihub_Stafihub_Rstaking_QueryInflationBaseResponse>]

  /// - Returns: Interceptors to use when invoking 'validatorWhitelist'.
  func makeValidatorWhitelistInterceptors() -> [ClientInterceptor<Stafihub_Stafihub_Rstaking_QueryValidatorWhitelistRequest, Stafihub_Stafihub_Rstaking_QueryValidatorWhitelistResponse>]

  /// - Returns: Interceptors to use when invoking 'validatorWhitelistSwitch'.
  func makeValidatorWhitelistSwitchInterceptors() -> [ClientInterceptor<Stafihub_Stafihub_Rstaking_QueryValidatorWhitelistSwitchRequest, Stafihub_Stafihub_Rstaking_QueryValidatorWhitelistSwitchResponse>]

  /// - Returns: Interceptors to use when invoking 'delegatorWhitelist'.
  func makeDelegatorWhitelistInterceptors() -> [ClientInterceptor<Stafihub_Stafihub_Rstaking_QueryDelegatorWhitelistRequest, Stafihub_Stafihub_Rstaking_QueryDelegatorWhitelistResponse>]

  /// - Returns: Interceptors to use when invoking 'delegatorWhitelistSwitch'.
  func makeDelegatorWhitelistSwitchInterceptors() -> [ClientInterceptor<Stafihub_Stafihub_Rstaking_QueryDelegatorWhitelistSwitchRequest, Stafihub_Stafihub_Rstaking_QueryDelegatorWhitelistSwitchResponse>]
}

internal enum Stafihub_Stafihub_Rstaking_QueryClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "stafihub.stafihub.rstaking.Query",
    methods: [
      Stafihub_Stafihub_Rstaking_QueryClientMetadata.Methods.params,
      Stafihub_Stafihub_Rstaking_QueryClientMetadata.Methods.inflationBase,
      Stafihub_Stafihub_Rstaking_QueryClientMetadata.Methods.validatorWhitelist,
      Stafihub_Stafihub_Rstaking_QueryClientMetadata.Methods.validatorWhitelistSwitch,
      Stafihub_Stafihub_Rstaking_QueryClientMetadata.Methods.delegatorWhitelist,
      Stafihub_Stafihub_Rstaking_QueryClientMetadata.Methods.delegatorWhitelistSwitch,
    ]
  )

  internal enum Methods {
    internal static let params = GRPCMethodDescriptor(
      name: "Params",
      path: "/stafihub.stafihub.rstaking.Query/Params",
      type: GRPCCallType.unary
    )

    internal static let inflationBase = GRPCMethodDescriptor(
      name: "InflationBase",
      path: "/stafihub.stafihub.rstaking.Query/InflationBase",
      type: GRPCCallType.unary
    )

    internal static let validatorWhitelist = GRPCMethodDescriptor(
      name: "ValidatorWhitelist",
      path: "/stafihub.stafihub.rstaking.Query/ValidatorWhitelist",
      type: GRPCCallType.unary
    )

    internal static let validatorWhitelistSwitch = GRPCMethodDescriptor(
      name: "ValidatorWhitelistSwitch",
      path: "/stafihub.stafihub.rstaking.Query/ValidatorWhitelistSwitch",
      type: GRPCCallType.unary
    )

    internal static let delegatorWhitelist = GRPCMethodDescriptor(
      name: "DelegatorWhitelist",
      path: "/stafihub.stafihub.rstaking.Query/DelegatorWhitelist",
      type: GRPCCallType.unary
    )

    internal static let delegatorWhitelistSwitch = GRPCMethodDescriptor(
      name: "DelegatorWhitelistSwitch",
      path: "/stafihub.stafihub.rstaking.Query/DelegatorWhitelistSwitch",
      type: GRPCCallType.unary
    )
  }
}

/// Query defines the gRPC querier service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Stafihub_Stafihub_Rstaking_QueryProvider: CallHandlerProvider {
  var interceptors: Stafihub_Stafihub_Rstaking_QueryServerInterceptorFactoryProtocol? { get }

  /// Parameters queries the parameters of the module.
  func params(request: Stafihub_Stafihub_Rstaking_QueryParamsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Stafihub_Stafihub_Rstaking_QueryParamsResponse>

  /// Queries a list of InflationBase items.
  func inflationBase(request: Stafihub_Stafihub_Rstaking_QueryInflationBaseRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Stafihub_Stafihub_Rstaking_QueryInflationBaseResponse>

  /// Queries a list of ValidatorWhitelist items.
  func validatorWhitelist(request: Stafihub_Stafihub_Rstaking_QueryValidatorWhitelistRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Stafihub_Stafihub_Rstaking_QueryValidatorWhitelistResponse>

  /// Queries a list of WhitelistSwitch items.
  func validatorWhitelistSwitch(request: Stafihub_Stafihub_Rstaking_QueryValidatorWhitelistSwitchRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Stafihub_Stafihub_Rstaking_QueryValidatorWhitelistSwitchResponse>

  /// Queries a list of DelegatorWhitelist items.
  func delegatorWhitelist(request: Stafihub_Stafihub_Rstaking_QueryDelegatorWhitelistRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Stafihub_Stafihub_Rstaking_QueryDelegatorWhitelistResponse>

  /// Queries a list of DelegatorWhitelistSwitch items.
  func delegatorWhitelistSwitch(request: Stafihub_Stafihub_Rstaking_QueryDelegatorWhitelistSwitchRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Stafihub_Stafihub_Rstaking_QueryDelegatorWhitelistSwitchResponse>
}

extension Stafihub_Stafihub_Rstaking_QueryProvider {
  internal var serviceName: Substring {
    return Stafihub_Stafihub_Rstaking_QueryServerMetadata.serviceDescriptor.fullName[...]
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
        requestDeserializer: ProtobufDeserializer<Stafihub_Stafihub_Rstaking_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Stafihub_Stafihub_Rstaking_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        userFunction: self.params(request:context:)
      )

    case "InflationBase":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stafihub_Stafihub_Rstaking_QueryInflationBaseRequest>(),
        responseSerializer: ProtobufSerializer<Stafihub_Stafihub_Rstaking_QueryInflationBaseResponse>(),
        interceptors: self.interceptors?.makeInflationBaseInterceptors() ?? [],
        userFunction: self.inflationBase(request:context:)
      )

    case "ValidatorWhitelist":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stafihub_Stafihub_Rstaking_QueryValidatorWhitelistRequest>(),
        responseSerializer: ProtobufSerializer<Stafihub_Stafihub_Rstaking_QueryValidatorWhitelistResponse>(),
        interceptors: self.interceptors?.makeValidatorWhitelistInterceptors() ?? [],
        userFunction: self.validatorWhitelist(request:context:)
      )

    case "ValidatorWhitelistSwitch":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stafihub_Stafihub_Rstaking_QueryValidatorWhitelistSwitchRequest>(),
        responseSerializer: ProtobufSerializer<Stafihub_Stafihub_Rstaking_QueryValidatorWhitelistSwitchResponse>(),
        interceptors: self.interceptors?.makeValidatorWhitelistSwitchInterceptors() ?? [],
        userFunction: self.validatorWhitelistSwitch(request:context:)
      )

    case "DelegatorWhitelist":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stafihub_Stafihub_Rstaking_QueryDelegatorWhitelistRequest>(),
        responseSerializer: ProtobufSerializer<Stafihub_Stafihub_Rstaking_QueryDelegatorWhitelistResponse>(),
        interceptors: self.interceptors?.makeDelegatorWhitelistInterceptors() ?? [],
        userFunction: self.delegatorWhitelist(request:context:)
      )

    case "DelegatorWhitelistSwitch":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stafihub_Stafihub_Rstaking_QueryDelegatorWhitelistSwitchRequest>(),
        responseSerializer: ProtobufSerializer<Stafihub_Stafihub_Rstaking_QueryDelegatorWhitelistSwitchResponse>(),
        interceptors: self.interceptors?.makeDelegatorWhitelistSwitchInterceptors() ?? [],
        userFunction: self.delegatorWhitelistSwitch(request:context:)
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
internal protocol Stafihub_Stafihub_Rstaking_QueryAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Stafihub_Stafihub_Rstaking_QueryServerInterceptorFactoryProtocol? { get }

  /// Parameters queries the parameters of the module.
  @Sendable func params(
    request: Stafihub_Stafihub_Rstaking_QueryParamsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Stafihub_Stafihub_Rstaking_QueryParamsResponse

  /// Queries a list of InflationBase items.
  @Sendable func inflationBase(
    request: Stafihub_Stafihub_Rstaking_QueryInflationBaseRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Stafihub_Stafihub_Rstaking_QueryInflationBaseResponse

  /// Queries a list of ValidatorWhitelist items.
  @Sendable func validatorWhitelist(
    request: Stafihub_Stafihub_Rstaking_QueryValidatorWhitelistRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Stafihub_Stafihub_Rstaking_QueryValidatorWhitelistResponse

  /// Queries a list of WhitelistSwitch items.
  @Sendable func validatorWhitelistSwitch(
    request: Stafihub_Stafihub_Rstaking_QueryValidatorWhitelistSwitchRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Stafihub_Stafihub_Rstaking_QueryValidatorWhitelistSwitchResponse

  /// Queries a list of DelegatorWhitelist items.
  @Sendable func delegatorWhitelist(
    request: Stafihub_Stafihub_Rstaking_QueryDelegatorWhitelistRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Stafihub_Stafihub_Rstaking_QueryDelegatorWhitelistResponse

  /// Queries a list of DelegatorWhitelistSwitch items.
  @Sendable func delegatorWhitelistSwitch(
    request: Stafihub_Stafihub_Rstaking_QueryDelegatorWhitelistSwitchRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Stafihub_Stafihub_Rstaking_QueryDelegatorWhitelistSwitchResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Stafihub_Stafihub_Rstaking_QueryAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Stafihub_Stafihub_Rstaking_QueryServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Stafihub_Stafihub_Rstaking_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Stafihub_Stafihub_Rstaking_QueryServerInterceptorFactoryProtocol? {
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
        requestDeserializer: ProtobufDeserializer<Stafihub_Stafihub_Rstaking_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Stafihub_Stafihub_Rstaking_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        wrapping: self.params(request:context:)
      )

    case "InflationBase":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stafihub_Stafihub_Rstaking_QueryInflationBaseRequest>(),
        responseSerializer: ProtobufSerializer<Stafihub_Stafihub_Rstaking_QueryInflationBaseResponse>(),
        interceptors: self.interceptors?.makeInflationBaseInterceptors() ?? [],
        wrapping: self.inflationBase(request:context:)
      )

    case "ValidatorWhitelist":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stafihub_Stafihub_Rstaking_QueryValidatorWhitelistRequest>(),
        responseSerializer: ProtobufSerializer<Stafihub_Stafihub_Rstaking_QueryValidatorWhitelistResponse>(),
        interceptors: self.interceptors?.makeValidatorWhitelistInterceptors() ?? [],
        wrapping: self.validatorWhitelist(request:context:)
      )

    case "ValidatorWhitelistSwitch":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stafihub_Stafihub_Rstaking_QueryValidatorWhitelistSwitchRequest>(),
        responseSerializer: ProtobufSerializer<Stafihub_Stafihub_Rstaking_QueryValidatorWhitelistSwitchResponse>(),
        interceptors: self.interceptors?.makeValidatorWhitelistSwitchInterceptors() ?? [],
        wrapping: self.validatorWhitelistSwitch(request:context:)
      )

    case "DelegatorWhitelist":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stafihub_Stafihub_Rstaking_QueryDelegatorWhitelistRequest>(),
        responseSerializer: ProtobufSerializer<Stafihub_Stafihub_Rstaking_QueryDelegatorWhitelistResponse>(),
        interceptors: self.interceptors?.makeDelegatorWhitelistInterceptors() ?? [],
        wrapping: self.delegatorWhitelist(request:context:)
      )

    case "DelegatorWhitelistSwitch":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stafihub_Stafihub_Rstaking_QueryDelegatorWhitelistSwitchRequest>(),
        responseSerializer: ProtobufSerializer<Stafihub_Stafihub_Rstaking_QueryDelegatorWhitelistSwitchResponse>(),
        interceptors: self.interceptors?.makeDelegatorWhitelistSwitchInterceptors() ?? [],
        wrapping: self.delegatorWhitelistSwitch(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Stafihub_Stafihub_Rstaking_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'params'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeParamsInterceptors() -> [ServerInterceptor<Stafihub_Stafihub_Rstaking_QueryParamsRequest, Stafihub_Stafihub_Rstaking_QueryParamsResponse>]

  /// - Returns: Interceptors to use when handling 'inflationBase'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeInflationBaseInterceptors() -> [ServerInterceptor<Stafihub_Stafihub_Rstaking_QueryInflationBaseRequest, Stafihub_Stafihub_Rstaking_QueryInflationBaseResponse>]

  /// - Returns: Interceptors to use when handling 'validatorWhitelist'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeValidatorWhitelistInterceptors() -> [ServerInterceptor<Stafihub_Stafihub_Rstaking_QueryValidatorWhitelistRequest, Stafihub_Stafihub_Rstaking_QueryValidatorWhitelistResponse>]

  /// - Returns: Interceptors to use when handling 'validatorWhitelistSwitch'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeValidatorWhitelistSwitchInterceptors() -> [ServerInterceptor<Stafihub_Stafihub_Rstaking_QueryValidatorWhitelistSwitchRequest, Stafihub_Stafihub_Rstaking_QueryValidatorWhitelistSwitchResponse>]

  /// - Returns: Interceptors to use when handling 'delegatorWhitelist'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeDelegatorWhitelistInterceptors() -> [ServerInterceptor<Stafihub_Stafihub_Rstaking_QueryDelegatorWhitelistRequest, Stafihub_Stafihub_Rstaking_QueryDelegatorWhitelistResponse>]

  /// - Returns: Interceptors to use when handling 'delegatorWhitelistSwitch'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeDelegatorWhitelistSwitchInterceptors() -> [ServerInterceptor<Stafihub_Stafihub_Rstaking_QueryDelegatorWhitelistSwitchRequest, Stafihub_Stafihub_Rstaking_QueryDelegatorWhitelistSwitchResponse>]
}

internal enum Stafihub_Stafihub_Rstaking_QueryServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "stafihub.stafihub.rstaking.Query",
    methods: [
      Stafihub_Stafihub_Rstaking_QueryServerMetadata.Methods.params,
      Stafihub_Stafihub_Rstaking_QueryServerMetadata.Methods.inflationBase,
      Stafihub_Stafihub_Rstaking_QueryServerMetadata.Methods.validatorWhitelist,
      Stafihub_Stafihub_Rstaking_QueryServerMetadata.Methods.validatorWhitelistSwitch,
      Stafihub_Stafihub_Rstaking_QueryServerMetadata.Methods.delegatorWhitelist,
      Stafihub_Stafihub_Rstaking_QueryServerMetadata.Methods.delegatorWhitelistSwitch,
    ]
  )

  internal enum Methods {
    internal static let params = GRPCMethodDescriptor(
      name: "Params",
      path: "/stafihub.stafihub.rstaking.Query/Params",
      type: GRPCCallType.unary
    )

    internal static let inflationBase = GRPCMethodDescriptor(
      name: "InflationBase",
      path: "/stafihub.stafihub.rstaking.Query/InflationBase",
      type: GRPCCallType.unary
    )

    internal static let validatorWhitelist = GRPCMethodDescriptor(
      name: "ValidatorWhitelist",
      path: "/stafihub.stafihub.rstaking.Query/ValidatorWhitelist",
      type: GRPCCallType.unary
    )

    internal static let validatorWhitelistSwitch = GRPCMethodDescriptor(
      name: "ValidatorWhitelistSwitch",
      path: "/stafihub.stafihub.rstaking.Query/ValidatorWhitelistSwitch",
      type: GRPCCallType.unary
    )

    internal static let delegatorWhitelist = GRPCMethodDescriptor(
      name: "DelegatorWhitelist",
      path: "/stafihub.stafihub.rstaking.Query/DelegatorWhitelist",
      type: GRPCCallType.unary
    )

    internal static let delegatorWhitelistSwitch = GRPCMethodDescriptor(
      name: "DelegatorWhitelistSwitch",
      path: "/stafihub.stafihub.rstaking.Query/DelegatorWhitelistSwitch",
      type: GRPCCallType.unary
    )
  }
}
