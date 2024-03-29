//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: stafihub/rmintreward/tx.proto
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


/// Msg defines the Msg service.
///
/// Usage: instantiate `Stafihub_Stafihub_Rmintreward_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Stafihub_Stafihub_Rmintreward_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Stafihub_Stafihub_Rmintreward_MsgClientInterceptorFactoryProtocol? { get }

  func addMintRewardAct(
    _ request: Stafihub_Stafihub_Rmintreward_MsgAddMintRewardAct,
    callOptions: CallOptions?
  ) -> UnaryCall<Stafihub_Stafihub_Rmintreward_MsgAddMintRewardAct, Stafihub_Stafihub_Rmintreward_MsgAddMintRewardActResponse>

  func updateMintRewardAct(
    _ request: Stafihub_Stafihub_Rmintreward_MsgUpdateMintRewardAct,
    callOptions: CallOptions?
  ) -> UnaryCall<Stafihub_Stafihub_Rmintreward_MsgUpdateMintRewardAct, Stafihub_Stafihub_Rmintreward_MsgUpdateMintRewardActResponse>

  func claimMintReward(
    _ request: Stafihub_Stafihub_Rmintreward_MsgClaimMintReward,
    callOptions: CallOptions?
  ) -> UnaryCall<Stafihub_Stafihub_Rmintreward_MsgClaimMintReward, Stafihub_Stafihub_Rmintreward_MsgClaimMintRewardResponse>

  func provideRewardToken(
    _ request: Stafihub_Stafihub_Rmintreward_MsgProvideRewardToken,
    callOptions: CallOptions?
  ) -> UnaryCall<Stafihub_Stafihub_Rmintreward_MsgProvideRewardToken, Stafihub_Stafihub_Rmintreward_MsgProvideRewardTokenResponse>
}

extension Stafihub_Stafihub_Rmintreward_MsgClientProtocol {
  internal var serviceName: String {
    return "stafihub.stafihub.rmintreward.Msg"
  }

  /// Unary call to AddMintRewardAct
  ///
  /// - Parameters:
  ///   - request: Request to send to AddMintRewardAct.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func addMintRewardAct(
    _ request: Stafihub_Stafihub_Rmintreward_MsgAddMintRewardAct,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Stafihub_Stafihub_Rmintreward_MsgAddMintRewardAct, Stafihub_Stafihub_Rmintreward_MsgAddMintRewardActResponse> {
    return self.makeUnaryCall(
      path: Stafihub_Stafihub_Rmintreward_MsgClientMetadata.Methods.addMintRewardAct.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAddMintRewardActInterceptors() ?? []
    )
  }

  /// Unary call to UpdateMintRewardAct
  ///
  /// - Parameters:
  ///   - request: Request to send to UpdateMintRewardAct.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func updateMintRewardAct(
    _ request: Stafihub_Stafihub_Rmintreward_MsgUpdateMintRewardAct,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Stafihub_Stafihub_Rmintreward_MsgUpdateMintRewardAct, Stafihub_Stafihub_Rmintreward_MsgUpdateMintRewardActResponse> {
    return self.makeUnaryCall(
      path: Stafihub_Stafihub_Rmintreward_MsgClientMetadata.Methods.updateMintRewardAct.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUpdateMintRewardActInterceptors() ?? []
    )
  }

  /// Unary call to ClaimMintReward
  ///
  /// - Parameters:
  ///   - request: Request to send to ClaimMintReward.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func claimMintReward(
    _ request: Stafihub_Stafihub_Rmintreward_MsgClaimMintReward,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Stafihub_Stafihub_Rmintreward_MsgClaimMintReward, Stafihub_Stafihub_Rmintreward_MsgClaimMintRewardResponse> {
    return self.makeUnaryCall(
      path: Stafihub_Stafihub_Rmintreward_MsgClientMetadata.Methods.claimMintReward.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClaimMintRewardInterceptors() ?? []
    )
  }

  /// this line is used by starport scaffolding # proto/tx/rpc
  ///
  /// - Parameters:
  ///   - request: Request to send to ProvideRewardToken.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func provideRewardToken(
    _ request: Stafihub_Stafihub_Rmintreward_MsgProvideRewardToken,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Stafihub_Stafihub_Rmintreward_MsgProvideRewardToken, Stafihub_Stafihub_Rmintreward_MsgProvideRewardTokenResponse> {
    return self.makeUnaryCall(
      path: Stafihub_Stafihub_Rmintreward_MsgClientMetadata.Methods.provideRewardToken.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeProvideRewardTokenInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Stafihub_Stafihub_Rmintreward_MsgClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Stafihub_Stafihub_Rmintreward_MsgNIOClient")
internal final class Stafihub_Stafihub_Rmintreward_MsgClient: Stafihub_Stafihub_Rmintreward_MsgClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Stafihub_Stafihub_Rmintreward_MsgClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Stafihub_Stafihub_Rmintreward_MsgClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the stafihub.stafihub.rmintreward.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Stafihub_Stafihub_Rmintreward_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Stafihub_Stafihub_Rmintreward_MsgNIOClient: Stafihub_Stafihub_Rmintreward_MsgClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Stafihub_Stafihub_Rmintreward_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the stafihub.stafihub.rmintreward.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Stafihub_Stafihub_Rmintreward_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Msg defines the Msg service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Stafihub_Stafihub_Rmintreward_MsgAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Stafihub_Stafihub_Rmintreward_MsgClientInterceptorFactoryProtocol? { get }

  func makeAddMintRewardActCall(
    _ request: Stafihub_Stafihub_Rmintreward_MsgAddMintRewardAct,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Stafihub_Stafihub_Rmintreward_MsgAddMintRewardAct, Stafihub_Stafihub_Rmintreward_MsgAddMintRewardActResponse>

  func makeUpdateMintRewardActCall(
    _ request: Stafihub_Stafihub_Rmintreward_MsgUpdateMintRewardAct,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Stafihub_Stafihub_Rmintreward_MsgUpdateMintRewardAct, Stafihub_Stafihub_Rmintreward_MsgUpdateMintRewardActResponse>

  func makeClaimMintRewardCall(
    _ request: Stafihub_Stafihub_Rmintreward_MsgClaimMintReward,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Stafihub_Stafihub_Rmintreward_MsgClaimMintReward, Stafihub_Stafihub_Rmintreward_MsgClaimMintRewardResponse>

  func makeProvideRewardTokenCall(
    _ request: Stafihub_Stafihub_Rmintreward_MsgProvideRewardToken,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Stafihub_Stafihub_Rmintreward_MsgProvideRewardToken, Stafihub_Stafihub_Rmintreward_MsgProvideRewardTokenResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Stafihub_Stafihub_Rmintreward_MsgAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Stafihub_Stafihub_Rmintreward_MsgClientMetadata.serviceDescriptor
  }

  internal var interceptors: Stafihub_Stafihub_Rmintreward_MsgClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeAddMintRewardActCall(
    _ request: Stafihub_Stafihub_Rmintreward_MsgAddMintRewardAct,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Stafihub_Stafihub_Rmintreward_MsgAddMintRewardAct, Stafihub_Stafihub_Rmintreward_MsgAddMintRewardActResponse> {
    return self.makeAsyncUnaryCall(
      path: Stafihub_Stafihub_Rmintreward_MsgClientMetadata.Methods.addMintRewardAct.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAddMintRewardActInterceptors() ?? []
    )
  }

  internal func makeUpdateMintRewardActCall(
    _ request: Stafihub_Stafihub_Rmintreward_MsgUpdateMintRewardAct,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Stafihub_Stafihub_Rmintreward_MsgUpdateMintRewardAct, Stafihub_Stafihub_Rmintreward_MsgUpdateMintRewardActResponse> {
    return self.makeAsyncUnaryCall(
      path: Stafihub_Stafihub_Rmintreward_MsgClientMetadata.Methods.updateMintRewardAct.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUpdateMintRewardActInterceptors() ?? []
    )
  }

  internal func makeClaimMintRewardCall(
    _ request: Stafihub_Stafihub_Rmintreward_MsgClaimMintReward,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Stafihub_Stafihub_Rmintreward_MsgClaimMintReward, Stafihub_Stafihub_Rmintreward_MsgClaimMintRewardResponse> {
    return self.makeAsyncUnaryCall(
      path: Stafihub_Stafihub_Rmintreward_MsgClientMetadata.Methods.claimMintReward.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClaimMintRewardInterceptors() ?? []
    )
  }

  internal func makeProvideRewardTokenCall(
    _ request: Stafihub_Stafihub_Rmintreward_MsgProvideRewardToken,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Stafihub_Stafihub_Rmintreward_MsgProvideRewardToken, Stafihub_Stafihub_Rmintreward_MsgProvideRewardTokenResponse> {
    return self.makeAsyncUnaryCall(
      path: Stafihub_Stafihub_Rmintreward_MsgClientMetadata.Methods.provideRewardToken.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeProvideRewardTokenInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Stafihub_Stafihub_Rmintreward_MsgAsyncClientProtocol {
  internal func addMintRewardAct(
    _ request: Stafihub_Stafihub_Rmintreward_MsgAddMintRewardAct,
    callOptions: CallOptions? = nil
  ) async throws -> Stafihub_Stafihub_Rmintreward_MsgAddMintRewardActResponse {
    return try await self.performAsyncUnaryCall(
      path: Stafihub_Stafihub_Rmintreward_MsgClientMetadata.Methods.addMintRewardAct.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAddMintRewardActInterceptors() ?? []
    )
  }

  internal func updateMintRewardAct(
    _ request: Stafihub_Stafihub_Rmintreward_MsgUpdateMintRewardAct,
    callOptions: CallOptions? = nil
  ) async throws -> Stafihub_Stafihub_Rmintreward_MsgUpdateMintRewardActResponse {
    return try await self.performAsyncUnaryCall(
      path: Stafihub_Stafihub_Rmintreward_MsgClientMetadata.Methods.updateMintRewardAct.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUpdateMintRewardActInterceptors() ?? []
    )
  }

  internal func claimMintReward(
    _ request: Stafihub_Stafihub_Rmintreward_MsgClaimMintReward,
    callOptions: CallOptions? = nil
  ) async throws -> Stafihub_Stafihub_Rmintreward_MsgClaimMintRewardResponse {
    return try await self.performAsyncUnaryCall(
      path: Stafihub_Stafihub_Rmintreward_MsgClientMetadata.Methods.claimMintReward.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClaimMintRewardInterceptors() ?? []
    )
  }

  internal func provideRewardToken(
    _ request: Stafihub_Stafihub_Rmintreward_MsgProvideRewardToken,
    callOptions: CallOptions? = nil
  ) async throws -> Stafihub_Stafihub_Rmintreward_MsgProvideRewardTokenResponse {
    return try await self.performAsyncUnaryCall(
      path: Stafihub_Stafihub_Rmintreward_MsgClientMetadata.Methods.provideRewardToken.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeProvideRewardTokenInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Stafihub_Stafihub_Rmintreward_MsgAsyncClient: Stafihub_Stafihub_Rmintreward_MsgAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Stafihub_Stafihub_Rmintreward_MsgClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Stafihub_Stafihub_Rmintreward_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Stafihub_Stafihub_Rmintreward_MsgClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'addMintRewardAct'.
  func makeAddMintRewardActInterceptors() -> [ClientInterceptor<Stafihub_Stafihub_Rmintreward_MsgAddMintRewardAct, Stafihub_Stafihub_Rmintreward_MsgAddMintRewardActResponse>]

  /// - Returns: Interceptors to use when invoking 'updateMintRewardAct'.
  func makeUpdateMintRewardActInterceptors() -> [ClientInterceptor<Stafihub_Stafihub_Rmintreward_MsgUpdateMintRewardAct, Stafihub_Stafihub_Rmintreward_MsgUpdateMintRewardActResponse>]

  /// - Returns: Interceptors to use when invoking 'claimMintReward'.
  func makeClaimMintRewardInterceptors() -> [ClientInterceptor<Stafihub_Stafihub_Rmintreward_MsgClaimMintReward, Stafihub_Stafihub_Rmintreward_MsgClaimMintRewardResponse>]

  /// - Returns: Interceptors to use when invoking 'provideRewardToken'.
  func makeProvideRewardTokenInterceptors() -> [ClientInterceptor<Stafihub_Stafihub_Rmintreward_MsgProvideRewardToken, Stafihub_Stafihub_Rmintreward_MsgProvideRewardTokenResponse>]
}

internal enum Stafihub_Stafihub_Rmintreward_MsgClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "stafihub.stafihub.rmintreward.Msg",
    methods: [
      Stafihub_Stafihub_Rmintreward_MsgClientMetadata.Methods.addMintRewardAct,
      Stafihub_Stafihub_Rmintreward_MsgClientMetadata.Methods.updateMintRewardAct,
      Stafihub_Stafihub_Rmintreward_MsgClientMetadata.Methods.claimMintReward,
      Stafihub_Stafihub_Rmintreward_MsgClientMetadata.Methods.provideRewardToken,
    ]
  )

  internal enum Methods {
    internal static let addMintRewardAct = GRPCMethodDescriptor(
      name: "AddMintRewardAct",
      path: "/stafihub.stafihub.rmintreward.Msg/AddMintRewardAct",
      type: GRPCCallType.unary
    )

    internal static let updateMintRewardAct = GRPCMethodDescriptor(
      name: "UpdateMintRewardAct",
      path: "/stafihub.stafihub.rmintreward.Msg/UpdateMintRewardAct",
      type: GRPCCallType.unary
    )

    internal static let claimMintReward = GRPCMethodDescriptor(
      name: "ClaimMintReward",
      path: "/stafihub.stafihub.rmintreward.Msg/ClaimMintReward",
      type: GRPCCallType.unary
    )

    internal static let provideRewardToken = GRPCMethodDescriptor(
      name: "ProvideRewardToken",
      path: "/stafihub.stafihub.rmintreward.Msg/ProvideRewardToken",
      type: GRPCCallType.unary
    )
  }
}

/// Msg defines the Msg service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Stafihub_Stafihub_Rmintreward_MsgProvider: CallHandlerProvider {
  var interceptors: Stafihub_Stafihub_Rmintreward_MsgServerInterceptorFactoryProtocol? { get }

  func addMintRewardAct(request: Stafihub_Stafihub_Rmintreward_MsgAddMintRewardAct, context: StatusOnlyCallContext) -> EventLoopFuture<Stafihub_Stafihub_Rmintreward_MsgAddMintRewardActResponse>

  func updateMintRewardAct(request: Stafihub_Stafihub_Rmintreward_MsgUpdateMintRewardAct, context: StatusOnlyCallContext) -> EventLoopFuture<Stafihub_Stafihub_Rmintreward_MsgUpdateMintRewardActResponse>

  func claimMintReward(request: Stafihub_Stafihub_Rmintreward_MsgClaimMintReward, context: StatusOnlyCallContext) -> EventLoopFuture<Stafihub_Stafihub_Rmintreward_MsgClaimMintRewardResponse>

  /// this line is used by starport scaffolding # proto/tx/rpc
  func provideRewardToken(request: Stafihub_Stafihub_Rmintreward_MsgProvideRewardToken, context: StatusOnlyCallContext) -> EventLoopFuture<Stafihub_Stafihub_Rmintreward_MsgProvideRewardTokenResponse>
}

extension Stafihub_Stafihub_Rmintreward_MsgProvider {
  internal var serviceName: Substring {
    return Stafihub_Stafihub_Rmintreward_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "AddMintRewardAct":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stafihub_Stafihub_Rmintreward_MsgAddMintRewardAct>(),
        responseSerializer: ProtobufSerializer<Stafihub_Stafihub_Rmintreward_MsgAddMintRewardActResponse>(),
        interceptors: self.interceptors?.makeAddMintRewardActInterceptors() ?? [],
        userFunction: self.addMintRewardAct(request:context:)
      )

    case "UpdateMintRewardAct":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stafihub_Stafihub_Rmintreward_MsgUpdateMintRewardAct>(),
        responseSerializer: ProtobufSerializer<Stafihub_Stafihub_Rmintreward_MsgUpdateMintRewardActResponse>(),
        interceptors: self.interceptors?.makeUpdateMintRewardActInterceptors() ?? [],
        userFunction: self.updateMintRewardAct(request:context:)
      )

    case "ClaimMintReward":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stafihub_Stafihub_Rmintreward_MsgClaimMintReward>(),
        responseSerializer: ProtobufSerializer<Stafihub_Stafihub_Rmintreward_MsgClaimMintRewardResponse>(),
        interceptors: self.interceptors?.makeClaimMintRewardInterceptors() ?? [],
        userFunction: self.claimMintReward(request:context:)
      )

    case "ProvideRewardToken":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stafihub_Stafihub_Rmintreward_MsgProvideRewardToken>(),
        responseSerializer: ProtobufSerializer<Stafihub_Stafihub_Rmintreward_MsgProvideRewardTokenResponse>(),
        interceptors: self.interceptors?.makeProvideRewardTokenInterceptors() ?? [],
        userFunction: self.provideRewardToken(request:context:)
      )

    default:
      return nil
    }
  }
}

/// Msg defines the Msg service.
///
/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Stafihub_Stafihub_Rmintreward_MsgAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Stafihub_Stafihub_Rmintreward_MsgServerInterceptorFactoryProtocol? { get }

  @Sendable func addMintRewardAct(
    request: Stafihub_Stafihub_Rmintreward_MsgAddMintRewardAct,
    context: GRPCAsyncServerCallContext
  ) async throws -> Stafihub_Stafihub_Rmintreward_MsgAddMintRewardActResponse

  @Sendable func updateMintRewardAct(
    request: Stafihub_Stafihub_Rmintreward_MsgUpdateMintRewardAct,
    context: GRPCAsyncServerCallContext
  ) async throws -> Stafihub_Stafihub_Rmintreward_MsgUpdateMintRewardActResponse

  @Sendable func claimMintReward(
    request: Stafihub_Stafihub_Rmintreward_MsgClaimMintReward,
    context: GRPCAsyncServerCallContext
  ) async throws -> Stafihub_Stafihub_Rmintreward_MsgClaimMintRewardResponse

  /// this line is used by starport scaffolding # proto/tx/rpc
  @Sendable func provideRewardToken(
    request: Stafihub_Stafihub_Rmintreward_MsgProvideRewardToken,
    context: GRPCAsyncServerCallContext
  ) async throws -> Stafihub_Stafihub_Rmintreward_MsgProvideRewardTokenResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Stafihub_Stafihub_Rmintreward_MsgAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Stafihub_Stafihub_Rmintreward_MsgServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Stafihub_Stafihub_Rmintreward_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Stafihub_Stafihub_Rmintreward_MsgServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "AddMintRewardAct":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stafihub_Stafihub_Rmintreward_MsgAddMintRewardAct>(),
        responseSerializer: ProtobufSerializer<Stafihub_Stafihub_Rmintreward_MsgAddMintRewardActResponse>(),
        interceptors: self.interceptors?.makeAddMintRewardActInterceptors() ?? [],
        wrapping: self.addMintRewardAct(request:context:)
      )

    case "UpdateMintRewardAct":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stafihub_Stafihub_Rmintreward_MsgUpdateMintRewardAct>(),
        responseSerializer: ProtobufSerializer<Stafihub_Stafihub_Rmintreward_MsgUpdateMintRewardActResponse>(),
        interceptors: self.interceptors?.makeUpdateMintRewardActInterceptors() ?? [],
        wrapping: self.updateMintRewardAct(request:context:)
      )

    case "ClaimMintReward":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stafihub_Stafihub_Rmintreward_MsgClaimMintReward>(),
        responseSerializer: ProtobufSerializer<Stafihub_Stafihub_Rmintreward_MsgClaimMintRewardResponse>(),
        interceptors: self.interceptors?.makeClaimMintRewardInterceptors() ?? [],
        wrapping: self.claimMintReward(request:context:)
      )

    case "ProvideRewardToken":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stafihub_Stafihub_Rmintreward_MsgProvideRewardToken>(),
        responseSerializer: ProtobufSerializer<Stafihub_Stafihub_Rmintreward_MsgProvideRewardTokenResponse>(),
        interceptors: self.interceptors?.makeProvideRewardTokenInterceptors() ?? [],
        wrapping: self.provideRewardToken(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Stafihub_Stafihub_Rmintreward_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'addMintRewardAct'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeAddMintRewardActInterceptors() -> [ServerInterceptor<Stafihub_Stafihub_Rmintreward_MsgAddMintRewardAct, Stafihub_Stafihub_Rmintreward_MsgAddMintRewardActResponse>]

  /// - Returns: Interceptors to use when handling 'updateMintRewardAct'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeUpdateMintRewardActInterceptors() -> [ServerInterceptor<Stafihub_Stafihub_Rmintreward_MsgUpdateMintRewardAct, Stafihub_Stafihub_Rmintreward_MsgUpdateMintRewardActResponse>]

  /// - Returns: Interceptors to use when handling 'claimMintReward'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeClaimMintRewardInterceptors() -> [ServerInterceptor<Stafihub_Stafihub_Rmintreward_MsgClaimMintReward, Stafihub_Stafihub_Rmintreward_MsgClaimMintRewardResponse>]

  /// - Returns: Interceptors to use when handling 'provideRewardToken'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeProvideRewardTokenInterceptors() -> [ServerInterceptor<Stafihub_Stafihub_Rmintreward_MsgProvideRewardToken, Stafihub_Stafihub_Rmintreward_MsgProvideRewardTokenResponse>]
}

internal enum Stafihub_Stafihub_Rmintreward_MsgServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "stafihub.stafihub.rmintreward.Msg",
    methods: [
      Stafihub_Stafihub_Rmintreward_MsgServerMetadata.Methods.addMintRewardAct,
      Stafihub_Stafihub_Rmintreward_MsgServerMetadata.Methods.updateMintRewardAct,
      Stafihub_Stafihub_Rmintreward_MsgServerMetadata.Methods.claimMintReward,
      Stafihub_Stafihub_Rmintreward_MsgServerMetadata.Methods.provideRewardToken,
    ]
  )

  internal enum Methods {
    internal static let addMintRewardAct = GRPCMethodDescriptor(
      name: "AddMintRewardAct",
      path: "/stafihub.stafihub.rmintreward.Msg/AddMintRewardAct",
      type: GRPCCallType.unary
    )

    internal static let updateMintRewardAct = GRPCMethodDescriptor(
      name: "UpdateMintRewardAct",
      path: "/stafihub.stafihub.rmintreward.Msg/UpdateMintRewardAct",
      type: GRPCCallType.unary
    )

    internal static let claimMintReward = GRPCMethodDescriptor(
      name: "ClaimMintReward",
      path: "/stafihub.stafihub.rmintreward.Msg/ClaimMintReward",
      type: GRPCCallType.unary
    )

    internal static let provideRewardToken = GRPCMethodDescriptor(
      name: "ProvideRewardToken",
      path: "/stafihub.stafihub.rmintreward.Msg/ProvideRewardToken",
      type: GRPCCallType.unary
    )
  }
}
