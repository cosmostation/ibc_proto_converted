//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: quicksilver/airdrop/v1/query.proto
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
/// Usage: instantiate `Quicksilver_Airdrop_V1_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Quicksilver_Airdrop_V1_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Quicksilver_Airdrop_V1_QueryClientInterceptorFactoryProtocol? { get }

  func params(
    _ request: Quicksilver_Airdrop_V1_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Quicksilver_Airdrop_V1_QueryParamsRequest, Quicksilver_Airdrop_V1_QueryParamsResponse>

  func zoneDrop(
    _ request: Quicksilver_Airdrop_V1_QueryZoneDropRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Quicksilver_Airdrop_V1_QueryZoneDropRequest, Quicksilver_Airdrop_V1_QueryZoneDropResponse>

  func accountBalance(
    _ request: Quicksilver_Airdrop_V1_QueryAccountBalanceRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Quicksilver_Airdrop_V1_QueryAccountBalanceRequest, Quicksilver_Airdrop_V1_QueryAccountBalanceResponse>

  func zoneDrops(
    _ request: Quicksilver_Airdrop_V1_QueryZoneDropsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Quicksilver_Airdrop_V1_QueryZoneDropsRequest, Quicksilver_Airdrop_V1_QueryZoneDropsResponse>

  func claimRecord(
    _ request: Quicksilver_Airdrop_V1_QueryClaimRecordRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Quicksilver_Airdrop_V1_QueryClaimRecordRequest, Quicksilver_Airdrop_V1_QueryClaimRecordResponse>

  func claimRecords(
    _ request: Quicksilver_Airdrop_V1_QueryClaimRecordsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Quicksilver_Airdrop_V1_QueryClaimRecordsRequest, Quicksilver_Airdrop_V1_QueryClaimRecordsResponse>
}

extension Quicksilver_Airdrop_V1_QueryClientProtocol {
  internal var serviceName: String {
    return "quicksilver.airdrop.v1.Query"
  }

  /// Params returns the total set of airdrop parameters.
  ///
  /// - Parameters:
  ///   - request: Request to send to Params.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func params(
    _ request: Quicksilver_Airdrop_V1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Quicksilver_Airdrop_V1_QueryParamsRequest, Quicksilver_Airdrop_V1_QueryParamsResponse> {
    return self.makeUnaryCall(
      path: Quicksilver_Airdrop_V1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }

  /// ZoneDrop returns the details of the specified zone airdrop.
  ///
  /// - Parameters:
  ///   - request: Request to send to ZoneDrop.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func zoneDrop(
    _ request: Quicksilver_Airdrop_V1_QueryZoneDropRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Quicksilver_Airdrop_V1_QueryZoneDropRequest, Quicksilver_Airdrop_V1_QueryZoneDropResponse> {
    return self.makeUnaryCall(
      path: Quicksilver_Airdrop_V1_QueryClientMetadata.Methods.zoneDrop.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeZoneDropInterceptors() ?? []
    )
  }

  /// AccountBalance returns the module account balance of the specified zone.
  ///
  /// - Parameters:
  ///   - request: Request to send to AccountBalance.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func accountBalance(
    _ request: Quicksilver_Airdrop_V1_QueryAccountBalanceRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Quicksilver_Airdrop_V1_QueryAccountBalanceRequest, Quicksilver_Airdrop_V1_QueryAccountBalanceResponse> {
    return self.makeUnaryCall(
      path: Quicksilver_Airdrop_V1_QueryClientMetadata.Methods.accountBalance.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAccountBalanceInterceptors() ?? []
    )
  }

  /// ZoneDrops returns all zone airdrops of the specified status.
  ///
  /// - Parameters:
  ///   - request: Request to send to ZoneDrops.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func zoneDrops(
    _ request: Quicksilver_Airdrop_V1_QueryZoneDropsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Quicksilver_Airdrop_V1_QueryZoneDropsRequest, Quicksilver_Airdrop_V1_QueryZoneDropsResponse> {
    return self.makeUnaryCall(
      path: Quicksilver_Airdrop_V1_QueryClientMetadata.Methods.zoneDrops.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeZoneDropsInterceptors() ?? []
    )
  }

  /// ClaimRecord returns the claim record that corresponds to the given zone and
  /// address.
  ///
  /// - Parameters:
  ///   - request: Request to send to ClaimRecord.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func claimRecord(
    _ request: Quicksilver_Airdrop_V1_QueryClaimRecordRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Quicksilver_Airdrop_V1_QueryClaimRecordRequest, Quicksilver_Airdrop_V1_QueryClaimRecordResponse> {
    return self.makeUnaryCall(
      path: Quicksilver_Airdrop_V1_QueryClientMetadata.Methods.claimRecord.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClaimRecordInterceptors() ?? []
    )
  }

  /// ClaimRecords returns all the claim records of the given zone.
  ///
  /// - Parameters:
  ///   - request: Request to send to ClaimRecords.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func claimRecords(
    _ request: Quicksilver_Airdrop_V1_QueryClaimRecordsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Quicksilver_Airdrop_V1_QueryClaimRecordsRequest, Quicksilver_Airdrop_V1_QueryClaimRecordsResponse> {
    return self.makeUnaryCall(
      path: Quicksilver_Airdrop_V1_QueryClientMetadata.Methods.claimRecords.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClaimRecordsInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Quicksilver_Airdrop_V1_QueryClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Quicksilver_Airdrop_V1_QueryNIOClient")
internal final class Quicksilver_Airdrop_V1_QueryClient: Quicksilver_Airdrop_V1_QueryClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Quicksilver_Airdrop_V1_QueryClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Quicksilver_Airdrop_V1_QueryClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the quicksilver.airdrop.v1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Quicksilver_Airdrop_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Quicksilver_Airdrop_V1_QueryNIOClient: Quicksilver_Airdrop_V1_QueryClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Quicksilver_Airdrop_V1_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the quicksilver.airdrop.v1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Quicksilver_Airdrop_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query provides defines the gRPC querier service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Quicksilver_Airdrop_V1_QueryAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Quicksilver_Airdrop_V1_QueryClientInterceptorFactoryProtocol? { get }

  func makeParamsCall(
    _ request: Quicksilver_Airdrop_V1_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Quicksilver_Airdrop_V1_QueryParamsRequest, Quicksilver_Airdrop_V1_QueryParamsResponse>

  func makeZoneDropCall(
    _ request: Quicksilver_Airdrop_V1_QueryZoneDropRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Quicksilver_Airdrop_V1_QueryZoneDropRequest, Quicksilver_Airdrop_V1_QueryZoneDropResponse>

  func makeAccountBalanceCall(
    _ request: Quicksilver_Airdrop_V1_QueryAccountBalanceRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Quicksilver_Airdrop_V1_QueryAccountBalanceRequest, Quicksilver_Airdrop_V1_QueryAccountBalanceResponse>

  func makeZoneDropsCall(
    _ request: Quicksilver_Airdrop_V1_QueryZoneDropsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Quicksilver_Airdrop_V1_QueryZoneDropsRequest, Quicksilver_Airdrop_V1_QueryZoneDropsResponse>

  func makeClaimRecordCall(
    _ request: Quicksilver_Airdrop_V1_QueryClaimRecordRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Quicksilver_Airdrop_V1_QueryClaimRecordRequest, Quicksilver_Airdrop_V1_QueryClaimRecordResponse>

  func makeClaimRecordsCall(
    _ request: Quicksilver_Airdrop_V1_QueryClaimRecordsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Quicksilver_Airdrop_V1_QueryClaimRecordsRequest, Quicksilver_Airdrop_V1_QueryClaimRecordsResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Quicksilver_Airdrop_V1_QueryAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Quicksilver_Airdrop_V1_QueryClientMetadata.serviceDescriptor
  }

  internal var interceptors: Quicksilver_Airdrop_V1_QueryClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeParamsCall(
    _ request: Quicksilver_Airdrop_V1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Quicksilver_Airdrop_V1_QueryParamsRequest, Quicksilver_Airdrop_V1_QueryParamsResponse> {
    return self.makeAsyncUnaryCall(
      path: Quicksilver_Airdrop_V1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }

  internal func makeZoneDropCall(
    _ request: Quicksilver_Airdrop_V1_QueryZoneDropRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Quicksilver_Airdrop_V1_QueryZoneDropRequest, Quicksilver_Airdrop_V1_QueryZoneDropResponse> {
    return self.makeAsyncUnaryCall(
      path: Quicksilver_Airdrop_V1_QueryClientMetadata.Methods.zoneDrop.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeZoneDropInterceptors() ?? []
    )
  }

  internal func makeAccountBalanceCall(
    _ request: Quicksilver_Airdrop_V1_QueryAccountBalanceRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Quicksilver_Airdrop_V1_QueryAccountBalanceRequest, Quicksilver_Airdrop_V1_QueryAccountBalanceResponse> {
    return self.makeAsyncUnaryCall(
      path: Quicksilver_Airdrop_V1_QueryClientMetadata.Methods.accountBalance.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAccountBalanceInterceptors() ?? []
    )
  }

  internal func makeZoneDropsCall(
    _ request: Quicksilver_Airdrop_V1_QueryZoneDropsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Quicksilver_Airdrop_V1_QueryZoneDropsRequest, Quicksilver_Airdrop_V1_QueryZoneDropsResponse> {
    return self.makeAsyncUnaryCall(
      path: Quicksilver_Airdrop_V1_QueryClientMetadata.Methods.zoneDrops.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeZoneDropsInterceptors() ?? []
    )
  }

  internal func makeClaimRecordCall(
    _ request: Quicksilver_Airdrop_V1_QueryClaimRecordRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Quicksilver_Airdrop_V1_QueryClaimRecordRequest, Quicksilver_Airdrop_V1_QueryClaimRecordResponse> {
    return self.makeAsyncUnaryCall(
      path: Quicksilver_Airdrop_V1_QueryClientMetadata.Methods.claimRecord.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClaimRecordInterceptors() ?? []
    )
  }

  internal func makeClaimRecordsCall(
    _ request: Quicksilver_Airdrop_V1_QueryClaimRecordsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Quicksilver_Airdrop_V1_QueryClaimRecordsRequest, Quicksilver_Airdrop_V1_QueryClaimRecordsResponse> {
    return self.makeAsyncUnaryCall(
      path: Quicksilver_Airdrop_V1_QueryClientMetadata.Methods.claimRecords.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClaimRecordsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Quicksilver_Airdrop_V1_QueryAsyncClientProtocol {
  internal func params(
    _ request: Quicksilver_Airdrop_V1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Quicksilver_Airdrop_V1_QueryParamsResponse {
    return try await self.performAsyncUnaryCall(
      path: Quicksilver_Airdrop_V1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }

  internal func zoneDrop(
    _ request: Quicksilver_Airdrop_V1_QueryZoneDropRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Quicksilver_Airdrop_V1_QueryZoneDropResponse {
    return try await self.performAsyncUnaryCall(
      path: Quicksilver_Airdrop_V1_QueryClientMetadata.Methods.zoneDrop.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeZoneDropInterceptors() ?? []
    )
  }

  internal func accountBalance(
    _ request: Quicksilver_Airdrop_V1_QueryAccountBalanceRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Quicksilver_Airdrop_V1_QueryAccountBalanceResponse {
    return try await self.performAsyncUnaryCall(
      path: Quicksilver_Airdrop_V1_QueryClientMetadata.Methods.accountBalance.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAccountBalanceInterceptors() ?? []
    )
  }

  internal func zoneDrops(
    _ request: Quicksilver_Airdrop_V1_QueryZoneDropsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Quicksilver_Airdrop_V1_QueryZoneDropsResponse {
    return try await self.performAsyncUnaryCall(
      path: Quicksilver_Airdrop_V1_QueryClientMetadata.Methods.zoneDrops.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeZoneDropsInterceptors() ?? []
    )
  }

  internal func claimRecord(
    _ request: Quicksilver_Airdrop_V1_QueryClaimRecordRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Quicksilver_Airdrop_V1_QueryClaimRecordResponse {
    return try await self.performAsyncUnaryCall(
      path: Quicksilver_Airdrop_V1_QueryClientMetadata.Methods.claimRecord.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClaimRecordInterceptors() ?? []
    )
  }

  internal func claimRecords(
    _ request: Quicksilver_Airdrop_V1_QueryClaimRecordsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Quicksilver_Airdrop_V1_QueryClaimRecordsResponse {
    return try await self.performAsyncUnaryCall(
      path: Quicksilver_Airdrop_V1_QueryClientMetadata.Methods.claimRecords.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClaimRecordsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Quicksilver_Airdrop_V1_QueryAsyncClient: Quicksilver_Airdrop_V1_QueryAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Quicksilver_Airdrop_V1_QueryClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Quicksilver_Airdrop_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Quicksilver_Airdrop_V1_QueryClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'params'.
  func makeParamsInterceptors() -> [ClientInterceptor<Quicksilver_Airdrop_V1_QueryParamsRequest, Quicksilver_Airdrop_V1_QueryParamsResponse>]

  /// - Returns: Interceptors to use when invoking 'zoneDrop'.
  func makeZoneDropInterceptors() -> [ClientInterceptor<Quicksilver_Airdrop_V1_QueryZoneDropRequest, Quicksilver_Airdrop_V1_QueryZoneDropResponse>]

  /// - Returns: Interceptors to use when invoking 'accountBalance'.
  func makeAccountBalanceInterceptors() -> [ClientInterceptor<Quicksilver_Airdrop_V1_QueryAccountBalanceRequest, Quicksilver_Airdrop_V1_QueryAccountBalanceResponse>]

  /// - Returns: Interceptors to use when invoking 'zoneDrops'.
  func makeZoneDropsInterceptors() -> [ClientInterceptor<Quicksilver_Airdrop_V1_QueryZoneDropsRequest, Quicksilver_Airdrop_V1_QueryZoneDropsResponse>]

  /// - Returns: Interceptors to use when invoking 'claimRecord'.
  func makeClaimRecordInterceptors() -> [ClientInterceptor<Quicksilver_Airdrop_V1_QueryClaimRecordRequest, Quicksilver_Airdrop_V1_QueryClaimRecordResponse>]

  /// - Returns: Interceptors to use when invoking 'claimRecords'.
  func makeClaimRecordsInterceptors() -> [ClientInterceptor<Quicksilver_Airdrop_V1_QueryClaimRecordsRequest, Quicksilver_Airdrop_V1_QueryClaimRecordsResponse>]
}

internal enum Quicksilver_Airdrop_V1_QueryClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "quicksilver.airdrop.v1.Query",
    methods: [
      Quicksilver_Airdrop_V1_QueryClientMetadata.Methods.params,
      Quicksilver_Airdrop_V1_QueryClientMetadata.Methods.zoneDrop,
      Quicksilver_Airdrop_V1_QueryClientMetadata.Methods.accountBalance,
      Quicksilver_Airdrop_V1_QueryClientMetadata.Methods.zoneDrops,
      Quicksilver_Airdrop_V1_QueryClientMetadata.Methods.claimRecord,
      Quicksilver_Airdrop_V1_QueryClientMetadata.Methods.claimRecords,
    ]
  )

  internal enum Methods {
    internal static let params = GRPCMethodDescriptor(
      name: "Params",
      path: "/quicksilver.airdrop.v1.Query/Params",
      type: GRPCCallType.unary
    )

    internal static let zoneDrop = GRPCMethodDescriptor(
      name: "ZoneDrop",
      path: "/quicksilver.airdrop.v1.Query/ZoneDrop",
      type: GRPCCallType.unary
    )

    internal static let accountBalance = GRPCMethodDescriptor(
      name: "AccountBalance",
      path: "/quicksilver.airdrop.v1.Query/AccountBalance",
      type: GRPCCallType.unary
    )

    internal static let zoneDrops = GRPCMethodDescriptor(
      name: "ZoneDrops",
      path: "/quicksilver.airdrop.v1.Query/ZoneDrops",
      type: GRPCCallType.unary
    )

    internal static let claimRecord = GRPCMethodDescriptor(
      name: "ClaimRecord",
      path: "/quicksilver.airdrop.v1.Query/ClaimRecord",
      type: GRPCCallType.unary
    )

    internal static let claimRecords = GRPCMethodDescriptor(
      name: "ClaimRecords",
      path: "/quicksilver.airdrop.v1.Query/ClaimRecords",
      type: GRPCCallType.unary
    )
  }
}

/// Query provides defines the gRPC querier service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Quicksilver_Airdrop_V1_QueryProvider: CallHandlerProvider {
  var interceptors: Quicksilver_Airdrop_V1_QueryServerInterceptorFactoryProtocol? { get }

  /// Params returns the total set of airdrop parameters.
  func params(request: Quicksilver_Airdrop_V1_QueryParamsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Quicksilver_Airdrop_V1_QueryParamsResponse>

  /// ZoneDrop returns the details of the specified zone airdrop.
  func zoneDrop(request: Quicksilver_Airdrop_V1_QueryZoneDropRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Quicksilver_Airdrop_V1_QueryZoneDropResponse>

  /// AccountBalance returns the module account balance of the specified zone.
  func accountBalance(request: Quicksilver_Airdrop_V1_QueryAccountBalanceRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Quicksilver_Airdrop_V1_QueryAccountBalanceResponse>

  /// ZoneDrops returns all zone airdrops of the specified status.
  func zoneDrops(request: Quicksilver_Airdrop_V1_QueryZoneDropsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Quicksilver_Airdrop_V1_QueryZoneDropsResponse>

  /// ClaimRecord returns the claim record that corresponds to the given zone and
  /// address.
  func claimRecord(request: Quicksilver_Airdrop_V1_QueryClaimRecordRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Quicksilver_Airdrop_V1_QueryClaimRecordResponse>

  /// ClaimRecords returns all the claim records of the given zone.
  func claimRecords(request: Quicksilver_Airdrop_V1_QueryClaimRecordsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Quicksilver_Airdrop_V1_QueryClaimRecordsResponse>
}

extension Quicksilver_Airdrop_V1_QueryProvider {
  internal var serviceName: Substring {
    return Quicksilver_Airdrop_V1_QueryServerMetadata.serviceDescriptor.fullName[...]
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
        requestDeserializer: ProtobufDeserializer<Quicksilver_Airdrop_V1_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Quicksilver_Airdrop_V1_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        userFunction: self.params(request:context:)
      )

    case "ZoneDrop":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Quicksilver_Airdrop_V1_QueryZoneDropRequest>(),
        responseSerializer: ProtobufSerializer<Quicksilver_Airdrop_V1_QueryZoneDropResponse>(),
        interceptors: self.interceptors?.makeZoneDropInterceptors() ?? [],
        userFunction: self.zoneDrop(request:context:)
      )

    case "AccountBalance":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Quicksilver_Airdrop_V1_QueryAccountBalanceRequest>(),
        responseSerializer: ProtobufSerializer<Quicksilver_Airdrop_V1_QueryAccountBalanceResponse>(),
        interceptors: self.interceptors?.makeAccountBalanceInterceptors() ?? [],
        userFunction: self.accountBalance(request:context:)
      )

    case "ZoneDrops":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Quicksilver_Airdrop_V1_QueryZoneDropsRequest>(),
        responseSerializer: ProtobufSerializer<Quicksilver_Airdrop_V1_QueryZoneDropsResponse>(),
        interceptors: self.interceptors?.makeZoneDropsInterceptors() ?? [],
        userFunction: self.zoneDrops(request:context:)
      )

    case "ClaimRecord":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Quicksilver_Airdrop_V1_QueryClaimRecordRequest>(),
        responseSerializer: ProtobufSerializer<Quicksilver_Airdrop_V1_QueryClaimRecordResponse>(),
        interceptors: self.interceptors?.makeClaimRecordInterceptors() ?? [],
        userFunction: self.claimRecord(request:context:)
      )

    case "ClaimRecords":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Quicksilver_Airdrop_V1_QueryClaimRecordsRequest>(),
        responseSerializer: ProtobufSerializer<Quicksilver_Airdrop_V1_QueryClaimRecordsResponse>(),
        interceptors: self.interceptors?.makeClaimRecordsInterceptors() ?? [],
        userFunction: self.claimRecords(request:context:)
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
internal protocol Quicksilver_Airdrop_V1_QueryAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Quicksilver_Airdrop_V1_QueryServerInterceptorFactoryProtocol? { get }

  /// Params returns the total set of airdrop parameters.
  @Sendable func params(
    request: Quicksilver_Airdrop_V1_QueryParamsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Quicksilver_Airdrop_V1_QueryParamsResponse

  /// ZoneDrop returns the details of the specified zone airdrop.
  @Sendable func zoneDrop(
    request: Quicksilver_Airdrop_V1_QueryZoneDropRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Quicksilver_Airdrop_V1_QueryZoneDropResponse

  /// AccountBalance returns the module account balance of the specified zone.
  @Sendable func accountBalance(
    request: Quicksilver_Airdrop_V1_QueryAccountBalanceRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Quicksilver_Airdrop_V1_QueryAccountBalanceResponse

  /// ZoneDrops returns all zone airdrops of the specified status.
  @Sendable func zoneDrops(
    request: Quicksilver_Airdrop_V1_QueryZoneDropsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Quicksilver_Airdrop_V1_QueryZoneDropsResponse

  /// ClaimRecord returns the claim record that corresponds to the given zone and
  /// address.
  @Sendable func claimRecord(
    request: Quicksilver_Airdrop_V1_QueryClaimRecordRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Quicksilver_Airdrop_V1_QueryClaimRecordResponse

  /// ClaimRecords returns all the claim records of the given zone.
  @Sendable func claimRecords(
    request: Quicksilver_Airdrop_V1_QueryClaimRecordsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Quicksilver_Airdrop_V1_QueryClaimRecordsResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Quicksilver_Airdrop_V1_QueryAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Quicksilver_Airdrop_V1_QueryServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Quicksilver_Airdrop_V1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Quicksilver_Airdrop_V1_QueryServerInterceptorFactoryProtocol? {
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
        requestDeserializer: ProtobufDeserializer<Quicksilver_Airdrop_V1_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Quicksilver_Airdrop_V1_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        wrapping: self.params(request:context:)
      )

    case "ZoneDrop":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Quicksilver_Airdrop_V1_QueryZoneDropRequest>(),
        responseSerializer: ProtobufSerializer<Quicksilver_Airdrop_V1_QueryZoneDropResponse>(),
        interceptors: self.interceptors?.makeZoneDropInterceptors() ?? [],
        wrapping: self.zoneDrop(request:context:)
      )

    case "AccountBalance":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Quicksilver_Airdrop_V1_QueryAccountBalanceRequest>(),
        responseSerializer: ProtobufSerializer<Quicksilver_Airdrop_V1_QueryAccountBalanceResponse>(),
        interceptors: self.interceptors?.makeAccountBalanceInterceptors() ?? [],
        wrapping: self.accountBalance(request:context:)
      )

    case "ZoneDrops":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Quicksilver_Airdrop_V1_QueryZoneDropsRequest>(),
        responseSerializer: ProtobufSerializer<Quicksilver_Airdrop_V1_QueryZoneDropsResponse>(),
        interceptors: self.interceptors?.makeZoneDropsInterceptors() ?? [],
        wrapping: self.zoneDrops(request:context:)
      )

    case "ClaimRecord":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Quicksilver_Airdrop_V1_QueryClaimRecordRequest>(),
        responseSerializer: ProtobufSerializer<Quicksilver_Airdrop_V1_QueryClaimRecordResponse>(),
        interceptors: self.interceptors?.makeClaimRecordInterceptors() ?? [],
        wrapping: self.claimRecord(request:context:)
      )

    case "ClaimRecords":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Quicksilver_Airdrop_V1_QueryClaimRecordsRequest>(),
        responseSerializer: ProtobufSerializer<Quicksilver_Airdrop_V1_QueryClaimRecordsResponse>(),
        interceptors: self.interceptors?.makeClaimRecordsInterceptors() ?? [],
        wrapping: self.claimRecords(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Quicksilver_Airdrop_V1_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'params'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeParamsInterceptors() -> [ServerInterceptor<Quicksilver_Airdrop_V1_QueryParamsRequest, Quicksilver_Airdrop_V1_QueryParamsResponse>]

  /// - Returns: Interceptors to use when handling 'zoneDrop'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeZoneDropInterceptors() -> [ServerInterceptor<Quicksilver_Airdrop_V1_QueryZoneDropRequest, Quicksilver_Airdrop_V1_QueryZoneDropResponse>]

  /// - Returns: Interceptors to use when handling 'accountBalance'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeAccountBalanceInterceptors() -> [ServerInterceptor<Quicksilver_Airdrop_V1_QueryAccountBalanceRequest, Quicksilver_Airdrop_V1_QueryAccountBalanceResponse>]

  /// - Returns: Interceptors to use when handling 'zoneDrops'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeZoneDropsInterceptors() -> [ServerInterceptor<Quicksilver_Airdrop_V1_QueryZoneDropsRequest, Quicksilver_Airdrop_V1_QueryZoneDropsResponse>]

  /// - Returns: Interceptors to use when handling 'claimRecord'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeClaimRecordInterceptors() -> [ServerInterceptor<Quicksilver_Airdrop_V1_QueryClaimRecordRequest, Quicksilver_Airdrop_V1_QueryClaimRecordResponse>]

  /// - Returns: Interceptors to use when handling 'claimRecords'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeClaimRecordsInterceptors() -> [ServerInterceptor<Quicksilver_Airdrop_V1_QueryClaimRecordsRequest, Quicksilver_Airdrop_V1_QueryClaimRecordsResponse>]
}

internal enum Quicksilver_Airdrop_V1_QueryServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "quicksilver.airdrop.v1.Query",
    methods: [
      Quicksilver_Airdrop_V1_QueryServerMetadata.Methods.params,
      Quicksilver_Airdrop_V1_QueryServerMetadata.Methods.zoneDrop,
      Quicksilver_Airdrop_V1_QueryServerMetadata.Methods.accountBalance,
      Quicksilver_Airdrop_V1_QueryServerMetadata.Methods.zoneDrops,
      Quicksilver_Airdrop_V1_QueryServerMetadata.Methods.claimRecord,
      Quicksilver_Airdrop_V1_QueryServerMetadata.Methods.claimRecords,
    ]
  )

  internal enum Methods {
    internal static let params = GRPCMethodDescriptor(
      name: "Params",
      path: "/quicksilver.airdrop.v1.Query/Params",
      type: GRPCCallType.unary
    )

    internal static let zoneDrop = GRPCMethodDescriptor(
      name: "ZoneDrop",
      path: "/quicksilver.airdrop.v1.Query/ZoneDrop",
      type: GRPCCallType.unary
    )

    internal static let accountBalance = GRPCMethodDescriptor(
      name: "AccountBalance",
      path: "/quicksilver.airdrop.v1.Query/AccountBalance",
      type: GRPCCallType.unary
    )

    internal static let zoneDrops = GRPCMethodDescriptor(
      name: "ZoneDrops",
      path: "/quicksilver.airdrop.v1.Query/ZoneDrops",
      type: GRPCCallType.unary
    )

    internal static let claimRecord = GRPCMethodDescriptor(
      name: "ClaimRecord",
      path: "/quicksilver.airdrop.v1.Query/ClaimRecord",
      type: GRPCCallType.unary
    )

    internal static let claimRecords = GRPCMethodDescriptor(
      name: "ClaimRecords",
      path: "/quicksilver.airdrop.v1.Query/ClaimRecords",
      type: GRPCCallType.unary
    )
  }
}