//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: provenance/reward/v1/tx.proto
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


/// Msg
///
/// Usage: instantiate `Provenance_Reward_V1_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Provenance_Reward_V1_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Provenance_Reward_V1_MsgClientInterceptorFactoryProtocol? { get }

  func createRewardProgram(
    _ request: Provenance_Reward_V1_MsgCreateRewardProgramRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Provenance_Reward_V1_MsgCreateRewardProgramRequest, Provenance_Reward_V1_MsgCreateRewardProgramResponse>

  func endRewardProgram(
    _ request: Provenance_Reward_V1_MsgEndRewardProgramRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Provenance_Reward_V1_MsgEndRewardProgramRequest, Provenance_Reward_V1_MsgEndRewardProgramResponse>

  func claimRewards(
    _ request: Provenance_Reward_V1_MsgClaimRewardsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Provenance_Reward_V1_MsgClaimRewardsRequest, Provenance_Reward_V1_MsgClaimRewardsResponse>

  func claimAllRewards(
    _ request: Provenance_Reward_V1_MsgClaimAllRewardsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Provenance_Reward_V1_MsgClaimAllRewardsRequest, Provenance_Reward_V1_MsgClaimAllRewardsResponse>
}

extension Provenance_Reward_V1_MsgClientProtocol {
  internal var serviceName: String {
    return "provenance.reward.v1.Msg"
  }

  /// CreateRewardProgram is the RPC endpoint for creating a rewards program
  ///
  /// - Parameters:
  ///   - request: Request to send to CreateRewardProgram.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func createRewardProgram(
    _ request: Provenance_Reward_V1_MsgCreateRewardProgramRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Provenance_Reward_V1_MsgCreateRewardProgramRequest, Provenance_Reward_V1_MsgCreateRewardProgramResponse> {
    return self.makeUnaryCall(
      path: Provenance_Reward_V1_MsgClientMetadata.Methods.createRewardProgram.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCreateRewardProgramInterceptors() ?? []
    )
  }

  /// EndRewardProgram is the RPC endpoint for ending a rewards program
  ///
  /// - Parameters:
  ///   - request: Request to send to EndRewardProgram.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func endRewardProgram(
    _ request: Provenance_Reward_V1_MsgEndRewardProgramRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Provenance_Reward_V1_MsgEndRewardProgramRequest, Provenance_Reward_V1_MsgEndRewardProgramResponse> {
    return self.makeUnaryCall(
      path: Provenance_Reward_V1_MsgClientMetadata.Methods.endRewardProgram.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeEndRewardProgramInterceptors() ?? []
    )
  }

  /// ClaimRewards is the RPC endpoint for claiming rewards belonging to completed claim periods of a reward program
  ///
  /// - Parameters:
  ///   - request: Request to send to ClaimRewards.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func claimRewards(
    _ request: Provenance_Reward_V1_MsgClaimRewardsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Provenance_Reward_V1_MsgClaimRewardsRequest, Provenance_Reward_V1_MsgClaimRewardsResponse> {
    return self.makeUnaryCall(
      path: Provenance_Reward_V1_MsgClientMetadata.Methods.claimRewards.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClaimRewardsInterceptors() ?? []
    )
  }

  /// ClaimAllRewards is the RPC endpoint for claiming rewards for completed claim periods of every reward program for
  /// the signer of the tx.
  ///
  /// - Parameters:
  ///   - request: Request to send to ClaimAllRewards.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func claimAllRewards(
    _ request: Provenance_Reward_V1_MsgClaimAllRewardsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Provenance_Reward_V1_MsgClaimAllRewardsRequest, Provenance_Reward_V1_MsgClaimAllRewardsResponse> {
    return self.makeUnaryCall(
      path: Provenance_Reward_V1_MsgClientMetadata.Methods.claimAllRewards.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClaimAllRewardsInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Provenance_Reward_V1_MsgClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Provenance_Reward_V1_MsgNIOClient")
internal final class Provenance_Reward_V1_MsgClient: Provenance_Reward_V1_MsgClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Provenance_Reward_V1_MsgClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Provenance_Reward_V1_MsgClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the provenance.reward.v1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Provenance_Reward_V1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Provenance_Reward_V1_MsgNIOClient: Provenance_Reward_V1_MsgClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Provenance_Reward_V1_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the provenance.reward.v1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Provenance_Reward_V1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Msg
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Provenance_Reward_V1_MsgAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Provenance_Reward_V1_MsgClientInterceptorFactoryProtocol? { get }

  func makeCreateRewardProgramCall(
    _ request: Provenance_Reward_V1_MsgCreateRewardProgramRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Provenance_Reward_V1_MsgCreateRewardProgramRequest, Provenance_Reward_V1_MsgCreateRewardProgramResponse>

  func makeEndRewardProgramCall(
    _ request: Provenance_Reward_V1_MsgEndRewardProgramRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Provenance_Reward_V1_MsgEndRewardProgramRequest, Provenance_Reward_V1_MsgEndRewardProgramResponse>

  func makeClaimRewardsCall(
    _ request: Provenance_Reward_V1_MsgClaimRewardsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Provenance_Reward_V1_MsgClaimRewardsRequest, Provenance_Reward_V1_MsgClaimRewardsResponse>

  func makeClaimAllRewardsCall(
    _ request: Provenance_Reward_V1_MsgClaimAllRewardsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Provenance_Reward_V1_MsgClaimAllRewardsRequest, Provenance_Reward_V1_MsgClaimAllRewardsResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Provenance_Reward_V1_MsgAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Provenance_Reward_V1_MsgClientMetadata.serviceDescriptor
  }

  internal var interceptors: Provenance_Reward_V1_MsgClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeCreateRewardProgramCall(
    _ request: Provenance_Reward_V1_MsgCreateRewardProgramRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Provenance_Reward_V1_MsgCreateRewardProgramRequest, Provenance_Reward_V1_MsgCreateRewardProgramResponse> {
    return self.makeAsyncUnaryCall(
      path: Provenance_Reward_V1_MsgClientMetadata.Methods.createRewardProgram.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCreateRewardProgramInterceptors() ?? []
    )
  }

  internal func makeEndRewardProgramCall(
    _ request: Provenance_Reward_V1_MsgEndRewardProgramRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Provenance_Reward_V1_MsgEndRewardProgramRequest, Provenance_Reward_V1_MsgEndRewardProgramResponse> {
    return self.makeAsyncUnaryCall(
      path: Provenance_Reward_V1_MsgClientMetadata.Methods.endRewardProgram.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeEndRewardProgramInterceptors() ?? []
    )
  }

  internal func makeClaimRewardsCall(
    _ request: Provenance_Reward_V1_MsgClaimRewardsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Provenance_Reward_V1_MsgClaimRewardsRequest, Provenance_Reward_V1_MsgClaimRewardsResponse> {
    return self.makeAsyncUnaryCall(
      path: Provenance_Reward_V1_MsgClientMetadata.Methods.claimRewards.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClaimRewardsInterceptors() ?? []
    )
  }

  internal func makeClaimAllRewardsCall(
    _ request: Provenance_Reward_V1_MsgClaimAllRewardsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Provenance_Reward_V1_MsgClaimAllRewardsRequest, Provenance_Reward_V1_MsgClaimAllRewardsResponse> {
    return self.makeAsyncUnaryCall(
      path: Provenance_Reward_V1_MsgClientMetadata.Methods.claimAllRewards.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClaimAllRewardsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Provenance_Reward_V1_MsgAsyncClientProtocol {
  internal func createRewardProgram(
    _ request: Provenance_Reward_V1_MsgCreateRewardProgramRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Provenance_Reward_V1_MsgCreateRewardProgramResponse {
    return try await self.performAsyncUnaryCall(
      path: Provenance_Reward_V1_MsgClientMetadata.Methods.createRewardProgram.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCreateRewardProgramInterceptors() ?? []
    )
  }

  internal func endRewardProgram(
    _ request: Provenance_Reward_V1_MsgEndRewardProgramRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Provenance_Reward_V1_MsgEndRewardProgramResponse {
    return try await self.performAsyncUnaryCall(
      path: Provenance_Reward_V1_MsgClientMetadata.Methods.endRewardProgram.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeEndRewardProgramInterceptors() ?? []
    )
  }

  internal func claimRewards(
    _ request: Provenance_Reward_V1_MsgClaimRewardsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Provenance_Reward_V1_MsgClaimRewardsResponse {
    return try await self.performAsyncUnaryCall(
      path: Provenance_Reward_V1_MsgClientMetadata.Methods.claimRewards.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClaimRewardsInterceptors() ?? []
    )
  }

  internal func claimAllRewards(
    _ request: Provenance_Reward_V1_MsgClaimAllRewardsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Provenance_Reward_V1_MsgClaimAllRewardsResponse {
    return try await self.performAsyncUnaryCall(
      path: Provenance_Reward_V1_MsgClientMetadata.Methods.claimAllRewards.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClaimAllRewardsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Provenance_Reward_V1_MsgAsyncClient: Provenance_Reward_V1_MsgAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Provenance_Reward_V1_MsgClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Provenance_Reward_V1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Provenance_Reward_V1_MsgClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'createRewardProgram'.
  func makeCreateRewardProgramInterceptors() -> [ClientInterceptor<Provenance_Reward_V1_MsgCreateRewardProgramRequest, Provenance_Reward_V1_MsgCreateRewardProgramResponse>]

  /// - Returns: Interceptors to use when invoking 'endRewardProgram'.
  func makeEndRewardProgramInterceptors() -> [ClientInterceptor<Provenance_Reward_V1_MsgEndRewardProgramRequest, Provenance_Reward_V1_MsgEndRewardProgramResponse>]

  /// - Returns: Interceptors to use when invoking 'claimRewards'.
  func makeClaimRewardsInterceptors() -> [ClientInterceptor<Provenance_Reward_V1_MsgClaimRewardsRequest, Provenance_Reward_V1_MsgClaimRewardsResponse>]

  /// - Returns: Interceptors to use when invoking 'claimAllRewards'.
  func makeClaimAllRewardsInterceptors() -> [ClientInterceptor<Provenance_Reward_V1_MsgClaimAllRewardsRequest, Provenance_Reward_V1_MsgClaimAllRewardsResponse>]
}

internal enum Provenance_Reward_V1_MsgClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "provenance.reward.v1.Msg",
    methods: [
      Provenance_Reward_V1_MsgClientMetadata.Methods.createRewardProgram,
      Provenance_Reward_V1_MsgClientMetadata.Methods.endRewardProgram,
      Provenance_Reward_V1_MsgClientMetadata.Methods.claimRewards,
      Provenance_Reward_V1_MsgClientMetadata.Methods.claimAllRewards,
    ]
  )

  internal enum Methods {
    internal static let createRewardProgram = GRPCMethodDescriptor(
      name: "CreateRewardProgram",
      path: "/provenance.reward.v1.Msg/CreateRewardProgram",
      type: GRPCCallType.unary
    )

    internal static let endRewardProgram = GRPCMethodDescriptor(
      name: "EndRewardProgram",
      path: "/provenance.reward.v1.Msg/EndRewardProgram",
      type: GRPCCallType.unary
    )

    internal static let claimRewards = GRPCMethodDescriptor(
      name: "ClaimRewards",
      path: "/provenance.reward.v1.Msg/ClaimRewards",
      type: GRPCCallType.unary
    )

    internal static let claimAllRewards = GRPCMethodDescriptor(
      name: "ClaimAllRewards",
      path: "/provenance.reward.v1.Msg/ClaimAllRewards",
      type: GRPCCallType.unary
    )
  }
}

/// Msg
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Provenance_Reward_V1_MsgProvider: CallHandlerProvider {
  var interceptors: Provenance_Reward_V1_MsgServerInterceptorFactoryProtocol? { get }

  /// CreateRewardProgram is the RPC endpoint for creating a rewards program
  func createRewardProgram(request: Provenance_Reward_V1_MsgCreateRewardProgramRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Provenance_Reward_V1_MsgCreateRewardProgramResponse>

  /// EndRewardProgram is the RPC endpoint for ending a rewards program
  func endRewardProgram(request: Provenance_Reward_V1_MsgEndRewardProgramRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Provenance_Reward_V1_MsgEndRewardProgramResponse>

  /// ClaimRewards is the RPC endpoint for claiming rewards belonging to completed claim periods of a reward program
  func claimRewards(request: Provenance_Reward_V1_MsgClaimRewardsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Provenance_Reward_V1_MsgClaimRewardsResponse>

  /// ClaimAllRewards is the RPC endpoint for claiming rewards for completed claim periods of every reward program for
  /// the signer of the tx.
  func claimAllRewards(request: Provenance_Reward_V1_MsgClaimAllRewardsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Provenance_Reward_V1_MsgClaimAllRewardsResponse>
}

extension Provenance_Reward_V1_MsgProvider {
  internal var serviceName: Substring {
    return Provenance_Reward_V1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "CreateRewardProgram":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Reward_V1_MsgCreateRewardProgramRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Reward_V1_MsgCreateRewardProgramResponse>(),
        interceptors: self.interceptors?.makeCreateRewardProgramInterceptors() ?? [],
        userFunction: self.createRewardProgram(request:context:)
      )

    case "EndRewardProgram":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Reward_V1_MsgEndRewardProgramRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Reward_V1_MsgEndRewardProgramResponse>(),
        interceptors: self.interceptors?.makeEndRewardProgramInterceptors() ?? [],
        userFunction: self.endRewardProgram(request:context:)
      )

    case "ClaimRewards":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Reward_V1_MsgClaimRewardsRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Reward_V1_MsgClaimRewardsResponse>(),
        interceptors: self.interceptors?.makeClaimRewardsInterceptors() ?? [],
        userFunction: self.claimRewards(request:context:)
      )

    case "ClaimAllRewards":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Reward_V1_MsgClaimAllRewardsRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Reward_V1_MsgClaimAllRewardsResponse>(),
        interceptors: self.interceptors?.makeClaimAllRewardsInterceptors() ?? [],
        userFunction: self.claimAllRewards(request:context:)
      )

    default:
      return nil
    }
  }
}

/// Msg
///
/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Provenance_Reward_V1_MsgAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Provenance_Reward_V1_MsgServerInterceptorFactoryProtocol? { get }

  /// CreateRewardProgram is the RPC endpoint for creating a rewards program
  @Sendable func createRewardProgram(
    request: Provenance_Reward_V1_MsgCreateRewardProgramRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Provenance_Reward_V1_MsgCreateRewardProgramResponse

  /// EndRewardProgram is the RPC endpoint for ending a rewards program
  @Sendable func endRewardProgram(
    request: Provenance_Reward_V1_MsgEndRewardProgramRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Provenance_Reward_V1_MsgEndRewardProgramResponse

  /// ClaimRewards is the RPC endpoint for claiming rewards belonging to completed claim periods of a reward program
  @Sendable func claimRewards(
    request: Provenance_Reward_V1_MsgClaimRewardsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Provenance_Reward_V1_MsgClaimRewardsResponse

  /// ClaimAllRewards is the RPC endpoint for claiming rewards for completed claim periods of every reward program for
  /// the signer of the tx.
  @Sendable func claimAllRewards(
    request: Provenance_Reward_V1_MsgClaimAllRewardsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Provenance_Reward_V1_MsgClaimAllRewardsResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Provenance_Reward_V1_MsgAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Provenance_Reward_V1_MsgServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Provenance_Reward_V1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Provenance_Reward_V1_MsgServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "CreateRewardProgram":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Reward_V1_MsgCreateRewardProgramRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Reward_V1_MsgCreateRewardProgramResponse>(),
        interceptors: self.interceptors?.makeCreateRewardProgramInterceptors() ?? [],
        wrapping: self.createRewardProgram(request:context:)
      )

    case "EndRewardProgram":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Reward_V1_MsgEndRewardProgramRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Reward_V1_MsgEndRewardProgramResponse>(),
        interceptors: self.interceptors?.makeEndRewardProgramInterceptors() ?? [],
        wrapping: self.endRewardProgram(request:context:)
      )

    case "ClaimRewards":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Reward_V1_MsgClaimRewardsRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Reward_V1_MsgClaimRewardsResponse>(),
        interceptors: self.interceptors?.makeClaimRewardsInterceptors() ?? [],
        wrapping: self.claimRewards(request:context:)
      )

    case "ClaimAllRewards":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Reward_V1_MsgClaimAllRewardsRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Reward_V1_MsgClaimAllRewardsResponse>(),
        interceptors: self.interceptors?.makeClaimAllRewardsInterceptors() ?? [],
        wrapping: self.claimAllRewards(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Provenance_Reward_V1_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'createRewardProgram'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeCreateRewardProgramInterceptors() -> [ServerInterceptor<Provenance_Reward_V1_MsgCreateRewardProgramRequest, Provenance_Reward_V1_MsgCreateRewardProgramResponse>]

  /// - Returns: Interceptors to use when handling 'endRewardProgram'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeEndRewardProgramInterceptors() -> [ServerInterceptor<Provenance_Reward_V1_MsgEndRewardProgramRequest, Provenance_Reward_V1_MsgEndRewardProgramResponse>]

  /// - Returns: Interceptors to use when handling 'claimRewards'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeClaimRewardsInterceptors() -> [ServerInterceptor<Provenance_Reward_V1_MsgClaimRewardsRequest, Provenance_Reward_V1_MsgClaimRewardsResponse>]

  /// - Returns: Interceptors to use when handling 'claimAllRewards'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeClaimAllRewardsInterceptors() -> [ServerInterceptor<Provenance_Reward_V1_MsgClaimAllRewardsRequest, Provenance_Reward_V1_MsgClaimAllRewardsResponse>]
}

internal enum Provenance_Reward_V1_MsgServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "provenance.reward.v1.Msg",
    methods: [
      Provenance_Reward_V1_MsgServerMetadata.Methods.createRewardProgram,
      Provenance_Reward_V1_MsgServerMetadata.Methods.endRewardProgram,
      Provenance_Reward_V1_MsgServerMetadata.Methods.claimRewards,
      Provenance_Reward_V1_MsgServerMetadata.Methods.claimAllRewards,
    ]
  )

  internal enum Methods {
    internal static let createRewardProgram = GRPCMethodDescriptor(
      name: "CreateRewardProgram",
      path: "/provenance.reward.v1.Msg/CreateRewardProgram",
      type: GRPCCallType.unary
    )

    internal static let endRewardProgram = GRPCMethodDescriptor(
      name: "EndRewardProgram",
      path: "/provenance.reward.v1.Msg/EndRewardProgram",
      type: GRPCCallType.unary
    )

    internal static let claimRewards = GRPCMethodDescriptor(
      name: "ClaimRewards",
      path: "/provenance.reward.v1.Msg/ClaimRewards",
      type: GRPCCallType.unary
    )

    internal static let claimAllRewards = GRPCMethodDescriptor(
      name: "ClaimAllRewards",
      path: "/provenance.reward.v1.Msg/ClaimAllRewards",
      type: GRPCCallType.unary
    )
  }
}
