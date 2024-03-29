//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: cosmos/bank/v1beta1/tx.proto
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


/// Msg defines the bank Msg service.
///
/// Usage: instantiate `Cosmos_Bank_V1beta1_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Cosmos_Bank_V1beta1_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Cosmos_Bank_V1beta1_MsgClientInterceptorFactoryProtocol? { get }

  func send(
    _ request: Cosmos_Bank_V1beta1_MsgSend,
    callOptions: CallOptions?
  ) -> UnaryCall<Cosmos_Bank_V1beta1_MsgSend, Cosmos_Bank_V1beta1_MsgSendResponse>

  func multiSend(
    _ request: Cosmos_Bank_V1beta1_MsgMultiSend,
    callOptions: CallOptions?
  ) -> UnaryCall<Cosmos_Bank_V1beta1_MsgMultiSend, Cosmos_Bank_V1beta1_MsgMultiSendResponse>

  func updateParams(
    _ request: Cosmos_Bank_V1beta1_MsgUpdateParams,
    callOptions: CallOptions?
  ) -> UnaryCall<Cosmos_Bank_V1beta1_MsgUpdateParams, Cosmos_Bank_V1beta1_MsgUpdateParamsResponse>

  func setSendEnabled(
    _ request: Cosmos_Bank_V1beta1_MsgSetSendEnabled,
    callOptions: CallOptions?
  ) -> UnaryCall<Cosmos_Bank_V1beta1_MsgSetSendEnabled, Cosmos_Bank_V1beta1_MsgSetSendEnabledResponse>
}

extension Cosmos_Bank_V1beta1_MsgClientProtocol {
  internal var serviceName: String {
    return "cosmos.bank.v1beta1.Msg"
  }

  /// Send defines a method for sending coins from one account to another account.
  ///
  /// - Parameters:
  ///   - request: Request to send to Send.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func send(
    _ request: Cosmos_Bank_V1beta1_MsgSend,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Cosmos_Bank_V1beta1_MsgSend, Cosmos_Bank_V1beta1_MsgSendResponse> {
    return self.makeUnaryCall(
      path: Cosmos_Bank_V1beta1_MsgClientMetadata.Methods.send.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSendInterceptors() ?? []
    )
  }

  /// MultiSend defines a method for sending coins from some accounts to other accounts.
  ///
  /// - Parameters:
  ///   - request: Request to send to MultiSend.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func multiSend(
    _ request: Cosmos_Bank_V1beta1_MsgMultiSend,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Cosmos_Bank_V1beta1_MsgMultiSend, Cosmos_Bank_V1beta1_MsgMultiSendResponse> {
    return self.makeUnaryCall(
      path: Cosmos_Bank_V1beta1_MsgClientMetadata.Methods.multiSend.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeMultiSendInterceptors() ?? []
    )
  }

  /// UpdateParams defines a governance operation for updating the x/bank module parameters.
  /// The authority is defined in the keeper.
  ///
  /// Since: cosmos-sdk 0.47
  ///
  /// - Parameters:
  ///   - request: Request to send to UpdateParams.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func updateParams(
    _ request: Cosmos_Bank_V1beta1_MsgUpdateParams,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Cosmos_Bank_V1beta1_MsgUpdateParams, Cosmos_Bank_V1beta1_MsgUpdateParamsResponse> {
    return self.makeUnaryCall(
      path: Cosmos_Bank_V1beta1_MsgClientMetadata.Methods.updateParams.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUpdateParamsInterceptors() ?? []
    )
  }

  /// SetSendEnabled is a governance operation for setting the SendEnabled flag
  /// on any number of Denoms. Only the entries to add or update should be
  /// included. Entries that already exist in the store, but that aren't
  /// included in this message, will be left unchanged.
  ///
  /// Since: cosmos-sdk 0.47
  ///
  /// - Parameters:
  ///   - request: Request to send to SetSendEnabled.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func setSendEnabled(
    _ request: Cosmos_Bank_V1beta1_MsgSetSendEnabled,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Cosmos_Bank_V1beta1_MsgSetSendEnabled, Cosmos_Bank_V1beta1_MsgSetSendEnabledResponse> {
    return self.makeUnaryCall(
      path: Cosmos_Bank_V1beta1_MsgClientMetadata.Methods.setSendEnabled.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSetSendEnabledInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Cosmos_Bank_V1beta1_MsgClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Cosmos_Bank_V1beta1_MsgNIOClient")
internal final class Cosmos_Bank_V1beta1_MsgClient: Cosmos_Bank_V1beta1_MsgClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Cosmos_Bank_V1beta1_MsgClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Cosmos_Bank_V1beta1_MsgClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the cosmos.bank.v1beta1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Cosmos_Bank_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Cosmos_Bank_V1beta1_MsgNIOClient: Cosmos_Bank_V1beta1_MsgClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Cosmos_Bank_V1beta1_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the cosmos.bank.v1beta1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Cosmos_Bank_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Msg defines the bank Msg service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Cosmos_Bank_V1beta1_MsgAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Cosmos_Bank_V1beta1_MsgClientInterceptorFactoryProtocol? { get }

  func makeSendCall(
    _ request: Cosmos_Bank_V1beta1_MsgSend,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Cosmos_Bank_V1beta1_MsgSend, Cosmos_Bank_V1beta1_MsgSendResponse>

  func makeMultiSendCall(
    _ request: Cosmos_Bank_V1beta1_MsgMultiSend,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Cosmos_Bank_V1beta1_MsgMultiSend, Cosmos_Bank_V1beta1_MsgMultiSendResponse>

  func makeUpdateParamsCall(
    _ request: Cosmos_Bank_V1beta1_MsgUpdateParams,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Cosmos_Bank_V1beta1_MsgUpdateParams, Cosmos_Bank_V1beta1_MsgUpdateParamsResponse>

  func makeSetSendEnabledCall(
    _ request: Cosmos_Bank_V1beta1_MsgSetSendEnabled,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Cosmos_Bank_V1beta1_MsgSetSendEnabled, Cosmos_Bank_V1beta1_MsgSetSendEnabledResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Cosmos_Bank_V1beta1_MsgAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Cosmos_Bank_V1beta1_MsgClientMetadata.serviceDescriptor
  }

  internal var interceptors: Cosmos_Bank_V1beta1_MsgClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeSendCall(
    _ request: Cosmos_Bank_V1beta1_MsgSend,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Cosmos_Bank_V1beta1_MsgSend, Cosmos_Bank_V1beta1_MsgSendResponse> {
    return self.makeAsyncUnaryCall(
      path: Cosmos_Bank_V1beta1_MsgClientMetadata.Methods.send.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSendInterceptors() ?? []
    )
  }

  internal func makeMultiSendCall(
    _ request: Cosmos_Bank_V1beta1_MsgMultiSend,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Cosmos_Bank_V1beta1_MsgMultiSend, Cosmos_Bank_V1beta1_MsgMultiSendResponse> {
    return self.makeAsyncUnaryCall(
      path: Cosmos_Bank_V1beta1_MsgClientMetadata.Methods.multiSend.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeMultiSendInterceptors() ?? []
    )
  }

  internal func makeUpdateParamsCall(
    _ request: Cosmos_Bank_V1beta1_MsgUpdateParams,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Cosmos_Bank_V1beta1_MsgUpdateParams, Cosmos_Bank_V1beta1_MsgUpdateParamsResponse> {
    return self.makeAsyncUnaryCall(
      path: Cosmos_Bank_V1beta1_MsgClientMetadata.Methods.updateParams.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUpdateParamsInterceptors() ?? []
    )
  }

  internal func makeSetSendEnabledCall(
    _ request: Cosmos_Bank_V1beta1_MsgSetSendEnabled,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Cosmos_Bank_V1beta1_MsgSetSendEnabled, Cosmos_Bank_V1beta1_MsgSetSendEnabledResponse> {
    return self.makeAsyncUnaryCall(
      path: Cosmos_Bank_V1beta1_MsgClientMetadata.Methods.setSendEnabled.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSetSendEnabledInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Cosmos_Bank_V1beta1_MsgAsyncClientProtocol {
  internal func send(
    _ request: Cosmos_Bank_V1beta1_MsgSend,
    callOptions: CallOptions? = nil
  ) async throws -> Cosmos_Bank_V1beta1_MsgSendResponse {
    return try await self.performAsyncUnaryCall(
      path: Cosmos_Bank_V1beta1_MsgClientMetadata.Methods.send.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSendInterceptors() ?? []
    )
  }

  internal func multiSend(
    _ request: Cosmos_Bank_V1beta1_MsgMultiSend,
    callOptions: CallOptions? = nil
  ) async throws -> Cosmos_Bank_V1beta1_MsgMultiSendResponse {
    return try await self.performAsyncUnaryCall(
      path: Cosmos_Bank_V1beta1_MsgClientMetadata.Methods.multiSend.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeMultiSendInterceptors() ?? []
    )
  }

  internal func updateParams(
    _ request: Cosmos_Bank_V1beta1_MsgUpdateParams,
    callOptions: CallOptions? = nil
  ) async throws -> Cosmos_Bank_V1beta1_MsgUpdateParamsResponse {
    return try await self.performAsyncUnaryCall(
      path: Cosmos_Bank_V1beta1_MsgClientMetadata.Methods.updateParams.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUpdateParamsInterceptors() ?? []
    )
  }

  internal func setSendEnabled(
    _ request: Cosmos_Bank_V1beta1_MsgSetSendEnabled,
    callOptions: CallOptions? = nil
  ) async throws -> Cosmos_Bank_V1beta1_MsgSetSendEnabledResponse {
    return try await self.performAsyncUnaryCall(
      path: Cosmos_Bank_V1beta1_MsgClientMetadata.Methods.setSendEnabled.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSetSendEnabledInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Cosmos_Bank_V1beta1_MsgAsyncClient: Cosmos_Bank_V1beta1_MsgAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Cosmos_Bank_V1beta1_MsgClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Cosmos_Bank_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Cosmos_Bank_V1beta1_MsgClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'send'.
  func makeSendInterceptors() -> [ClientInterceptor<Cosmos_Bank_V1beta1_MsgSend, Cosmos_Bank_V1beta1_MsgSendResponse>]

  /// - Returns: Interceptors to use when invoking 'multiSend'.
  func makeMultiSendInterceptors() -> [ClientInterceptor<Cosmos_Bank_V1beta1_MsgMultiSend, Cosmos_Bank_V1beta1_MsgMultiSendResponse>]

  /// - Returns: Interceptors to use when invoking 'updateParams'.
  func makeUpdateParamsInterceptors() -> [ClientInterceptor<Cosmos_Bank_V1beta1_MsgUpdateParams, Cosmos_Bank_V1beta1_MsgUpdateParamsResponse>]

  /// - Returns: Interceptors to use when invoking 'setSendEnabled'.
  func makeSetSendEnabledInterceptors() -> [ClientInterceptor<Cosmos_Bank_V1beta1_MsgSetSendEnabled, Cosmos_Bank_V1beta1_MsgSetSendEnabledResponse>]
}

internal enum Cosmos_Bank_V1beta1_MsgClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "cosmos.bank.v1beta1.Msg",
    methods: [
      Cosmos_Bank_V1beta1_MsgClientMetadata.Methods.send,
      Cosmos_Bank_V1beta1_MsgClientMetadata.Methods.multiSend,
      Cosmos_Bank_V1beta1_MsgClientMetadata.Methods.updateParams,
      Cosmos_Bank_V1beta1_MsgClientMetadata.Methods.setSendEnabled,
    ]
  )

  internal enum Methods {
    internal static let send = GRPCMethodDescriptor(
      name: "Send",
      path: "/cosmos.bank.v1beta1.Msg/Send",
      type: GRPCCallType.unary
    )

    internal static let multiSend = GRPCMethodDescriptor(
      name: "MultiSend",
      path: "/cosmos.bank.v1beta1.Msg/MultiSend",
      type: GRPCCallType.unary
    )

    internal static let updateParams = GRPCMethodDescriptor(
      name: "UpdateParams",
      path: "/cosmos.bank.v1beta1.Msg/UpdateParams",
      type: GRPCCallType.unary
    )

    internal static let setSendEnabled = GRPCMethodDescriptor(
      name: "SetSendEnabled",
      path: "/cosmos.bank.v1beta1.Msg/SetSendEnabled",
      type: GRPCCallType.unary
    )
  }
}

/// Msg defines the bank Msg service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Cosmos_Bank_V1beta1_MsgProvider: CallHandlerProvider {
  var interceptors: Cosmos_Bank_V1beta1_MsgServerInterceptorFactoryProtocol? { get }

  /// Send defines a method for sending coins from one account to another account.
  func send(request: Cosmos_Bank_V1beta1_MsgSend, context: StatusOnlyCallContext) -> EventLoopFuture<Cosmos_Bank_V1beta1_MsgSendResponse>

  /// MultiSend defines a method for sending coins from some accounts to other accounts.
  func multiSend(request: Cosmos_Bank_V1beta1_MsgMultiSend, context: StatusOnlyCallContext) -> EventLoopFuture<Cosmos_Bank_V1beta1_MsgMultiSendResponse>

  /// UpdateParams defines a governance operation for updating the x/bank module parameters.
  /// The authority is defined in the keeper.
  ///
  /// Since: cosmos-sdk 0.47
  func updateParams(request: Cosmos_Bank_V1beta1_MsgUpdateParams, context: StatusOnlyCallContext) -> EventLoopFuture<Cosmos_Bank_V1beta1_MsgUpdateParamsResponse>

  /// SetSendEnabled is a governance operation for setting the SendEnabled flag
  /// on any number of Denoms. Only the entries to add or update should be
  /// included. Entries that already exist in the store, but that aren't
  /// included in this message, will be left unchanged.
  ///
  /// Since: cosmos-sdk 0.47
  func setSendEnabled(request: Cosmos_Bank_V1beta1_MsgSetSendEnabled, context: StatusOnlyCallContext) -> EventLoopFuture<Cosmos_Bank_V1beta1_MsgSetSendEnabledResponse>
}

extension Cosmos_Bank_V1beta1_MsgProvider {
  internal var serviceName: Substring {
    return Cosmos_Bank_V1beta1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Send":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Cosmos_Bank_V1beta1_MsgSend>(),
        responseSerializer: ProtobufSerializer<Cosmos_Bank_V1beta1_MsgSendResponse>(),
        interceptors: self.interceptors?.makeSendInterceptors() ?? [],
        userFunction: self.send(request:context:)
      )

    case "MultiSend":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Cosmos_Bank_V1beta1_MsgMultiSend>(),
        responseSerializer: ProtobufSerializer<Cosmos_Bank_V1beta1_MsgMultiSendResponse>(),
        interceptors: self.interceptors?.makeMultiSendInterceptors() ?? [],
        userFunction: self.multiSend(request:context:)
      )

    case "UpdateParams":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Cosmos_Bank_V1beta1_MsgUpdateParams>(),
        responseSerializer: ProtobufSerializer<Cosmos_Bank_V1beta1_MsgUpdateParamsResponse>(),
        interceptors: self.interceptors?.makeUpdateParamsInterceptors() ?? [],
        userFunction: self.updateParams(request:context:)
      )

    case "SetSendEnabled":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Cosmos_Bank_V1beta1_MsgSetSendEnabled>(),
        responseSerializer: ProtobufSerializer<Cosmos_Bank_V1beta1_MsgSetSendEnabledResponse>(),
        interceptors: self.interceptors?.makeSetSendEnabledInterceptors() ?? [],
        userFunction: self.setSendEnabled(request:context:)
      )

    default:
      return nil
    }
  }
}

/// Msg defines the bank Msg service.
///
/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Cosmos_Bank_V1beta1_MsgAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Cosmos_Bank_V1beta1_MsgServerInterceptorFactoryProtocol? { get }

  /// Send defines a method for sending coins from one account to another account.
  @Sendable func send(
    request: Cosmos_Bank_V1beta1_MsgSend,
    context: GRPCAsyncServerCallContext
  ) async throws -> Cosmos_Bank_V1beta1_MsgSendResponse

  /// MultiSend defines a method for sending coins from some accounts to other accounts.
  @Sendable func multiSend(
    request: Cosmos_Bank_V1beta1_MsgMultiSend,
    context: GRPCAsyncServerCallContext
  ) async throws -> Cosmos_Bank_V1beta1_MsgMultiSendResponse

  /// UpdateParams defines a governance operation for updating the x/bank module parameters.
  /// The authority is defined in the keeper.
  ///
  /// Since: cosmos-sdk 0.47
  @Sendable func updateParams(
    request: Cosmos_Bank_V1beta1_MsgUpdateParams,
    context: GRPCAsyncServerCallContext
  ) async throws -> Cosmos_Bank_V1beta1_MsgUpdateParamsResponse

  /// SetSendEnabled is a governance operation for setting the SendEnabled flag
  /// on any number of Denoms. Only the entries to add or update should be
  /// included. Entries that already exist in the store, but that aren't
  /// included in this message, will be left unchanged.
  ///
  /// Since: cosmos-sdk 0.47
  @Sendable func setSendEnabled(
    request: Cosmos_Bank_V1beta1_MsgSetSendEnabled,
    context: GRPCAsyncServerCallContext
  ) async throws -> Cosmos_Bank_V1beta1_MsgSetSendEnabledResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Cosmos_Bank_V1beta1_MsgAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Cosmos_Bank_V1beta1_MsgServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Cosmos_Bank_V1beta1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Cosmos_Bank_V1beta1_MsgServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Send":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Cosmos_Bank_V1beta1_MsgSend>(),
        responseSerializer: ProtobufSerializer<Cosmos_Bank_V1beta1_MsgSendResponse>(),
        interceptors: self.interceptors?.makeSendInterceptors() ?? [],
        wrapping: self.send(request:context:)
      )

    case "MultiSend":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Cosmos_Bank_V1beta1_MsgMultiSend>(),
        responseSerializer: ProtobufSerializer<Cosmos_Bank_V1beta1_MsgMultiSendResponse>(),
        interceptors: self.interceptors?.makeMultiSendInterceptors() ?? [],
        wrapping: self.multiSend(request:context:)
      )

    case "UpdateParams":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Cosmos_Bank_V1beta1_MsgUpdateParams>(),
        responseSerializer: ProtobufSerializer<Cosmos_Bank_V1beta1_MsgUpdateParamsResponse>(),
        interceptors: self.interceptors?.makeUpdateParamsInterceptors() ?? [],
        wrapping: self.updateParams(request:context:)
      )

    case "SetSendEnabled":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Cosmos_Bank_V1beta1_MsgSetSendEnabled>(),
        responseSerializer: ProtobufSerializer<Cosmos_Bank_V1beta1_MsgSetSendEnabledResponse>(),
        interceptors: self.interceptors?.makeSetSendEnabledInterceptors() ?? [],
        wrapping: self.setSendEnabled(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Cosmos_Bank_V1beta1_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'send'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeSendInterceptors() -> [ServerInterceptor<Cosmos_Bank_V1beta1_MsgSend, Cosmos_Bank_V1beta1_MsgSendResponse>]

  /// - Returns: Interceptors to use when handling 'multiSend'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeMultiSendInterceptors() -> [ServerInterceptor<Cosmos_Bank_V1beta1_MsgMultiSend, Cosmos_Bank_V1beta1_MsgMultiSendResponse>]

  /// - Returns: Interceptors to use when handling 'updateParams'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeUpdateParamsInterceptors() -> [ServerInterceptor<Cosmos_Bank_V1beta1_MsgUpdateParams, Cosmos_Bank_V1beta1_MsgUpdateParamsResponse>]

  /// - Returns: Interceptors to use when handling 'setSendEnabled'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeSetSendEnabledInterceptors() -> [ServerInterceptor<Cosmos_Bank_V1beta1_MsgSetSendEnabled, Cosmos_Bank_V1beta1_MsgSetSendEnabledResponse>]
}

internal enum Cosmos_Bank_V1beta1_MsgServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "cosmos.bank.v1beta1.Msg",
    methods: [
      Cosmos_Bank_V1beta1_MsgServerMetadata.Methods.send,
      Cosmos_Bank_V1beta1_MsgServerMetadata.Methods.multiSend,
      Cosmos_Bank_V1beta1_MsgServerMetadata.Methods.updateParams,
      Cosmos_Bank_V1beta1_MsgServerMetadata.Methods.setSendEnabled,
    ]
  )

  internal enum Methods {
    internal static let send = GRPCMethodDescriptor(
      name: "Send",
      path: "/cosmos.bank.v1beta1.Msg/Send",
      type: GRPCCallType.unary
    )

    internal static let multiSend = GRPCMethodDescriptor(
      name: "MultiSend",
      path: "/cosmos.bank.v1beta1.Msg/MultiSend",
      type: GRPCCallType.unary
    )

    internal static let updateParams = GRPCMethodDescriptor(
      name: "UpdateParams",
      path: "/cosmos.bank.v1beta1.Msg/UpdateParams",
      type: GRPCCallType.unary
    )

    internal static let setSendEnabled = GRPCMethodDescriptor(
      name: "SetSendEnabled",
      path: "/cosmos.bank.v1beta1.Msg/SetSendEnabled",
      type: GRPCCallType.unary
    )
  }
}
