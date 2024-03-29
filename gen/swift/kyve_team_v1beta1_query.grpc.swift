//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: kyve/team/v1beta1/query.proto
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
/// Usage: instantiate `Kyve_Team_V1beta1_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Kyve_Team_V1beta1_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Kyve_Team_V1beta1_QueryClientInterceptorFactoryProtocol? { get }

  func teamInfo(
    _ request: Kyve_Team_V1beta1_QueryTeamInfoRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Kyve_Team_V1beta1_QueryTeamInfoRequest, Kyve_Team_V1beta1_QueryTeamInfoResponse>

  func teamVestingAccounts(
    _ request: Kyve_Team_V1beta1_QueryTeamVestingAccountsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Kyve_Team_V1beta1_QueryTeamVestingAccountsRequest, Kyve_Team_V1beta1_QueryTeamVestingAccountsResponse>

  func teamVestingAccount(
    _ request: Kyve_Team_V1beta1_QueryTeamVestingAccountRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Kyve_Team_V1beta1_QueryTeamVestingAccountRequest, Kyve_Team_V1beta1_QueryTeamVestingAccountResponse>

  func teamVestingStatus(
    _ request: Kyve_Team_V1beta1_QueryTeamVestingStatusRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Kyve_Team_V1beta1_QueryTeamVestingStatusRequest, Kyve_Team_V1beta1_QueryTeamVestingStatusResponse>

  func teamVestingStatusByTime(
    _ request: Kyve_Team_V1beta1_QueryTeamVestingStatusByTimeRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Kyve_Team_V1beta1_QueryTeamVestingStatusByTimeRequest, Kyve_Team_V1beta1_QueryTeamVestingStatusByTimeResponse>
}

extension Kyve_Team_V1beta1_QueryClientProtocol {
  internal var serviceName: String {
    return "kyve.team.v1beta1.Query"
  }

  /// TeamInfo queries all important information from the team module
  ///
  /// - Parameters:
  ///   - request: Request to send to TeamInfo.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func teamInfo(
    _ request: Kyve_Team_V1beta1_QueryTeamInfoRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Kyve_Team_V1beta1_QueryTeamInfoRequest, Kyve_Team_V1beta1_QueryTeamInfoResponse> {
    return self.makeUnaryCall(
      path: Kyve_Team_V1beta1_QueryClientMetadata.Methods.teamInfo.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeTeamInfoInterceptors() ?? []
    )
  }

  /// TeamVestingAccounts queries all team vesting accounts of the module.
  ///
  /// - Parameters:
  ///   - request: Request to send to TeamVestingAccounts.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func teamVestingAccounts(
    _ request: Kyve_Team_V1beta1_QueryTeamVestingAccountsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Kyve_Team_V1beta1_QueryTeamVestingAccountsRequest, Kyve_Team_V1beta1_QueryTeamVestingAccountsResponse> {
    return self.makeUnaryCall(
      path: Kyve_Team_V1beta1_QueryClientMetadata.Methods.teamVestingAccounts.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeTeamVestingAccountsInterceptors() ?? []
    )
  }

  /// TeamVestingAccount queries the team vesting accounts of the module.
  ///
  /// - Parameters:
  ///   - request: Request to send to TeamVestingAccount.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func teamVestingAccount(
    _ request: Kyve_Team_V1beta1_QueryTeamVestingAccountRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Kyve_Team_V1beta1_QueryTeamVestingAccountRequest, Kyve_Team_V1beta1_QueryTeamVestingAccountResponse> {
    return self.makeUnaryCall(
      path: Kyve_Team_V1beta1_QueryClientMetadata.Methods.teamVestingAccount.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeTeamVestingAccountInterceptors() ?? []
    )
  }

  /// TeamCurrentVestingStatus queries the current vesting progress of a team vesting account
  ///
  /// - Parameters:
  ///   - request: Request to send to TeamVestingStatus.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func teamVestingStatus(
    _ request: Kyve_Team_V1beta1_QueryTeamVestingStatusRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Kyve_Team_V1beta1_QueryTeamVestingStatusRequest, Kyve_Team_V1beta1_QueryTeamVestingStatusResponse> {
    return self.makeUnaryCall(
      path: Kyve_Team_V1beta1_QueryClientMetadata.Methods.teamVestingStatus.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeTeamVestingStatusInterceptors() ?? []
    )
  }

  /// TeamCurrentVestingStatus queries the current vesting progress of a team vesting account
  ///
  /// - Parameters:
  ///   - request: Request to send to TeamVestingStatusByTime.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func teamVestingStatusByTime(
    _ request: Kyve_Team_V1beta1_QueryTeamVestingStatusByTimeRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Kyve_Team_V1beta1_QueryTeamVestingStatusByTimeRequest, Kyve_Team_V1beta1_QueryTeamVestingStatusByTimeResponse> {
    return self.makeUnaryCall(
      path: Kyve_Team_V1beta1_QueryClientMetadata.Methods.teamVestingStatusByTime.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeTeamVestingStatusByTimeInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Kyve_Team_V1beta1_QueryClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Kyve_Team_V1beta1_QueryNIOClient")
internal final class Kyve_Team_V1beta1_QueryClient: Kyve_Team_V1beta1_QueryClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Kyve_Team_V1beta1_QueryClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Kyve_Team_V1beta1_QueryClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the kyve.team.v1beta1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Kyve_Team_V1beta1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Kyve_Team_V1beta1_QueryNIOClient: Kyve_Team_V1beta1_QueryClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Kyve_Team_V1beta1_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the kyve.team.v1beta1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Kyve_Team_V1beta1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query defines the gRPC querier service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Kyve_Team_V1beta1_QueryAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Kyve_Team_V1beta1_QueryClientInterceptorFactoryProtocol? { get }

  func makeTeamInfoCall(
    _ request: Kyve_Team_V1beta1_QueryTeamInfoRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Kyve_Team_V1beta1_QueryTeamInfoRequest, Kyve_Team_V1beta1_QueryTeamInfoResponse>

  func makeTeamVestingAccountsCall(
    _ request: Kyve_Team_V1beta1_QueryTeamVestingAccountsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Kyve_Team_V1beta1_QueryTeamVestingAccountsRequest, Kyve_Team_V1beta1_QueryTeamVestingAccountsResponse>

  func makeTeamVestingAccountCall(
    _ request: Kyve_Team_V1beta1_QueryTeamVestingAccountRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Kyve_Team_V1beta1_QueryTeamVestingAccountRequest, Kyve_Team_V1beta1_QueryTeamVestingAccountResponse>

  func makeTeamVestingStatusCall(
    _ request: Kyve_Team_V1beta1_QueryTeamVestingStatusRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Kyve_Team_V1beta1_QueryTeamVestingStatusRequest, Kyve_Team_V1beta1_QueryTeamVestingStatusResponse>

  func makeTeamVestingStatusByTimeCall(
    _ request: Kyve_Team_V1beta1_QueryTeamVestingStatusByTimeRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Kyve_Team_V1beta1_QueryTeamVestingStatusByTimeRequest, Kyve_Team_V1beta1_QueryTeamVestingStatusByTimeResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Kyve_Team_V1beta1_QueryAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Kyve_Team_V1beta1_QueryClientMetadata.serviceDescriptor
  }

  internal var interceptors: Kyve_Team_V1beta1_QueryClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeTeamInfoCall(
    _ request: Kyve_Team_V1beta1_QueryTeamInfoRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Kyve_Team_V1beta1_QueryTeamInfoRequest, Kyve_Team_V1beta1_QueryTeamInfoResponse> {
    return self.makeAsyncUnaryCall(
      path: Kyve_Team_V1beta1_QueryClientMetadata.Methods.teamInfo.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeTeamInfoInterceptors() ?? []
    )
  }

  internal func makeTeamVestingAccountsCall(
    _ request: Kyve_Team_V1beta1_QueryTeamVestingAccountsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Kyve_Team_V1beta1_QueryTeamVestingAccountsRequest, Kyve_Team_V1beta1_QueryTeamVestingAccountsResponse> {
    return self.makeAsyncUnaryCall(
      path: Kyve_Team_V1beta1_QueryClientMetadata.Methods.teamVestingAccounts.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeTeamVestingAccountsInterceptors() ?? []
    )
  }

  internal func makeTeamVestingAccountCall(
    _ request: Kyve_Team_V1beta1_QueryTeamVestingAccountRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Kyve_Team_V1beta1_QueryTeamVestingAccountRequest, Kyve_Team_V1beta1_QueryTeamVestingAccountResponse> {
    return self.makeAsyncUnaryCall(
      path: Kyve_Team_V1beta1_QueryClientMetadata.Methods.teamVestingAccount.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeTeamVestingAccountInterceptors() ?? []
    )
  }

  internal func makeTeamVestingStatusCall(
    _ request: Kyve_Team_V1beta1_QueryTeamVestingStatusRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Kyve_Team_V1beta1_QueryTeamVestingStatusRequest, Kyve_Team_V1beta1_QueryTeamVestingStatusResponse> {
    return self.makeAsyncUnaryCall(
      path: Kyve_Team_V1beta1_QueryClientMetadata.Methods.teamVestingStatus.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeTeamVestingStatusInterceptors() ?? []
    )
  }

  internal func makeTeamVestingStatusByTimeCall(
    _ request: Kyve_Team_V1beta1_QueryTeamVestingStatusByTimeRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Kyve_Team_V1beta1_QueryTeamVestingStatusByTimeRequest, Kyve_Team_V1beta1_QueryTeamVestingStatusByTimeResponse> {
    return self.makeAsyncUnaryCall(
      path: Kyve_Team_V1beta1_QueryClientMetadata.Methods.teamVestingStatusByTime.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeTeamVestingStatusByTimeInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Kyve_Team_V1beta1_QueryAsyncClientProtocol {
  internal func teamInfo(
    _ request: Kyve_Team_V1beta1_QueryTeamInfoRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Kyve_Team_V1beta1_QueryTeamInfoResponse {
    return try await self.performAsyncUnaryCall(
      path: Kyve_Team_V1beta1_QueryClientMetadata.Methods.teamInfo.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeTeamInfoInterceptors() ?? []
    )
  }

  internal func teamVestingAccounts(
    _ request: Kyve_Team_V1beta1_QueryTeamVestingAccountsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Kyve_Team_V1beta1_QueryTeamVestingAccountsResponse {
    return try await self.performAsyncUnaryCall(
      path: Kyve_Team_V1beta1_QueryClientMetadata.Methods.teamVestingAccounts.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeTeamVestingAccountsInterceptors() ?? []
    )
  }

  internal func teamVestingAccount(
    _ request: Kyve_Team_V1beta1_QueryTeamVestingAccountRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Kyve_Team_V1beta1_QueryTeamVestingAccountResponse {
    return try await self.performAsyncUnaryCall(
      path: Kyve_Team_V1beta1_QueryClientMetadata.Methods.teamVestingAccount.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeTeamVestingAccountInterceptors() ?? []
    )
  }

  internal func teamVestingStatus(
    _ request: Kyve_Team_V1beta1_QueryTeamVestingStatusRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Kyve_Team_V1beta1_QueryTeamVestingStatusResponse {
    return try await self.performAsyncUnaryCall(
      path: Kyve_Team_V1beta1_QueryClientMetadata.Methods.teamVestingStatus.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeTeamVestingStatusInterceptors() ?? []
    )
  }

  internal func teamVestingStatusByTime(
    _ request: Kyve_Team_V1beta1_QueryTeamVestingStatusByTimeRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Kyve_Team_V1beta1_QueryTeamVestingStatusByTimeResponse {
    return try await self.performAsyncUnaryCall(
      path: Kyve_Team_V1beta1_QueryClientMetadata.Methods.teamVestingStatusByTime.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeTeamVestingStatusByTimeInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Kyve_Team_V1beta1_QueryAsyncClient: Kyve_Team_V1beta1_QueryAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Kyve_Team_V1beta1_QueryClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Kyve_Team_V1beta1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Kyve_Team_V1beta1_QueryClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'teamInfo'.
  func makeTeamInfoInterceptors() -> [ClientInterceptor<Kyve_Team_V1beta1_QueryTeamInfoRequest, Kyve_Team_V1beta1_QueryTeamInfoResponse>]

  /// - Returns: Interceptors to use when invoking 'teamVestingAccounts'.
  func makeTeamVestingAccountsInterceptors() -> [ClientInterceptor<Kyve_Team_V1beta1_QueryTeamVestingAccountsRequest, Kyve_Team_V1beta1_QueryTeamVestingAccountsResponse>]

  /// - Returns: Interceptors to use when invoking 'teamVestingAccount'.
  func makeTeamVestingAccountInterceptors() -> [ClientInterceptor<Kyve_Team_V1beta1_QueryTeamVestingAccountRequest, Kyve_Team_V1beta1_QueryTeamVestingAccountResponse>]

  /// - Returns: Interceptors to use when invoking 'teamVestingStatus'.
  func makeTeamVestingStatusInterceptors() -> [ClientInterceptor<Kyve_Team_V1beta1_QueryTeamVestingStatusRequest, Kyve_Team_V1beta1_QueryTeamVestingStatusResponse>]

  /// - Returns: Interceptors to use when invoking 'teamVestingStatusByTime'.
  func makeTeamVestingStatusByTimeInterceptors() -> [ClientInterceptor<Kyve_Team_V1beta1_QueryTeamVestingStatusByTimeRequest, Kyve_Team_V1beta1_QueryTeamVestingStatusByTimeResponse>]
}

internal enum Kyve_Team_V1beta1_QueryClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "kyve.team.v1beta1.Query",
    methods: [
      Kyve_Team_V1beta1_QueryClientMetadata.Methods.teamInfo,
      Kyve_Team_V1beta1_QueryClientMetadata.Methods.teamVestingAccounts,
      Kyve_Team_V1beta1_QueryClientMetadata.Methods.teamVestingAccount,
      Kyve_Team_V1beta1_QueryClientMetadata.Methods.teamVestingStatus,
      Kyve_Team_V1beta1_QueryClientMetadata.Methods.teamVestingStatusByTime,
    ]
  )

  internal enum Methods {
    internal static let teamInfo = GRPCMethodDescriptor(
      name: "TeamInfo",
      path: "/kyve.team.v1beta1.Query/TeamInfo",
      type: GRPCCallType.unary
    )

    internal static let teamVestingAccounts = GRPCMethodDescriptor(
      name: "TeamVestingAccounts",
      path: "/kyve.team.v1beta1.Query/TeamVestingAccounts",
      type: GRPCCallType.unary
    )

    internal static let teamVestingAccount = GRPCMethodDescriptor(
      name: "TeamVestingAccount",
      path: "/kyve.team.v1beta1.Query/TeamVestingAccount",
      type: GRPCCallType.unary
    )

    internal static let teamVestingStatus = GRPCMethodDescriptor(
      name: "TeamVestingStatus",
      path: "/kyve.team.v1beta1.Query/TeamVestingStatus",
      type: GRPCCallType.unary
    )

    internal static let teamVestingStatusByTime = GRPCMethodDescriptor(
      name: "TeamVestingStatusByTime",
      path: "/kyve.team.v1beta1.Query/TeamVestingStatusByTime",
      type: GRPCCallType.unary
    )
  }
}

/// Query defines the gRPC querier service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Kyve_Team_V1beta1_QueryProvider: CallHandlerProvider {
  var interceptors: Kyve_Team_V1beta1_QueryServerInterceptorFactoryProtocol? { get }

  /// TeamInfo queries all important information from the team module
  func teamInfo(request: Kyve_Team_V1beta1_QueryTeamInfoRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Kyve_Team_V1beta1_QueryTeamInfoResponse>

  /// TeamVestingAccounts queries all team vesting accounts of the module.
  func teamVestingAccounts(request: Kyve_Team_V1beta1_QueryTeamVestingAccountsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Kyve_Team_V1beta1_QueryTeamVestingAccountsResponse>

  /// TeamVestingAccount queries the team vesting accounts of the module.
  func teamVestingAccount(request: Kyve_Team_V1beta1_QueryTeamVestingAccountRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Kyve_Team_V1beta1_QueryTeamVestingAccountResponse>

  /// TeamCurrentVestingStatus queries the current vesting progress of a team vesting account
  func teamVestingStatus(request: Kyve_Team_V1beta1_QueryTeamVestingStatusRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Kyve_Team_V1beta1_QueryTeamVestingStatusResponse>

  /// TeamCurrentVestingStatus queries the current vesting progress of a team vesting account
  func teamVestingStatusByTime(request: Kyve_Team_V1beta1_QueryTeamVestingStatusByTimeRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Kyve_Team_V1beta1_QueryTeamVestingStatusByTimeResponse>
}

extension Kyve_Team_V1beta1_QueryProvider {
  internal var serviceName: Substring {
    return Kyve_Team_V1beta1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "TeamInfo":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kyve_Team_V1beta1_QueryTeamInfoRequest>(),
        responseSerializer: ProtobufSerializer<Kyve_Team_V1beta1_QueryTeamInfoResponse>(),
        interceptors: self.interceptors?.makeTeamInfoInterceptors() ?? [],
        userFunction: self.teamInfo(request:context:)
      )

    case "TeamVestingAccounts":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kyve_Team_V1beta1_QueryTeamVestingAccountsRequest>(),
        responseSerializer: ProtobufSerializer<Kyve_Team_V1beta1_QueryTeamVestingAccountsResponse>(),
        interceptors: self.interceptors?.makeTeamVestingAccountsInterceptors() ?? [],
        userFunction: self.teamVestingAccounts(request:context:)
      )

    case "TeamVestingAccount":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kyve_Team_V1beta1_QueryTeamVestingAccountRequest>(),
        responseSerializer: ProtobufSerializer<Kyve_Team_V1beta1_QueryTeamVestingAccountResponse>(),
        interceptors: self.interceptors?.makeTeamVestingAccountInterceptors() ?? [],
        userFunction: self.teamVestingAccount(request:context:)
      )

    case "TeamVestingStatus":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kyve_Team_V1beta1_QueryTeamVestingStatusRequest>(),
        responseSerializer: ProtobufSerializer<Kyve_Team_V1beta1_QueryTeamVestingStatusResponse>(),
        interceptors: self.interceptors?.makeTeamVestingStatusInterceptors() ?? [],
        userFunction: self.teamVestingStatus(request:context:)
      )

    case "TeamVestingStatusByTime":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kyve_Team_V1beta1_QueryTeamVestingStatusByTimeRequest>(),
        responseSerializer: ProtobufSerializer<Kyve_Team_V1beta1_QueryTeamVestingStatusByTimeResponse>(),
        interceptors: self.interceptors?.makeTeamVestingStatusByTimeInterceptors() ?? [],
        userFunction: self.teamVestingStatusByTime(request:context:)
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
internal protocol Kyve_Team_V1beta1_QueryAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Kyve_Team_V1beta1_QueryServerInterceptorFactoryProtocol? { get }

  /// TeamInfo queries all important information from the team module
  @Sendable func teamInfo(
    request: Kyve_Team_V1beta1_QueryTeamInfoRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Kyve_Team_V1beta1_QueryTeamInfoResponse

  /// TeamVestingAccounts queries all team vesting accounts of the module.
  @Sendable func teamVestingAccounts(
    request: Kyve_Team_V1beta1_QueryTeamVestingAccountsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Kyve_Team_V1beta1_QueryTeamVestingAccountsResponse

  /// TeamVestingAccount queries the team vesting accounts of the module.
  @Sendable func teamVestingAccount(
    request: Kyve_Team_V1beta1_QueryTeamVestingAccountRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Kyve_Team_V1beta1_QueryTeamVestingAccountResponse

  /// TeamCurrentVestingStatus queries the current vesting progress of a team vesting account
  @Sendable func teamVestingStatus(
    request: Kyve_Team_V1beta1_QueryTeamVestingStatusRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Kyve_Team_V1beta1_QueryTeamVestingStatusResponse

  /// TeamCurrentVestingStatus queries the current vesting progress of a team vesting account
  @Sendable func teamVestingStatusByTime(
    request: Kyve_Team_V1beta1_QueryTeamVestingStatusByTimeRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Kyve_Team_V1beta1_QueryTeamVestingStatusByTimeResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Kyve_Team_V1beta1_QueryAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Kyve_Team_V1beta1_QueryServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Kyve_Team_V1beta1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Kyve_Team_V1beta1_QueryServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "TeamInfo":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kyve_Team_V1beta1_QueryTeamInfoRequest>(),
        responseSerializer: ProtobufSerializer<Kyve_Team_V1beta1_QueryTeamInfoResponse>(),
        interceptors: self.interceptors?.makeTeamInfoInterceptors() ?? [],
        wrapping: self.teamInfo(request:context:)
      )

    case "TeamVestingAccounts":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kyve_Team_V1beta1_QueryTeamVestingAccountsRequest>(),
        responseSerializer: ProtobufSerializer<Kyve_Team_V1beta1_QueryTeamVestingAccountsResponse>(),
        interceptors: self.interceptors?.makeTeamVestingAccountsInterceptors() ?? [],
        wrapping: self.teamVestingAccounts(request:context:)
      )

    case "TeamVestingAccount":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kyve_Team_V1beta1_QueryTeamVestingAccountRequest>(),
        responseSerializer: ProtobufSerializer<Kyve_Team_V1beta1_QueryTeamVestingAccountResponse>(),
        interceptors: self.interceptors?.makeTeamVestingAccountInterceptors() ?? [],
        wrapping: self.teamVestingAccount(request:context:)
      )

    case "TeamVestingStatus":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kyve_Team_V1beta1_QueryTeamVestingStatusRequest>(),
        responseSerializer: ProtobufSerializer<Kyve_Team_V1beta1_QueryTeamVestingStatusResponse>(),
        interceptors: self.interceptors?.makeTeamVestingStatusInterceptors() ?? [],
        wrapping: self.teamVestingStatus(request:context:)
      )

    case "TeamVestingStatusByTime":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kyve_Team_V1beta1_QueryTeamVestingStatusByTimeRequest>(),
        responseSerializer: ProtobufSerializer<Kyve_Team_V1beta1_QueryTeamVestingStatusByTimeResponse>(),
        interceptors: self.interceptors?.makeTeamVestingStatusByTimeInterceptors() ?? [],
        wrapping: self.teamVestingStatusByTime(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Kyve_Team_V1beta1_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'teamInfo'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeTeamInfoInterceptors() -> [ServerInterceptor<Kyve_Team_V1beta1_QueryTeamInfoRequest, Kyve_Team_V1beta1_QueryTeamInfoResponse>]

  /// - Returns: Interceptors to use when handling 'teamVestingAccounts'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeTeamVestingAccountsInterceptors() -> [ServerInterceptor<Kyve_Team_V1beta1_QueryTeamVestingAccountsRequest, Kyve_Team_V1beta1_QueryTeamVestingAccountsResponse>]

  /// - Returns: Interceptors to use when handling 'teamVestingAccount'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeTeamVestingAccountInterceptors() -> [ServerInterceptor<Kyve_Team_V1beta1_QueryTeamVestingAccountRequest, Kyve_Team_V1beta1_QueryTeamVestingAccountResponse>]

  /// - Returns: Interceptors to use when handling 'teamVestingStatus'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeTeamVestingStatusInterceptors() -> [ServerInterceptor<Kyve_Team_V1beta1_QueryTeamVestingStatusRequest, Kyve_Team_V1beta1_QueryTeamVestingStatusResponse>]

  /// - Returns: Interceptors to use when handling 'teamVestingStatusByTime'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeTeamVestingStatusByTimeInterceptors() -> [ServerInterceptor<Kyve_Team_V1beta1_QueryTeamVestingStatusByTimeRequest, Kyve_Team_V1beta1_QueryTeamVestingStatusByTimeResponse>]
}

internal enum Kyve_Team_V1beta1_QueryServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "kyve.team.v1beta1.Query",
    methods: [
      Kyve_Team_V1beta1_QueryServerMetadata.Methods.teamInfo,
      Kyve_Team_V1beta1_QueryServerMetadata.Methods.teamVestingAccounts,
      Kyve_Team_V1beta1_QueryServerMetadata.Methods.teamVestingAccount,
      Kyve_Team_V1beta1_QueryServerMetadata.Methods.teamVestingStatus,
      Kyve_Team_V1beta1_QueryServerMetadata.Methods.teamVestingStatusByTime,
    ]
  )

  internal enum Methods {
    internal static let teamInfo = GRPCMethodDescriptor(
      name: "TeamInfo",
      path: "/kyve.team.v1beta1.Query/TeamInfo",
      type: GRPCCallType.unary
    )

    internal static let teamVestingAccounts = GRPCMethodDescriptor(
      name: "TeamVestingAccounts",
      path: "/kyve.team.v1beta1.Query/TeamVestingAccounts",
      type: GRPCCallType.unary
    )

    internal static let teamVestingAccount = GRPCMethodDescriptor(
      name: "TeamVestingAccount",
      path: "/kyve.team.v1beta1.Query/TeamVestingAccount",
      type: GRPCCallType.unary
    )

    internal static let teamVestingStatus = GRPCMethodDescriptor(
      name: "TeamVestingStatus",
      path: "/kyve.team.v1beta1.Query/TeamVestingStatus",
      type: GRPCCallType.unary
    )

    internal static let teamVestingStatusByTime = GRPCMethodDescriptor(
      name: "TeamVestingStatusByTime",
      path: "/kyve.team.v1beta1.Query/TeamVestingStatusByTime",
      type: GRPCCallType.unary
    )
  }
}
