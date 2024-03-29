//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: irismod/farm/tx.proto
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


/// Msg defines the farm Msg service.
///
/// Usage: instantiate `Irismod_Farm_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Irismod_Farm_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Irismod_Farm_MsgClientInterceptorFactoryProtocol? { get }

  func createPool(
    _ request: Irismod_Farm_MsgCreatePool,
    callOptions: CallOptions?
  ) -> UnaryCall<Irismod_Farm_MsgCreatePool, Irismod_Farm_MsgCreatePoolResponse>

  func destroyPool(
    _ request: Irismod_Farm_MsgDestroyPool,
    callOptions: CallOptions?
  ) -> UnaryCall<Irismod_Farm_MsgDestroyPool, Irismod_Farm_MsgDestroyPoolResponse>

  func adjustPool(
    _ request: Irismod_Farm_MsgAdjustPool,
    callOptions: CallOptions?
  ) -> UnaryCall<Irismod_Farm_MsgAdjustPool, Irismod_Farm_MsgAdjustPoolResponse>

  func stake(
    _ request: Irismod_Farm_MsgStake,
    callOptions: CallOptions?
  ) -> UnaryCall<Irismod_Farm_MsgStake, Irismod_Farm_MsgStakeResponse>

  func unstake(
    _ request: Irismod_Farm_MsgUnstake,
    callOptions: CallOptions?
  ) -> UnaryCall<Irismod_Farm_MsgUnstake, Irismod_Farm_MsgUnstakeResponse>

  func harvest(
    _ request: Irismod_Farm_MsgHarvest,
    callOptions: CallOptions?
  ) -> UnaryCall<Irismod_Farm_MsgHarvest, Irismod_Farm_MsgHarvestResponse>
}

extension Irismod_Farm_MsgClientProtocol {
  internal var serviceName: String {
    return "irismod.farm.Msg"
  }

  /// CreatePool defines a method for creating a new farm pool
  ///
  /// - Parameters:
  ///   - request: Request to send to CreatePool.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func createPool(
    _ request: Irismod_Farm_MsgCreatePool,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Irismod_Farm_MsgCreatePool, Irismod_Farm_MsgCreatePoolResponse> {
    return self.makeUnaryCall(
      path: Irismod_Farm_MsgClientMetadata.Methods.createPool.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCreatePoolInterceptors() ?? []
    )
  }

  /// DestroyPool defines a method for destroying a existed farm pool
  ///
  /// - Parameters:
  ///   - request: Request to send to DestroyPool.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func destroyPool(
    _ request: Irismod_Farm_MsgDestroyPool,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Irismod_Farm_MsgDestroyPool, Irismod_Farm_MsgDestroyPoolResponse> {
    return self.makeUnaryCall(
      path: Irismod_Farm_MsgClientMetadata.Methods.destroyPool.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDestroyPoolInterceptors() ?? []
    )
  }

  /// AdjustPool defines a method for adjusting the farm pool params
  ///
  /// - Parameters:
  ///   - request: Request to send to AdjustPool.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func adjustPool(
    _ request: Irismod_Farm_MsgAdjustPool,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Irismod_Farm_MsgAdjustPool, Irismod_Farm_MsgAdjustPoolResponse> {
    return self.makeUnaryCall(
      path: Irismod_Farm_MsgClientMetadata.Methods.adjustPool.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAdjustPoolInterceptors() ?? []
    )
  }

  /// Stake defines a method for staking some lp token to a farm pool
  ///
  /// - Parameters:
  ///   - request: Request to send to Stake.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func stake(
    _ request: Irismod_Farm_MsgStake,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Irismod_Farm_MsgStake, Irismod_Farm_MsgStakeResponse> {
    return self.makeUnaryCall(
      path: Irismod_Farm_MsgClientMetadata.Methods.stake.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeStakeInterceptors() ?? []
    )
  }

  /// Unstake defines a method for unstaking some lp token from a farm pool and
  /// withdraw some reward
  ///
  /// - Parameters:
  ///   - request: Request to send to Unstake.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func unstake(
    _ request: Irismod_Farm_MsgUnstake,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Irismod_Farm_MsgUnstake, Irismod_Farm_MsgUnstakeResponse> {
    return self.makeUnaryCall(
      path: Irismod_Farm_MsgClientMetadata.Methods.unstake.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUnstakeInterceptors() ?? []
    )
  }

  /// Harvest defines a method withdraw some reward from a farm pool
  ///
  /// - Parameters:
  ///   - request: Request to send to Harvest.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func harvest(
    _ request: Irismod_Farm_MsgHarvest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Irismod_Farm_MsgHarvest, Irismod_Farm_MsgHarvestResponse> {
    return self.makeUnaryCall(
      path: Irismod_Farm_MsgClientMetadata.Methods.harvest.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeHarvestInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Irismod_Farm_MsgClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Irismod_Farm_MsgNIOClient")
internal final class Irismod_Farm_MsgClient: Irismod_Farm_MsgClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Irismod_Farm_MsgClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Irismod_Farm_MsgClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the irismod.farm.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Irismod_Farm_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Irismod_Farm_MsgNIOClient: Irismod_Farm_MsgClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Irismod_Farm_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the irismod.farm.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Irismod_Farm_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Msg defines the farm Msg service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Irismod_Farm_MsgAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Irismod_Farm_MsgClientInterceptorFactoryProtocol? { get }

  func makeCreatePoolCall(
    _ request: Irismod_Farm_MsgCreatePool,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Irismod_Farm_MsgCreatePool, Irismod_Farm_MsgCreatePoolResponse>

  func makeDestroyPoolCall(
    _ request: Irismod_Farm_MsgDestroyPool,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Irismod_Farm_MsgDestroyPool, Irismod_Farm_MsgDestroyPoolResponse>

  func makeAdjustPoolCall(
    _ request: Irismod_Farm_MsgAdjustPool,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Irismod_Farm_MsgAdjustPool, Irismod_Farm_MsgAdjustPoolResponse>

  func makeStakeCall(
    _ request: Irismod_Farm_MsgStake,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Irismod_Farm_MsgStake, Irismod_Farm_MsgStakeResponse>

  func makeUnstakeCall(
    _ request: Irismod_Farm_MsgUnstake,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Irismod_Farm_MsgUnstake, Irismod_Farm_MsgUnstakeResponse>

  func makeHarvestCall(
    _ request: Irismod_Farm_MsgHarvest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Irismod_Farm_MsgHarvest, Irismod_Farm_MsgHarvestResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Irismod_Farm_MsgAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Irismod_Farm_MsgClientMetadata.serviceDescriptor
  }

  internal var interceptors: Irismod_Farm_MsgClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeCreatePoolCall(
    _ request: Irismod_Farm_MsgCreatePool,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Irismod_Farm_MsgCreatePool, Irismod_Farm_MsgCreatePoolResponse> {
    return self.makeAsyncUnaryCall(
      path: Irismod_Farm_MsgClientMetadata.Methods.createPool.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCreatePoolInterceptors() ?? []
    )
  }

  internal func makeDestroyPoolCall(
    _ request: Irismod_Farm_MsgDestroyPool,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Irismod_Farm_MsgDestroyPool, Irismod_Farm_MsgDestroyPoolResponse> {
    return self.makeAsyncUnaryCall(
      path: Irismod_Farm_MsgClientMetadata.Methods.destroyPool.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDestroyPoolInterceptors() ?? []
    )
  }

  internal func makeAdjustPoolCall(
    _ request: Irismod_Farm_MsgAdjustPool,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Irismod_Farm_MsgAdjustPool, Irismod_Farm_MsgAdjustPoolResponse> {
    return self.makeAsyncUnaryCall(
      path: Irismod_Farm_MsgClientMetadata.Methods.adjustPool.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAdjustPoolInterceptors() ?? []
    )
  }

  internal func makeStakeCall(
    _ request: Irismod_Farm_MsgStake,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Irismod_Farm_MsgStake, Irismod_Farm_MsgStakeResponse> {
    return self.makeAsyncUnaryCall(
      path: Irismod_Farm_MsgClientMetadata.Methods.stake.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeStakeInterceptors() ?? []
    )
  }

  internal func makeUnstakeCall(
    _ request: Irismod_Farm_MsgUnstake,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Irismod_Farm_MsgUnstake, Irismod_Farm_MsgUnstakeResponse> {
    return self.makeAsyncUnaryCall(
      path: Irismod_Farm_MsgClientMetadata.Methods.unstake.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUnstakeInterceptors() ?? []
    )
  }

  internal func makeHarvestCall(
    _ request: Irismod_Farm_MsgHarvest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Irismod_Farm_MsgHarvest, Irismod_Farm_MsgHarvestResponse> {
    return self.makeAsyncUnaryCall(
      path: Irismod_Farm_MsgClientMetadata.Methods.harvest.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeHarvestInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Irismod_Farm_MsgAsyncClientProtocol {
  internal func createPool(
    _ request: Irismod_Farm_MsgCreatePool,
    callOptions: CallOptions? = nil
  ) async throws -> Irismod_Farm_MsgCreatePoolResponse {
    return try await self.performAsyncUnaryCall(
      path: Irismod_Farm_MsgClientMetadata.Methods.createPool.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCreatePoolInterceptors() ?? []
    )
  }

  internal func destroyPool(
    _ request: Irismod_Farm_MsgDestroyPool,
    callOptions: CallOptions? = nil
  ) async throws -> Irismod_Farm_MsgDestroyPoolResponse {
    return try await self.performAsyncUnaryCall(
      path: Irismod_Farm_MsgClientMetadata.Methods.destroyPool.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDestroyPoolInterceptors() ?? []
    )
  }

  internal func adjustPool(
    _ request: Irismod_Farm_MsgAdjustPool,
    callOptions: CallOptions? = nil
  ) async throws -> Irismod_Farm_MsgAdjustPoolResponse {
    return try await self.performAsyncUnaryCall(
      path: Irismod_Farm_MsgClientMetadata.Methods.adjustPool.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAdjustPoolInterceptors() ?? []
    )
  }

  internal func stake(
    _ request: Irismod_Farm_MsgStake,
    callOptions: CallOptions? = nil
  ) async throws -> Irismod_Farm_MsgStakeResponse {
    return try await self.performAsyncUnaryCall(
      path: Irismod_Farm_MsgClientMetadata.Methods.stake.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeStakeInterceptors() ?? []
    )
  }

  internal func unstake(
    _ request: Irismod_Farm_MsgUnstake,
    callOptions: CallOptions? = nil
  ) async throws -> Irismod_Farm_MsgUnstakeResponse {
    return try await self.performAsyncUnaryCall(
      path: Irismod_Farm_MsgClientMetadata.Methods.unstake.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUnstakeInterceptors() ?? []
    )
  }

  internal func harvest(
    _ request: Irismod_Farm_MsgHarvest,
    callOptions: CallOptions? = nil
  ) async throws -> Irismod_Farm_MsgHarvestResponse {
    return try await self.performAsyncUnaryCall(
      path: Irismod_Farm_MsgClientMetadata.Methods.harvest.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeHarvestInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Irismod_Farm_MsgAsyncClient: Irismod_Farm_MsgAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Irismod_Farm_MsgClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Irismod_Farm_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Irismod_Farm_MsgClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'createPool'.
  func makeCreatePoolInterceptors() -> [ClientInterceptor<Irismod_Farm_MsgCreatePool, Irismod_Farm_MsgCreatePoolResponse>]

  /// - Returns: Interceptors to use when invoking 'destroyPool'.
  func makeDestroyPoolInterceptors() -> [ClientInterceptor<Irismod_Farm_MsgDestroyPool, Irismod_Farm_MsgDestroyPoolResponse>]

  /// - Returns: Interceptors to use when invoking 'adjustPool'.
  func makeAdjustPoolInterceptors() -> [ClientInterceptor<Irismod_Farm_MsgAdjustPool, Irismod_Farm_MsgAdjustPoolResponse>]

  /// - Returns: Interceptors to use when invoking 'stake'.
  func makeStakeInterceptors() -> [ClientInterceptor<Irismod_Farm_MsgStake, Irismod_Farm_MsgStakeResponse>]

  /// - Returns: Interceptors to use when invoking 'unstake'.
  func makeUnstakeInterceptors() -> [ClientInterceptor<Irismod_Farm_MsgUnstake, Irismod_Farm_MsgUnstakeResponse>]

  /// - Returns: Interceptors to use when invoking 'harvest'.
  func makeHarvestInterceptors() -> [ClientInterceptor<Irismod_Farm_MsgHarvest, Irismod_Farm_MsgHarvestResponse>]
}

internal enum Irismod_Farm_MsgClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "irismod.farm.Msg",
    methods: [
      Irismod_Farm_MsgClientMetadata.Methods.createPool,
      Irismod_Farm_MsgClientMetadata.Methods.destroyPool,
      Irismod_Farm_MsgClientMetadata.Methods.adjustPool,
      Irismod_Farm_MsgClientMetadata.Methods.stake,
      Irismod_Farm_MsgClientMetadata.Methods.unstake,
      Irismod_Farm_MsgClientMetadata.Methods.harvest,
    ]
  )

  internal enum Methods {
    internal static let createPool = GRPCMethodDescriptor(
      name: "CreatePool",
      path: "/irismod.farm.Msg/CreatePool",
      type: GRPCCallType.unary
    )

    internal static let destroyPool = GRPCMethodDescriptor(
      name: "DestroyPool",
      path: "/irismod.farm.Msg/DestroyPool",
      type: GRPCCallType.unary
    )

    internal static let adjustPool = GRPCMethodDescriptor(
      name: "AdjustPool",
      path: "/irismod.farm.Msg/AdjustPool",
      type: GRPCCallType.unary
    )

    internal static let stake = GRPCMethodDescriptor(
      name: "Stake",
      path: "/irismod.farm.Msg/Stake",
      type: GRPCCallType.unary
    )

    internal static let unstake = GRPCMethodDescriptor(
      name: "Unstake",
      path: "/irismod.farm.Msg/Unstake",
      type: GRPCCallType.unary
    )

    internal static let harvest = GRPCMethodDescriptor(
      name: "Harvest",
      path: "/irismod.farm.Msg/Harvest",
      type: GRPCCallType.unary
    )
  }
}

/// Msg defines the farm Msg service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Irismod_Farm_MsgProvider: CallHandlerProvider {
  var interceptors: Irismod_Farm_MsgServerInterceptorFactoryProtocol? { get }

  /// CreatePool defines a method for creating a new farm pool
  func createPool(request: Irismod_Farm_MsgCreatePool, context: StatusOnlyCallContext) -> EventLoopFuture<Irismod_Farm_MsgCreatePoolResponse>

  /// DestroyPool defines a method for destroying a existed farm pool
  func destroyPool(request: Irismod_Farm_MsgDestroyPool, context: StatusOnlyCallContext) -> EventLoopFuture<Irismod_Farm_MsgDestroyPoolResponse>

  /// AdjustPool defines a method for adjusting the farm pool params
  func adjustPool(request: Irismod_Farm_MsgAdjustPool, context: StatusOnlyCallContext) -> EventLoopFuture<Irismod_Farm_MsgAdjustPoolResponse>

  /// Stake defines a method for staking some lp token to a farm pool
  func stake(request: Irismod_Farm_MsgStake, context: StatusOnlyCallContext) -> EventLoopFuture<Irismod_Farm_MsgStakeResponse>

  /// Unstake defines a method for unstaking some lp token from a farm pool and
  /// withdraw some reward
  func unstake(request: Irismod_Farm_MsgUnstake, context: StatusOnlyCallContext) -> EventLoopFuture<Irismod_Farm_MsgUnstakeResponse>

  /// Harvest defines a method withdraw some reward from a farm pool
  func harvest(request: Irismod_Farm_MsgHarvest, context: StatusOnlyCallContext) -> EventLoopFuture<Irismod_Farm_MsgHarvestResponse>
}

extension Irismod_Farm_MsgProvider {
  internal var serviceName: Substring {
    return Irismod_Farm_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "CreatePool":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Irismod_Farm_MsgCreatePool>(),
        responseSerializer: ProtobufSerializer<Irismod_Farm_MsgCreatePoolResponse>(),
        interceptors: self.interceptors?.makeCreatePoolInterceptors() ?? [],
        userFunction: self.createPool(request:context:)
      )

    case "DestroyPool":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Irismod_Farm_MsgDestroyPool>(),
        responseSerializer: ProtobufSerializer<Irismod_Farm_MsgDestroyPoolResponse>(),
        interceptors: self.interceptors?.makeDestroyPoolInterceptors() ?? [],
        userFunction: self.destroyPool(request:context:)
      )

    case "AdjustPool":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Irismod_Farm_MsgAdjustPool>(),
        responseSerializer: ProtobufSerializer<Irismod_Farm_MsgAdjustPoolResponse>(),
        interceptors: self.interceptors?.makeAdjustPoolInterceptors() ?? [],
        userFunction: self.adjustPool(request:context:)
      )

    case "Stake":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Irismod_Farm_MsgStake>(),
        responseSerializer: ProtobufSerializer<Irismod_Farm_MsgStakeResponse>(),
        interceptors: self.interceptors?.makeStakeInterceptors() ?? [],
        userFunction: self.stake(request:context:)
      )

    case "Unstake":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Irismod_Farm_MsgUnstake>(),
        responseSerializer: ProtobufSerializer<Irismod_Farm_MsgUnstakeResponse>(),
        interceptors: self.interceptors?.makeUnstakeInterceptors() ?? [],
        userFunction: self.unstake(request:context:)
      )

    case "Harvest":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Irismod_Farm_MsgHarvest>(),
        responseSerializer: ProtobufSerializer<Irismod_Farm_MsgHarvestResponse>(),
        interceptors: self.interceptors?.makeHarvestInterceptors() ?? [],
        userFunction: self.harvest(request:context:)
      )

    default:
      return nil
    }
  }
}

/// Msg defines the farm Msg service.
///
/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Irismod_Farm_MsgAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Irismod_Farm_MsgServerInterceptorFactoryProtocol? { get }

  /// CreatePool defines a method for creating a new farm pool
  @Sendable func createPool(
    request: Irismod_Farm_MsgCreatePool,
    context: GRPCAsyncServerCallContext
  ) async throws -> Irismod_Farm_MsgCreatePoolResponse

  /// DestroyPool defines a method for destroying a existed farm pool
  @Sendable func destroyPool(
    request: Irismod_Farm_MsgDestroyPool,
    context: GRPCAsyncServerCallContext
  ) async throws -> Irismod_Farm_MsgDestroyPoolResponse

  /// AdjustPool defines a method for adjusting the farm pool params
  @Sendable func adjustPool(
    request: Irismod_Farm_MsgAdjustPool,
    context: GRPCAsyncServerCallContext
  ) async throws -> Irismod_Farm_MsgAdjustPoolResponse

  /// Stake defines a method for staking some lp token to a farm pool
  @Sendable func stake(
    request: Irismod_Farm_MsgStake,
    context: GRPCAsyncServerCallContext
  ) async throws -> Irismod_Farm_MsgStakeResponse

  /// Unstake defines a method for unstaking some lp token from a farm pool and
  /// withdraw some reward
  @Sendable func unstake(
    request: Irismod_Farm_MsgUnstake,
    context: GRPCAsyncServerCallContext
  ) async throws -> Irismod_Farm_MsgUnstakeResponse

  /// Harvest defines a method withdraw some reward from a farm pool
  @Sendable func harvest(
    request: Irismod_Farm_MsgHarvest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Irismod_Farm_MsgHarvestResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Irismod_Farm_MsgAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Irismod_Farm_MsgServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Irismod_Farm_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Irismod_Farm_MsgServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "CreatePool":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Irismod_Farm_MsgCreatePool>(),
        responseSerializer: ProtobufSerializer<Irismod_Farm_MsgCreatePoolResponse>(),
        interceptors: self.interceptors?.makeCreatePoolInterceptors() ?? [],
        wrapping: self.createPool(request:context:)
      )

    case "DestroyPool":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Irismod_Farm_MsgDestroyPool>(),
        responseSerializer: ProtobufSerializer<Irismod_Farm_MsgDestroyPoolResponse>(),
        interceptors: self.interceptors?.makeDestroyPoolInterceptors() ?? [],
        wrapping: self.destroyPool(request:context:)
      )

    case "AdjustPool":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Irismod_Farm_MsgAdjustPool>(),
        responseSerializer: ProtobufSerializer<Irismod_Farm_MsgAdjustPoolResponse>(),
        interceptors: self.interceptors?.makeAdjustPoolInterceptors() ?? [],
        wrapping: self.adjustPool(request:context:)
      )

    case "Stake":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Irismod_Farm_MsgStake>(),
        responseSerializer: ProtobufSerializer<Irismod_Farm_MsgStakeResponse>(),
        interceptors: self.interceptors?.makeStakeInterceptors() ?? [],
        wrapping: self.stake(request:context:)
      )

    case "Unstake":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Irismod_Farm_MsgUnstake>(),
        responseSerializer: ProtobufSerializer<Irismod_Farm_MsgUnstakeResponse>(),
        interceptors: self.interceptors?.makeUnstakeInterceptors() ?? [],
        wrapping: self.unstake(request:context:)
      )

    case "Harvest":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Irismod_Farm_MsgHarvest>(),
        responseSerializer: ProtobufSerializer<Irismod_Farm_MsgHarvestResponse>(),
        interceptors: self.interceptors?.makeHarvestInterceptors() ?? [],
        wrapping: self.harvest(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Irismod_Farm_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'createPool'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeCreatePoolInterceptors() -> [ServerInterceptor<Irismod_Farm_MsgCreatePool, Irismod_Farm_MsgCreatePoolResponse>]

  /// - Returns: Interceptors to use when handling 'destroyPool'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeDestroyPoolInterceptors() -> [ServerInterceptor<Irismod_Farm_MsgDestroyPool, Irismod_Farm_MsgDestroyPoolResponse>]

  /// - Returns: Interceptors to use when handling 'adjustPool'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeAdjustPoolInterceptors() -> [ServerInterceptor<Irismod_Farm_MsgAdjustPool, Irismod_Farm_MsgAdjustPoolResponse>]

  /// - Returns: Interceptors to use when handling 'stake'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeStakeInterceptors() -> [ServerInterceptor<Irismod_Farm_MsgStake, Irismod_Farm_MsgStakeResponse>]

  /// - Returns: Interceptors to use when handling 'unstake'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeUnstakeInterceptors() -> [ServerInterceptor<Irismod_Farm_MsgUnstake, Irismod_Farm_MsgUnstakeResponse>]

  /// - Returns: Interceptors to use when handling 'harvest'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeHarvestInterceptors() -> [ServerInterceptor<Irismod_Farm_MsgHarvest, Irismod_Farm_MsgHarvestResponse>]
}

internal enum Irismod_Farm_MsgServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "irismod.farm.Msg",
    methods: [
      Irismod_Farm_MsgServerMetadata.Methods.createPool,
      Irismod_Farm_MsgServerMetadata.Methods.destroyPool,
      Irismod_Farm_MsgServerMetadata.Methods.adjustPool,
      Irismod_Farm_MsgServerMetadata.Methods.stake,
      Irismod_Farm_MsgServerMetadata.Methods.unstake,
      Irismod_Farm_MsgServerMetadata.Methods.harvest,
    ]
  )

  internal enum Methods {
    internal static let createPool = GRPCMethodDescriptor(
      name: "CreatePool",
      path: "/irismod.farm.Msg/CreatePool",
      type: GRPCCallType.unary
    )

    internal static let destroyPool = GRPCMethodDescriptor(
      name: "DestroyPool",
      path: "/irismod.farm.Msg/DestroyPool",
      type: GRPCCallType.unary
    )

    internal static let adjustPool = GRPCMethodDescriptor(
      name: "AdjustPool",
      path: "/irismod.farm.Msg/AdjustPool",
      type: GRPCCallType.unary
    )

    internal static let stake = GRPCMethodDescriptor(
      name: "Stake",
      path: "/irismod.farm.Msg/Stake",
      type: GRPCCallType.unary
    )

    internal static let unstake = GRPCMethodDescriptor(
      name: "Unstake",
      path: "/irismod.farm.Msg/Unstake",
      type: GRPCCallType.unary
    )

    internal static let harvest = GRPCMethodDescriptor(
      name: "Harvest",
      path: "/irismod.farm.Msg/Harvest",
      type: GRPCCallType.unary
    )
  }
}
