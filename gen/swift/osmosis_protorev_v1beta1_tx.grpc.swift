//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: osmosis/protorev/v1beta1/tx.proto
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


/// Usage: instantiate `Osmosis_Protorev_V1beta1_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Osmosis_Protorev_V1beta1_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Osmosis_Protorev_V1beta1_MsgClientInterceptorFactoryProtocol? { get }

  func setHotRoutes(
    _ request: Osmosis_Protorev_V1beta1_MsgSetHotRoutes,
    callOptions: CallOptions?
  ) -> UnaryCall<Osmosis_Protorev_V1beta1_MsgSetHotRoutes, Osmosis_Protorev_V1beta1_MsgSetHotRoutesResponse>

  func setDeveloperAccount(
    _ request: Osmosis_Protorev_V1beta1_MsgSetDeveloperAccount,
    callOptions: CallOptions?
  ) -> UnaryCall<Osmosis_Protorev_V1beta1_MsgSetDeveloperAccount, Osmosis_Protorev_V1beta1_MsgSetDeveloperAccountResponse>

  func setMaxPoolPointsPerTx(
    _ request: Osmosis_Protorev_V1beta1_MsgSetMaxPoolPointsPerTx,
    callOptions: CallOptions?
  ) -> UnaryCall<Osmosis_Protorev_V1beta1_MsgSetMaxPoolPointsPerTx, Osmosis_Protorev_V1beta1_MsgSetMaxPoolPointsPerTxResponse>

  func setMaxPoolPointsPerBlock(
    _ request: Osmosis_Protorev_V1beta1_MsgSetMaxPoolPointsPerBlock,
    callOptions: CallOptions?
  ) -> UnaryCall<Osmosis_Protorev_V1beta1_MsgSetMaxPoolPointsPerBlock, Osmosis_Protorev_V1beta1_MsgSetMaxPoolPointsPerBlockResponse>

  func setPoolWeights(
    _ request: Osmosis_Protorev_V1beta1_MsgSetPoolWeights,
    callOptions: CallOptions?
  ) -> UnaryCall<Osmosis_Protorev_V1beta1_MsgSetPoolWeights, Osmosis_Protorev_V1beta1_MsgSetPoolWeightsResponse>

  func setBaseDenoms(
    _ request: Osmosis_Protorev_V1beta1_MsgSetBaseDenoms,
    callOptions: CallOptions?
  ) -> UnaryCall<Osmosis_Protorev_V1beta1_MsgSetBaseDenoms, Osmosis_Protorev_V1beta1_MsgSetBaseDenomsResponse>
}

extension Osmosis_Protorev_V1beta1_MsgClientProtocol {
  internal var serviceName: String {
    return "osmosis.protorev.v1beta1.Msg"
  }

  /// SetHotRoutes sets the hot routes that will be explored when creating
  /// cyclic arbitrage routes. Can only be called by the admin account.
  ///
  /// - Parameters:
  ///   - request: Request to send to SetHotRoutes.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func setHotRoutes(
    _ request: Osmosis_Protorev_V1beta1_MsgSetHotRoutes,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Osmosis_Protorev_V1beta1_MsgSetHotRoutes, Osmosis_Protorev_V1beta1_MsgSetHotRoutesResponse> {
    return self.makeUnaryCall(
      path: Osmosis_Protorev_V1beta1_MsgClientMetadata.Methods.setHotRoutes.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSetHotRoutesInterceptors() ?? []
    )
  }

  /// SetDeveloperAccount sets the account that can withdraw a portion of the
  /// profits from the protorev module. This will be Skip's address.
  ///
  /// - Parameters:
  ///   - request: Request to send to SetDeveloperAccount.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func setDeveloperAccount(
    _ request: Osmosis_Protorev_V1beta1_MsgSetDeveloperAccount,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Osmosis_Protorev_V1beta1_MsgSetDeveloperAccount, Osmosis_Protorev_V1beta1_MsgSetDeveloperAccountResponse> {
    return self.makeUnaryCall(
      path: Osmosis_Protorev_V1beta1_MsgClientMetadata.Methods.setDeveloperAccount.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSetDeveloperAccountInterceptors() ?? []
    )
  }

  /// SetMaxPoolPointsPerTx sets the maximum number of pool points that can be
  /// consumed per transaction. Can only be called by the admin account.
  ///
  /// - Parameters:
  ///   - request: Request to send to SetMaxPoolPointsPerTx.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func setMaxPoolPointsPerTx(
    _ request: Osmosis_Protorev_V1beta1_MsgSetMaxPoolPointsPerTx,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Osmosis_Protorev_V1beta1_MsgSetMaxPoolPointsPerTx, Osmosis_Protorev_V1beta1_MsgSetMaxPoolPointsPerTxResponse> {
    return self.makeUnaryCall(
      path: Osmosis_Protorev_V1beta1_MsgClientMetadata.Methods.setMaxPoolPointsPerTx.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSetMaxPoolPointsPerTxInterceptors() ?? []
    )
  }

  /// SetMaxPoolPointsPerBlock sets the maximum number of pool points that can be
  /// consumed per block. Can only be called by the admin account.
  ///
  /// - Parameters:
  ///   - request: Request to send to SetMaxPoolPointsPerBlock.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func setMaxPoolPointsPerBlock(
    _ request: Osmosis_Protorev_V1beta1_MsgSetMaxPoolPointsPerBlock,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Osmosis_Protorev_V1beta1_MsgSetMaxPoolPointsPerBlock, Osmosis_Protorev_V1beta1_MsgSetMaxPoolPointsPerBlockResponse> {
    return self.makeUnaryCall(
      path: Osmosis_Protorev_V1beta1_MsgClientMetadata.Methods.setMaxPoolPointsPerBlock.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSetMaxPoolPointsPerBlockInterceptors() ?? []
    )
  }

  /// SetPoolWeights sets the weights of each pool type in the store. Can only be
  /// called by the admin account.
  ///
  /// - Parameters:
  ///   - request: Request to send to SetPoolWeights.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func setPoolWeights(
    _ request: Osmosis_Protorev_V1beta1_MsgSetPoolWeights,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Osmosis_Protorev_V1beta1_MsgSetPoolWeights, Osmosis_Protorev_V1beta1_MsgSetPoolWeightsResponse> {
    return self.makeUnaryCall(
      path: Osmosis_Protorev_V1beta1_MsgClientMetadata.Methods.setPoolWeights.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSetPoolWeightsInterceptors() ?? []
    )
  }

  /// SetBaseDenoms sets the base denoms that will be used to create cyclic
  /// arbitrage routes. Can only be called by the admin account.
  ///
  /// - Parameters:
  ///   - request: Request to send to SetBaseDenoms.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func setBaseDenoms(
    _ request: Osmosis_Protorev_V1beta1_MsgSetBaseDenoms,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Osmosis_Protorev_V1beta1_MsgSetBaseDenoms, Osmosis_Protorev_V1beta1_MsgSetBaseDenomsResponse> {
    return self.makeUnaryCall(
      path: Osmosis_Protorev_V1beta1_MsgClientMetadata.Methods.setBaseDenoms.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSetBaseDenomsInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Osmosis_Protorev_V1beta1_MsgClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Osmosis_Protorev_V1beta1_MsgNIOClient")
internal final class Osmosis_Protorev_V1beta1_MsgClient: Osmosis_Protorev_V1beta1_MsgClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Osmosis_Protorev_V1beta1_MsgClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Osmosis_Protorev_V1beta1_MsgClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the osmosis.protorev.v1beta1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Osmosis_Protorev_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Osmosis_Protorev_V1beta1_MsgNIOClient: Osmosis_Protorev_V1beta1_MsgClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Osmosis_Protorev_V1beta1_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the osmosis.protorev.v1beta1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Osmosis_Protorev_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Osmosis_Protorev_V1beta1_MsgAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Osmosis_Protorev_V1beta1_MsgClientInterceptorFactoryProtocol? { get }

  func makeSetHotRoutesCall(
    _ request: Osmosis_Protorev_V1beta1_MsgSetHotRoutes,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Osmosis_Protorev_V1beta1_MsgSetHotRoutes, Osmosis_Protorev_V1beta1_MsgSetHotRoutesResponse>

  func makeSetDeveloperAccountCall(
    _ request: Osmosis_Protorev_V1beta1_MsgSetDeveloperAccount,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Osmosis_Protorev_V1beta1_MsgSetDeveloperAccount, Osmosis_Protorev_V1beta1_MsgSetDeveloperAccountResponse>

  func makeSetMaxPoolPointsPerTxCall(
    _ request: Osmosis_Protorev_V1beta1_MsgSetMaxPoolPointsPerTx,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Osmosis_Protorev_V1beta1_MsgSetMaxPoolPointsPerTx, Osmosis_Protorev_V1beta1_MsgSetMaxPoolPointsPerTxResponse>

  func makeSetMaxPoolPointsPerBlockCall(
    _ request: Osmosis_Protorev_V1beta1_MsgSetMaxPoolPointsPerBlock,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Osmosis_Protorev_V1beta1_MsgSetMaxPoolPointsPerBlock, Osmosis_Protorev_V1beta1_MsgSetMaxPoolPointsPerBlockResponse>

  func makeSetPoolWeightsCall(
    _ request: Osmosis_Protorev_V1beta1_MsgSetPoolWeights,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Osmosis_Protorev_V1beta1_MsgSetPoolWeights, Osmosis_Protorev_V1beta1_MsgSetPoolWeightsResponse>

  func makeSetBaseDenomsCall(
    _ request: Osmosis_Protorev_V1beta1_MsgSetBaseDenoms,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Osmosis_Protorev_V1beta1_MsgSetBaseDenoms, Osmosis_Protorev_V1beta1_MsgSetBaseDenomsResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Osmosis_Protorev_V1beta1_MsgAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Osmosis_Protorev_V1beta1_MsgClientMetadata.serviceDescriptor
  }

  internal var interceptors: Osmosis_Protorev_V1beta1_MsgClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeSetHotRoutesCall(
    _ request: Osmosis_Protorev_V1beta1_MsgSetHotRoutes,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Osmosis_Protorev_V1beta1_MsgSetHotRoutes, Osmosis_Protorev_V1beta1_MsgSetHotRoutesResponse> {
    return self.makeAsyncUnaryCall(
      path: Osmosis_Protorev_V1beta1_MsgClientMetadata.Methods.setHotRoutes.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSetHotRoutesInterceptors() ?? []
    )
  }

  internal func makeSetDeveloperAccountCall(
    _ request: Osmosis_Protorev_V1beta1_MsgSetDeveloperAccount,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Osmosis_Protorev_V1beta1_MsgSetDeveloperAccount, Osmosis_Protorev_V1beta1_MsgSetDeveloperAccountResponse> {
    return self.makeAsyncUnaryCall(
      path: Osmosis_Protorev_V1beta1_MsgClientMetadata.Methods.setDeveloperAccount.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSetDeveloperAccountInterceptors() ?? []
    )
  }

  internal func makeSetMaxPoolPointsPerTxCall(
    _ request: Osmosis_Protorev_V1beta1_MsgSetMaxPoolPointsPerTx,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Osmosis_Protorev_V1beta1_MsgSetMaxPoolPointsPerTx, Osmosis_Protorev_V1beta1_MsgSetMaxPoolPointsPerTxResponse> {
    return self.makeAsyncUnaryCall(
      path: Osmosis_Protorev_V1beta1_MsgClientMetadata.Methods.setMaxPoolPointsPerTx.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSetMaxPoolPointsPerTxInterceptors() ?? []
    )
  }

  internal func makeSetMaxPoolPointsPerBlockCall(
    _ request: Osmosis_Protorev_V1beta1_MsgSetMaxPoolPointsPerBlock,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Osmosis_Protorev_V1beta1_MsgSetMaxPoolPointsPerBlock, Osmosis_Protorev_V1beta1_MsgSetMaxPoolPointsPerBlockResponse> {
    return self.makeAsyncUnaryCall(
      path: Osmosis_Protorev_V1beta1_MsgClientMetadata.Methods.setMaxPoolPointsPerBlock.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSetMaxPoolPointsPerBlockInterceptors() ?? []
    )
  }

  internal func makeSetPoolWeightsCall(
    _ request: Osmosis_Protorev_V1beta1_MsgSetPoolWeights,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Osmosis_Protorev_V1beta1_MsgSetPoolWeights, Osmosis_Protorev_V1beta1_MsgSetPoolWeightsResponse> {
    return self.makeAsyncUnaryCall(
      path: Osmosis_Protorev_V1beta1_MsgClientMetadata.Methods.setPoolWeights.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSetPoolWeightsInterceptors() ?? []
    )
  }

  internal func makeSetBaseDenomsCall(
    _ request: Osmosis_Protorev_V1beta1_MsgSetBaseDenoms,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Osmosis_Protorev_V1beta1_MsgSetBaseDenoms, Osmosis_Protorev_V1beta1_MsgSetBaseDenomsResponse> {
    return self.makeAsyncUnaryCall(
      path: Osmosis_Protorev_V1beta1_MsgClientMetadata.Methods.setBaseDenoms.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSetBaseDenomsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Osmosis_Protorev_V1beta1_MsgAsyncClientProtocol {
  internal func setHotRoutes(
    _ request: Osmosis_Protorev_V1beta1_MsgSetHotRoutes,
    callOptions: CallOptions? = nil
  ) async throws -> Osmosis_Protorev_V1beta1_MsgSetHotRoutesResponse {
    return try await self.performAsyncUnaryCall(
      path: Osmosis_Protorev_V1beta1_MsgClientMetadata.Methods.setHotRoutes.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSetHotRoutesInterceptors() ?? []
    )
  }

  internal func setDeveloperAccount(
    _ request: Osmosis_Protorev_V1beta1_MsgSetDeveloperAccount,
    callOptions: CallOptions? = nil
  ) async throws -> Osmosis_Protorev_V1beta1_MsgSetDeveloperAccountResponse {
    return try await self.performAsyncUnaryCall(
      path: Osmosis_Protorev_V1beta1_MsgClientMetadata.Methods.setDeveloperAccount.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSetDeveloperAccountInterceptors() ?? []
    )
  }

  internal func setMaxPoolPointsPerTx(
    _ request: Osmosis_Protorev_V1beta1_MsgSetMaxPoolPointsPerTx,
    callOptions: CallOptions? = nil
  ) async throws -> Osmosis_Protorev_V1beta1_MsgSetMaxPoolPointsPerTxResponse {
    return try await self.performAsyncUnaryCall(
      path: Osmosis_Protorev_V1beta1_MsgClientMetadata.Methods.setMaxPoolPointsPerTx.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSetMaxPoolPointsPerTxInterceptors() ?? []
    )
  }

  internal func setMaxPoolPointsPerBlock(
    _ request: Osmosis_Protorev_V1beta1_MsgSetMaxPoolPointsPerBlock,
    callOptions: CallOptions? = nil
  ) async throws -> Osmosis_Protorev_V1beta1_MsgSetMaxPoolPointsPerBlockResponse {
    return try await self.performAsyncUnaryCall(
      path: Osmosis_Protorev_V1beta1_MsgClientMetadata.Methods.setMaxPoolPointsPerBlock.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSetMaxPoolPointsPerBlockInterceptors() ?? []
    )
  }

  internal func setPoolWeights(
    _ request: Osmosis_Protorev_V1beta1_MsgSetPoolWeights,
    callOptions: CallOptions? = nil
  ) async throws -> Osmosis_Protorev_V1beta1_MsgSetPoolWeightsResponse {
    return try await self.performAsyncUnaryCall(
      path: Osmosis_Protorev_V1beta1_MsgClientMetadata.Methods.setPoolWeights.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSetPoolWeightsInterceptors() ?? []
    )
  }

  internal func setBaseDenoms(
    _ request: Osmosis_Protorev_V1beta1_MsgSetBaseDenoms,
    callOptions: CallOptions? = nil
  ) async throws -> Osmosis_Protorev_V1beta1_MsgSetBaseDenomsResponse {
    return try await self.performAsyncUnaryCall(
      path: Osmosis_Protorev_V1beta1_MsgClientMetadata.Methods.setBaseDenoms.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSetBaseDenomsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Osmosis_Protorev_V1beta1_MsgAsyncClient: Osmosis_Protorev_V1beta1_MsgAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Osmosis_Protorev_V1beta1_MsgClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Osmosis_Protorev_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Osmosis_Protorev_V1beta1_MsgClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'setHotRoutes'.
  func makeSetHotRoutesInterceptors() -> [ClientInterceptor<Osmosis_Protorev_V1beta1_MsgSetHotRoutes, Osmosis_Protorev_V1beta1_MsgSetHotRoutesResponse>]

  /// - Returns: Interceptors to use when invoking 'setDeveloperAccount'.
  func makeSetDeveloperAccountInterceptors() -> [ClientInterceptor<Osmosis_Protorev_V1beta1_MsgSetDeveloperAccount, Osmosis_Protorev_V1beta1_MsgSetDeveloperAccountResponse>]

  /// - Returns: Interceptors to use when invoking 'setMaxPoolPointsPerTx'.
  func makeSetMaxPoolPointsPerTxInterceptors() -> [ClientInterceptor<Osmosis_Protorev_V1beta1_MsgSetMaxPoolPointsPerTx, Osmosis_Protorev_V1beta1_MsgSetMaxPoolPointsPerTxResponse>]

  /// - Returns: Interceptors to use when invoking 'setMaxPoolPointsPerBlock'.
  func makeSetMaxPoolPointsPerBlockInterceptors() -> [ClientInterceptor<Osmosis_Protorev_V1beta1_MsgSetMaxPoolPointsPerBlock, Osmosis_Protorev_V1beta1_MsgSetMaxPoolPointsPerBlockResponse>]

  /// - Returns: Interceptors to use when invoking 'setPoolWeights'.
  func makeSetPoolWeightsInterceptors() -> [ClientInterceptor<Osmosis_Protorev_V1beta1_MsgSetPoolWeights, Osmosis_Protorev_V1beta1_MsgSetPoolWeightsResponse>]

  /// - Returns: Interceptors to use when invoking 'setBaseDenoms'.
  func makeSetBaseDenomsInterceptors() -> [ClientInterceptor<Osmosis_Protorev_V1beta1_MsgSetBaseDenoms, Osmosis_Protorev_V1beta1_MsgSetBaseDenomsResponse>]
}

internal enum Osmosis_Protorev_V1beta1_MsgClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "osmosis.protorev.v1beta1.Msg",
    methods: [
      Osmosis_Protorev_V1beta1_MsgClientMetadata.Methods.setHotRoutes,
      Osmosis_Protorev_V1beta1_MsgClientMetadata.Methods.setDeveloperAccount,
      Osmosis_Protorev_V1beta1_MsgClientMetadata.Methods.setMaxPoolPointsPerTx,
      Osmosis_Protorev_V1beta1_MsgClientMetadata.Methods.setMaxPoolPointsPerBlock,
      Osmosis_Protorev_V1beta1_MsgClientMetadata.Methods.setPoolWeights,
      Osmosis_Protorev_V1beta1_MsgClientMetadata.Methods.setBaseDenoms,
    ]
  )

  internal enum Methods {
    internal static let setHotRoutes = GRPCMethodDescriptor(
      name: "SetHotRoutes",
      path: "/osmosis.protorev.v1beta1.Msg/SetHotRoutes",
      type: GRPCCallType.unary
    )

    internal static let setDeveloperAccount = GRPCMethodDescriptor(
      name: "SetDeveloperAccount",
      path: "/osmosis.protorev.v1beta1.Msg/SetDeveloperAccount",
      type: GRPCCallType.unary
    )

    internal static let setMaxPoolPointsPerTx = GRPCMethodDescriptor(
      name: "SetMaxPoolPointsPerTx",
      path: "/osmosis.protorev.v1beta1.Msg/SetMaxPoolPointsPerTx",
      type: GRPCCallType.unary
    )

    internal static let setMaxPoolPointsPerBlock = GRPCMethodDescriptor(
      name: "SetMaxPoolPointsPerBlock",
      path: "/osmosis.protorev.v1beta1.Msg/SetMaxPoolPointsPerBlock",
      type: GRPCCallType.unary
    )

    internal static let setPoolWeights = GRPCMethodDescriptor(
      name: "SetPoolWeights",
      path: "/osmosis.protorev.v1beta1.Msg/SetPoolWeights",
      type: GRPCCallType.unary
    )

    internal static let setBaseDenoms = GRPCMethodDescriptor(
      name: "SetBaseDenoms",
      path: "/osmosis.protorev.v1beta1.Msg/SetBaseDenoms",
      type: GRPCCallType.unary
    )
  }
}

/// To build a server, implement a class that conforms to this protocol.
internal protocol Osmosis_Protorev_V1beta1_MsgProvider: CallHandlerProvider {
  var interceptors: Osmosis_Protorev_V1beta1_MsgServerInterceptorFactoryProtocol? { get }

  /// SetHotRoutes sets the hot routes that will be explored when creating
  /// cyclic arbitrage routes. Can only be called by the admin account.
  func setHotRoutes(request: Osmosis_Protorev_V1beta1_MsgSetHotRoutes, context: StatusOnlyCallContext) -> EventLoopFuture<Osmosis_Protorev_V1beta1_MsgSetHotRoutesResponse>

  /// SetDeveloperAccount sets the account that can withdraw a portion of the
  /// profits from the protorev module. This will be Skip's address.
  func setDeveloperAccount(request: Osmosis_Protorev_V1beta1_MsgSetDeveloperAccount, context: StatusOnlyCallContext) -> EventLoopFuture<Osmosis_Protorev_V1beta1_MsgSetDeveloperAccountResponse>

  /// SetMaxPoolPointsPerTx sets the maximum number of pool points that can be
  /// consumed per transaction. Can only be called by the admin account.
  func setMaxPoolPointsPerTx(request: Osmosis_Protorev_V1beta1_MsgSetMaxPoolPointsPerTx, context: StatusOnlyCallContext) -> EventLoopFuture<Osmosis_Protorev_V1beta1_MsgSetMaxPoolPointsPerTxResponse>

  /// SetMaxPoolPointsPerBlock sets the maximum number of pool points that can be
  /// consumed per block. Can only be called by the admin account.
  func setMaxPoolPointsPerBlock(request: Osmosis_Protorev_V1beta1_MsgSetMaxPoolPointsPerBlock, context: StatusOnlyCallContext) -> EventLoopFuture<Osmosis_Protorev_V1beta1_MsgSetMaxPoolPointsPerBlockResponse>

  /// SetPoolWeights sets the weights of each pool type in the store. Can only be
  /// called by the admin account.
  func setPoolWeights(request: Osmosis_Protorev_V1beta1_MsgSetPoolWeights, context: StatusOnlyCallContext) -> EventLoopFuture<Osmosis_Protorev_V1beta1_MsgSetPoolWeightsResponse>

  /// SetBaseDenoms sets the base denoms that will be used to create cyclic
  /// arbitrage routes. Can only be called by the admin account.
  func setBaseDenoms(request: Osmosis_Protorev_V1beta1_MsgSetBaseDenoms, context: StatusOnlyCallContext) -> EventLoopFuture<Osmosis_Protorev_V1beta1_MsgSetBaseDenomsResponse>
}

extension Osmosis_Protorev_V1beta1_MsgProvider {
  internal var serviceName: Substring {
    return Osmosis_Protorev_V1beta1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "SetHotRoutes":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Osmosis_Protorev_V1beta1_MsgSetHotRoutes>(),
        responseSerializer: ProtobufSerializer<Osmosis_Protorev_V1beta1_MsgSetHotRoutesResponse>(),
        interceptors: self.interceptors?.makeSetHotRoutesInterceptors() ?? [],
        userFunction: self.setHotRoutes(request:context:)
      )

    case "SetDeveloperAccount":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Osmosis_Protorev_V1beta1_MsgSetDeveloperAccount>(),
        responseSerializer: ProtobufSerializer<Osmosis_Protorev_V1beta1_MsgSetDeveloperAccountResponse>(),
        interceptors: self.interceptors?.makeSetDeveloperAccountInterceptors() ?? [],
        userFunction: self.setDeveloperAccount(request:context:)
      )

    case "SetMaxPoolPointsPerTx":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Osmosis_Protorev_V1beta1_MsgSetMaxPoolPointsPerTx>(),
        responseSerializer: ProtobufSerializer<Osmosis_Protorev_V1beta1_MsgSetMaxPoolPointsPerTxResponse>(),
        interceptors: self.interceptors?.makeSetMaxPoolPointsPerTxInterceptors() ?? [],
        userFunction: self.setMaxPoolPointsPerTx(request:context:)
      )

    case "SetMaxPoolPointsPerBlock":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Osmosis_Protorev_V1beta1_MsgSetMaxPoolPointsPerBlock>(),
        responseSerializer: ProtobufSerializer<Osmosis_Protorev_V1beta1_MsgSetMaxPoolPointsPerBlockResponse>(),
        interceptors: self.interceptors?.makeSetMaxPoolPointsPerBlockInterceptors() ?? [],
        userFunction: self.setMaxPoolPointsPerBlock(request:context:)
      )

    case "SetPoolWeights":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Osmosis_Protorev_V1beta1_MsgSetPoolWeights>(),
        responseSerializer: ProtobufSerializer<Osmosis_Protorev_V1beta1_MsgSetPoolWeightsResponse>(),
        interceptors: self.interceptors?.makeSetPoolWeightsInterceptors() ?? [],
        userFunction: self.setPoolWeights(request:context:)
      )

    case "SetBaseDenoms":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Osmosis_Protorev_V1beta1_MsgSetBaseDenoms>(),
        responseSerializer: ProtobufSerializer<Osmosis_Protorev_V1beta1_MsgSetBaseDenomsResponse>(),
        interceptors: self.interceptors?.makeSetBaseDenomsInterceptors() ?? [],
        userFunction: self.setBaseDenoms(request:context:)
      )

    default:
      return nil
    }
  }
}

/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Osmosis_Protorev_V1beta1_MsgAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Osmosis_Protorev_V1beta1_MsgServerInterceptorFactoryProtocol? { get }

  /// SetHotRoutes sets the hot routes that will be explored when creating
  /// cyclic arbitrage routes. Can only be called by the admin account.
  @Sendable func setHotRoutes(
    request: Osmosis_Protorev_V1beta1_MsgSetHotRoutes,
    context: GRPCAsyncServerCallContext
  ) async throws -> Osmosis_Protorev_V1beta1_MsgSetHotRoutesResponse

  /// SetDeveloperAccount sets the account that can withdraw a portion of the
  /// profits from the protorev module. This will be Skip's address.
  @Sendable func setDeveloperAccount(
    request: Osmosis_Protorev_V1beta1_MsgSetDeveloperAccount,
    context: GRPCAsyncServerCallContext
  ) async throws -> Osmosis_Protorev_V1beta1_MsgSetDeveloperAccountResponse

  /// SetMaxPoolPointsPerTx sets the maximum number of pool points that can be
  /// consumed per transaction. Can only be called by the admin account.
  @Sendable func setMaxPoolPointsPerTx(
    request: Osmosis_Protorev_V1beta1_MsgSetMaxPoolPointsPerTx,
    context: GRPCAsyncServerCallContext
  ) async throws -> Osmosis_Protorev_V1beta1_MsgSetMaxPoolPointsPerTxResponse

  /// SetMaxPoolPointsPerBlock sets the maximum number of pool points that can be
  /// consumed per block. Can only be called by the admin account.
  @Sendable func setMaxPoolPointsPerBlock(
    request: Osmosis_Protorev_V1beta1_MsgSetMaxPoolPointsPerBlock,
    context: GRPCAsyncServerCallContext
  ) async throws -> Osmosis_Protorev_V1beta1_MsgSetMaxPoolPointsPerBlockResponse

  /// SetPoolWeights sets the weights of each pool type in the store. Can only be
  /// called by the admin account.
  @Sendable func setPoolWeights(
    request: Osmosis_Protorev_V1beta1_MsgSetPoolWeights,
    context: GRPCAsyncServerCallContext
  ) async throws -> Osmosis_Protorev_V1beta1_MsgSetPoolWeightsResponse

  /// SetBaseDenoms sets the base denoms that will be used to create cyclic
  /// arbitrage routes. Can only be called by the admin account.
  @Sendable func setBaseDenoms(
    request: Osmosis_Protorev_V1beta1_MsgSetBaseDenoms,
    context: GRPCAsyncServerCallContext
  ) async throws -> Osmosis_Protorev_V1beta1_MsgSetBaseDenomsResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Osmosis_Protorev_V1beta1_MsgAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Osmosis_Protorev_V1beta1_MsgServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Osmosis_Protorev_V1beta1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Osmosis_Protorev_V1beta1_MsgServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "SetHotRoutes":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Osmosis_Protorev_V1beta1_MsgSetHotRoutes>(),
        responseSerializer: ProtobufSerializer<Osmosis_Protorev_V1beta1_MsgSetHotRoutesResponse>(),
        interceptors: self.interceptors?.makeSetHotRoutesInterceptors() ?? [],
        wrapping: self.setHotRoutes(request:context:)
      )

    case "SetDeveloperAccount":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Osmosis_Protorev_V1beta1_MsgSetDeveloperAccount>(),
        responseSerializer: ProtobufSerializer<Osmosis_Protorev_V1beta1_MsgSetDeveloperAccountResponse>(),
        interceptors: self.interceptors?.makeSetDeveloperAccountInterceptors() ?? [],
        wrapping: self.setDeveloperAccount(request:context:)
      )

    case "SetMaxPoolPointsPerTx":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Osmosis_Protorev_V1beta1_MsgSetMaxPoolPointsPerTx>(),
        responseSerializer: ProtobufSerializer<Osmosis_Protorev_V1beta1_MsgSetMaxPoolPointsPerTxResponse>(),
        interceptors: self.interceptors?.makeSetMaxPoolPointsPerTxInterceptors() ?? [],
        wrapping: self.setMaxPoolPointsPerTx(request:context:)
      )

    case "SetMaxPoolPointsPerBlock":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Osmosis_Protorev_V1beta1_MsgSetMaxPoolPointsPerBlock>(),
        responseSerializer: ProtobufSerializer<Osmosis_Protorev_V1beta1_MsgSetMaxPoolPointsPerBlockResponse>(),
        interceptors: self.interceptors?.makeSetMaxPoolPointsPerBlockInterceptors() ?? [],
        wrapping: self.setMaxPoolPointsPerBlock(request:context:)
      )

    case "SetPoolWeights":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Osmosis_Protorev_V1beta1_MsgSetPoolWeights>(),
        responseSerializer: ProtobufSerializer<Osmosis_Protorev_V1beta1_MsgSetPoolWeightsResponse>(),
        interceptors: self.interceptors?.makeSetPoolWeightsInterceptors() ?? [],
        wrapping: self.setPoolWeights(request:context:)
      )

    case "SetBaseDenoms":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Osmosis_Protorev_V1beta1_MsgSetBaseDenoms>(),
        responseSerializer: ProtobufSerializer<Osmosis_Protorev_V1beta1_MsgSetBaseDenomsResponse>(),
        interceptors: self.interceptors?.makeSetBaseDenomsInterceptors() ?? [],
        wrapping: self.setBaseDenoms(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Osmosis_Protorev_V1beta1_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'setHotRoutes'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeSetHotRoutesInterceptors() -> [ServerInterceptor<Osmosis_Protorev_V1beta1_MsgSetHotRoutes, Osmosis_Protorev_V1beta1_MsgSetHotRoutesResponse>]

  /// - Returns: Interceptors to use when handling 'setDeveloperAccount'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeSetDeveloperAccountInterceptors() -> [ServerInterceptor<Osmosis_Protorev_V1beta1_MsgSetDeveloperAccount, Osmosis_Protorev_V1beta1_MsgSetDeveloperAccountResponse>]

  /// - Returns: Interceptors to use when handling 'setMaxPoolPointsPerTx'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeSetMaxPoolPointsPerTxInterceptors() -> [ServerInterceptor<Osmosis_Protorev_V1beta1_MsgSetMaxPoolPointsPerTx, Osmosis_Protorev_V1beta1_MsgSetMaxPoolPointsPerTxResponse>]

  /// - Returns: Interceptors to use when handling 'setMaxPoolPointsPerBlock'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeSetMaxPoolPointsPerBlockInterceptors() -> [ServerInterceptor<Osmosis_Protorev_V1beta1_MsgSetMaxPoolPointsPerBlock, Osmosis_Protorev_V1beta1_MsgSetMaxPoolPointsPerBlockResponse>]

  /// - Returns: Interceptors to use when handling 'setPoolWeights'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeSetPoolWeightsInterceptors() -> [ServerInterceptor<Osmosis_Protorev_V1beta1_MsgSetPoolWeights, Osmosis_Protorev_V1beta1_MsgSetPoolWeightsResponse>]

  /// - Returns: Interceptors to use when handling 'setBaseDenoms'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeSetBaseDenomsInterceptors() -> [ServerInterceptor<Osmosis_Protorev_V1beta1_MsgSetBaseDenoms, Osmosis_Protorev_V1beta1_MsgSetBaseDenomsResponse>]
}

internal enum Osmosis_Protorev_V1beta1_MsgServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "osmosis.protorev.v1beta1.Msg",
    methods: [
      Osmosis_Protorev_V1beta1_MsgServerMetadata.Methods.setHotRoutes,
      Osmosis_Protorev_V1beta1_MsgServerMetadata.Methods.setDeveloperAccount,
      Osmosis_Protorev_V1beta1_MsgServerMetadata.Methods.setMaxPoolPointsPerTx,
      Osmosis_Protorev_V1beta1_MsgServerMetadata.Methods.setMaxPoolPointsPerBlock,
      Osmosis_Protorev_V1beta1_MsgServerMetadata.Methods.setPoolWeights,
      Osmosis_Protorev_V1beta1_MsgServerMetadata.Methods.setBaseDenoms,
    ]
  )

  internal enum Methods {
    internal static let setHotRoutes = GRPCMethodDescriptor(
      name: "SetHotRoutes",
      path: "/osmosis.protorev.v1beta1.Msg/SetHotRoutes",
      type: GRPCCallType.unary
    )

    internal static let setDeveloperAccount = GRPCMethodDescriptor(
      name: "SetDeveloperAccount",
      path: "/osmosis.protorev.v1beta1.Msg/SetDeveloperAccount",
      type: GRPCCallType.unary
    )

    internal static let setMaxPoolPointsPerTx = GRPCMethodDescriptor(
      name: "SetMaxPoolPointsPerTx",
      path: "/osmosis.protorev.v1beta1.Msg/SetMaxPoolPointsPerTx",
      type: GRPCCallType.unary
    )

    internal static let setMaxPoolPointsPerBlock = GRPCMethodDescriptor(
      name: "SetMaxPoolPointsPerBlock",
      path: "/osmosis.protorev.v1beta1.Msg/SetMaxPoolPointsPerBlock",
      type: GRPCCallType.unary
    )

    internal static let setPoolWeights = GRPCMethodDescriptor(
      name: "SetPoolWeights",
      path: "/osmosis.protorev.v1beta1.Msg/SetPoolWeights",
      type: GRPCCallType.unary
    )

    internal static let setBaseDenoms = GRPCMethodDescriptor(
      name: "SetBaseDenoms",
      path: "/osmosis.protorev.v1beta1.Msg/SetBaseDenoms",
      type: GRPCCallType.unary
    )
  }
}
