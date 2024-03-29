//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: crescent/marketmaker/v1beta1/tx.proto
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


/// Msg defines the marketmaker Msg service.
///
/// Usage: instantiate `Crescent_Marketmaker_V1beta1_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Crescent_Marketmaker_V1beta1_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Crescent_Marketmaker_V1beta1_MsgClientInterceptorFactoryProtocol? { get }

  func applyMarketMaker(
    _ request: Crescent_Marketmaker_V1beta1_MsgApplyMarketMaker,
    callOptions: CallOptions?
  ) -> UnaryCall<Crescent_Marketmaker_V1beta1_MsgApplyMarketMaker, Crescent_Marketmaker_V1beta1_MsgApplyMarketMakerResponse>

  func claimIncentives(
    _ request: Crescent_Marketmaker_V1beta1_MsgClaimIncentives,
    callOptions: CallOptions?
  ) -> UnaryCall<Crescent_Marketmaker_V1beta1_MsgClaimIncentives, Crescent_Marketmaker_V1beta1_MsgClaimIncentivesResponse>
}

extension Crescent_Marketmaker_V1beta1_MsgClientProtocol {
  internal var serviceName: String {
    return "crescent.marketmaker.v1beta1.Msg"
  }

  /// Unary call to ApplyMarketMaker
  ///
  /// - Parameters:
  ///   - request: Request to send to ApplyMarketMaker.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func applyMarketMaker(
    _ request: Crescent_Marketmaker_V1beta1_MsgApplyMarketMaker,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Crescent_Marketmaker_V1beta1_MsgApplyMarketMaker, Crescent_Marketmaker_V1beta1_MsgApplyMarketMakerResponse> {
    return self.makeUnaryCall(
      path: Crescent_Marketmaker_V1beta1_MsgClientMetadata.Methods.applyMarketMaker.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeApplyMarketMakerInterceptors() ?? []
    )
  }

  /// Unary call to ClaimIncentives
  ///
  /// - Parameters:
  ///   - request: Request to send to ClaimIncentives.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func claimIncentives(
    _ request: Crescent_Marketmaker_V1beta1_MsgClaimIncentives,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Crescent_Marketmaker_V1beta1_MsgClaimIncentives, Crescent_Marketmaker_V1beta1_MsgClaimIncentivesResponse> {
    return self.makeUnaryCall(
      path: Crescent_Marketmaker_V1beta1_MsgClientMetadata.Methods.claimIncentives.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClaimIncentivesInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Crescent_Marketmaker_V1beta1_MsgClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Crescent_Marketmaker_V1beta1_MsgNIOClient")
internal final class Crescent_Marketmaker_V1beta1_MsgClient: Crescent_Marketmaker_V1beta1_MsgClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Crescent_Marketmaker_V1beta1_MsgClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Crescent_Marketmaker_V1beta1_MsgClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the crescent.marketmaker.v1beta1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Crescent_Marketmaker_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Crescent_Marketmaker_V1beta1_MsgNIOClient: Crescent_Marketmaker_V1beta1_MsgClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Crescent_Marketmaker_V1beta1_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the crescent.marketmaker.v1beta1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Crescent_Marketmaker_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Msg defines the marketmaker Msg service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Crescent_Marketmaker_V1beta1_MsgAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Crescent_Marketmaker_V1beta1_MsgClientInterceptorFactoryProtocol? { get }

  func makeApplyMarketMakerCall(
    _ request: Crescent_Marketmaker_V1beta1_MsgApplyMarketMaker,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Crescent_Marketmaker_V1beta1_MsgApplyMarketMaker, Crescent_Marketmaker_V1beta1_MsgApplyMarketMakerResponse>

  func makeClaimIncentivesCall(
    _ request: Crescent_Marketmaker_V1beta1_MsgClaimIncentives,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Crescent_Marketmaker_V1beta1_MsgClaimIncentives, Crescent_Marketmaker_V1beta1_MsgClaimIncentivesResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Crescent_Marketmaker_V1beta1_MsgAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Crescent_Marketmaker_V1beta1_MsgClientMetadata.serviceDescriptor
  }

  internal var interceptors: Crescent_Marketmaker_V1beta1_MsgClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeApplyMarketMakerCall(
    _ request: Crescent_Marketmaker_V1beta1_MsgApplyMarketMaker,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Crescent_Marketmaker_V1beta1_MsgApplyMarketMaker, Crescent_Marketmaker_V1beta1_MsgApplyMarketMakerResponse> {
    return self.makeAsyncUnaryCall(
      path: Crescent_Marketmaker_V1beta1_MsgClientMetadata.Methods.applyMarketMaker.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeApplyMarketMakerInterceptors() ?? []
    )
  }

  internal func makeClaimIncentivesCall(
    _ request: Crescent_Marketmaker_V1beta1_MsgClaimIncentives,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Crescent_Marketmaker_V1beta1_MsgClaimIncentives, Crescent_Marketmaker_V1beta1_MsgClaimIncentivesResponse> {
    return self.makeAsyncUnaryCall(
      path: Crescent_Marketmaker_V1beta1_MsgClientMetadata.Methods.claimIncentives.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClaimIncentivesInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Crescent_Marketmaker_V1beta1_MsgAsyncClientProtocol {
  internal func applyMarketMaker(
    _ request: Crescent_Marketmaker_V1beta1_MsgApplyMarketMaker,
    callOptions: CallOptions? = nil
  ) async throws -> Crescent_Marketmaker_V1beta1_MsgApplyMarketMakerResponse {
    return try await self.performAsyncUnaryCall(
      path: Crescent_Marketmaker_V1beta1_MsgClientMetadata.Methods.applyMarketMaker.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeApplyMarketMakerInterceptors() ?? []
    )
  }

  internal func claimIncentives(
    _ request: Crescent_Marketmaker_V1beta1_MsgClaimIncentives,
    callOptions: CallOptions? = nil
  ) async throws -> Crescent_Marketmaker_V1beta1_MsgClaimIncentivesResponse {
    return try await self.performAsyncUnaryCall(
      path: Crescent_Marketmaker_V1beta1_MsgClientMetadata.Methods.claimIncentives.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClaimIncentivesInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Crescent_Marketmaker_V1beta1_MsgAsyncClient: Crescent_Marketmaker_V1beta1_MsgAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Crescent_Marketmaker_V1beta1_MsgClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Crescent_Marketmaker_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Crescent_Marketmaker_V1beta1_MsgClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'applyMarketMaker'.
  func makeApplyMarketMakerInterceptors() -> [ClientInterceptor<Crescent_Marketmaker_V1beta1_MsgApplyMarketMaker, Crescent_Marketmaker_V1beta1_MsgApplyMarketMakerResponse>]

  /// - Returns: Interceptors to use when invoking 'claimIncentives'.
  func makeClaimIncentivesInterceptors() -> [ClientInterceptor<Crescent_Marketmaker_V1beta1_MsgClaimIncentives, Crescent_Marketmaker_V1beta1_MsgClaimIncentivesResponse>]
}

internal enum Crescent_Marketmaker_V1beta1_MsgClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "crescent.marketmaker.v1beta1.Msg",
    methods: [
      Crescent_Marketmaker_V1beta1_MsgClientMetadata.Methods.applyMarketMaker,
      Crescent_Marketmaker_V1beta1_MsgClientMetadata.Methods.claimIncentives,
    ]
  )

  internal enum Methods {
    internal static let applyMarketMaker = GRPCMethodDescriptor(
      name: "ApplyMarketMaker",
      path: "/crescent.marketmaker.v1beta1.Msg/ApplyMarketMaker",
      type: GRPCCallType.unary
    )

    internal static let claimIncentives = GRPCMethodDescriptor(
      name: "ClaimIncentives",
      path: "/crescent.marketmaker.v1beta1.Msg/ClaimIncentives",
      type: GRPCCallType.unary
    )
  }
}

/// Msg defines the marketmaker Msg service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Crescent_Marketmaker_V1beta1_MsgProvider: CallHandlerProvider {
  var interceptors: Crescent_Marketmaker_V1beta1_MsgServerInterceptorFactoryProtocol? { get }

  func applyMarketMaker(request: Crescent_Marketmaker_V1beta1_MsgApplyMarketMaker, context: StatusOnlyCallContext) -> EventLoopFuture<Crescent_Marketmaker_V1beta1_MsgApplyMarketMakerResponse>

  func claimIncentives(request: Crescent_Marketmaker_V1beta1_MsgClaimIncentives, context: StatusOnlyCallContext) -> EventLoopFuture<Crescent_Marketmaker_V1beta1_MsgClaimIncentivesResponse>
}

extension Crescent_Marketmaker_V1beta1_MsgProvider {
  internal var serviceName: Substring {
    return Crescent_Marketmaker_V1beta1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "ApplyMarketMaker":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Crescent_Marketmaker_V1beta1_MsgApplyMarketMaker>(),
        responseSerializer: ProtobufSerializer<Crescent_Marketmaker_V1beta1_MsgApplyMarketMakerResponse>(),
        interceptors: self.interceptors?.makeApplyMarketMakerInterceptors() ?? [],
        userFunction: self.applyMarketMaker(request:context:)
      )

    case "ClaimIncentives":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Crescent_Marketmaker_V1beta1_MsgClaimIncentives>(),
        responseSerializer: ProtobufSerializer<Crescent_Marketmaker_V1beta1_MsgClaimIncentivesResponse>(),
        interceptors: self.interceptors?.makeClaimIncentivesInterceptors() ?? [],
        userFunction: self.claimIncentives(request:context:)
      )

    default:
      return nil
    }
  }
}

/// Msg defines the marketmaker Msg service.
///
/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Crescent_Marketmaker_V1beta1_MsgAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Crescent_Marketmaker_V1beta1_MsgServerInterceptorFactoryProtocol? { get }

  @Sendable func applyMarketMaker(
    request: Crescent_Marketmaker_V1beta1_MsgApplyMarketMaker,
    context: GRPCAsyncServerCallContext
  ) async throws -> Crescent_Marketmaker_V1beta1_MsgApplyMarketMakerResponse

  @Sendable func claimIncentives(
    request: Crescent_Marketmaker_V1beta1_MsgClaimIncentives,
    context: GRPCAsyncServerCallContext
  ) async throws -> Crescent_Marketmaker_V1beta1_MsgClaimIncentivesResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Crescent_Marketmaker_V1beta1_MsgAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Crescent_Marketmaker_V1beta1_MsgServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Crescent_Marketmaker_V1beta1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Crescent_Marketmaker_V1beta1_MsgServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "ApplyMarketMaker":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Crescent_Marketmaker_V1beta1_MsgApplyMarketMaker>(),
        responseSerializer: ProtobufSerializer<Crescent_Marketmaker_V1beta1_MsgApplyMarketMakerResponse>(),
        interceptors: self.interceptors?.makeApplyMarketMakerInterceptors() ?? [],
        wrapping: self.applyMarketMaker(request:context:)
      )

    case "ClaimIncentives":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Crescent_Marketmaker_V1beta1_MsgClaimIncentives>(),
        responseSerializer: ProtobufSerializer<Crescent_Marketmaker_V1beta1_MsgClaimIncentivesResponse>(),
        interceptors: self.interceptors?.makeClaimIncentivesInterceptors() ?? [],
        wrapping: self.claimIncentives(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Crescent_Marketmaker_V1beta1_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'applyMarketMaker'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeApplyMarketMakerInterceptors() -> [ServerInterceptor<Crescent_Marketmaker_V1beta1_MsgApplyMarketMaker, Crescent_Marketmaker_V1beta1_MsgApplyMarketMakerResponse>]

  /// - Returns: Interceptors to use when handling 'claimIncentives'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeClaimIncentivesInterceptors() -> [ServerInterceptor<Crescent_Marketmaker_V1beta1_MsgClaimIncentives, Crescent_Marketmaker_V1beta1_MsgClaimIncentivesResponse>]
}

internal enum Crescent_Marketmaker_V1beta1_MsgServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "crescent.marketmaker.v1beta1.Msg",
    methods: [
      Crescent_Marketmaker_V1beta1_MsgServerMetadata.Methods.applyMarketMaker,
      Crescent_Marketmaker_V1beta1_MsgServerMetadata.Methods.claimIncentives,
    ]
  )

  internal enum Methods {
    internal static let applyMarketMaker = GRPCMethodDescriptor(
      name: "ApplyMarketMaker",
      path: "/crescent.marketmaker.v1beta1.Msg/ApplyMarketMaker",
      type: GRPCCallType.unary
    )

    internal static let claimIncentives = GRPCMethodDescriptor(
      name: "ClaimIncentives",
      path: "/crescent.marketmaker.v1beta1.Msg/ClaimIncentives",
      type: GRPCCallType.unary
    )
  }
}
