//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: mars/envoy/v1beta1/tx.proto
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


/// Msg defines the module's gRPC message service.
///
/// Usage: instantiate `Mars_Envoy_V1beta1_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Mars_Envoy_V1beta1_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Mars_Envoy_V1beta1_MsgClientInterceptorFactoryProtocol? { get }

  func registerAccount(
    _ request: Mars_Envoy_V1beta1_MsgRegisterAccount,
    callOptions: CallOptions?
  ) -> UnaryCall<Mars_Envoy_V1beta1_MsgRegisterAccount, Mars_Envoy_V1beta1_MsgRegisterAccountResponse>

  func sendFunds(
    _ request: Mars_Envoy_V1beta1_MsgSendFunds,
    callOptions: CallOptions?
  ) -> UnaryCall<Mars_Envoy_V1beta1_MsgSendFunds, Mars_Envoy_V1beta1_MsgSendFundsResponse>

  func sendMessages(
    _ request: Mars_Envoy_V1beta1_MsgSendMessages,
    callOptions: CallOptions?
  ) -> UnaryCall<Mars_Envoy_V1beta1_MsgSendMessages, Mars_Envoy_V1beta1_MsgSendMessagesResponse>
}

extension Mars_Envoy_V1beta1_MsgClientProtocol {
  internal var serviceName: String {
    return "mars.envoy.v1beta1.Msg"
  }

  /// RegisterAccount creates a new interchain account on the given connection,
  /// or if an interchain account already exists but its channel is closed (due
  /// to a packet having timed out), open a new channel for this account.
  ///
  /// - Parameters:
  ///   - request: Request to send to RegisterAccount.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func registerAccount(
    _ request: Mars_Envoy_V1beta1_MsgRegisterAccount,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Mars_Envoy_V1beta1_MsgRegisterAccount, Mars_Envoy_V1beta1_MsgRegisterAccountResponse> {
    return self.makeUnaryCall(
      path: Mars_Envoy_V1beta1_MsgClientMetadata.Methods.registerAccount.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRegisterAccountInterceptors() ?? []
    )
  }

  /// SendFunds is a governance operation for sending funds to an interchain
  /// account via ICS-20.
  ///
  /// The envoy module will first attempt to use the balance held in its own
  /// module account. If the balance is not sufficient, it will attempt to draw
  /// the difference from the community pool.
  ///
  /// - Parameters:
  ///   - request: Request to send to SendFunds.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func sendFunds(
    _ request: Mars_Envoy_V1beta1_MsgSendFunds,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Mars_Envoy_V1beta1_MsgSendFunds, Mars_Envoy_V1beta1_MsgSendFundsResponse> {
    return self.makeUnaryCall(
      path: Mars_Envoy_V1beta1_MsgClientMetadata.Methods.sendFunds.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSendFundsInterceptors() ?? []
    )
  }

  /// SendMessages is a governance operation for sending one or more messages to
  /// the host chain to be executed by the interchain account.
  ///
  /// - Parameters:
  ///   - request: Request to send to SendMessages.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func sendMessages(
    _ request: Mars_Envoy_V1beta1_MsgSendMessages,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Mars_Envoy_V1beta1_MsgSendMessages, Mars_Envoy_V1beta1_MsgSendMessagesResponse> {
    return self.makeUnaryCall(
      path: Mars_Envoy_V1beta1_MsgClientMetadata.Methods.sendMessages.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSendMessagesInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Mars_Envoy_V1beta1_MsgClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Mars_Envoy_V1beta1_MsgNIOClient")
internal final class Mars_Envoy_V1beta1_MsgClient: Mars_Envoy_V1beta1_MsgClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Mars_Envoy_V1beta1_MsgClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Mars_Envoy_V1beta1_MsgClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the mars.envoy.v1beta1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Mars_Envoy_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Mars_Envoy_V1beta1_MsgNIOClient: Mars_Envoy_V1beta1_MsgClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Mars_Envoy_V1beta1_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the mars.envoy.v1beta1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Mars_Envoy_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Msg defines the module's gRPC message service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Mars_Envoy_V1beta1_MsgAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Mars_Envoy_V1beta1_MsgClientInterceptorFactoryProtocol? { get }

  func makeRegisterAccountCall(
    _ request: Mars_Envoy_V1beta1_MsgRegisterAccount,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Mars_Envoy_V1beta1_MsgRegisterAccount, Mars_Envoy_V1beta1_MsgRegisterAccountResponse>

  func makeSendFundsCall(
    _ request: Mars_Envoy_V1beta1_MsgSendFunds,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Mars_Envoy_V1beta1_MsgSendFunds, Mars_Envoy_V1beta1_MsgSendFundsResponse>

  func makeSendMessagesCall(
    _ request: Mars_Envoy_V1beta1_MsgSendMessages,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Mars_Envoy_V1beta1_MsgSendMessages, Mars_Envoy_V1beta1_MsgSendMessagesResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Mars_Envoy_V1beta1_MsgAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Mars_Envoy_V1beta1_MsgClientMetadata.serviceDescriptor
  }

  internal var interceptors: Mars_Envoy_V1beta1_MsgClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeRegisterAccountCall(
    _ request: Mars_Envoy_V1beta1_MsgRegisterAccount,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Mars_Envoy_V1beta1_MsgRegisterAccount, Mars_Envoy_V1beta1_MsgRegisterAccountResponse> {
    return self.makeAsyncUnaryCall(
      path: Mars_Envoy_V1beta1_MsgClientMetadata.Methods.registerAccount.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRegisterAccountInterceptors() ?? []
    )
  }

  internal func makeSendFundsCall(
    _ request: Mars_Envoy_V1beta1_MsgSendFunds,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Mars_Envoy_V1beta1_MsgSendFunds, Mars_Envoy_V1beta1_MsgSendFundsResponse> {
    return self.makeAsyncUnaryCall(
      path: Mars_Envoy_V1beta1_MsgClientMetadata.Methods.sendFunds.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSendFundsInterceptors() ?? []
    )
  }

  internal func makeSendMessagesCall(
    _ request: Mars_Envoy_V1beta1_MsgSendMessages,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Mars_Envoy_V1beta1_MsgSendMessages, Mars_Envoy_V1beta1_MsgSendMessagesResponse> {
    return self.makeAsyncUnaryCall(
      path: Mars_Envoy_V1beta1_MsgClientMetadata.Methods.sendMessages.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSendMessagesInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Mars_Envoy_V1beta1_MsgAsyncClientProtocol {
  internal func registerAccount(
    _ request: Mars_Envoy_V1beta1_MsgRegisterAccount,
    callOptions: CallOptions? = nil
  ) async throws -> Mars_Envoy_V1beta1_MsgRegisterAccountResponse {
    return try await self.performAsyncUnaryCall(
      path: Mars_Envoy_V1beta1_MsgClientMetadata.Methods.registerAccount.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRegisterAccountInterceptors() ?? []
    )
  }

  internal func sendFunds(
    _ request: Mars_Envoy_V1beta1_MsgSendFunds,
    callOptions: CallOptions? = nil
  ) async throws -> Mars_Envoy_V1beta1_MsgSendFundsResponse {
    return try await self.performAsyncUnaryCall(
      path: Mars_Envoy_V1beta1_MsgClientMetadata.Methods.sendFunds.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSendFundsInterceptors() ?? []
    )
  }

  internal func sendMessages(
    _ request: Mars_Envoy_V1beta1_MsgSendMessages,
    callOptions: CallOptions? = nil
  ) async throws -> Mars_Envoy_V1beta1_MsgSendMessagesResponse {
    return try await self.performAsyncUnaryCall(
      path: Mars_Envoy_V1beta1_MsgClientMetadata.Methods.sendMessages.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSendMessagesInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Mars_Envoy_V1beta1_MsgAsyncClient: Mars_Envoy_V1beta1_MsgAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Mars_Envoy_V1beta1_MsgClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Mars_Envoy_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Mars_Envoy_V1beta1_MsgClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'registerAccount'.
  func makeRegisterAccountInterceptors() -> [ClientInterceptor<Mars_Envoy_V1beta1_MsgRegisterAccount, Mars_Envoy_V1beta1_MsgRegisterAccountResponse>]

  /// - Returns: Interceptors to use when invoking 'sendFunds'.
  func makeSendFundsInterceptors() -> [ClientInterceptor<Mars_Envoy_V1beta1_MsgSendFunds, Mars_Envoy_V1beta1_MsgSendFundsResponse>]

  /// - Returns: Interceptors to use when invoking 'sendMessages'.
  func makeSendMessagesInterceptors() -> [ClientInterceptor<Mars_Envoy_V1beta1_MsgSendMessages, Mars_Envoy_V1beta1_MsgSendMessagesResponse>]
}

internal enum Mars_Envoy_V1beta1_MsgClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "mars.envoy.v1beta1.Msg",
    methods: [
      Mars_Envoy_V1beta1_MsgClientMetadata.Methods.registerAccount,
      Mars_Envoy_V1beta1_MsgClientMetadata.Methods.sendFunds,
      Mars_Envoy_V1beta1_MsgClientMetadata.Methods.sendMessages,
    ]
  )

  internal enum Methods {
    internal static let registerAccount = GRPCMethodDescriptor(
      name: "RegisterAccount",
      path: "/mars.envoy.v1beta1.Msg/RegisterAccount",
      type: GRPCCallType.unary
    )

    internal static let sendFunds = GRPCMethodDescriptor(
      name: "SendFunds",
      path: "/mars.envoy.v1beta1.Msg/SendFunds",
      type: GRPCCallType.unary
    )

    internal static let sendMessages = GRPCMethodDescriptor(
      name: "SendMessages",
      path: "/mars.envoy.v1beta1.Msg/SendMessages",
      type: GRPCCallType.unary
    )
  }
}

/// Msg defines the module's gRPC message service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Mars_Envoy_V1beta1_MsgProvider: CallHandlerProvider {
  var interceptors: Mars_Envoy_V1beta1_MsgServerInterceptorFactoryProtocol? { get }

  /// RegisterAccount creates a new interchain account on the given connection,
  /// or if an interchain account already exists but its channel is closed (due
  /// to a packet having timed out), open a new channel for this account.
  func registerAccount(request: Mars_Envoy_V1beta1_MsgRegisterAccount, context: StatusOnlyCallContext) -> EventLoopFuture<Mars_Envoy_V1beta1_MsgRegisterAccountResponse>

  /// SendFunds is a governance operation for sending funds to an interchain
  /// account via ICS-20.
  ///
  /// The envoy module will first attempt to use the balance held in its own
  /// module account. If the balance is not sufficient, it will attempt to draw
  /// the difference from the community pool.
  func sendFunds(request: Mars_Envoy_V1beta1_MsgSendFunds, context: StatusOnlyCallContext) -> EventLoopFuture<Mars_Envoy_V1beta1_MsgSendFundsResponse>

  /// SendMessages is a governance operation for sending one or more messages to
  /// the host chain to be executed by the interchain account.
  func sendMessages(request: Mars_Envoy_V1beta1_MsgSendMessages, context: StatusOnlyCallContext) -> EventLoopFuture<Mars_Envoy_V1beta1_MsgSendMessagesResponse>
}

extension Mars_Envoy_V1beta1_MsgProvider {
  internal var serviceName: Substring {
    return Mars_Envoy_V1beta1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "RegisterAccount":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Mars_Envoy_V1beta1_MsgRegisterAccount>(),
        responseSerializer: ProtobufSerializer<Mars_Envoy_V1beta1_MsgRegisterAccountResponse>(),
        interceptors: self.interceptors?.makeRegisterAccountInterceptors() ?? [],
        userFunction: self.registerAccount(request:context:)
      )

    case "SendFunds":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Mars_Envoy_V1beta1_MsgSendFunds>(),
        responseSerializer: ProtobufSerializer<Mars_Envoy_V1beta1_MsgSendFundsResponse>(),
        interceptors: self.interceptors?.makeSendFundsInterceptors() ?? [],
        userFunction: self.sendFunds(request:context:)
      )

    case "SendMessages":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Mars_Envoy_V1beta1_MsgSendMessages>(),
        responseSerializer: ProtobufSerializer<Mars_Envoy_V1beta1_MsgSendMessagesResponse>(),
        interceptors: self.interceptors?.makeSendMessagesInterceptors() ?? [],
        userFunction: self.sendMessages(request:context:)
      )

    default:
      return nil
    }
  }
}

/// Msg defines the module's gRPC message service.
///
/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Mars_Envoy_V1beta1_MsgAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Mars_Envoy_V1beta1_MsgServerInterceptorFactoryProtocol? { get }

  /// RegisterAccount creates a new interchain account on the given connection,
  /// or if an interchain account already exists but its channel is closed (due
  /// to a packet having timed out), open a new channel for this account.
  @Sendable func registerAccount(
    request: Mars_Envoy_V1beta1_MsgRegisterAccount,
    context: GRPCAsyncServerCallContext
  ) async throws -> Mars_Envoy_V1beta1_MsgRegisterAccountResponse

  /// SendFunds is a governance operation for sending funds to an interchain
  /// account via ICS-20.
  ///
  /// The envoy module will first attempt to use the balance held in its own
  /// module account. If the balance is not sufficient, it will attempt to draw
  /// the difference from the community pool.
  @Sendable func sendFunds(
    request: Mars_Envoy_V1beta1_MsgSendFunds,
    context: GRPCAsyncServerCallContext
  ) async throws -> Mars_Envoy_V1beta1_MsgSendFundsResponse

  /// SendMessages is a governance operation for sending one or more messages to
  /// the host chain to be executed by the interchain account.
  @Sendable func sendMessages(
    request: Mars_Envoy_V1beta1_MsgSendMessages,
    context: GRPCAsyncServerCallContext
  ) async throws -> Mars_Envoy_V1beta1_MsgSendMessagesResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Mars_Envoy_V1beta1_MsgAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Mars_Envoy_V1beta1_MsgServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Mars_Envoy_V1beta1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Mars_Envoy_V1beta1_MsgServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "RegisterAccount":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Mars_Envoy_V1beta1_MsgRegisterAccount>(),
        responseSerializer: ProtobufSerializer<Mars_Envoy_V1beta1_MsgRegisterAccountResponse>(),
        interceptors: self.interceptors?.makeRegisterAccountInterceptors() ?? [],
        wrapping: self.registerAccount(request:context:)
      )

    case "SendFunds":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Mars_Envoy_V1beta1_MsgSendFunds>(),
        responseSerializer: ProtobufSerializer<Mars_Envoy_V1beta1_MsgSendFundsResponse>(),
        interceptors: self.interceptors?.makeSendFundsInterceptors() ?? [],
        wrapping: self.sendFunds(request:context:)
      )

    case "SendMessages":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Mars_Envoy_V1beta1_MsgSendMessages>(),
        responseSerializer: ProtobufSerializer<Mars_Envoy_V1beta1_MsgSendMessagesResponse>(),
        interceptors: self.interceptors?.makeSendMessagesInterceptors() ?? [],
        wrapping: self.sendMessages(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Mars_Envoy_V1beta1_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'registerAccount'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeRegisterAccountInterceptors() -> [ServerInterceptor<Mars_Envoy_V1beta1_MsgRegisterAccount, Mars_Envoy_V1beta1_MsgRegisterAccountResponse>]

  /// - Returns: Interceptors to use when handling 'sendFunds'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeSendFundsInterceptors() -> [ServerInterceptor<Mars_Envoy_V1beta1_MsgSendFunds, Mars_Envoy_V1beta1_MsgSendFundsResponse>]

  /// - Returns: Interceptors to use when handling 'sendMessages'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeSendMessagesInterceptors() -> [ServerInterceptor<Mars_Envoy_V1beta1_MsgSendMessages, Mars_Envoy_V1beta1_MsgSendMessagesResponse>]
}

internal enum Mars_Envoy_V1beta1_MsgServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "mars.envoy.v1beta1.Msg",
    methods: [
      Mars_Envoy_V1beta1_MsgServerMetadata.Methods.registerAccount,
      Mars_Envoy_V1beta1_MsgServerMetadata.Methods.sendFunds,
      Mars_Envoy_V1beta1_MsgServerMetadata.Methods.sendMessages,
    ]
  )

  internal enum Methods {
    internal static let registerAccount = GRPCMethodDescriptor(
      name: "RegisterAccount",
      path: "/mars.envoy.v1beta1.Msg/RegisterAccount",
      type: GRPCCallType.unary
    )

    internal static let sendFunds = GRPCMethodDescriptor(
      name: "SendFunds",
      path: "/mars.envoy.v1beta1.Msg/SendFunds",
      type: GRPCCallType.unary
    )

    internal static let sendMessages = GRPCMethodDescriptor(
      name: "SendMessages",
      path: "/mars.envoy.v1beta1.Msg/SendMessages",
      type: GRPCCallType.unary
    )
  }
}
