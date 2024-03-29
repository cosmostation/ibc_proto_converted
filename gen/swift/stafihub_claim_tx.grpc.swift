//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: stafihub/claim/tx.proto
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
/// Usage: instantiate `Stafihub_Stafihub_Claim_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Stafihub_Stafihub_Claim_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Stafihub_Stafihub_Claim_MsgClientInterceptorFactoryProtocol? { get }

  func setMerkleRoot(
    _ request: Stafihub_Stafihub_Claim_MsgSetMerkleRoot,
    callOptions: CallOptions?
  ) -> UnaryCall<Stafihub_Stafihub_Claim_MsgSetMerkleRoot, Stafihub_Stafihub_Claim_MsgSetMerkleRootResponse>

  func claim(
    _ request: Stafihub_Stafihub_Claim_MsgClaim,
    callOptions: CallOptions?
  ) -> UnaryCall<Stafihub_Stafihub_Claim_MsgClaim, Stafihub_Stafihub_Claim_MsgClaimResponse>

  func toggleClaimSwitch(
    _ request: Stafihub_Stafihub_Claim_MsgToggleClaimSwitch,
    callOptions: CallOptions?
  ) -> UnaryCall<Stafihub_Stafihub_Claim_MsgToggleClaimSwitch, Stafihub_Stafihub_Claim_MsgToggleClaimSwitchResponse>

  func provideToken(
    _ request: Stafihub_Stafihub_Claim_MsgProvideToken,
    callOptions: CallOptions?
  ) -> UnaryCall<Stafihub_Stafihub_Claim_MsgProvideToken, Stafihub_Stafihub_Claim_MsgProvideTokenResponse>

  func withdrawToken(
    _ request: Stafihub_Stafihub_Claim_MsgWithdrawToken,
    callOptions: CallOptions?
  ) -> UnaryCall<Stafihub_Stafihub_Claim_MsgWithdrawToken, Stafihub_Stafihub_Claim_MsgWithdrawTokenResponse>
}

extension Stafihub_Stafihub_Claim_MsgClientProtocol {
  internal var serviceName: String {
    return "stafihub.stafihub.claim.Msg"
  }

  /// Unary call to SetMerkleRoot
  ///
  /// - Parameters:
  ///   - request: Request to send to SetMerkleRoot.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func setMerkleRoot(
    _ request: Stafihub_Stafihub_Claim_MsgSetMerkleRoot,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Stafihub_Stafihub_Claim_MsgSetMerkleRoot, Stafihub_Stafihub_Claim_MsgSetMerkleRootResponse> {
    return self.makeUnaryCall(
      path: Stafihub_Stafihub_Claim_MsgClientMetadata.Methods.setMerkleRoot.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSetMerkleRootInterceptors() ?? []
    )
  }

  /// Unary call to Claim
  ///
  /// - Parameters:
  ///   - request: Request to send to Claim.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func claim(
    _ request: Stafihub_Stafihub_Claim_MsgClaim,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Stafihub_Stafihub_Claim_MsgClaim, Stafihub_Stafihub_Claim_MsgClaimResponse> {
    return self.makeUnaryCall(
      path: Stafihub_Stafihub_Claim_MsgClientMetadata.Methods.claim.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClaimInterceptors() ?? []
    )
  }

  /// Unary call to ToggleClaimSwitch
  ///
  /// - Parameters:
  ///   - request: Request to send to ToggleClaimSwitch.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func toggleClaimSwitch(
    _ request: Stafihub_Stafihub_Claim_MsgToggleClaimSwitch,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Stafihub_Stafihub_Claim_MsgToggleClaimSwitch, Stafihub_Stafihub_Claim_MsgToggleClaimSwitchResponse> {
    return self.makeUnaryCall(
      path: Stafihub_Stafihub_Claim_MsgClientMetadata.Methods.toggleClaimSwitch.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeToggleClaimSwitchInterceptors() ?? []
    )
  }

  /// Unary call to ProvideToken
  ///
  /// - Parameters:
  ///   - request: Request to send to ProvideToken.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func provideToken(
    _ request: Stafihub_Stafihub_Claim_MsgProvideToken,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Stafihub_Stafihub_Claim_MsgProvideToken, Stafihub_Stafihub_Claim_MsgProvideTokenResponse> {
    return self.makeUnaryCall(
      path: Stafihub_Stafihub_Claim_MsgClientMetadata.Methods.provideToken.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeProvideTokenInterceptors() ?? []
    )
  }

  /// this line is used by starport scaffolding # proto/tx/rpc
  ///
  /// - Parameters:
  ///   - request: Request to send to WithdrawToken.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func withdrawToken(
    _ request: Stafihub_Stafihub_Claim_MsgWithdrawToken,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Stafihub_Stafihub_Claim_MsgWithdrawToken, Stafihub_Stafihub_Claim_MsgWithdrawTokenResponse> {
    return self.makeUnaryCall(
      path: Stafihub_Stafihub_Claim_MsgClientMetadata.Methods.withdrawToken.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeWithdrawTokenInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Stafihub_Stafihub_Claim_MsgClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Stafihub_Stafihub_Claim_MsgNIOClient")
internal final class Stafihub_Stafihub_Claim_MsgClient: Stafihub_Stafihub_Claim_MsgClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Stafihub_Stafihub_Claim_MsgClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Stafihub_Stafihub_Claim_MsgClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the stafihub.stafihub.claim.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Stafihub_Stafihub_Claim_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Stafihub_Stafihub_Claim_MsgNIOClient: Stafihub_Stafihub_Claim_MsgClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Stafihub_Stafihub_Claim_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the stafihub.stafihub.claim.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Stafihub_Stafihub_Claim_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Msg defines the Msg service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Stafihub_Stafihub_Claim_MsgAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Stafihub_Stafihub_Claim_MsgClientInterceptorFactoryProtocol? { get }

  func makeSetMerkleRootCall(
    _ request: Stafihub_Stafihub_Claim_MsgSetMerkleRoot,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Stafihub_Stafihub_Claim_MsgSetMerkleRoot, Stafihub_Stafihub_Claim_MsgSetMerkleRootResponse>

  func makeClaimCall(
    _ request: Stafihub_Stafihub_Claim_MsgClaim,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Stafihub_Stafihub_Claim_MsgClaim, Stafihub_Stafihub_Claim_MsgClaimResponse>

  func makeToggleClaimSwitchCall(
    _ request: Stafihub_Stafihub_Claim_MsgToggleClaimSwitch,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Stafihub_Stafihub_Claim_MsgToggleClaimSwitch, Stafihub_Stafihub_Claim_MsgToggleClaimSwitchResponse>

  func makeProvideTokenCall(
    _ request: Stafihub_Stafihub_Claim_MsgProvideToken,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Stafihub_Stafihub_Claim_MsgProvideToken, Stafihub_Stafihub_Claim_MsgProvideTokenResponse>

  func makeWithdrawTokenCall(
    _ request: Stafihub_Stafihub_Claim_MsgWithdrawToken,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Stafihub_Stafihub_Claim_MsgWithdrawToken, Stafihub_Stafihub_Claim_MsgWithdrawTokenResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Stafihub_Stafihub_Claim_MsgAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Stafihub_Stafihub_Claim_MsgClientMetadata.serviceDescriptor
  }

  internal var interceptors: Stafihub_Stafihub_Claim_MsgClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeSetMerkleRootCall(
    _ request: Stafihub_Stafihub_Claim_MsgSetMerkleRoot,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Stafihub_Stafihub_Claim_MsgSetMerkleRoot, Stafihub_Stafihub_Claim_MsgSetMerkleRootResponse> {
    return self.makeAsyncUnaryCall(
      path: Stafihub_Stafihub_Claim_MsgClientMetadata.Methods.setMerkleRoot.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSetMerkleRootInterceptors() ?? []
    )
  }

  internal func makeClaimCall(
    _ request: Stafihub_Stafihub_Claim_MsgClaim,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Stafihub_Stafihub_Claim_MsgClaim, Stafihub_Stafihub_Claim_MsgClaimResponse> {
    return self.makeAsyncUnaryCall(
      path: Stafihub_Stafihub_Claim_MsgClientMetadata.Methods.claim.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClaimInterceptors() ?? []
    )
  }

  internal func makeToggleClaimSwitchCall(
    _ request: Stafihub_Stafihub_Claim_MsgToggleClaimSwitch,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Stafihub_Stafihub_Claim_MsgToggleClaimSwitch, Stafihub_Stafihub_Claim_MsgToggleClaimSwitchResponse> {
    return self.makeAsyncUnaryCall(
      path: Stafihub_Stafihub_Claim_MsgClientMetadata.Methods.toggleClaimSwitch.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeToggleClaimSwitchInterceptors() ?? []
    )
  }

  internal func makeProvideTokenCall(
    _ request: Stafihub_Stafihub_Claim_MsgProvideToken,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Stafihub_Stafihub_Claim_MsgProvideToken, Stafihub_Stafihub_Claim_MsgProvideTokenResponse> {
    return self.makeAsyncUnaryCall(
      path: Stafihub_Stafihub_Claim_MsgClientMetadata.Methods.provideToken.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeProvideTokenInterceptors() ?? []
    )
  }

  internal func makeWithdrawTokenCall(
    _ request: Stafihub_Stafihub_Claim_MsgWithdrawToken,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Stafihub_Stafihub_Claim_MsgWithdrawToken, Stafihub_Stafihub_Claim_MsgWithdrawTokenResponse> {
    return self.makeAsyncUnaryCall(
      path: Stafihub_Stafihub_Claim_MsgClientMetadata.Methods.withdrawToken.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeWithdrawTokenInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Stafihub_Stafihub_Claim_MsgAsyncClientProtocol {
  internal func setMerkleRoot(
    _ request: Stafihub_Stafihub_Claim_MsgSetMerkleRoot,
    callOptions: CallOptions? = nil
  ) async throws -> Stafihub_Stafihub_Claim_MsgSetMerkleRootResponse {
    return try await self.performAsyncUnaryCall(
      path: Stafihub_Stafihub_Claim_MsgClientMetadata.Methods.setMerkleRoot.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSetMerkleRootInterceptors() ?? []
    )
  }

  internal func claim(
    _ request: Stafihub_Stafihub_Claim_MsgClaim,
    callOptions: CallOptions? = nil
  ) async throws -> Stafihub_Stafihub_Claim_MsgClaimResponse {
    return try await self.performAsyncUnaryCall(
      path: Stafihub_Stafihub_Claim_MsgClientMetadata.Methods.claim.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClaimInterceptors() ?? []
    )
  }

  internal func toggleClaimSwitch(
    _ request: Stafihub_Stafihub_Claim_MsgToggleClaimSwitch,
    callOptions: CallOptions? = nil
  ) async throws -> Stafihub_Stafihub_Claim_MsgToggleClaimSwitchResponse {
    return try await self.performAsyncUnaryCall(
      path: Stafihub_Stafihub_Claim_MsgClientMetadata.Methods.toggleClaimSwitch.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeToggleClaimSwitchInterceptors() ?? []
    )
  }

  internal func provideToken(
    _ request: Stafihub_Stafihub_Claim_MsgProvideToken,
    callOptions: CallOptions? = nil
  ) async throws -> Stafihub_Stafihub_Claim_MsgProvideTokenResponse {
    return try await self.performAsyncUnaryCall(
      path: Stafihub_Stafihub_Claim_MsgClientMetadata.Methods.provideToken.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeProvideTokenInterceptors() ?? []
    )
  }

  internal func withdrawToken(
    _ request: Stafihub_Stafihub_Claim_MsgWithdrawToken,
    callOptions: CallOptions? = nil
  ) async throws -> Stafihub_Stafihub_Claim_MsgWithdrawTokenResponse {
    return try await self.performAsyncUnaryCall(
      path: Stafihub_Stafihub_Claim_MsgClientMetadata.Methods.withdrawToken.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeWithdrawTokenInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Stafihub_Stafihub_Claim_MsgAsyncClient: Stafihub_Stafihub_Claim_MsgAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Stafihub_Stafihub_Claim_MsgClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Stafihub_Stafihub_Claim_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Stafihub_Stafihub_Claim_MsgClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'setMerkleRoot'.
  func makeSetMerkleRootInterceptors() -> [ClientInterceptor<Stafihub_Stafihub_Claim_MsgSetMerkleRoot, Stafihub_Stafihub_Claim_MsgSetMerkleRootResponse>]

  /// - Returns: Interceptors to use when invoking 'claim'.
  func makeClaimInterceptors() -> [ClientInterceptor<Stafihub_Stafihub_Claim_MsgClaim, Stafihub_Stafihub_Claim_MsgClaimResponse>]

  /// - Returns: Interceptors to use when invoking 'toggleClaimSwitch'.
  func makeToggleClaimSwitchInterceptors() -> [ClientInterceptor<Stafihub_Stafihub_Claim_MsgToggleClaimSwitch, Stafihub_Stafihub_Claim_MsgToggleClaimSwitchResponse>]

  /// - Returns: Interceptors to use when invoking 'provideToken'.
  func makeProvideTokenInterceptors() -> [ClientInterceptor<Stafihub_Stafihub_Claim_MsgProvideToken, Stafihub_Stafihub_Claim_MsgProvideTokenResponse>]

  /// - Returns: Interceptors to use when invoking 'withdrawToken'.
  func makeWithdrawTokenInterceptors() -> [ClientInterceptor<Stafihub_Stafihub_Claim_MsgWithdrawToken, Stafihub_Stafihub_Claim_MsgWithdrawTokenResponse>]
}

internal enum Stafihub_Stafihub_Claim_MsgClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "stafihub.stafihub.claim.Msg",
    methods: [
      Stafihub_Stafihub_Claim_MsgClientMetadata.Methods.setMerkleRoot,
      Stafihub_Stafihub_Claim_MsgClientMetadata.Methods.claim,
      Stafihub_Stafihub_Claim_MsgClientMetadata.Methods.toggleClaimSwitch,
      Stafihub_Stafihub_Claim_MsgClientMetadata.Methods.provideToken,
      Stafihub_Stafihub_Claim_MsgClientMetadata.Methods.withdrawToken,
    ]
  )

  internal enum Methods {
    internal static let setMerkleRoot = GRPCMethodDescriptor(
      name: "SetMerkleRoot",
      path: "/stafihub.stafihub.claim.Msg/SetMerkleRoot",
      type: GRPCCallType.unary
    )

    internal static let claim = GRPCMethodDescriptor(
      name: "Claim",
      path: "/stafihub.stafihub.claim.Msg/Claim",
      type: GRPCCallType.unary
    )

    internal static let toggleClaimSwitch = GRPCMethodDescriptor(
      name: "ToggleClaimSwitch",
      path: "/stafihub.stafihub.claim.Msg/ToggleClaimSwitch",
      type: GRPCCallType.unary
    )

    internal static let provideToken = GRPCMethodDescriptor(
      name: "ProvideToken",
      path: "/stafihub.stafihub.claim.Msg/ProvideToken",
      type: GRPCCallType.unary
    )

    internal static let withdrawToken = GRPCMethodDescriptor(
      name: "WithdrawToken",
      path: "/stafihub.stafihub.claim.Msg/WithdrawToken",
      type: GRPCCallType.unary
    )
  }
}

/// Msg defines the Msg service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Stafihub_Stafihub_Claim_MsgProvider: CallHandlerProvider {
  var interceptors: Stafihub_Stafihub_Claim_MsgServerInterceptorFactoryProtocol? { get }

  func setMerkleRoot(request: Stafihub_Stafihub_Claim_MsgSetMerkleRoot, context: StatusOnlyCallContext) -> EventLoopFuture<Stafihub_Stafihub_Claim_MsgSetMerkleRootResponse>

  func claim(request: Stafihub_Stafihub_Claim_MsgClaim, context: StatusOnlyCallContext) -> EventLoopFuture<Stafihub_Stafihub_Claim_MsgClaimResponse>

  func toggleClaimSwitch(request: Stafihub_Stafihub_Claim_MsgToggleClaimSwitch, context: StatusOnlyCallContext) -> EventLoopFuture<Stafihub_Stafihub_Claim_MsgToggleClaimSwitchResponse>

  func provideToken(request: Stafihub_Stafihub_Claim_MsgProvideToken, context: StatusOnlyCallContext) -> EventLoopFuture<Stafihub_Stafihub_Claim_MsgProvideTokenResponse>

  /// this line is used by starport scaffolding # proto/tx/rpc
  func withdrawToken(request: Stafihub_Stafihub_Claim_MsgWithdrawToken, context: StatusOnlyCallContext) -> EventLoopFuture<Stafihub_Stafihub_Claim_MsgWithdrawTokenResponse>
}

extension Stafihub_Stafihub_Claim_MsgProvider {
  internal var serviceName: Substring {
    return Stafihub_Stafihub_Claim_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "SetMerkleRoot":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stafihub_Stafihub_Claim_MsgSetMerkleRoot>(),
        responseSerializer: ProtobufSerializer<Stafihub_Stafihub_Claim_MsgSetMerkleRootResponse>(),
        interceptors: self.interceptors?.makeSetMerkleRootInterceptors() ?? [],
        userFunction: self.setMerkleRoot(request:context:)
      )

    case "Claim":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stafihub_Stafihub_Claim_MsgClaim>(),
        responseSerializer: ProtobufSerializer<Stafihub_Stafihub_Claim_MsgClaimResponse>(),
        interceptors: self.interceptors?.makeClaimInterceptors() ?? [],
        userFunction: self.claim(request:context:)
      )

    case "ToggleClaimSwitch":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stafihub_Stafihub_Claim_MsgToggleClaimSwitch>(),
        responseSerializer: ProtobufSerializer<Stafihub_Stafihub_Claim_MsgToggleClaimSwitchResponse>(),
        interceptors: self.interceptors?.makeToggleClaimSwitchInterceptors() ?? [],
        userFunction: self.toggleClaimSwitch(request:context:)
      )

    case "ProvideToken":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stafihub_Stafihub_Claim_MsgProvideToken>(),
        responseSerializer: ProtobufSerializer<Stafihub_Stafihub_Claim_MsgProvideTokenResponse>(),
        interceptors: self.interceptors?.makeProvideTokenInterceptors() ?? [],
        userFunction: self.provideToken(request:context:)
      )

    case "WithdrawToken":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stafihub_Stafihub_Claim_MsgWithdrawToken>(),
        responseSerializer: ProtobufSerializer<Stafihub_Stafihub_Claim_MsgWithdrawTokenResponse>(),
        interceptors: self.interceptors?.makeWithdrawTokenInterceptors() ?? [],
        userFunction: self.withdrawToken(request:context:)
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
internal protocol Stafihub_Stafihub_Claim_MsgAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Stafihub_Stafihub_Claim_MsgServerInterceptorFactoryProtocol? { get }

  @Sendable func setMerkleRoot(
    request: Stafihub_Stafihub_Claim_MsgSetMerkleRoot,
    context: GRPCAsyncServerCallContext
  ) async throws -> Stafihub_Stafihub_Claim_MsgSetMerkleRootResponse

  @Sendable func claim(
    request: Stafihub_Stafihub_Claim_MsgClaim,
    context: GRPCAsyncServerCallContext
  ) async throws -> Stafihub_Stafihub_Claim_MsgClaimResponse

  @Sendable func toggleClaimSwitch(
    request: Stafihub_Stafihub_Claim_MsgToggleClaimSwitch,
    context: GRPCAsyncServerCallContext
  ) async throws -> Stafihub_Stafihub_Claim_MsgToggleClaimSwitchResponse

  @Sendable func provideToken(
    request: Stafihub_Stafihub_Claim_MsgProvideToken,
    context: GRPCAsyncServerCallContext
  ) async throws -> Stafihub_Stafihub_Claim_MsgProvideTokenResponse

  /// this line is used by starport scaffolding # proto/tx/rpc
  @Sendable func withdrawToken(
    request: Stafihub_Stafihub_Claim_MsgWithdrawToken,
    context: GRPCAsyncServerCallContext
  ) async throws -> Stafihub_Stafihub_Claim_MsgWithdrawTokenResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Stafihub_Stafihub_Claim_MsgAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Stafihub_Stafihub_Claim_MsgServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Stafihub_Stafihub_Claim_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Stafihub_Stafihub_Claim_MsgServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "SetMerkleRoot":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stafihub_Stafihub_Claim_MsgSetMerkleRoot>(),
        responseSerializer: ProtobufSerializer<Stafihub_Stafihub_Claim_MsgSetMerkleRootResponse>(),
        interceptors: self.interceptors?.makeSetMerkleRootInterceptors() ?? [],
        wrapping: self.setMerkleRoot(request:context:)
      )

    case "Claim":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stafihub_Stafihub_Claim_MsgClaim>(),
        responseSerializer: ProtobufSerializer<Stafihub_Stafihub_Claim_MsgClaimResponse>(),
        interceptors: self.interceptors?.makeClaimInterceptors() ?? [],
        wrapping: self.claim(request:context:)
      )

    case "ToggleClaimSwitch":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stafihub_Stafihub_Claim_MsgToggleClaimSwitch>(),
        responseSerializer: ProtobufSerializer<Stafihub_Stafihub_Claim_MsgToggleClaimSwitchResponse>(),
        interceptors: self.interceptors?.makeToggleClaimSwitchInterceptors() ?? [],
        wrapping: self.toggleClaimSwitch(request:context:)
      )

    case "ProvideToken":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stafihub_Stafihub_Claim_MsgProvideToken>(),
        responseSerializer: ProtobufSerializer<Stafihub_Stafihub_Claim_MsgProvideTokenResponse>(),
        interceptors: self.interceptors?.makeProvideTokenInterceptors() ?? [],
        wrapping: self.provideToken(request:context:)
      )

    case "WithdrawToken":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stafihub_Stafihub_Claim_MsgWithdrawToken>(),
        responseSerializer: ProtobufSerializer<Stafihub_Stafihub_Claim_MsgWithdrawTokenResponse>(),
        interceptors: self.interceptors?.makeWithdrawTokenInterceptors() ?? [],
        wrapping: self.withdrawToken(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Stafihub_Stafihub_Claim_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'setMerkleRoot'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeSetMerkleRootInterceptors() -> [ServerInterceptor<Stafihub_Stafihub_Claim_MsgSetMerkleRoot, Stafihub_Stafihub_Claim_MsgSetMerkleRootResponse>]

  /// - Returns: Interceptors to use when handling 'claim'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeClaimInterceptors() -> [ServerInterceptor<Stafihub_Stafihub_Claim_MsgClaim, Stafihub_Stafihub_Claim_MsgClaimResponse>]

  /// - Returns: Interceptors to use when handling 'toggleClaimSwitch'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeToggleClaimSwitchInterceptors() -> [ServerInterceptor<Stafihub_Stafihub_Claim_MsgToggleClaimSwitch, Stafihub_Stafihub_Claim_MsgToggleClaimSwitchResponse>]

  /// - Returns: Interceptors to use when handling 'provideToken'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeProvideTokenInterceptors() -> [ServerInterceptor<Stafihub_Stafihub_Claim_MsgProvideToken, Stafihub_Stafihub_Claim_MsgProvideTokenResponse>]

  /// - Returns: Interceptors to use when handling 'withdrawToken'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeWithdrawTokenInterceptors() -> [ServerInterceptor<Stafihub_Stafihub_Claim_MsgWithdrawToken, Stafihub_Stafihub_Claim_MsgWithdrawTokenResponse>]
}

internal enum Stafihub_Stafihub_Claim_MsgServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "stafihub.stafihub.claim.Msg",
    methods: [
      Stafihub_Stafihub_Claim_MsgServerMetadata.Methods.setMerkleRoot,
      Stafihub_Stafihub_Claim_MsgServerMetadata.Methods.claim,
      Stafihub_Stafihub_Claim_MsgServerMetadata.Methods.toggleClaimSwitch,
      Stafihub_Stafihub_Claim_MsgServerMetadata.Methods.provideToken,
      Stafihub_Stafihub_Claim_MsgServerMetadata.Methods.withdrawToken,
    ]
  )

  internal enum Methods {
    internal static let setMerkleRoot = GRPCMethodDescriptor(
      name: "SetMerkleRoot",
      path: "/stafihub.stafihub.claim.Msg/SetMerkleRoot",
      type: GRPCCallType.unary
    )

    internal static let claim = GRPCMethodDescriptor(
      name: "Claim",
      path: "/stafihub.stafihub.claim.Msg/Claim",
      type: GRPCCallType.unary
    )

    internal static let toggleClaimSwitch = GRPCMethodDescriptor(
      name: "ToggleClaimSwitch",
      path: "/stafihub.stafihub.claim.Msg/ToggleClaimSwitch",
      type: GRPCCallType.unary
    )

    internal static let provideToken = GRPCMethodDescriptor(
      name: "ProvideToken",
      path: "/stafihub.stafihub.claim.Msg/ProvideToken",
      type: GRPCCallType.unary
    )

    internal static let withdrawToken = GRPCMethodDescriptor(
      name: "WithdrawToken",
      path: "/stafihub.stafihub.claim.Msg/WithdrawToken",
      type: GRPCCallType.unary
    )
  }
}
