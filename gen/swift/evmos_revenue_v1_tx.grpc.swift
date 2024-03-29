//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: evmos/revenue/v1/tx.proto
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


/// Msg defines the fees Msg service.
///
/// Usage: instantiate `Evmos_Revenue_V1_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Evmos_Revenue_V1_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Evmos_Revenue_V1_MsgClientInterceptorFactoryProtocol? { get }

  func registerRevenue(
    _ request: Evmos_Revenue_V1_MsgRegisterRevenue,
    callOptions: CallOptions?
  ) -> UnaryCall<Evmos_Revenue_V1_MsgRegisterRevenue, Evmos_Revenue_V1_MsgRegisterRevenueResponse>

  func updateRevenue(
    _ request: Evmos_Revenue_V1_MsgUpdateRevenue,
    callOptions: CallOptions?
  ) -> UnaryCall<Evmos_Revenue_V1_MsgUpdateRevenue, Evmos_Revenue_V1_MsgUpdateRevenueResponse>

  func cancelRevenue(
    _ request: Evmos_Revenue_V1_MsgCancelRevenue,
    callOptions: CallOptions?
  ) -> UnaryCall<Evmos_Revenue_V1_MsgCancelRevenue, Evmos_Revenue_V1_MsgCancelRevenueResponse>

  func updateParams(
    _ request: Evmos_Revenue_V1_MsgUpdateParams,
    callOptions: CallOptions?
  ) -> UnaryCall<Evmos_Revenue_V1_MsgUpdateParams, Evmos_Revenue_V1_MsgUpdateParamsResponse>
}

extension Evmos_Revenue_V1_MsgClientProtocol {
  internal var serviceName: String {
    return "evmos.revenue.v1.Msg"
  }

  /// RegisterRevenue registers a new contract for receiving transaction fees
  ///
  /// - Parameters:
  ///   - request: Request to send to RegisterRevenue.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func registerRevenue(
    _ request: Evmos_Revenue_V1_MsgRegisterRevenue,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Evmos_Revenue_V1_MsgRegisterRevenue, Evmos_Revenue_V1_MsgRegisterRevenueResponse> {
    return self.makeUnaryCall(
      path: Evmos_Revenue_V1_MsgClientMetadata.Methods.registerRevenue.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRegisterRevenueInterceptors() ?? []
    )
  }

  /// UpdateRevenue updates the withdrawer address of a revenue
  ///
  /// - Parameters:
  ///   - request: Request to send to UpdateRevenue.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func updateRevenue(
    _ request: Evmos_Revenue_V1_MsgUpdateRevenue,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Evmos_Revenue_V1_MsgUpdateRevenue, Evmos_Revenue_V1_MsgUpdateRevenueResponse> {
    return self.makeUnaryCall(
      path: Evmos_Revenue_V1_MsgClientMetadata.Methods.updateRevenue.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUpdateRevenueInterceptors() ?? []
    )
  }

  /// CancelRevenue cancels a contract's fee registration and further receival
  /// of transaction fees
  ///
  /// - Parameters:
  ///   - request: Request to send to CancelRevenue.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func cancelRevenue(
    _ request: Evmos_Revenue_V1_MsgCancelRevenue,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Evmos_Revenue_V1_MsgCancelRevenue, Evmos_Revenue_V1_MsgCancelRevenueResponse> {
    return self.makeUnaryCall(
      path: Evmos_Revenue_V1_MsgClientMetadata.Methods.cancelRevenue.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCancelRevenueInterceptors() ?? []
    )
  }

  /// UpdateParams defined a governance operation for updating the x/revenue module parameters.
  /// The authority is hard-coded to the Cosmos SDK x/gov module account
  ///
  /// - Parameters:
  ///   - request: Request to send to UpdateParams.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func updateParams(
    _ request: Evmos_Revenue_V1_MsgUpdateParams,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Evmos_Revenue_V1_MsgUpdateParams, Evmos_Revenue_V1_MsgUpdateParamsResponse> {
    return self.makeUnaryCall(
      path: Evmos_Revenue_V1_MsgClientMetadata.Methods.updateParams.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUpdateParamsInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Evmos_Revenue_V1_MsgClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Evmos_Revenue_V1_MsgNIOClient")
internal final class Evmos_Revenue_V1_MsgClient: Evmos_Revenue_V1_MsgClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Evmos_Revenue_V1_MsgClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Evmos_Revenue_V1_MsgClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the evmos.revenue.v1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Evmos_Revenue_V1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Evmos_Revenue_V1_MsgNIOClient: Evmos_Revenue_V1_MsgClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Evmos_Revenue_V1_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the evmos.revenue.v1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Evmos_Revenue_V1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Msg defines the fees Msg service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Evmos_Revenue_V1_MsgAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Evmos_Revenue_V1_MsgClientInterceptorFactoryProtocol? { get }

  func makeRegisterRevenueCall(
    _ request: Evmos_Revenue_V1_MsgRegisterRevenue,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Evmos_Revenue_V1_MsgRegisterRevenue, Evmos_Revenue_V1_MsgRegisterRevenueResponse>

  func makeUpdateRevenueCall(
    _ request: Evmos_Revenue_V1_MsgUpdateRevenue,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Evmos_Revenue_V1_MsgUpdateRevenue, Evmos_Revenue_V1_MsgUpdateRevenueResponse>

  func makeCancelRevenueCall(
    _ request: Evmos_Revenue_V1_MsgCancelRevenue,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Evmos_Revenue_V1_MsgCancelRevenue, Evmos_Revenue_V1_MsgCancelRevenueResponse>

  func makeUpdateParamsCall(
    _ request: Evmos_Revenue_V1_MsgUpdateParams,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Evmos_Revenue_V1_MsgUpdateParams, Evmos_Revenue_V1_MsgUpdateParamsResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Evmos_Revenue_V1_MsgAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Evmos_Revenue_V1_MsgClientMetadata.serviceDescriptor
  }

  internal var interceptors: Evmos_Revenue_V1_MsgClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeRegisterRevenueCall(
    _ request: Evmos_Revenue_V1_MsgRegisterRevenue,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Evmos_Revenue_V1_MsgRegisterRevenue, Evmos_Revenue_V1_MsgRegisterRevenueResponse> {
    return self.makeAsyncUnaryCall(
      path: Evmos_Revenue_V1_MsgClientMetadata.Methods.registerRevenue.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRegisterRevenueInterceptors() ?? []
    )
  }

  internal func makeUpdateRevenueCall(
    _ request: Evmos_Revenue_V1_MsgUpdateRevenue,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Evmos_Revenue_V1_MsgUpdateRevenue, Evmos_Revenue_V1_MsgUpdateRevenueResponse> {
    return self.makeAsyncUnaryCall(
      path: Evmos_Revenue_V1_MsgClientMetadata.Methods.updateRevenue.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUpdateRevenueInterceptors() ?? []
    )
  }

  internal func makeCancelRevenueCall(
    _ request: Evmos_Revenue_V1_MsgCancelRevenue,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Evmos_Revenue_V1_MsgCancelRevenue, Evmos_Revenue_V1_MsgCancelRevenueResponse> {
    return self.makeAsyncUnaryCall(
      path: Evmos_Revenue_V1_MsgClientMetadata.Methods.cancelRevenue.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCancelRevenueInterceptors() ?? []
    )
  }

  internal func makeUpdateParamsCall(
    _ request: Evmos_Revenue_V1_MsgUpdateParams,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Evmos_Revenue_V1_MsgUpdateParams, Evmos_Revenue_V1_MsgUpdateParamsResponse> {
    return self.makeAsyncUnaryCall(
      path: Evmos_Revenue_V1_MsgClientMetadata.Methods.updateParams.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUpdateParamsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Evmos_Revenue_V1_MsgAsyncClientProtocol {
  internal func registerRevenue(
    _ request: Evmos_Revenue_V1_MsgRegisterRevenue,
    callOptions: CallOptions? = nil
  ) async throws -> Evmos_Revenue_V1_MsgRegisterRevenueResponse {
    return try await self.performAsyncUnaryCall(
      path: Evmos_Revenue_V1_MsgClientMetadata.Methods.registerRevenue.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRegisterRevenueInterceptors() ?? []
    )
  }

  internal func updateRevenue(
    _ request: Evmos_Revenue_V1_MsgUpdateRevenue,
    callOptions: CallOptions? = nil
  ) async throws -> Evmos_Revenue_V1_MsgUpdateRevenueResponse {
    return try await self.performAsyncUnaryCall(
      path: Evmos_Revenue_V1_MsgClientMetadata.Methods.updateRevenue.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUpdateRevenueInterceptors() ?? []
    )
  }

  internal func cancelRevenue(
    _ request: Evmos_Revenue_V1_MsgCancelRevenue,
    callOptions: CallOptions? = nil
  ) async throws -> Evmos_Revenue_V1_MsgCancelRevenueResponse {
    return try await self.performAsyncUnaryCall(
      path: Evmos_Revenue_V1_MsgClientMetadata.Methods.cancelRevenue.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCancelRevenueInterceptors() ?? []
    )
  }

  internal func updateParams(
    _ request: Evmos_Revenue_V1_MsgUpdateParams,
    callOptions: CallOptions? = nil
  ) async throws -> Evmos_Revenue_V1_MsgUpdateParamsResponse {
    return try await self.performAsyncUnaryCall(
      path: Evmos_Revenue_V1_MsgClientMetadata.Methods.updateParams.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUpdateParamsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Evmos_Revenue_V1_MsgAsyncClient: Evmos_Revenue_V1_MsgAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Evmos_Revenue_V1_MsgClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Evmos_Revenue_V1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Evmos_Revenue_V1_MsgClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'registerRevenue'.
  func makeRegisterRevenueInterceptors() -> [ClientInterceptor<Evmos_Revenue_V1_MsgRegisterRevenue, Evmos_Revenue_V1_MsgRegisterRevenueResponse>]

  /// - Returns: Interceptors to use when invoking 'updateRevenue'.
  func makeUpdateRevenueInterceptors() -> [ClientInterceptor<Evmos_Revenue_V1_MsgUpdateRevenue, Evmos_Revenue_V1_MsgUpdateRevenueResponse>]

  /// - Returns: Interceptors to use when invoking 'cancelRevenue'.
  func makeCancelRevenueInterceptors() -> [ClientInterceptor<Evmos_Revenue_V1_MsgCancelRevenue, Evmos_Revenue_V1_MsgCancelRevenueResponse>]

  /// - Returns: Interceptors to use when invoking 'updateParams'.
  func makeUpdateParamsInterceptors() -> [ClientInterceptor<Evmos_Revenue_V1_MsgUpdateParams, Evmos_Revenue_V1_MsgUpdateParamsResponse>]
}

internal enum Evmos_Revenue_V1_MsgClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "evmos.revenue.v1.Msg",
    methods: [
      Evmos_Revenue_V1_MsgClientMetadata.Methods.registerRevenue,
      Evmos_Revenue_V1_MsgClientMetadata.Methods.updateRevenue,
      Evmos_Revenue_V1_MsgClientMetadata.Methods.cancelRevenue,
      Evmos_Revenue_V1_MsgClientMetadata.Methods.updateParams,
    ]
  )

  internal enum Methods {
    internal static let registerRevenue = GRPCMethodDescriptor(
      name: "RegisterRevenue",
      path: "/evmos.revenue.v1.Msg/RegisterRevenue",
      type: GRPCCallType.unary
    )

    internal static let updateRevenue = GRPCMethodDescriptor(
      name: "UpdateRevenue",
      path: "/evmos.revenue.v1.Msg/UpdateRevenue",
      type: GRPCCallType.unary
    )

    internal static let cancelRevenue = GRPCMethodDescriptor(
      name: "CancelRevenue",
      path: "/evmos.revenue.v1.Msg/CancelRevenue",
      type: GRPCCallType.unary
    )

    internal static let updateParams = GRPCMethodDescriptor(
      name: "UpdateParams",
      path: "/evmos.revenue.v1.Msg/UpdateParams",
      type: GRPCCallType.unary
    )
  }
}

/// Msg defines the fees Msg service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Evmos_Revenue_V1_MsgProvider: CallHandlerProvider {
  var interceptors: Evmos_Revenue_V1_MsgServerInterceptorFactoryProtocol? { get }

  /// RegisterRevenue registers a new contract for receiving transaction fees
  func registerRevenue(request: Evmos_Revenue_V1_MsgRegisterRevenue, context: StatusOnlyCallContext) -> EventLoopFuture<Evmos_Revenue_V1_MsgRegisterRevenueResponse>

  /// UpdateRevenue updates the withdrawer address of a revenue
  func updateRevenue(request: Evmos_Revenue_V1_MsgUpdateRevenue, context: StatusOnlyCallContext) -> EventLoopFuture<Evmos_Revenue_V1_MsgUpdateRevenueResponse>

  /// CancelRevenue cancels a contract's fee registration and further receival
  /// of transaction fees
  func cancelRevenue(request: Evmos_Revenue_V1_MsgCancelRevenue, context: StatusOnlyCallContext) -> EventLoopFuture<Evmos_Revenue_V1_MsgCancelRevenueResponse>

  /// UpdateParams defined a governance operation for updating the x/revenue module parameters.
  /// The authority is hard-coded to the Cosmos SDK x/gov module account
  func updateParams(request: Evmos_Revenue_V1_MsgUpdateParams, context: StatusOnlyCallContext) -> EventLoopFuture<Evmos_Revenue_V1_MsgUpdateParamsResponse>
}

extension Evmos_Revenue_V1_MsgProvider {
  internal var serviceName: Substring {
    return Evmos_Revenue_V1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "RegisterRevenue":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Evmos_Revenue_V1_MsgRegisterRevenue>(),
        responseSerializer: ProtobufSerializer<Evmos_Revenue_V1_MsgRegisterRevenueResponse>(),
        interceptors: self.interceptors?.makeRegisterRevenueInterceptors() ?? [],
        userFunction: self.registerRevenue(request:context:)
      )

    case "UpdateRevenue":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Evmos_Revenue_V1_MsgUpdateRevenue>(),
        responseSerializer: ProtobufSerializer<Evmos_Revenue_V1_MsgUpdateRevenueResponse>(),
        interceptors: self.interceptors?.makeUpdateRevenueInterceptors() ?? [],
        userFunction: self.updateRevenue(request:context:)
      )

    case "CancelRevenue":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Evmos_Revenue_V1_MsgCancelRevenue>(),
        responseSerializer: ProtobufSerializer<Evmos_Revenue_V1_MsgCancelRevenueResponse>(),
        interceptors: self.interceptors?.makeCancelRevenueInterceptors() ?? [],
        userFunction: self.cancelRevenue(request:context:)
      )

    case "UpdateParams":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Evmos_Revenue_V1_MsgUpdateParams>(),
        responseSerializer: ProtobufSerializer<Evmos_Revenue_V1_MsgUpdateParamsResponse>(),
        interceptors: self.interceptors?.makeUpdateParamsInterceptors() ?? [],
        userFunction: self.updateParams(request:context:)
      )

    default:
      return nil
    }
  }
}

/// Msg defines the fees Msg service.
///
/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Evmos_Revenue_V1_MsgAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Evmos_Revenue_V1_MsgServerInterceptorFactoryProtocol? { get }

  /// RegisterRevenue registers a new contract for receiving transaction fees
  @Sendable func registerRevenue(
    request: Evmos_Revenue_V1_MsgRegisterRevenue,
    context: GRPCAsyncServerCallContext
  ) async throws -> Evmos_Revenue_V1_MsgRegisterRevenueResponse

  /// UpdateRevenue updates the withdrawer address of a revenue
  @Sendable func updateRevenue(
    request: Evmos_Revenue_V1_MsgUpdateRevenue,
    context: GRPCAsyncServerCallContext
  ) async throws -> Evmos_Revenue_V1_MsgUpdateRevenueResponse

  /// CancelRevenue cancels a contract's fee registration and further receival
  /// of transaction fees
  @Sendable func cancelRevenue(
    request: Evmos_Revenue_V1_MsgCancelRevenue,
    context: GRPCAsyncServerCallContext
  ) async throws -> Evmos_Revenue_V1_MsgCancelRevenueResponse

  /// UpdateParams defined a governance operation for updating the x/revenue module parameters.
  /// The authority is hard-coded to the Cosmos SDK x/gov module account
  @Sendable func updateParams(
    request: Evmos_Revenue_V1_MsgUpdateParams,
    context: GRPCAsyncServerCallContext
  ) async throws -> Evmos_Revenue_V1_MsgUpdateParamsResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Evmos_Revenue_V1_MsgAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Evmos_Revenue_V1_MsgServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Evmos_Revenue_V1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Evmos_Revenue_V1_MsgServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "RegisterRevenue":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Evmos_Revenue_V1_MsgRegisterRevenue>(),
        responseSerializer: ProtobufSerializer<Evmos_Revenue_V1_MsgRegisterRevenueResponse>(),
        interceptors: self.interceptors?.makeRegisterRevenueInterceptors() ?? [],
        wrapping: self.registerRevenue(request:context:)
      )

    case "UpdateRevenue":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Evmos_Revenue_V1_MsgUpdateRevenue>(),
        responseSerializer: ProtobufSerializer<Evmos_Revenue_V1_MsgUpdateRevenueResponse>(),
        interceptors: self.interceptors?.makeUpdateRevenueInterceptors() ?? [],
        wrapping: self.updateRevenue(request:context:)
      )

    case "CancelRevenue":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Evmos_Revenue_V1_MsgCancelRevenue>(),
        responseSerializer: ProtobufSerializer<Evmos_Revenue_V1_MsgCancelRevenueResponse>(),
        interceptors: self.interceptors?.makeCancelRevenueInterceptors() ?? [],
        wrapping: self.cancelRevenue(request:context:)
      )

    case "UpdateParams":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Evmos_Revenue_V1_MsgUpdateParams>(),
        responseSerializer: ProtobufSerializer<Evmos_Revenue_V1_MsgUpdateParamsResponse>(),
        interceptors: self.interceptors?.makeUpdateParamsInterceptors() ?? [],
        wrapping: self.updateParams(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Evmos_Revenue_V1_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'registerRevenue'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeRegisterRevenueInterceptors() -> [ServerInterceptor<Evmos_Revenue_V1_MsgRegisterRevenue, Evmos_Revenue_V1_MsgRegisterRevenueResponse>]

  /// - Returns: Interceptors to use when handling 'updateRevenue'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeUpdateRevenueInterceptors() -> [ServerInterceptor<Evmos_Revenue_V1_MsgUpdateRevenue, Evmos_Revenue_V1_MsgUpdateRevenueResponse>]

  /// - Returns: Interceptors to use when handling 'cancelRevenue'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeCancelRevenueInterceptors() -> [ServerInterceptor<Evmos_Revenue_V1_MsgCancelRevenue, Evmos_Revenue_V1_MsgCancelRevenueResponse>]

  /// - Returns: Interceptors to use when handling 'updateParams'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeUpdateParamsInterceptors() -> [ServerInterceptor<Evmos_Revenue_V1_MsgUpdateParams, Evmos_Revenue_V1_MsgUpdateParamsResponse>]
}

internal enum Evmos_Revenue_V1_MsgServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "evmos.revenue.v1.Msg",
    methods: [
      Evmos_Revenue_V1_MsgServerMetadata.Methods.registerRevenue,
      Evmos_Revenue_V1_MsgServerMetadata.Methods.updateRevenue,
      Evmos_Revenue_V1_MsgServerMetadata.Methods.cancelRevenue,
      Evmos_Revenue_V1_MsgServerMetadata.Methods.updateParams,
    ]
  )

  internal enum Methods {
    internal static let registerRevenue = GRPCMethodDescriptor(
      name: "RegisterRevenue",
      path: "/evmos.revenue.v1.Msg/RegisterRevenue",
      type: GRPCCallType.unary
    )

    internal static let updateRevenue = GRPCMethodDescriptor(
      name: "UpdateRevenue",
      path: "/evmos.revenue.v1.Msg/UpdateRevenue",
      type: GRPCCallType.unary
    )

    internal static let cancelRevenue = GRPCMethodDescriptor(
      name: "CancelRevenue",
      path: "/evmos.revenue.v1.Msg/CancelRevenue",
      type: GRPCCallType.unary
    )

    internal static let updateParams = GRPCMethodDescriptor(
      name: "UpdateParams",
      path: "/evmos.revenue.v1.Msg/UpdateParams",
      type: GRPCCallType.unary
    )
  }
}
