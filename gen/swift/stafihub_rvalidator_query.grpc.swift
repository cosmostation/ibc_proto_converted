//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: stafihub/rvalidator/query.proto
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
/// Usage: instantiate `Stafihub_Stafihub_Rvalidator_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Stafihub_Stafihub_Rvalidator_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Stafihub_Stafihub_Rvalidator_QueryClientInterceptorFactoryProtocol? { get }

  func params(
    _ request: Stafihub_Stafihub_Rvalidator_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Stafihub_Stafihub_Rvalidator_QueryParamsRequest, Stafihub_Stafihub_Rvalidator_QueryParamsResponse>

  func rValidatorList(
    _ request: Stafihub_Stafihub_Rvalidator_QueryRValidatorListRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Stafihub_Stafihub_Rvalidator_QueryRValidatorListRequest, Stafihub_Stafihub_Rvalidator_QueryRValidatorListResponse>

  func cycleSeconds(
    _ request: Stafihub_Stafihub_Rvalidator_QueryCycleSecondsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Stafihub_Stafihub_Rvalidator_QueryCycleSecondsRequest, Stafihub_Stafihub_Rvalidator_QueryCycleSecondsResponse>

  func shuffleSeconds(
    _ request: Stafihub_Stafihub_Rvalidator_QueryShuffleSecondsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Stafihub_Stafihub_Rvalidator_QueryShuffleSecondsRequest, Stafihub_Stafihub_Rvalidator_QueryShuffleSecondsResponse>

  func latestVotedCycle(
    _ request: Stafihub_Stafihub_Rvalidator_QueryLatestVotedCycleRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Stafihub_Stafihub_Rvalidator_QueryLatestVotedCycleRequest, Stafihub_Stafihub_Rvalidator_QueryLatestVotedCycleResponse>

  func latestDealedCycle(
    _ request: Stafihub_Stafihub_Rvalidator_QueryLatestDealedCycleRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Stafihub_Stafihub_Rvalidator_QueryLatestDealedCycleRequest, Stafihub_Stafihub_Rvalidator_QueryLatestDealedCycleResponse>
}

extension Stafihub_Stafihub_Rvalidator_QueryClientProtocol {
  internal var serviceName: String {
    return "stafihub.stafihub.rvalidator.Query"
  }

  /// Parameters queries the parameters of the module.
  ///
  /// - Parameters:
  ///   - request: Request to send to Params.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func params(
    _ request: Stafihub_Stafihub_Rvalidator_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Stafihub_Stafihub_Rvalidator_QueryParamsRequest, Stafihub_Stafihub_Rvalidator_QueryParamsResponse> {
    return self.makeUnaryCall(
      path: Stafihub_Stafihub_Rvalidator_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }

  /// Queries a list of RValidatorList items.
  ///
  /// - Parameters:
  ///   - request: Request to send to RValidatorList.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func rValidatorList(
    _ request: Stafihub_Stafihub_Rvalidator_QueryRValidatorListRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Stafihub_Stafihub_Rvalidator_QueryRValidatorListRequest, Stafihub_Stafihub_Rvalidator_QueryRValidatorListResponse> {
    return self.makeUnaryCall(
      path: Stafihub_Stafihub_Rvalidator_QueryClientMetadata.Methods.rValidatorList.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRValidatorListInterceptors() ?? []
    )
  }

  /// Queries a list of CycleSeconds items.
  ///
  /// - Parameters:
  ///   - request: Request to send to CycleSeconds.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func cycleSeconds(
    _ request: Stafihub_Stafihub_Rvalidator_QueryCycleSecondsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Stafihub_Stafihub_Rvalidator_QueryCycleSecondsRequest, Stafihub_Stafihub_Rvalidator_QueryCycleSecondsResponse> {
    return self.makeUnaryCall(
      path: Stafihub_Stafihub_Rvalidator_QueryClientMetadata.Methods.cycleSeconds.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCycleSecondsInterceptors() ?? []
    )
  }

  /// Queries a list of ShuffleSeconds items.
  ///
  /// - Parameters:
  ///   - request: Request to send to ShuffleSeconds.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func shuffleSeconds(
    _ request: Stafihub_Stafihub_Rvalidator_QueryShuffleSecondsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Stafihub_Stafihub_Rvalidator_QueryShuffleSecondsRequest, Stafihub_Stafihub_Rvalidator_QueryShuffleSecondsResponse> {
    return self.makeUnaryCall(
      path: Stafihub_Stafihub_Rvalidator_QueryClientMetadata.Methods.shuffleSeconds.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeShuffleSecondsInterceptors() ?? []
    )
  }

  /// Queries a list of LatestVotedCycle items.
  ///
  /// - Parameters:
  ///   - request: Request to send to LatestVotedCycle.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func latestVotedCycle(
    _ request: Stafihub_Stafihub_Rvalidator_QueryLatestVotedCycleRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Stafihub_Stafihub_Rvalidator_QueryLatestVotedCycleRequest, Stafihub_Stafihub_Rvalidator_QueryLatestVotedCycleResponse> {
    return self.makeUnaryCall(
      path: Stafihub_Stafihub_Rvalidator_QueryClientMetadata.Methods.latestVotedCycle.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeLatestVotedCycleInterceptors() ?? []
    )
  }

  /// Queries a list of LatestDealedCycle items.
  ///
  /// - Parameters:
  ///   - request: Request to send to LatestDealedCycle.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func latestDealedCycle(
    _ request: Stafihub_Stafihub_Rvalidator_QueryLatestDealedCycleRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Stafihub_Stafihub_Rvalidator_QueryLatestDealedCycleRequest, Stafihub_Stafihub_Rvalidator_QueryLatestDealedCycleResponse> {
    return self.makeUnaryCall(
      path: Stafihub_Stafihub_Rvalidator_QueryClientMetadata.Methods.latestDealedCycle.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeLatestDealedCycleInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Stafihub_Stafihub_Rvalidator_QueryClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Stafihub_Stafihub_Rvalidator_QueryNIOClient")
internal final class Stafihub_Stafihub_Rvalidator_QueryClient: Stafihub_Stafihub_Rvalidator_QueryClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Stafihub_Stafihub_Rvalidator_QueryClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Stafihub_Stafihub_Rvalidator_QueryClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the stafihub.stafihub.rvalidator.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Stafihub_Stafihub_Rvalidator_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Stafihub_Stafihub_Rvalidator_QueryNIOClient: Stafihub_Stafihub_Rvalidator_QueryClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Stafihub_Stafihub_Rvalidator_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the stafihub.stafihub.rvalidator.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Stafihub_Stafihub_Rvalidator_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query defines the gRPC querier service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Stafihub_Stafihub_Rvalidator_QueryAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Stafihub_Stafihub_Rvalidator_QueryClientInterceptorFactoryProtocol? { get }

  func makeParamsCall(
    _ request: Stafihub_Stafihub_Rvalidator_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Stafihub_Stafihub_Rvalidator_QueryParamsRequest, Stafihub_Stafihub_Rvalidator_QueryParamsResponse>

  func makeRvalidatorListCall(
    _ request: Stafihub_Stafihub_Rvalidator_QueryRValidatorListRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Stafihub_Stafihub_Rvalidator_QueryRValidatorListRequest, Stafihub_Stafihub_Rvalidator_QueryRValidatorListResponse>

  func makeCycleSecondsCall(
    _ request: Stafihub_Stafihub_Rvalidator_QueryCycleSecondsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Stafihub_Stafihub_Rvalidator_QueryCycleSecondsRequest, Stafihub_Stafihub_Rvalidator_QueryCycleSecondsResponse>

  func makeShuffleSecondsCall(
    _ request: Stafihub_Stafihub_Rvalidator_QueryShuffleSecondsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Stafihub_Stafihub_Rvalidator_QueryShuffleSecondsRequest, Stafihub_Stafihub_Rvalidator_QueryShuffleSecondsResponse>

  func makeLatestVotedCycleCall(
    _ request: Stafihub_Stafihub_Rvalidator_QueryLatestVotedCycleRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Stafihub_Stafihub_Rvalidator_QueryLatestVotedCycleRequest, Stafihub_Stafihub_Rvalidator_QueryLatestVotedCycleResponse>

  func makeLatestDealedCycleCall(
    _ request: Stafihub_Stafihub_Rvalidator_QueryLatestDealedCycleRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Stafihub_Stafihub_Rvalidator_QueryLatestDealedCycleRequest, Stafihub_Stafihub_Rvalidator_QueryLatestDealedCycleResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Stafihub_Stafihub_Rvalidator_QueryAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Stafihub_Stafihub_Rvalidator_QueryClientMetadata.serviceDescriptor
  }

  internal var interceptors: Stafihub_Stafihub_Rvalidator_QueryClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeParamsCall(
    _ request: Stafihub_Stafihub_Rvalidator_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Stafihub_Stafihub_Rvalidator_QueryParamsRequest, Stafihub_Stafihub_Rvalidator_QueryParamsResponse> {
    return self.makeAsyncUnaryCall(
      path: Stafihub_Stafihub_Rvalidator_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }

  internal func makeRvalidatorListCall(
    _ request: Stafihub_Stafihub_Rvalidator_QueryRValidatorListRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Stafihub_Stafihub_Rvalidator_QueryRValidatorListRequest, Stafihub_Stafihub_Rvalidator_QueryRValidatorListResponse> {
    return self.makeAsyncUnaryCall(
      path: Stafihub_Stafihub_Rvalidator_QueryClientMetadata.Methods.rValidatorList.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRValidatorListInterceptors() ?? []
    )
  }

  internal func makeCycleSecondsCall(
    _ request: Stafihub_Stafihub_Rvalidator_QueryCycleSecondsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Stafihub_Stafihub_Rvalidator_QueryCycleSecondsRequest, Stafihub_Stafihub_Rvalidator_QueryCycleSecondsResponse> {
    return self.makeAsyncUnaryCall(
      path: Stafihub_Stafihub_Rvalidator_QueryClientMetadata.Methods.cycleSeconds.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCycleSecondsInterceptors() ?? []
    )
  }

  internal func makeShuffleSecondsCall(
    _ request: Stafihub_Stafihub_Rvalidator_QueryShuffleSecondsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Stafihub_Stafihub_Rvalidator_QueryShuffleSecondsRequest, Stafihub_Stafihub_Rvalidator_QueryShuffleSecondsResponse> {
    return self.makeAsyncUnaryCall(
      path: Stafihub_Stafihub_Rvalidator_QueryClientMetadata.Methods.shuffleSeconds.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeShuffleSecondsInterceptors() ?? []
    )
  }

  internal func makeLatestVotedCycleCall(
    _ request: Stafihub_Stafihub_Rvalidator_QueryLatestVotedCycleRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Stafihub_Stafihub_Rvalidator_QueryLatestVotedCycleRequest, Stafihub_Stafihub_Rvalidator_QueryLatestVotedCycleResponse> {
    return self.makeAsyncUnaryCall(
      path: Stafihub_Stafihub_Rvalidator_QueryClientMetadata.Methods.latestVotedCycle.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeLatestVotedCycleInterceptors() ?? []
    )
  }

  internal func makeLatestDealedCycleCall(
    _ request: Stafihub_Stafihub_Rvalidator_QueryLatestDealedCycleRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Stafihub_Stafihub_Rvalidator_QueryLatestDealedCycleRequest, Stafihub_Stafihub_Rvalidator_QueryLatestDealedCycleResponse> {
    return self.makeAsyncUnaryCall(
      path: Stafihub_Stafihub_Rvalidator_QueryClientMetadata.Methods.latestDealedCycle.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeLatestDealedCycleInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Stafihub_Stafihub_Rvalidator_QueryAsyncClientProtocol {
  internal func params(
    _ request: Stafihub_Stafihub_Rvalidator_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Stafihub_Stafihub_Rvalidator_QueryParamsResponse {
    return try await self.performAsyncUnaryCall(
      path: Stafihub_Stafihub_Rvalidator_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }

  internal func rValidatorList(
    _ request: Stafihub_Stafihub_Rvalidator_QueryRValidatorListRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Stafihub_Stafihub_Rvalidator_QueryRValidatorListResponse {
    return try await self.performAsyncUnaryCall(
      path: Stafihub_Stafihub_Rvalidator_QueryClientMetadata.Methods.rValidatorList.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRValidatorListInterceptors() ?? []
    )
  }

  internal func cycleSeconds(
    _ request: Stafihub_Stafihub_Rvalidator_QueryCycleSecondsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Stafihub_Stafihub_Rvalidator_QueryCycleSecondsResponse {
    return try await self.performAsyncUnaryCall(
      path: Stafihub_Stafihub_Rvalidator_QueryClientMetadata.Methods.cycleSeconds.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCycleSecondsInterceptors() ?? []
    )
  }

  internal func shuffleSeconds(
    _ request: Stafihub_Stafihub_Rvalidator_QueryShuffleSecondsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Stafihub_Stafihub_Rvalidator_QueryShuffleSecondsResponse {
    return try await self.performAsyncUnaryCall(
      path: Stafihub_Stafihub_Rvalidator_QueryClientMetadata.Methods.shuffleSeconds.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeShuffleSecondsInterceptors() ?? []
    )
  }

  internal func latestVotedCycle(
    _ request: Stafihub_Stafihub_Rvalidator_QueryLatestVotedCycleRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Stafihub_Stafihub_Rvalidator_QueryLatestVotedCycleResponse {
    return try await self.performAsyncUnaryCall(
      path: Stafihub_Stafihub_Rvalidator_QueryClientMetadata.Methods.latestVotedCycle.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeLatestVotedCycleInterceptors() ?? []
    )
  }

  internal func latestDealedCycle(
    _ request: Stafihub_Stafihub_Rvalidator_QueryLatestDealedCycleRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Stafihub_Stafihub_Rvalidator_QueryLatestDealedCycleResponse {
    return try await self.performAsyncUnaryCall(
      path: Stafihub_Stafihub_Rvalidator_QueryClientMetadata.Methods.latestDealedCycle.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeLatestDealedCycleInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Stafihub_Stafihub_Rvalidator_QueryAsyncClient: Stafihub_Stafihub_Rvalidator_QueryAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Stafihub_Stafihub_Rvalidator_QueryClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Stafihub_Stafihub_Rvalidator_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Stafihub_Stafihub_Rvalidator_QueryClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'params'.
  func makeParamsInterceptors() -> [ClientInterceptor<Stafihub_Stafihub_Rvalidator_QueryParamsRequest, Stafihub_Stafihub_Rvalidator_QueryParamsResponse>]

  /// - Returns: Interceptors to use when invoking 'rValidatorList'.
  func makeRValidatorListInterceptors() -> [ClientInterceptor<Stafihub_Stafihub_Rvalidator_QueryRValidatorListRequest, Stafihub_Stafihub_Rvalidator_QueryRValidatorListResponse>]

  /// - Returns: Interceptors to use when invoking 'cycleSeconds'.
  func makeCycleSecondsInterceptors() -> [ClientInterceptor<Stafihub_Stafihub_Rvalidator_QueryCycleSecondsRequest, Stafihub_Stafihub_Rvalidator_QueryCycleSecondsResponse>]

  /// - Returns: Interceptors to use when invoking 'shuffleSeconds'.
  func makeShuffleSecondsInterceptors() -> [ClientInterceptor<Stafihub_Stafihub_Rvalidator_QueryShuffleSecondsRequest, Stafihub_Stafihub_Rvalidator_QueryShuffleSecondsResponse>]

  /// - Returns: Interceptors to use when invoking 'latestVotedCycle'.
  func makeLatestVotedCycleInterceptors() -> [ClientInterceptor<Stafihub_Stafihub_Rvalidator_QueryLatestVotedCycleRequest, Stafihub_Stafihub_Rvalidator_QueryLatestVotedCycleResponse>]

  /// - Returns: Interceptors to use when invoking 'latestDealedCycle'.
  func makeLatestDealedCycleInterceptors() -> [ClientInterceptor<Stafihub_Stafihub_Rvalidator_QueryLatestDealedCycleRequest, Stafihub_Stafihub_Rvalidator_QueryLatestDealedCycleResponse>]
}

internal enum Stafihub_Stafihub_Rvalidator_QueryClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "stafihub.stafihub.rvalidator.Query",
    methods: [
      Stafihub_Stafihub_Rvalidator_QueryClientMetadata.Methods.params,
      Stafihub_Stafihub_Rvalidator_QueryClientMetadata.Methods.rValidatorList,
      Stafihub_Stafihub_Rvalidator_QueryClientMetadata.Methods.cycleSeconds,
      Stafihub_Stafihub_Rvalidator_QueryClientMetadata.Methods.shuffleSeconds,
      Stafihub_Stafihub_Rvalidator_QueryClientMetadata.Methods.latestVotedCycle,
      Stafihub_Stafihub_Rvalidator_QueryClientMetadata.Methods.latestDealedCycle,
    ]
  )

  internal enum Methods {
    internal static let params = GRPCMethodDescriptor(
      name: "Params",
      path: "/stafihub.stafihub.rvalidator.Query/Params",
      type: GRPCCallType.unary
    )

    internal static let rValidatorList = GRPCMethodDescriptor(
      name: "RValidatorList",
      path: "/stafihub.stafihub.rvalidator.Query/RValidatorList",
      type: GRPCCallType.unary
    )

    internal static let cycleSeconds = GRPCMethodDescriptor(
      name: "CycleSeconds",
      path: "/stafihub.stafihub.rvalidator.Query/CycleSeconds",
      type: GRPCCallType.unary
    )

    internal static let shuffleSeconds = GRPCMethodDescriptor(
      name: "ShuffleSeconds",
      path: "/stafihub.stafihub.rvalidator.Query/ShuffleSeconds",
      type: GRPCCallType.unary
    )

    internal static let latestVotedCycle = GRPCMethodDescriptor(
      name: "LatestVotedCycle",
      path: "/stafihub.stafihub.rvalidator.Query/LatestVotedCycle",
      type: GRPCCallType.unary
    )

    internal static let latestDealedCycle = GRPCMethodDescriptor(
      name: "LatestDealedCycle",
      path: "/stafihub.stafihub.rvalidator.Query/LatestDealedCycle",
      type: GRPCCallType.unary
    )
  }
}

/// Query defines the gRPC querier service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Stafihub_Stafihub_Rvalidator_QueryProvider: CallHandlerProvider {
  var interceptors: Stafihub_Stafihub_Rvalidator_QueryServerInterceptorFactoryProtocol? { get }

  /// Parameters queries the parameters of the module.
  func params(request: Stafihub_Stafihub_Rvalidator_QueryParamsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Stafihub_Stafihub_Rvalidator_QueryParamsResponse>

  /// Queries a list of RValidatorList items.
  func rValidatorList(request: Stafihub_Stafihub_Rvalidator_QueryRValidatorListRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Stafihub_Stafihub_Rvalidator_QueryRValidatorListResponse>

  /// Queries a list of CycleSeconds items.
  func cycleSeconds(request: Stafihub_Stafihub_Rvalidator_QueryCycleSecondsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Stafihub_Stafihub_Rvalidator_QueryCycleSecondsResponse>

  /// Queries a list of ShuffleSeconds items.
  func shuffleSeconds(request: Stafihub_Stafihub_Rvalidator_QueryShuffleSecondsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Stafihub_Stafihub_Rvalidator_QueryShuffleSecondsResponse>

  /// Queries a list of LatestVotedCycle items.
  func latestVotedCycle(request: Stafihub_Stafihub_Rvalidator_QueryLatestVotedCycleRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Stafihub_Stafihub_Rvalidator_QueryLatestVotedCycleResponse>

  /// Queries a list of LatestDealedCycle items.
  func latestDealedCycle(request: Stafihub_Stafihub_Rvalidator_QueryLatestDealedCycleRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Stafihub_Stafihub_Rvalidator_QueryLatestDealedCycleResponse>
}

extension Stafihub_Stafihub_Rvalidator_QueryProvider {
  internal var serviceName: Substring {
    return Stafihub_Stafihub_Rvalidator_QueryServerMetadata.serviceDescriptor.fullName[...]
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
        requestDeserializer: ProtobufDeserializer<Stafihub_Stafihub_Rvalidator_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Stafihub_Stafihub_Rvalidator_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        userFunction: self.params(request:context:)
      )

    case "RValidatorList":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stafihub_Stafihub_Rvalidator_QueryRValidatorListRequest>(),
        responseSerializer: ProtobufSerializer<Stafihub_Stafihub_Rvalidator_QueryRValidatorListResponse>(),
        interceptors: self.interceptors?.makeRValidatorListInterceptors() ?? [],
        userFunction: self.rValidatorList(request:context:)
      )

    case "CycleSeconds":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stafihub_Stafihub_Rvalidator_QueryCycleSecondsRequest>(),
        responseSerializer: ProtobufSerializer<Stafihub_Stafihub_Rvalidator_QueryCycleSecondsResponse>(),
        interceptors: self.interceptors?.makeCycleSecondsInterceptors() ?? [],
        userFunction: self.cycleSeconds(request:context:)
      )

    case "ShuffleSeconds":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stafihub_Stafihub_Rvalidator_QueryShuffleSecondsRequest>(),
        responseSerializer: ProtobufSerializer<Stafihub_Stafihub_Rvalidator_QueryShuffleSecondsResponse>(),
        interceptors: self.interceptors?.makeShuffleSecondsInterceptors() ?? [],
        userFunction: self.shuffleSeconds(request:context:)
      )

    case "LatestVotedCycle":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stafihub_Stafihub_Rvalidator_QueryLatestVotedCycleRequest>(),
        responseSerializer: ProtobufSerializer<Stafihub_Stafihub_Rvalidator_QueryLatestVotedCycleResponse>(),
        interceptors: self.interceptors?.makeLatestVotedCycleInterceptors() ?? [],
        userFunction: self.latestVotedCycle(request:context:)
      )

    case "LatestDealedCycle":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stafihub_Stafihub_Rvalidator_QueryLatestDealedCycleRequest>(),
        responseSerializer: ProtobufSerializer<Stafihub_Stafihub_Rvalidator_QueryLatestDealedCycleResponse>(),
        interceptors: self.interceptors?.makeLatestDealedCycleInterceptors() ?? [],
        userFunction: self.latestDealedCycle(request:context:)
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
internal protocol Stafihub_Stafihub_Rvalidator_QueryAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Stafihub_Stafihub_Rvalidator_QueryServerInterceptorFactoryProtocol? { get }

  /// Parameters queries the parameters of the module.
  @Sendable func params(
    request: Stafihub_Stafihub_Rvalidator_QueryParamsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Stafihub_Stafihub_Rvalidator_QueryParamsResponse

  /// Queries a list of RValidatorList items.
  @Sendable func rValidatorList(
    request: Stafihub_Stafihub_Rvalidator_QueryRValidatorListRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Stafihub_Stafihub_Rvalidator_QueryRValidatorListResponse

  /// Queries a list of CycleSeconds items.
  @Sendable func cycleSeconds(
    request: Stafihub_Stafihub_Rvalidator_QueryCycleSecondsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Stafihub_Stafihub_Rvalidator_QueryCycleSecondsResponse

  /// Queries a list of ShuffleSeconds items.
  @Sendable func shuffleSeconds(
    request: Stafihub_Stafihub_Rvalidator_QueryShuffleSecondsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Stafihub_Stafihub_Rvalidator_QueryShuffleSecondsResponse

  /// Queries a list of LatestVotedCycle items.
  @Sendable func latestVotedCycle(
    request: Stafihub_Stafihub_Rvalidator_QueryLatestVotedCycleRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Stafihub_Stafihub_Rvalidator_QueryLatestVotedCycleResponse

  /// Queries a list of LatestDealedCycle items.
  @Sendable func latestDealedCycle(
    request: Stafihub_Stafihub_Rvalidator_QueryLatestDealedCycleRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Stafihub_Stafihub_Rvalidator_QueryLatestDealedCycleResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Stafihub_Stafihub_Rvalidator_QueryAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Stafihub_Stafihub_Rvalidator_QueryServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Stafihub_Stafihub_Rvalidator_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Stafihub_Stafihub_Rvalidator_QueryServerInterceptorFactoryProtocol? {
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
        requestDeserializer: ProtobufDeserializer<Stafihub_Stafihub_Rvalidator_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Stafihub_Stafihub_Rvalidator_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        wrapping: self.params(request:context:)
      )

    case "RValidatorList":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stafihub_Stafihub_Rvalidator_QueryRValidatorListRequest>(),
        responseSerializer: ProtobufSerializer<Stafihub_Stafihub_Rvalidator_QueryRValidatorListResponse>(),
        interceptors: self.interceptors?.makeRValidatorListInterceptors() ?? [],
        wrapping: self.rValidatorList(request:context:)
      )

    case "CycleSeconds":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stafihub_Stafihub_Rvalidator_QueryCycleSecondsRequest>(),
        responseSerializer: ProtobufSerializer<Stafihub_Stafihub_Rvalidator_QueryCycleSecondsResponse>(),
        interceptors: self.interceptors?.makeCycleSecondsInterceptors() ?? [],
        wrapping: self.cycleSeconds(request:context:)
      )

    case "ShuffleSeconds":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stafihub_Stafihub_Rvalidator_QueryShuffleSecondsRequest>(),
        responseSerializer: ProtobufSerializer<Stafihub_Stafihub_Rvalidator_QueryShuffleSecondsResponse>(),
        interceptors: self.interceptors?.makeShuffleSecondsInterceptors() ?? [],
        wrapping: self.shuffleSeconds(request:context:)
      )

    case "LatestVotedCycle":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stafihub_Stafihub_Rvalidator_QueryLatestVotedCycleRequest>(),
        responseSerializer: ProtobufSerializer<Stafihub_Stafihub_Rvalidator_QueryLatestVotedCycleResponse>(),
        interceptors: self.interceptors?.makeLatestVotedCycleInterceptors() ?? [],
        wrapping: self.latestVotedCycle(request:context:)
      )

    case "LatestDealedCycle":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stafihub_Stafihub_Rvalidator_QueryLatestDealedCycleRequest>(),
        responseSerializer: ProtobufSerializer<Stafihub_Stafihub_Rvalidator_QueryLatestDealedCycleResponse>(),
        interceptors: self.interceptors?.makeLatestDealedCycleInterceptors() ?? [],
        wrapping: self.latestDealedCycle(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Stafihub_Stafihub_Rvalidator_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'params'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeParamsInterceptors() -> [ServerInterceptor<Stafihub_Stafihub_Rvalidator_QueryParamsRequest, Stafihub_Stafihub_Rvalidator_QueryParamsResponse>]

  /// - Returns: Interceptors to use when handling 'rValidatorList'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeRValidatorListInterceptors() -> [ServerInterceptor<Stafihub_Stafihub_Rvalidator_QueryRValidatorListRequest, Stafihub_Stafihub_Rvalidator_QueryRValidatorListResponse>]

  /// - Returns: Interceptors to use when handling 'cycleSeconds'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeCycleSecondsInterceptors() -> [ServerInterceptor<Stafihub_Stafihub_Rvalidator_QueryCycleSecondsRequest, Stafihub_Stafihub_Rvalidator_QueryCycleSecondsResponse>]

  /// - Returns: Interceptors to use when handling 'shuffleSeconds'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeShuffleSecondsInterceptors() -> [ServerInterceptor<Stafihub_Stafihub_Rvalidator_QueryShuffleSecondsRequest, Stafihub_Stafihub_Rvalidator_QueryShuffleSecondsResponse>]

  /// - Returns: Interceptors to use when handling 'latestVotedCycle'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeLatestVotedCycleInterceptors() -> [ServerInterceptor<Stafihub_Stafihub_Rvalidator_QueryLatestVotedCycleRequest, Stafihub_Stafihub_Rvalidator_QueryLatestVotedCycleResponse>]

  /// - Returns: Interceptors to use when handling 'latestDealedCycle'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeLatestDealedCycleInterceptors() -> [ServerInterceptor<Stafihub_Stafihub_Rvalidator_QueryLatestDealedCycleRequest, Stafihub_Stafihub_Rvalidator_QueryLatestDealedCycleResponse>]
}

internal enum Stafihub_Stafihub_Rvalidator_QueryServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "stafihub.stafihub.rvalidator.Query",
    methods: [
      Stafihub_Stafihub_Rvalidator_QueryServerMetadata.Methods.params,
      Stafihub_Stafihub_Rvalidator_QueryServerMetadata.Methods.rValidatorList,
      Stafihub_Stafihub_Rvalidator_QueryServerMetadata.Methods.cycleSeconds,
      Stafihub_Stafihub_Rvalidator_QueryServerMetadata.Methods.shuffleSeconds,
      Stafihub_Stafihub_Rvalidator_QueryServerMetadata.Methods.latestVotedCycle,
      Stafihub_Stafihub_Rvalidator_QueryServerMetadata.Methods.latestDealedCycle,
    ]
  )

  internal enum Methods {
    internal static let params = GRPCMethodDescriptor(
      name: "Params",
      path: "/stafihub.stafihub.rvalidator.Query/Params",
      type: GRPCCallType.unary
    )

    internal static let rValidatorList = GRPCMethodDescriptor(
      name: "RValidatorList",
      path: "/stafihub.stafihub.rvalidator.Query/RValidatorList",
      type: GRPCCallType.unary
    )

    internal static let cycleSeconds = GRPCMethodDescriptor(
      name: "CycleSeconds",
      path: "/stafihub.stafihub.rvalidator.Query/CycleSeconds",
      type: GRPCCallType.unary
    )

    internal static let shuffleSeconds = GRPCMethodDescriptor(
      name: "ShuffleSeconds",
      path: "/stafihub.stafihub.rvalidator.Query/ShuffleSeconds",
      type: GRPCCallType.unary
    )

    internal static let latestVotedCycle = GRPCMethodDescriptor(
      name: "LatestVotedCycle",
      path: "/stafihub.stafihub.rvalidator.Query/LatestVotedCycle",
      type: GRPCCallType.unary
    )

    internal static let latestDealedCycle = GRPCMethodDescriptor(
      name: "LatestDealedCycle",
      path: "/stafihub.stafihub.rvalidator.Query/LatestDealedCycle",
      type: GRPCCallType.unary
    )
  }
}
