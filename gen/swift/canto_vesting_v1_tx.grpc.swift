//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: canto/vesting/v1/tx.proto
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


/// Msg defines the vesting Msg service.
///
/// Usage: instantiate `Canto_Vesting_V1_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Canto_Vesting_V1_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Canto_Vesting_V1_MsgClientInterceptorFactoryProtocol? { get }

  func createClawbackVestingAccount(
    _ request: Canto_Vesting_V1_MsgCreateClawbackVestingAccount,
    callOptions: CallOptions?
  ) -> UnaryCall<Canto_Vesting_V1_MsgCreateClawbackVestingAccount, Canto_Vesting_V1_MsgCreateClawbackVestingAccountResponse>

  func clawback(
    _ request: Canto_Vesting_V1_MsgClawback,
    callOptions: CallOptions?
  ) -> UnaryCall<Canto_Vesting_V1_MsgClawback, Canto_Vesting_V1_MsgClawbackResponse>
}

extension Canto_Vesting_V1_MsgClientProtocol {
  internal var serviceName: String {
    return "canto.vesting.v1.Msg"
  }

  /// CreateClawbackVestingAccount creats a vesting account that is subject to
  /// clawback and the configuration of vesting and lockup schedules.
  ///
  /// - Parameters:
  ///   - request: Request to send to CreateClawbackVestingAccount.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func createClawbackVestingAccount(
    _ request: Canto_Vesting_V1_MsgCreateClawbackVestingAccount,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Canto_Vesting_V1_MsgCreateClawbackVestingAccount, Canto_Vesting_V1_MsgCreateClawbackVestingAccountResponse> {
    return self.makeUnaryCall(
      path: Canto_Vesting_V1_MsgClientMetadata.Methods.createClawbackVestingAccount.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCreateClawbackVestingAccountInterceptors() ?? []
    )
  }

  /// Clawback removes the unvested tokens from a ClawbackVestingAccount.
  ///
  /// - Parameters:
  ///   - request: Request to send to Clawback.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func clawback(
    _ request: Canto_Vesting_V1_MsgClawback,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Canto_Vesting_V1_MsgClawback, Canto_Vesting_V1_MsgClawbackResponse> {
    return self.makeUnaryCall(
      path: Canto_Vesting_V1_MsgClientMetadata.Methods.clawback.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClawbackInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Canto_Vesting_V1_MsgClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Canto_Vesting_V1_MsgNIOClient")
internal final class Canto_Vesting_V1_MsgClient: Canto_Vesting_V1_MsgClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Canto_Vesting_V1_MsgClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Canto_Vesting_V1_MsgClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the canto.vesting.v1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Canto_Vesting_V1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Canto_Vesting_V1_MsgNIOClient: Canto_Vesting_V1_MsgClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Canto_Vesting_V1_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the canto.vesting.v1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Canto_Vesting_V1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Msg defines the vesting Msg service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Canto_Vesting_V1_MsgAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Canto_Vesting_V1_MsgClientInterceptorFactoryProtocol? { get }

  func makeCreateClawbackVestingAccountCall(
    _ request: Canto_Vesting_V1_MsgCreateClawbackVestingAccount,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Canto_Vesting_V1_MsgCreateClawbackVestingAccount, Canto_Vesting_V1_MsgCreateClawbackVestingAccountResponse>

  func makeClawbackCall(
    _ request: Canto_Vesting_V1_MsgClawback,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Canto_Vesting_V1_MsgClawback, Canto_Vesting_V1_MsgClawbackResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Canto_Vesting_V1_MsgAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Canto_Vesting_V1_MsgClientMetadata.serviceDescriptor
  }

  internal var interceptors: Canto_Vesting_V1_MsgClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeCreateClawbackVestingAccountCall(
    _ request: Canto_Vesting_V1_MsgCreateClawbackVestingAccount,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Canto_Vesting_V1_MsgCreateClawbackVestingAccount, Canto_Vesting_V1_MsgCreateClawbackVestingAccountResponse> {
    return self.makeAsyncUnaryCall(
      path: Canto_Vesting_V1_MsgClientMetadata.Methods.createClawbackVestingAccount.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCreateClawbackVestingAccountInterceptors() ?? []
    )
  }

  internal func makeClawbackCall(
    _ request: Canto_Vesting_V1_MsgClawback,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Canto_Vesting_V1_MsgClawback, Canto_Vesting_V1_MsgClawbackResponse> {
    return self.makeAsyncUnaryCall(
      path: Canto_Vesting_V1_MsgClientMetadata.Methods.clawback.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClawbackInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Canto_Vesting_V1_MsgAsyncClientProtocol {
  internal func createClawbackVestingAccount(
    _ request: Canto_Vesting_V1_MsgCreateClawbackVestingAccount,
    callOptions: CallOptions? = nil
  ) async throws -> Canto_Vesting_V1_MsgCreateClawbackVestingAccountResponse {
    return try await self.performAsyncUnaryCall(
      path: Canto_Vesting_V1_MsgClientMetadata.Methods.createClawbackVestingAccount.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCreateClawbackVestingAccountInterceptors() ?? []
    )
  }

  internal func clawback(
    _ request: Canto_Vesting_V1_MsgClawback,
    callOptions: CallOptions? = nil
  ) async throws -> Canto_Vesting_V1_MsgClawbackResponse {
    return try await self.performAsyncUnaryCall(
      path: Canto_Vesting_V1_MsgClientMetadata.Methods.clawback.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClawbackInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Canto_Vesting_V1_MsgAsyncClient: Canto_Vesting_V1_MsgAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Canto_Vesting_V1_MsgClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Canto_Vesting_V1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Canto_Vesting_V1_MsgClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'createClawbackVestingAccount'.
  func makeCreateClawbackVestingAccountInterceptors() -> [ClientInterceptor<Canto_Vesting_V1_MsgCreateClawbackVestingAccount, Canto_Vesting_V1_MsgCreateClawbackVestingAccountResponse>]

  /// - Returns: Interceptors to use when invoking 'clawback'.
  func makeClawbackInterceptors() -> [ClientInterceptor<Canto_Vesting_V1_MsgClawback, Canto_Vesting_V1_MsgClawbackResponse>]
}

internal enum Canto_Vesting_V1_MsgClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "canto.vesting.v1.Msg",
    methods: [
      Canto_Vesting_V1_MsgClientMetadata.Methods.createClawbackVestingAccount,
      Canto_Vesting_V1_MsgClientMetadata.Methods.clawback,
    ]
  )

  internal enum Methods {
    internal static let createClawbackVestingAccount = GRPCMethodDescriptor(
      name: "CreateClawbackVestingAccount",
      path: "/canto.vesting.v1.Msg/CreateClawbackVestingAccount",
      type: GRPCCallType.unary
    )

    internal static let clawback = GRPCMethodDescriptor(
      name: "Clawback",
      path: "/canto.vesting.v1.Msg/Clawback",
      type: GRPCCallType.unary
    )
  }
}

/// Msg defines the vesting Msg service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Canto_Vesting_V1_MsgProvider: CallHandlerProvider {
  var interceptors: Canto_Vesting_V1_MsgServerInterceptorFactoryProtocol? { get }

  /// CreateClawbackVestingAccount creats a vesting account that is subject to
  /// clawback and the configuration of vesting and lockup schedules.
  func createClawbackVestingAccount(request: Canto_Vesting_V1_MsgCreateClawbackVestingAccount, context: StatusOnlyCallContext) -> EventLoopFuture<Canto_Vesting_V1_MsgCreateClawbackVestingAccountResponse>

  /// Clawback removes the unvested tokens from a ClawbackVestingAccount.
  func clawback(request: Canto_Vesting_V1_MsgClawback, context: StatusOnlyCallContext) -> EventLoopFuture<Canto_Vesting_V1_MsgClawbackResponse>
}

extension Canto_Vesting_V1_MsgProvider {
  internal var serviceName: Substring {
    return Canto_Vesting_V1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "CreateClawbackVestingAccount":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Canto_Vesting_V1_MsgCreateClawbackVestingAccount>(),
        responseSerializer: ProtobufSerializer<Canto_Vesting_V1_MsgCreateClawbackVestingAccountResponse>(),
        interceptors: self.interceptors?.makeCreateClawbackVestingAccountInterceptors() ?? [],
        userFunction: self.createClawbackVestingAccount(request:context:)
      )

    case "Clawback":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Canto_Vesting_V1_MsgClawback>(),
        responseSerializer: ProtobufSerializer<Canto_Vesting_V1_MsgClawbackResponse>(),
        interceptors: self.interceptors?.makeClawbackInterceptors() ?? [],
        userFunction: self.clawback(request:context:)
      )

    default:
      return nil
    }
  }
}

/// Msg defines the vesting Msg service.
///
/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Canto_Vesting_V1_MsgAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Canto_Vesting_V1_MsgServerInterceptorFactoryProtocol? { get }

  /// CreateClawbackVestingAccount creats a vesting account that is subject to
  /// clawback and the configuration of vesting and lockup schedules.
  @Sendable func createClawbackVestingAccount(
    request: Canto_Vesting_V1_MsgCreateClawbackVestingAccount,
    context: GRPCAsyncServerCallContext
  ) async throws -> Canto_Vesting_V1_MsgCreateClawbackVestingAccountResponse

  /// Clawback removes the unvested tokens from a ClawbackVestingAccount.
  @Sendable func clawback(
    request: Canto_Vesting_V1_MsgClawback,
    context: GRPCAsyncServerCallContext
  ) async throws -> Canto_Vesting_V1_MsgClawbackResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Canto_Vesting_V1_MsgAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Canto_Vesting_V1_MsgServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Canto_Vesting_V1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Canto_Vesting_V1_MsgServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "CreateClawbackVestingAccount":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Canto_Vesting_V1_MsgCreateClawbackVestingAccount>(),
        responseSerializer: ProtobufSerializer<Canto_Vesting_V1_MsgCreateClawbackVestingAccountResponse>(),
        interceptors: self.interceptors?.makeCreateClawbackVestingAccountInterceptors() ?? [],
        wrapping: self.createClawbackVestingAccount(request:context:)
      )

    case "Clawback":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Canto_Vesting_V1_MsgClawback>(),
        responseSerializer: ProtobufSerializer<Canto_Vesting_V1_MsgClawbackResponse>(),
        interceptors: self.interceptors?.makeClawbackInterceptors() ?? [],
        wrapping: self.clawback(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Canto_Vesting_V1_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'createClawbackVestingAccount'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeCreateClawbackVestingAccountInterceptors() -> [ServerInterceptor<Canto_Vesting_V1_MsgCreateClawbackVestingAccount, Canto_Vesting_V1_MsgCreateClawbackVestingAccountResponse>]

  /// - Returns: Interceptors to use when handling 'clawback'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeClawbackInterceptors() -> [ServerInterceptor<Canto_Vesting_V1_MsgClawback, Canto_Vesting_V1_MsgClawbackResponse>]
}

internal enum Canto_Vesting_V1_MsgServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "canto.vesting.v1.Msg",
    methods: [
      Canto_Vesting_V1_MsgServerMetadata.Methods.createClawbackVestingAccount,
      Canto_Vesting_V1_MsgServerMetadata.Methods.clawback,
    ]
  )

  internal enum Methods {
    internal static let createClawbackVestingAccount = GRPCMethodDescriptor(
      name: "CreateClawbackVestingAccount",
      path: "/canto.vesting.v1.Msg/CreateClawbackVestingAccount",
      type: GRPCCallType.unary
    )

    internal static let clawback = GRPCMethodDescriptor(
      name: "Clawback",
      path: "/canto.vesting.v1.Msg/Clawback",
      type: GRPCCallType.unary
    )
  }
}