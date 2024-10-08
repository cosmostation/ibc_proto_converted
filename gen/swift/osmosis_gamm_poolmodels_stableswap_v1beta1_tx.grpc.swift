//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: osmosis/gamm/poolmodels/stableswap/v1beta1/tx.proto
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


/// Usage: instantiate `Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgClientInterceptorFactoryProtocol? { get }

  func createStableswapPool(
    _ request: Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgCreateStableswapPool,
    callOptions: CallOptions?
  ) -> UnaryCall<Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgCreateStableswapPool, Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgCreateStableswapPoolResponse>

  func stableSwapAdjustScalingFactors(
    _ request: Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgStableSwapAdjustScalingFactors,
    callOptions: CallOptions?
  ) -> UnaryCall<Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgStableSwapAdjustScalingFactors, Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgStableSwapAdjustScalingFactorsResponse>
}

extension Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgClientProtocol {
  internal var serviceName: String {
    return "osmosis.gamm.poolmodels.stableswap.v1beta1.Msg"
  }

  /// Unary call to CreateStableswapPool
  ///
  /// - Parameters:
  ///   - request: Request to send to CreateStableswapPool.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func createStableswapPool(
    _ request: Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgCreateStableswapPool,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgCreateStableswapPool, Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgCreateStableswapPoolResponse> {
    return self.makeUnaryCall(
      path: Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgClientMetadata.Methods.createStableswapPool.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCreateStableswapPoolInterceptors() ?? []
    )
  }

  /// Unary call to StableSwapAdjustScalingFactors
  ///
  /// - Parameters:
  ///   - request: Request to send to StableSwapAdjustScalingFactors.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func stableSwapAdjustScalingFactors(
    _ request: Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgStableSwapAdjustScalingFactors,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgStableSwapAdjustScalingFactors, Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgStableSwapAdjustScalingFactorsResponse> {
    return self.makeUnaryCall(
      path: Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgClientMetadata.Methods.stableSwapAdjustScalingFactors.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeStableSwapAdjustScalingFactorsInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgNIOClient")
internal final class Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgClient: Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the osmosis.gamm.poolmodels.stableswap.v1beta1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgNIOClient: Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the osmosis.gamm.poolmodels.stableswap.v1beta1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgClientInterceptorFactoryProtocol? { get }

  func makeCreateStableswapPoolCall(
    _ request: Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgCreateStableswapPool,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgCreateStableswapPool, Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgCreateStableswapPoolResponse>

  func makeStableSwapAdjustScalingFactorsCall(
    _ request: Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgStableSwapAdjustScalingFactors,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgStableSwapAdjustScalingFactors, Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgStableSwapAdjustScalingFactorsResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgClientMetadata.serviceDescriptor
  }

  internal var interceptors: Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeCreateStableswapPoolCall(
    _ request: Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgCreateStableswapPool,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgCreateStableswapPool, Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgCreateStableswapPoolResponse> {
    return self.makeAsyncUnaryCall(
      path: Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgClientMetadata.Methods.createStableswapPool.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCreateStableswapPoolInterceptors() ?? []
    )
  }

  internal func makeStableSwapAdjustScalingFactorsCall(
    _ request: Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgStableSwapAdjustScalingFactors,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgStableSwapAdjustScalingFactors, Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgStableSwapAdjustScalingFactorsResponse> {
    return self.makeAsyncUnaryCall(
      path: Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgClientMetadata.Methods.stableSwapAdjustScalingFactors.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeStableSwapAdjustScalingFactorsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgAsyncClientProtocol {
  internal func createStableswapPool(
    _ request: Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgCreateStableswapPool,
    callOptions: CallOptions? = nil
  ) async throws -> Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgCreateStableswapPoolResponse {
    return try await self.performAsyncUnaryCall(
      path: Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgClientMetadata.Methods.createStableswapPool.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCreateStableswapPoolInterceptors() ?? []
    )
  }

  internal func stableSwapAdjustScalingFactors(
    _ request: Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgStableSwapAdjustScalingFactors,
    callOptions: CallOptions? = nil
  ) async throws -> Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgStableSwapAdjustScalingFactorsResponse {
    return try await self.performAsyncUnaryCall(
      path: Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgClientMetadata.Methods.stableSwapAdjustScalingFactors.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeStableSwapAdjustScalingFactorsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgAsyncClient: Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'createStableswapPool'.
  func makeCreateStableswapPoolInterceptors() -> [ClientInterceptor<Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgCreateStableswapPool, Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgCreateStableswapPoolResponse>]

  /// - Returns: Interceptors to use when invoking 'stableSwapAdjustScalingFactors'.
  func makeStableSwapAdjustScalingFactorsInterceptors() -> [ClientInterceptor<Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgStableSwapAdjustScalingFactors, Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgStableSwapAdjustScalingFactorsResponse>]
}

internal enum Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "osmosis.gamm.poolmodels.stableswap.v1beta1.Msg",
    methods: [
      Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgClientMetadata.Methods.createStableswapPool,
      Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgClientMetadata.Methods.stableSwapAdjustScalingFactors,
    ]
  )

  internal enum Methods {
    internal static let createStableswapPool = GRPCMethodDescriptor(
      name: "CreateStableswapPool",
      path: "/osmosis.gamm.poolmodels.stableswap.v1beta1.Msg/CreateStableswapPool",
      type: GRPCCallType.unary
    )

    internal static let stableSwapAdjustScalingFactors = GRPCMethodDescriptor(
      name: "StableSwapAdjustScalingFactors",
      path: "/osmosis.gamm.poolmodels.stableswap.v1beta1.Msg/StableSwapAdjustScalingFactors",
      type: GRPCCallType.unary
    )
  }
}

/// To build a server, implement a class that conforms to this protocol.
internal protocol Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgProvider: CallHandlerProvider {
  var interceptors: Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgServerInterceptorFactoryProtocol? { get }

  func createStableswapPool(request: Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgCreateStableswapPool, context: StatusOnlyCallContext) -> EventLoopFuture<Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgCreateStableswapPoolResponse>

  func stableSwapAdjustScalingFactors(request: Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgStableSwapAdjustScalingFactors, context: StatusOnlyCallContext) -> EventLoopFuture<Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgStableSwapAdjustScalingFactorsResponse>
}

extension Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgProvider {
  internal var serviceName: Substring {
    return Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "CreateStableswapPool":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgCreateStableswapPool>(),
        responseSerializer: ProtobufSerializer<Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgCreateStableswapPoolResponse>(),
        interceptors: self.interceptors?.makeCreateStableswapPoolInterceptors() ?? [],
        userFunction: self.createStableswapPool(request:context:)
      )

    case "StableSwapAdjustScalingFactors":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgStableSwapAdjustScalingFactors>(),
        responseSerializer: ProtobufSerializer<Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgStableSwapAdjustScalingFactorsResponse>(),
        interceptors: self.interceptors?.makeStableSwapAdjustScalingFactorsInterceptors() ?? [],
        userFunction: self.stableSwapAdjustScalingFactors(request:context:)
      )

    default:
      return nil
    }
  }
}

/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgServerInterceptorFactoryProtocol? { get }

  @Sendable func createStableswapPool(
    request: Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgCreateStableswapPool,
    context: GRPCAsyncServerCallContext
  ) async throws -> Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgCreateStableswapPoolResponse

  @Sendable func stableSwapAdjustScalingFactors(
    request: Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgStableSwapAdjustScalingFactors,
    context: GRPCAsyncServerCallContext
  ) async throws -> Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgStableSwapAdjustScalingFactorsResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "CreateStableswapPool":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgCreateStableswapPool>(),
        responseSerializer: ProtobufSerializer<Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgCreateStableswapPoolResponse>(),
        interceptors: self.interceptors?.makeCreateStableswapPoolInterceptors() ?? [],
        wrapping: self.createStableswapPool(request:context:)
      )

    case "StableSwapAdjustScalingFactors":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgStableSwapAdjustScalingFactors>(),
        responseSerializer: ProtobufSerializer<Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgStableSwapAdjustScalingFactorsResponse>(),
        interceptors: self.interceptors?.makeStableSwapAdjustScalingFactorsInterceptors() ?? [],
        wrapping: self.stableSwapAdjustScalingFactors(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'createStableswapPool'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeCreateStableswapPoolInterceptors() -> [ServerInterceptor<Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgCreateStableswapPool, Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgCreateStableswapPoolResponse>]

  /// - Returns: Interceptors to use when handling 'stableSwapAdjustScalingFactors'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeStableSwapAdjustScalingFactorsInterceptors() -> [ServerInterceptor<Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgStableSwapAdjustScalingFactors, Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgStableSwapAdjustScalingFactorsResponse>]
}

internal enum Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "osmosis.gamm.poolmodels.stableswap.v1beta1.Msg",
    methods: [
      Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgServerMetadata.Methods.createStableswapPool,
      Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgServerMetadata.Methods.stableSwapAdjustScalingFactors,
    ]
  )

  internal enum Methods {
    internal static let createStableswapPool = GRPCMethodDescriptor(
      name: "CreateStableswapPool",
      path: "/osmosis.gamm.poolmodels.stableswap.v1beta1.Msg/CreateStableswapPool",
      type: GRPCCallType.unary
    )

    internal static let stableSwapAdjustScalingFactors = GRPCMethodDescriptor(
      name: "StableSwapAdjustScalingFactors",
      path: "/osmosis.gamm.poolmodels.stableswap.v1beta1.Msg/StableSwapAdjustScalingFactors",
      type: GRPCCallType.unary
    )
  }
}
